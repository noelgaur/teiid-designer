/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.mapping.ui.actions;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.teiid.designer.core.workspace.ModelResource;
import org.teiid.designer.diagram.ui.editor.DiagramEditor;
import org.teiid.designer.diagram.ui.editor.DiagramViewer;
import org.teiid.designer.mapping.ui.PluginConstants;
import org.teiid.designer.mapping.ui.UiPlugin;
import org.teiid.designer.metamodels.diagram.Diagram;
import org.teiid.designer.metamodels.transformation.MappingClass;
import org.teiid.designer.transformation.ui.actions.TransformationGlobalActionsManager;
import org.teiid.designer.transformation.util.TransformationHelper;
import org.teiid.designer.ui.common.eventsupport.SelectionUtilities;
import org.teiid.designer.ui.editors.ModelEditor;
import org.teiid.designer.ui.viewsupport.ModelObjectEditHelper;
import org.teiid.designer.ui.viewsupport.ModelUtilities;



/** 
 * @since 8.0
 */
public class MappingObjectEditHelper extends ModelObjectEditHelper {

    /** 
     * 
     * @since 4.3
     */
    public MappingObjectEditHelper() {
        super();
    }

    /* (non-Javadoc)
     * @See org.teiid.designer.ui.actions.IModelObjectEditHelper#canDelete(java.lang.Object)
     */
    @Override
    public boolean canDelete(Object obj) {
        if( obj instanceof EObject ) {
            
            // Defect 23466 - Need to put a hack in here to NOT allow deleting if the focused part is Diagram Editor, the diagram is
            // a transformation & the transformation global actions manager says it can or not.
            // This is because the SQL Editor global actions may supercede the DiagramEditor's and there is no framework to restore
            // these actions at the momement. 
            
            // Let's Check out the selection's source. If it's 
            IWorkbenchPart activePart = UiPlugin.getDefault().getCurrentWorkbenchWindow().getPartService().getActivePart();
    
            if( activePart instanceof ModelEditor ) {
                IEditorPart activeSubEditorPart = ((ModelEditor)activePart).getActiveEditor();
                if( activeSubEditorPart instanceof DiagramEditor ) {
                    DiagramViewer viewer = ((DiagramEditor)activeSubEditorPart).getDiagramViewer();
                    if( viewer.isValidViewer() && viewer.hasFocus() ) {
                        // Check for T-Diagram
                        Diagram diagram = viewer.getEditor().getDiagram();
                        if( diagram.getType().equals(PluginConstants.MAPPING_TRANSFORMATION_DIAGRAM_TYPE_ID) ) {
                            EObject vTable = diagram.getTarget();
                            if( vTable != null ) {
                                EObject transform = TransformationHelper.getTransformationMappingRoot(vTable);
                                if( transform != null ) {
                                    IStructuredSelection diagramSelection = (IStructuredSelection)viewer.getSelection();
                                    List selectedObjs = SelectionUtilities.getSelectedEObjects(diagramSelection);
                                    if( selectedObjs.contains(obj) ) {
                                        return TransformationGlobalActionsManager.canDelete(transform, selectedObjs);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @See org.teiid.designer.ui.actions.IModelObjectEditHelper#canDelete(java.lang.Object)
     */
    @Override
    public boolean canUndoDelete(Object obj) {

        if ( obj instanceof MappingClass ) {
            return false;
        }else if(obj instanceof Collection) {
            //Defect 23550
            //If a collection, return false if any item in the collection is a mapping class
            final Iterator objs = ((Collection)obj).iterator();
            while(objs.hasNext() ) {
                final Object next = objs.next();
                if(next instanceof MappingClass) {
                    return false;
                }
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @See org.teiid.designer.ui.actions.IModelObjectEditHelper#canDelete(java.lang.Object)
     */
    public boolean canSplit(Object obj) {

        return true;
    }

    /* (non-Javadoc)
     * @See org.teiid.designer.ui.actions.IModelObjectEditHelper#canDelete(java.lang.Object)
     */
    public boolean canUndoSplit(Object obj) {

        return false;
    }

    /* (non-Javadoc)
     * @See org.teiid.designer.ui.actions.IModelObjectEditHelper#canDelete(java.lang.Object)
     */
    public boolean canMerge(Object obj) {

        return true;
    }

    /* (non-Javadoc)
     * @See org.teiid.designer.ui.actions.IModelObjectEditHelper#canDelete(java.lang.Object)
     */
    public boolean canUndoMerge(Object obj) {

        return false;
    }
    
    public boolean canEdit(Object obj, Object targetResource) {
        // We need to return FALSE if the object being edited is a "Source" to a transformation
        if( obj instanceof EObject && targetResource instanceof ModelResource ) {
            // Check if the obj's ModelResource is same as target
            ModelResource mr = ModelUtilities.getModelResourceForModelObject((EObject)obj);
            if( mr != null && mr == targetResource) {
                return true;
            }
            return false;
        }
        return true;
    }
    
}

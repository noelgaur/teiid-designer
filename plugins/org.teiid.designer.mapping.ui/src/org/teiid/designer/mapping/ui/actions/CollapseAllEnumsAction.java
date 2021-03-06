/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.mapping.ui.actions;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchPart;
import org.teiid.designer.diagram.ui.editor.DiagramEditor;
import org.teiid.designer.diagram.ui.editor.DiagramEditorUtil;
import org.teiid.designer.diagram.ui.model.DiagramModelNode;
import org.teiid.designer.diagram.ui.model.ExpandableNode;
import org.teiid.designer.diagram.ui.notation.uml.model.UmlClassifierNode;
import org.teiid.designer.mapping.ui.UiPlugin;
import org.teiid.designer.mapping.ui.diagram.MappingDiagramUtil;
import org.teiid.designer.ui.viewsupport.ModelIdentifier;



/** 
 * @since 8.0
 */
public class CollapseAllEnumsAction extends MappingAction {

//    private static String EXPAND_ALL_ENUMERATIONS_TEXT 
//        = UiPlugin.Util.getString( "ExpandAllEnumsAction.text" );  //$NON-NLS-1$
    
    private boolean isLogicalModel = false;
    private boolean modelTypeChecked = false;
    /** 
     * 
     * @since 5.0
     */
    public CollapseAllEnumsAction() {
        super( UiPlugin.getDefault(), SWT.DEFAULT );
        
//        setText("Expand all Enumerations");
//        setToolTipText( "Expand all Enumerations"); //EXPAND_ALL_ENUMERATIONS_TEXT );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // METHODS
    ///////////////////////////////////////////////////////////////////////////////////////////////
    
    /* (non-Javadoc)
     * @see org.eclipse.ui.ISelectionListener#selectionChanged(IWorkbenchPart, ISelection)
     */
    @Override
    public void selectionChanged(IWorkbenchPart thePart, ISelection theSelection) {

        super.selectionChanged(thePart, theSelection);
        determineEnablement();
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.jface.action.IAction#run()
     */
    @Override
    protected void doRun() {
        // Get Diagram Editor, get all "Enum" UmlClassifiers and then "Expand" them all
        
        DiagramModelNode[] allEnumNodes = MappingDiagramUtil.getEnumeratedTypeNodes();
        if( allEnumNodes.length > 0 ) {
            for( int i = 0; i<allEnumNodes.length; i++ ) {
                if( allEnumNodes[i] instanceof ExpandableNode ) {
                    if( ((UmlClassifierNode)allEnumNodes[i]).isExpanded() ) {
                        // Just call update(EXPAND) to notify the part to do the expand for each classifier
                        ((UmlClassifierNode)allEnumNodes[i]).collapse();
                    }
                } 
            }
        }
    }
    
    private void checkModelType() {
        if( !modelTypeChecked ) {
            DiagramEditor dEditor = DiagramEditorUtil.getVisibleDiagramEditor();
            if( dEditor != null ) {
                isLogicalModel = ModelIdentifier.isLogicalModel(dEditor.getCurrentModelResource());
                modelTypeChecked = true;
            }
        }
    }

    private void determineEnablement() {
        // Only enable when the model is "Logical"
        checkModelType();
        
        boolean enable = isLogicalModel;

        setEnabled(enable);
    }
}

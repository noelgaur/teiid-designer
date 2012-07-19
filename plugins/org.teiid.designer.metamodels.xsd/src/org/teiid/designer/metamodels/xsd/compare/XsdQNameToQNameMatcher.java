/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.xsd.compare;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsd.XSDNamedComponent;
import org.teiid.designer.core.compare.AbstractEObjectNameMatcher;


/** 
 * @since 8.0
 */
public class XsdQNameToQNameMatcher extends AbstractEObjectNameMatcher {

    /** 
     * 
     * @since 4.2
     */
    public XsdQNameToQNameMatcher() {
        super();
    }

    /** 
     * @see org.teiid.designer.core.compare.AbstractEObjectNameMatcher#getInputKey(org.eclipse.emf.ecore.EObject)
     * @since 4.2
     */
    @Override
    protected String getInputKey(EObject entity) {
        if(entity instanceof XSDNamedComponent) {
            return ((XSDNamedComponent)entity).getQName();
        }
        return null;
    }

    /** 
     * @see org.teiid.designer.core.compare.AbstractEObjectNameMatcher#getOutputKey(org.eclipse.emf.ecore.EObject)
     * @since 4.2
     */
    @Override
    protected String getOutputKey(EObject entity) {
        if(entity instanceof XSDNamedComponent) {
            return ((XSDNamedComponent)entity).getQName();
        }
        return null;
    }

}

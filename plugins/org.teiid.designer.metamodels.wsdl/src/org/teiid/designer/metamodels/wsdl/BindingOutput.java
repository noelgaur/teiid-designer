/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.wsdl;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Binding Output</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.teiid.designer.metamodels.wsdl.BindingOutput#getBindingOperation <em>Binding Operation</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getBindingOutput()
 * @model
 * @generated
 *
 * @since 8.0
 */
public interface BindingOutput extends BindingParam {

    /**
     * Returns the value of the '<em><b>Binding Operation</b></em>' container reference. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.wsdl.BindingOperation#getBindingOutput <em>Binding Output</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Operation</em>' container reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Binding Operation</em>' container reference.
     * @see #setBindingOperation(BindingOperation)
     * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getBindingOutput_BindingOperation()
     * @see org.teiid.designer.metamodels.wsdl.BindingOperation#getBindingOutput
     * @model opposite="bindingOutput" required="true"
     * @generated
     */
    BindingOperation getBindingOperation();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.wsdl.BindingOutput#getBindingOperation <em>Binding Operation</em>}'
     * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Binding Operation</em>' container reference.
     * @see #getBindingOperation()
     * @generated
     */
    void setBindingOperation( BindingOperation value );

} // BindingOutput

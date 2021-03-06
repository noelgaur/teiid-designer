/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.wsdl;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Binding Input</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.teiid.designer.metamodels.wsdl.BindingInput#getBindingOperation <em>Binding Operation</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getBindingInput()
 * @model
 * @generated
 *
 * @since 8.0
 */
public interface BindingInput extends BindingParam {

    /**
     * Returns the value of the '<em><b>Binding Operation</b></em>' container reference. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.wsdl.BindingOperation#getBindingInput <em>Binding Input</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Operation</em>' container reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Binding Operation</em>' container reference.
     * @see #setBindingOperation(BindingOperation)
     * @see org.teiid.designer.metamodels.wsdl.WsdlPackage#getBindingInput_BindingOperation()
     * @see org.teiid.designer.metamodels.wsdl.BindingOperation#getBindingInput
     * @model opposite="bindingInput" required="true"
     * @generated
     */
    BindingOperation getBindingOperation();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.wsdl.BindingInput#getBindingOperation <em>Binding Operation</em>}'
     * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Binding Operation</em>' container reference.
     * @see #getBindingOperation()
     * @generated
     */
    void setBindingOperation( BindingOperation value );

} // BindingInput

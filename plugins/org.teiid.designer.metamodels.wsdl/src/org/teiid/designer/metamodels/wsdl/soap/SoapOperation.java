/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.wsdl.soap;

import org.eclipse.emf.ecore.EObject;
import org.teiid.designer.metamodels.wsdl.BindingOperation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.teiid.designer.metamodels.wsdl.soap.SoapOperation#getBindingOperation <em>Binding Operation</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.wsdl.soap.SoapOperation#getStyle <em>Style</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.wsdl.soap.SoapOperation#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.teiid.designer.metamodels.wsdl.soap.SoapPackage#getSoapOperation()
 * @model
 * @generated
 *
 * @since 8.0
 */
public interface SoapOperation extends EObject {

    /**
     * Returns the value of the '<em><b>Style</b></em>' attribute. The default value is <code>"DOCUMENT"</code>. The literals are
     * from the enumeration {@link org.teiid.designer.metamodels.wsdl.soap.SoapStyleType}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Style</em>' attribute.
     * @see org.teiid.designer.metamodels.wsdl.soap.SoapStyleType
     * @see #setStyle(SoapStyleType)
     * @see org.teiid.designer.metamodels.wsdl.soap.SoapPackage#getSoapOperation_Style()
     * @model default="DOCUMENT"
     * @generated
     */
    SoapStyleType getStyle();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.wsdl.soap.SoapOperation#getStyle <em>Style</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Style</em>' attribute.
     * @see org.teiid.designer.metamodels.wsdl.soap.SoapStyleType
     * @see #getStyle()
     * @generated
     */
    void setStyle( SoapStyleType value );

    /**
     * Returns the value of the '<em><b>Action</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Action</em>' attribute.
     * @see #setAction(String)
     * @see org.teiid.designer.metamodels.wsdl.soap.SoapPackage#getSoapOperation_Action()
     * @model
     * @generated
     */
    String getAction();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.wsdl.soap.SoapOperation#getAction <em>Action</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Action</em>' attribute.
     * @see #getAction()
     * @generated
     */
    void setAction( String value );

    /**
     * Returns the value of the '<em><b>Binding Operation</b></em>' container reference. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.wsdl.BindingOperation#getSoapOperation <em>Soap Operation</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Binding Operation</em>' container reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Binding Operation</em>' container reference.
     * @see #setBindingOperation(BindingOperation)
     * @see org.teiid.designer.metamodels.wsdl.soap.SoapPackage#getSoapOperation_BindingOperation()
     * @see org.teiid.designer.metamodels.wsdl.BindingOperation#getSoapOperation
     * @model opposite="soapOperation" required="true"
     * @generated
     */
    BindingOperation getBindingOperation();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.wsdl.soap.SoapOperation#getBindingOperation
     * <em>Binding Operation</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Binding Operation</em>' container reference.
     * @see #getBindingOperation()
     * @generated
     */
    void setBindingOperation( BindingOperation value );

} // SoapOperation

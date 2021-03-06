/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.transformation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Mapping Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.teiid.designer.metamodels.transformation.MappingClass#isRecursive <em>Recursive</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.transformation.MappingClass#isRecursionAllowed <em>Recursion Allowed</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.transformation.MappingClass#getRecursionCriteria <em>Recursion Criteria</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.transformation.MappingClass#getRecursionLimit <em>Recursion Limit</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.transformation.MappingClass#getRecursionLimitErrorMode <em>Recursion Limit Error Mode
 * </em>}</li>
 * <li>{@link org.teiid.designer.metamodels.transformation.MappingClass#getColumns <em>Columns</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.transformation.MappingClass#getMappingClassSet <em>Mapping Class Set</em>}</li>
 * <li>{@link org.teiid.designer.metamodels.transformation.MappingClass#getInputSet <em>Input Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.teiid.designer.metamodels.transformation.TransformationPackage#getMappingClass()
 * @model
 * @generated
 *
 * @since 8.0
 */
public interface MappingClass extends MappingClassObject {

    /**
     * Returns the value of the '<em><b>Recursive</b></em>' attribute. The default value is <code>"false"</code>. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recursive</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Recursive</em>' attribute.
     * @see #setRecursive(boolean)
     * @see org.teiid.designer.metamodels.transformation.TransformationPackage#getMappingClass_Recursive()
     * @model default="false"
     * @generated
     */
    boolean isRecursive();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.transformation.MappingClass#isRecursive <em>Recursive</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Recursive</em>' attribute.
     * @see #isRecursive()
     * @generated
     */
    void setRecursive( boolean value );

    /**
     * Returns the value of the '<em><b>Recursion Allowed</b></em>' attribute. The default value is <code>"false"</code>. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recursion Allowed</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Recursion Allowed</em>' attribute.
     * @see #setRecursionAllowed(boolean)
     * @see org.teiid.designer.metamodels.transformation.TransformationPackage#getMappingClass_RecursionAllowed()
     * @model default="false"
     * @generated
     */
    boolean isRecursionAllowed();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.transformation.MappingClass#isRecursionAllowed
     * <em>Recursion Allowed</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Recursion Allowed</em>' attribute.
     * @see #isRecursionAllowed()
     * @generated
     */
    void setRecursionAllowed( boolean value );

    /**
     * Returns the value of the '<em><b>Recursion Criteria</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recursion Criteria</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Recursion Criteria</em>' attribute.
     * @see #setRecursionCriteria(String)
     * @see org.teiid.designer.metamodels.transformation.TransformationPackage#getMappingClass_RecursionCriteria()
     * @model
     * @generated
     */
    String getRecursionCriteria();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.transformation.MappingClass#getRecursionCriteria
     * <em>Recursion Criteria</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Recursion Criteria</em>' attribute.
     * @see #getRecursionCriteria()
     * @generated
     */
    void setRecursionCriteria( String value );

    /**
     * Returns the value of the '<em><b>Recursion Limit</b></em>' attribute. The default value is <code>"5"</code>. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recursion Limit</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Recursion Limit</em>' attribute.
     * @see #setRecursionLimit(int)
     * @see org.teiid.designer.metamodels.transformation.TransformationPackage#getMappingClass_RecursionLimit()
     * @model default="5"
     * @generated
     */
    int getRecursionLimit();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.transformation.MappingClass#getRecursionLimit
     * <em>Recursion Limit</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Recursion Limit</em>' attribute.
     * @see #getRecursionLimit()
     * @generated
     */
    void setRecursionLimit( int value );

    /**
     * Returns the value of the '<em><b>Recursion Limit Error Mode</b></em>' attribute. The default value is <code>"THROW"</code>.
     * The literals are from the enumeration {@link org.teiid.designer.metamodels.transformation.RecursionErrorMode}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recursion Limit Error Mode</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Recursion Limit Error Mode</em>' attribute.
     * @see org.teiid.designer.metamodels.transformation.RecursionErrorMode
     * @see #setRecursionLimitErrorMode(RecursionErrorMode)
     * @see org.teiid.designer.metamodels.transformation.TransformationPackage#getMappingClass_RecursionLimitErrorMode()
     * @model default="THROW"
     * @generated
     */
    RecursionErrorMode getRecursionLimitErrorMode();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.transformation.MappingClass#getRecursionLimitErrorMode
     * <em>Recursion Limit Error Mode</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Recursion Limit Error Mode</em>' attribute.
     * @see org.teiid.designer.metamodels.transformation.RecursionErrorMode
     * @see #getRecursionLimitErrorMode()
     * @generated
     */
    void setRecursionLimitErrorMode( RecursionErrorMode value );

    /**
     * Returns the value of the '<em><b>Columns</b></em>' containment reference list. The list contents are of type
     * {@link org.teiid.designer.metamodels.transformation.MappingClassColumn}. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.transformation.MappingClassColumn#getMappingClass <em>Mapping Class</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Columns</em>' containment reference list isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Columns</em>' containment reference list.
     * @see org.teiid.designer.metamodels.transformation.TransformationPackage#getMappingClass_Columns()
     * @see org.teiid.designer.metamodels.transformation.MappingClassColumn#getMappingClass
     * @model type="org.teiid.designer.metamodels.transformation.MappingClassColumn" opposite="mappingClass" containment="true"
     *        required="true"
     * @generated
     */
    EList getColumns();

    /**
     * Returns the value of the '<em><b>Mapping Class Set</b></em>' container reference. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.transformation.MappingClassSet#getMappingClasses <em>Mapping Classes</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapping Class Set</em>' container reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Mapping Class Set</em>' container reference.
     * @see #setMappingClassSet(MappingClassSet)
     * @see org.teiid.designer.metamodels.transformation.TransformationPackage#getMappingClass_MappingClassSet()
     * @see org.teiid.designer.metamodels.transformation.MappingClassSet#getMappingClasses
     * @model opposite="mappingClasses"
     * @generated
     */
    MappingClassSet getMappingClassSet();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.transformation.MappingClass#getMappingClassSet
     * <em>Mapping Class Set</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Mapping Class Set</em>' container reference.
     * @see #getMappingClassSet()
     * @generated
     */
    void setMappingClassSet( MappingClassSet value );

    /**
     * Returns the value of the '<em><b>Input Set</b></em>' containment reference. It is bidirectional and its opposite is '
     * {@link org.teiid.designer.metamodels.transformation.InputSet#getMappingClass <em>Mapping Class</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Set</em>' containment reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Input Set</em>' containment reference.
     * @see #setInputSet(InputSet)
     * @see org.teiid.designer.metamodels.transformation.TransformationPackage#getMappingClass_InputSet()
     * @see org.teiid.designer.metamodels.transformation.InputSet#getMappingClass
     * @model opposite="mappingClass" containment="true"
     * @generated
     */
    InputSet getInputSet();

    /**
     * Sets the value of the '{@link org.teiid.designer.metamodels.transformation.MappingClass#getInputSet <em>Input Set</em>}'
     * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Input Set</em>' containment reference.
     * @see #getInputSet()
     * @generated
     */
    void setInputSet( InputSet value );

} // MappingClass

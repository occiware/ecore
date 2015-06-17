/**
 */
package org.occiware.clouddesigner.occi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.Extension#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Extension#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Extension#getImport <em>Import</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Extension#getKinds <em>Kinds</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Extension#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.Extension#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.OCCIPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getExtension_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Extension!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.Extension#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getExtension_Scheme()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Extension!scheme'"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.Extension#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getExtension_Import()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Extension!import'"
	 * @generated
	 */
	EList<Extension> getImport();

	/**
	 * Returns the value of the '<em><b>Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kinds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinds</em>' containment reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getExtension_Kinds()
	 * @model containment="true" keys="term"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Extension!kinds'"
	 * @generated
	 */
	EList<Kind> getKinds();

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' containment reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getExtension_Mixins()
	 * @model containment="true" keys="term"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Extension!mixins'"
	 * @generated
	 */
	EList<Mixin> getMixins();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getExtension_Types()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Extension!types'"
	 * @generated
	 */
	EList<EDataType> getTypes();

} // Extension

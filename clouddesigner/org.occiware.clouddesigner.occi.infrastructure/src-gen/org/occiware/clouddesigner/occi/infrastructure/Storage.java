/**
 */
package org.occiware.clouddesigner.occi.infrastructure;

import org.occiware.clouddesigner.occi.Resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getSize <em>Size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStorage()
 * @model annotation="OCCIE2Ecore title='Storage Resource'"
 * @generated
 */
public interface Storage extends Resource {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(float)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStorage_Size()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.GiB" required="true"
	 *        annotation="OCCIE2Ecore description='Storage size in gigabytes of the instance'"
	 * @generated
	 */
	float getSize();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(float value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.StorageStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageStatus
	 * @see #setState(StorageStatus)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStorage_State()
	 * @model required="true"
	 *        annotation="OCCIE2Ecore description='Current status of the instance'"
	 * @generated
	 */
	StorageStatus getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Storage#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(StorageStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Set storage online'"
	 * @generated
	 */
	void online();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Set storage offline'"
	 * @generated
	 */
	void offline();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Set storage as backup'"
	 * @generated
	 */
	void backup();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Take storage snapshot'"
	 * @generated
	 */
	void snapshot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sizeDataType="org.occiware.clouddesigner.occi.infrastructure.GiB" sizeRequired="true"
	 *        sizeAnnotation="OCCIE2Ecore description='null'"
	 *        annotation="OCCIE2Ecore title='Resize storage'"
	 * @generated
	 */
	void resize(float size);

} // Storage

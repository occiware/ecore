/**
 */
package org.occiware.clouddesigner.occi.infrastructure;

import org.occiware.clouddesigner.OCCI.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storagelink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink#getDeviceid <em>Deviceid</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink#getMountpoint <em>Mountpoint</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStoragelink()
 * @model
 * @generated
 */
public interface Storagelink extends Link {
	/**
	 * Returns the value of the '<em><b>Deviceid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviceid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviceid</em>' attribute.
	 * @see #setDeviceid(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStoragelink_Deviceid()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Storagelink!deviceid'"
	 * @generated
	 */
	String getDeviceid();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink#getDeviceid <em>Deviceid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviceid</em>' attribute.
	 * @see #getDeviceid()
	 * @generated
	 */
	void setDeviceid(String value);

	/**
	 * Returns the value of the '<em><b>Mountpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mountpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mountpoint</em>' attribute.
	 * @see #setMountpoint(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStoragelink_Mountpoint()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Storagelink!mountpoint'"
	 * @generated
	 */
	String getMountpoint();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink#getMountpoint <em>Mountpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mountpoint</em>' attribute.
	 * @see #getMountpoint()
	 * @generated
	 */
	void setMountpoint(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus
	 * @see #setState(StorageLinkStatus)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getStoragelink_State()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Storagelink!state'"
	 * @generated
	 */
	StorageLinkStatus getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Storagelink#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(StorageLinkStatus value);

} // Storagelink

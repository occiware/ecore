/**
 */
package org.occiware.clouddesigner.occi.hypervisor;

import org.occiware.clouddesigner.occi.infrastructure.Storage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getType <em>Type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getDevice <em>Device</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getSource <em>Source</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Disk#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getTarget_dev <em>Target dev</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getTarget_bus <em>Target bus</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDisk()
 * @model annotation="OCCIE2Ecore title='Disk resource'"
 * @generated
 */
public interface Disk extends Storage {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Disk"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDisk_Name()
	 * @model default="Disk" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The default name of the resource'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDisk_Type()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The kind of disk.'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDisk_Device()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Specify the disk device\'s.'"
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDisk_Source()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see #setReadonly(boolean)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDisk_Readonly()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Returns the value of the '<em><b>Target dev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target dev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target dev</em>' attribute.
	 * @see #setTarget_dev(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDisk_Target_dev()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getTarget_dev();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getTarget_dev <em>Target dev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target dev</em>' attribute.
	 * @see #getTarget_dev()
	 * @generated
	 */
	void setTarget_dev(String value);

	/**
	 * Returns the value of the '<em><b>Target bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target bus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target bus</em>' attribute.
	 * @see #setTarget_bus(String)
	 * @see org.occiware.clouddesigner.occi.hypervisor.HypervisorPackage#getDisk_Target_bus()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getTarget_bus();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.hypervisor.Disk#getTarget_bus <em>Target bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target bus</em>' attribute.
	 * @see #getTarget_bus()
	 * @generated
	 */
	void setTarget_bus(String value);

} // Disk

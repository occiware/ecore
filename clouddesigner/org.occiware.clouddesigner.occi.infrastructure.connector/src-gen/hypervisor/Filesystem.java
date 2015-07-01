/**
 */
package hypervisor;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filesystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hypervisor.Filesystem#getName <em>Name</em>}</li>
 *   <li>{@link hypervisor.Filesystem#getSource <em>Source</em>}</li>
 *   <li>{@link hypervisor.Filesystem#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see hypervisor.HypervisorPackage#getFilesystem()
 * @model
 * @generated
 */
public interface Filesystem extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"filesystem"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hypervisor.HypervisorPackage#getFilesystem_Name()
	 * @model default="filesystem" dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hypervisor.Filesystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see hypervisor.HypervisorPackage#getFilesystem_Source()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link hypervisor.Filesystem#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see hypervisor.HypervisorPackage#getFilesystem_Target()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link hypervisor.Filesystem#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // Filesystem

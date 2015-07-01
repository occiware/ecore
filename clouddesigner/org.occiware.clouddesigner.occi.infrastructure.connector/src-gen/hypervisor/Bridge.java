/**
 */
package hypervisor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hypervisor.Bridge#getSource_bridge <em>Source bridge</em>}</li>
 * </ul>
 * </p>
 *
 * @see hypervisor.HypervisorPackage#getBridge()
 * @model
 * @generated
 */
public interface Bridge extends Interface {
	/**
	 * Returns the value of the '<em><b>Source bridge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source bridge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source bridge</em>' attribute.
	 * @see #setSource_bridge(String)
	 * @see hypervisor.HypervisorPackage#getBridge_Source_bridge()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getSource_bridge();

	/**
	 * Sets the value of the '{@link hypervisor.Bridge#getSource_bridge <em>Source bridge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source bridge</em>' attribute.
	 * @see #getSource_bridge()
	 * @generated
	 */
	void setSource_bridge(String value);

} // Bridge

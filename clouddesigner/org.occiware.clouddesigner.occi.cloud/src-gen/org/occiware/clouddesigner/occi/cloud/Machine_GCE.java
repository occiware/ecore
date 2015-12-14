/**
 */
package org.occiware.clouddesigner.occi.cloud;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine GCE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getZone <em>Zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getMachine_type <em>Machine type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getMachine_url <em>Machine url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getFirewall_tag <em>Firewall tag</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getStartup_script <em>Startup script</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getJson_file <em>Json file</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_GCE()
 * @model
 * @generated
 */
public interface Machine_GCE extends Machine {
	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_GCE_Zone()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_GCE_Region()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Machine type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine type</em>' attribute.
	 * @see #setMachine_type(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_GCE_Machine_type()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getMachine_type();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getMachine_type <em>Machine type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine type</em>' attribute.
	 * @see #getMachine_type()
	 * @generated
	 */
	void setMachine_type(String value);

	/**
	 * Returns the value of the '<em><b>Machine url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine url</em>' attribute.
	 * @see #setMachine_url(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_GCE_Machine_url()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getMachine_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getMachine_url <em>Machine url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine url</em>' attribute.
	 * @see #getMachine_url()
	 * @generated
	 */
	void setMachine_url(String value);

	/**
	 * Returns the value of the '<em><b>Firewall tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firewall tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firewall tag</em>' attribute.
	 * @see #setFirewall_tag(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_GCE_Firewall_tag()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getFirewall_tag();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getFirewall_tag <em>Firewall tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firewall tag</em>' attribute.
	 * @see #getFirewall_tag()
	 * @generated
	 */
	void setFirewall_tag(String value);

	/**
	 * Returns the value of the '<em><b>Startup script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup script</em>' attribute.
	 * @see #setStartup_script(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_GCE_Startup_script()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getStartup_script();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getStartup_script <em>Startup script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup script</em>' attribute.
	 * @see #getStartup_script()
	 * @generated
	 */
	void setStartup_script(String value);

	/**
	 * Returns the value of the '<em><b>Json file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json file</em>' attribute.
	 * @see #setJson_file(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_GCE_Json_file()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 * @generated
	 */
	String getJson_file();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getJson_file <em>Json file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json file</em>' attribute.
	 * @see #getJson_file()
	 * @generated
	 */
	void setJson_file(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage#getMachine_GCE_Provider()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.cloud.Machine_GCE#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

} // Machine_GCE

/**
 */
package hypervisor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Virtual Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hypervisor.Machine_VirtualBox#getType <em>Type</em>}</li>
 *   <li>{@link hypervisor.Machine_VirtualBox#getFeatures <em>Features</em>}</li>
 *   <li>{@link hypervisor.Machine_VirtualBox#getOn_poweroff <em>On poweroff</em>}</li>
 *   <li>{@link hypervisor.Machine_VirtualBox#getOn_reboot <em>On reboot</em>}</li>
 *   <li>{@link hypervisor.Machine_VirtualBox#getOn_crash <em>On crash</em>}</li>
 *   <li>{@link hypervisor.Machine_VirtualBox#getCurrent_memory <em>Current memory</em>}</li>
 *   <li>{@link hypervisor.Machine_VirtualBox#getVcpu <em>Vcpu</em>}</li>
 * </ul>
 * </p>
 *
 * @see hypervisor.HypervisorPackage#getMachine_VirtualBox()
 * @model
 * @generated
 */
public interface Machine_VirtualBox extends Machine {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"hvm"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see hypervisor.HypervisorPackage#getMachine_VirtualBox_Type()
	 * @model default="hvm" dataType="org.occiware.clouddesigner.occi.String" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link hypervisor.Machine_VirtualBox#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute.
	 * The default value is <code>"acpi"</code>.
	 * The literals are from the enumeration {@link hypervisor.FEATURES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' attribute.
	 * @see hypervisor.FEATURES
	 * @see #setFeatures(FEATURES)
	 * @see hypervisor.HypervisorPackage#getMachine_VirtualBox_Features()
	 * @model default="acpi"
	 * @generated
	 */
	FEATURES getFeatures();

	/**
	 * Sets the value of the '{@link hypervisor.Machine_VirtualBox#getFeatures <em>Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' attribute.
	 * @see hypervisor.FEATURES
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(FEATURES value);

	/**
	 * Returns the value of the '<em><b>On poweroff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On poweroff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On poweroff</em>' attribute.
	 * @see #setOn_poweroff(String)
	 * @see hypervisor.HypervisorPackage#getMachine_VirtualBox_On_poweroff()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getOn_poweroff();

	/**
	 * Sets the value of the '{@link hypervisor.Machine_VirtualBox#getOn_poweroff <em>On poweroff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On poweroff</em>' attribute.
	 * @see #getOn_poweroff()
	 * @generated
	 */
	void setOn_poweroff(String value);

	/**
	 * Returns the value of the '<em><b>On reboot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On reboot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On reboot</em>' attribute.
	 * @see #setOn_reboot(String)
	 * @see hypervisor.HypervisorPackage#getMachine_VirtualBox_On_reboot()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getOn_reboot();

	/**
	 * Sets the value of the '{@link hypervisor.Machine_VirtualBox#getOn_reboot <em>On reboot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On reboot</em>' attribute.
	 * @see #getOn_reboot()
	 * @generated
	 */
	void setOn_reboot(String value);

	/**
	 * Returns the value of the '<em><b>On crash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On crash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On crash</em>' attribute.
	 * @see #setOn_crash(String)
	 * @see hypervisor.HypervisorPackage#getMachine_VirtualBox_On_crash()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 * @generated
	 */
	String getOn_crash();

	/**
	 * Sets the value of the '{@link hypervisor.Machine_VirtualBox#getOn_crash <em>On crash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On crash</em>' attribute.
	 * @see #getOn_crash()
	 * @generated
	 */
	void setOn_crash(String value);

	/**
	 * Returns the value of the '<em><b>Current memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current memory</em>' attribute.
	 * @see #setCurrent_memory(int)
	 * @see hypervisor.HypervisorPackage#getMachine_VirtualBox_Current_memory()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 * @generated
	 */
	int getCurrent_memory();

	/**
	 * Sets the value of the '{@link hypervisor.Machine_VirtualBox#getCurrent_memory <em>Current memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current memory</em>' attribute.
	 * @see #getCurrent_memory()
	 * @generated
	 */
	void setCurrent_memory(int value);

	/**
	 * Returns the value of the '<em><b>Vcpu</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vcpu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vcpu</em>' attribute.
	 * @see #setVcpu(int)
	 * @see hypervisor.HypervisorPackage#getMachine_VirtualBox_Vcpu()
	 * @model default="1" dataType="org.occiware.clouddesigner.occi.Number"
	 * @generated
	 */
	int getVcpu();

	/**
	 * Sets the value of the '{@link hypervisor.Machine_VirtualBox#getVcpu <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcpu</em>' attribute.
	 * @see #getVcpu()
	 * @generated
	 */
	void setVcpu(int value);

} // Machine_VirtualBox

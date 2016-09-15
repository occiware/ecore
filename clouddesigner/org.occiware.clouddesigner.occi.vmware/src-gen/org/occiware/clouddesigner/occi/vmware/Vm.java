/**
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.vmware;

import org.occiware.clouddesigner.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#getInstanceUUID <em>Instance UUID</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#isTemplate <em>Template</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#getVcpus <em>Vcpus</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#getCoresPerSocket <em>Cores Per Socket</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#getGuestState <em>Guest State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#isVmwareToolsInstalled <em>Vmware Tools Installed</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#isVmwareToolsRunning <em>Vmware Tools Running</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#getGuestFullName <em>Guest Full Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#isCpuhotAddEnabled <em>Cpuhot Add Enabled</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#isCpuHotRemoveEnabled <em>Cpu Hot Remove Enabled</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#getVmwarePowerState <em>Vmware Power State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Vm#getOverallStatus <em>Overall Status</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm()
 * @model annotation="OCCIE2Ecore title='Virtual machine compute on a host system'"
 * @generated
 */
public interface Vm extends Compute {
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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Display name of the virtual machine. Any % (percent) character used in this name parameter must be escaped, unless it is used to start an escape sequence.\nClients may also escape any other characters in this name parameter. \nSnapshots of virtual machines that have spaces in their names and are associated with ESX 2.x servers are not supported. Therefore, if you want the option to take snapshots of this virtual machine and you are associating it with an ESX 2.x server, do not use spaces in the name.\nReconfigure privilege: VirtualMachine.Config.Rename'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instance UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance UUID</em>' attribute.
	 * @see #setInstanceUUID(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_InstanceUUID()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='VirtualCenter-specific 128-bit UUID of a virtual machine, represented as a hexademical string. This identifier is used by VirtualCenter to uniquely identify all virtual machine instances, including those that may share the same SMBIOS UUID.'"
	 * @generated
	 */
	String getInstanceUUID();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#getInstanceUUID <em>Instance UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance UUID</em>' attribute.
	 * @see #getInstanceUUID()
	 * @generated
	 */
	void setInstanceUUID(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_Template()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='If true, this virtual machine is set as a template machine and may be used as an image'"
	 * @generated
	 */
	boolean isTemplate();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#isTemplate <em>Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #isTemplate()
	 * @generated
	 */
	void setTemplate(boolean value);

	/**
	 * Returns the value of the '<em><b>Vcpus</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vcpus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vcpus</em>' attribute.
	 * @see #setVcpus(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_Vcpus()
	 * @model default="1" dataType="org.occiware.clouddesigner.occi.Number" required="true"
	 *        annotation="OCCIE2Ecore description='Number of virtual cpus\nReconfigure privilege: VirtualMachine.Config.CpuCount '"
	 * @generated
	 */
	int getVcpus();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#getVcpus <em>Vcpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcpus</em>' attribute.
	 * @see #getVcpus()
	 * @generated
	 */
	void setVcpus(int value);

	/**
	 * Returns the value of the '<em><b>Cores Per Socket</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores Per Socket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores Per Socket</em>' attribute.
	 * @see #setCoresPerSocket(int)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_CoresPerSocket()
	 * @model default="1" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Number of cores per socket'"
	 * @generated
	 */
	int getCoresPerSocket();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#getCoresPerSocket <em>Cores Per Socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores Per Socket</em>' attribute.
	 * @see #getCoresPerSocket()
	 * @generated
	 */
	void setCoresPerSocket(int value);

	/**
	 * Returns the value of the '<em><b>Guest State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest State</em>' attribute.
	 * @see #setGuestState(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_GuestState()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='if vmware tools is installed this value show the state of the operating system'"
	 * @generated
	 */
	String getGuestState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#getGuestState <em>Guest State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest State</em>' attribute.
	 * @see #getGuestState()
	 * @generated
	 */
	void setGuestState(String value);

	/**
	 * Returns the value of the '<em><b>Vmware Tools Installed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmware Tools Installed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmware Tools Installed</em>' attribute.
	 * @see #setVmwareToolsInstalled(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_VmwareToolsInstalled()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Is vmware tools installed on this virtual machine'"
	 * @generated
	 */
	boolean isVmwareToolsInstalled();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#isVmwareToolsInstalled <em>Vmware Tools Installed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmware Tools Installed</em>' attribute.
	 * @see #isVmwareToolsInstalled()
	 * @generated
	 */
	void setVmwareToolsInstalled(boolean value);

	/**
	 * Returns the value of the '<em><b>Vmware Tools Running</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmware Tools Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmware Tools Running</em>' attribute.
	 * @see #setVmwareToolsRunning(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_VmwareToolsRunning()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='is vmware tools running on this virtual machine'"
	 * @generated
	 */
	boolean isVmwareToolsRunning();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#isVmwareToolsRunning <em>Vmware Tools Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmware Tools Running</em>' attribute.
	 * @see #isVmwareToolsRunning()
	 * @generated
	 */
	void setVmwareToolsRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Guest Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Full Name</em>' attribute.
	 * @see #setGuestFullName(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_GuestFullName()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='This is the full name of the guest operating system for the virtual machine. For example: Windows 2000 Professional.'"
	 * @generated
	 */
	String getGuestFullName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#getGuestFullName <em>Guest Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Full Name</em>' attribute.
	 * @see #getGuestFullName()
	 * @generated
	 */
	void setGuestFullName(String value);

	/**
	 * Returns the value of the '<em><b>Cpuhot Add Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpuhot Add Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpuhot Add Enabled</em>' attribute.
	 * @see #setCpuhotAddEnabled(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_CpuhotAddEnabled()
	 * @model default="true" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Whether virtual processors can be added while this virtual machine is running.\nSince vSphere API 4.0'"
	 * @generated
	 */
	boolean isCpuhotAddEnabled();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#isCpuhotAddEnabled <em>Cpuhot Add Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpuhot Add Enabled</em>' attribute.
	 * @see #isCpuhotAddEnabled()
	 * @generated
	 */
	void setCpuhotAddEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Cpu Hot Remove Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Hot Remove Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Hot Remove Enabled</em>' attribute.
	 * @see #setCpuHotRemoveEnabled(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_CpuHotRemoveEnabled()
	 * @model default="true" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Whether virtual processors can be removed while this virtual machine is running.\nSince vSphere API 4.0'"
	 * @generated
	 */
	boolean isCpuHotRemoveEnabled();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#isCpuHotRemoveEnabled <em>Cpu Hot Remove Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Hot Remove Enabled</em>' attribute.
	 * @see #isCpuHotRemoveEnabled()
	 * @generated
	 */
	void setCpuHotRemoveEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_Annotation()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='User-provided description of the virtual machine. Because this property is optional in the virtual machine configuration, it is necessary to pass an explicit empty string in a ConfigSpec object to remove an annotation that is already present in the VirtualMachineConfigInfo for a virtual machine.\nReconfigure privilege: VirtualMachine.Config.Rename '"
	 * @generated
	 */
	String getAnnotation();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(String value);

	/**
	 * Returns the value of the '<em><b>Vmware Power State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmware Power State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmware Power State</em>' attribute.
	 * @see #setVmwarePowerState(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_VmwarePowerState()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getVmwarePowerState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#getVmwarePowerState <em>Vmware Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmware Power State</em>' attribute.
	 * @see #getVmwarePowerState()
	 * @generated
	 */
	void setVmwarePowerState(String value);

	/**
	 * Returns the value of the '<em><b>Overall Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.vmware.OverallStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Status</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.OverallStatus
	 * @see #setOverallStatus(OverallStatus)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getVm_OverallStatus()
	 * @model annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	OverallStatus getOverallStatus();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Vm#getOverallStatus <em>Overall Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Status</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.OverallStatus
	 * @see #getOverallStatus()
	 * @generated
	 */
	void setOverallStatus(OverallStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Clone a virtual machine'"
	 * @generated
	 */
	void cloneVM();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Mount vmware tools iso'"
	 * @generated
	 */
	void mountVmwareToolsdisk();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Mark this virtual machine as a template image'"
	 * @generated
	 */
	void markAsTemplate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Mark this template image as a virtual machine'"
	 * @generated
	 */
	void markAsVirtualMachine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Register this virtual machine on vcenter'"
	 * @generated
	 */
	void registerVM();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Unregister this virtual machine from vcenter'"
	 * @generated
	 */
	void unregisterVM();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Defragment all virtual disk on this virtual machine'"
	 * @generated
	 */
	void defragmentAllDisks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='128-bit hash based on the virtual machine\'s configuration file location and the UUID of the host assigned to run the virtual machine.Normally, this property is not set by a client, allowing the Virtual Infrastructure environment to assign a location ID when the virtual machine is created. However, if the virtual machine\'s configuration file has been manually moved, it may be desirable to clear this property, setting it to an empty string, so the property is regenerated.Reconfigure privilege: VirtualMachine.Config.Settings'"
	 * @generated
	 */
	void resetLocationId();

} // Vm

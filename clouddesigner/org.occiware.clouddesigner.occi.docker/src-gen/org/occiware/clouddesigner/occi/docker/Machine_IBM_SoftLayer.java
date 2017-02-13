/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * -Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine IBM Soft Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getApi_endpoint <em>Api endpoint</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getUser <em>User</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getApi_key <em>Api key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getCpu <em>Cpu</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isHourly_billing <em>Hourly billing</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isLocal_disk <em>Local disk</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isPrivate_net_only <em>Private net only</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getPublic_vlan_id <em>Public vlan id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getPrivate_vlan_id <em>Private vlan id</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer()
 * @model annotation="OCCIE2Ecore title='Machine on IBM SoftLayer'"
 * @generated
 */
public interface Machine_IBM_SoftLayer extends Machine {
	/**
	 * Returns the value of the '<em><b>Api endpoint</b></em>' attribute.
	 * The default value is <code>"api.softlayer.com/rest/v3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api endpoint</em>' attribute.
	 * @see #setApi_endpoint(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Api_endpoint()
	 * @model default="api.softlayer.com/rest/v3" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Change softlayer API endpoint'"
	 * @generated
	 */
	String getApi_endpoint();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getApi_endpoint <em>Api endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api endpoint</em>' attribute.
	 * @see #getApi_endpoint()
	 * @generated
	 */
	void setApi_endpoint(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_User()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='username for your softlayer account, api key needs to match this user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Api key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api key</em>' attribute.
	 * @see #setApi_key(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Api_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='API key for your user account'"
	 * @generated
	 */
	String getApi_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getApi_key <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api key</em>' attribute.
	 * @see #getApi_key()
	 * @generated
	 */
	void setApi_key(String value);

	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu</em>' attribute.
	 * @see #setCpu(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Cpu()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Number of CPU\'s for the machine'"
	 * @generated
	 */
	int getCpu();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getCpu <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' attribute.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(int value);

	/**
	 * Returns the value of the '<em><b>Disk size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk size</em>' attribute.
	 * @see #setDisk_size(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Disk_size()
	 * @model dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Size of the disk in MB. 0 sets the softlayer default'"
	 * @generated
	 */
	int getDisk_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getDisk_size <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk size</em>' attribute.
	 * @see #getDisk_size()
	 * @generated
	 */
	void setDisk_size(int value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Domain()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='domain name for the machine'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Hourly billing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hourly billing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hourly billing</em>' attribute.
	 * @see #setHourly_billing(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Hourly_billing()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Sets the hourly billing flag (default), otherwise uses monthly billing'"
	 * @generated
	 */
	boolean isHourly_billing();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isHourly_billing <em>Hourly billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hourly billing</em>' attribute.
	 * @see #isHourly_billing()
	 * @generated
	 */
	void setHourly_billing(boolean value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * The default value is <code>"UBUNTU_LATEST"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Image()
	 * @model default="UBUNTU_LATEST" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='OS Image to use'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Local disk</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local disk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local disk</em>' attribute.
	 * @see #setLocal_disk(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Local_disk()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Use local machine disk instead of softlayer SAN'"
	 * @generated
	 */
	boolean isLocal_disk();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isLocal_disk <em>Local disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local disk</em>' attribute.
	 * @see #isLocal_disk()
	 * @generated
	 */
	void setLocal_disk(boolean value);

	/**
	 * Returns the value of the '<em><b>Private net only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private net only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private net only</em>' attribute.
	 * @see #setPrivate_net_only(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Private_net_only()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Disable public networking'"
	 * @generated
	 */
	boolean isPrivate_net_only();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#isPrivate_net_only <em>Private net only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private net only</em>' attribute.
	 * @see #isPrivate_net_only()
	 * @generated
	 */
	void setPrivate_net_only(boolean value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Region()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='softlayer region'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Public vlan id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public vlan id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public vlan id</em>' attribute.
	 * @see #setPublic_vlan_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Public_vlan_id()
	 * @model default="0" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Your public VLAN ID.'"
	 * @generated
	 */
	String getPublic_vlan_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getPublic_vlan_id <em>Public vlan id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public vlan id</em>' attribute.
	 * @see #getPublic_vlan_id()
	 * @generated
	 */
	void setPublic_vlan_id(String value);

	/**
	 * Returns the value of the '<em><b>Private vlan id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private vlan id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private vlan id</em>' attribute.
	 * @see #setPrivate_vlan_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_IBM_SoftLayer_Private_vlan_id()
	 * @model default="0" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Your private VLAN ID.'"
	 * @generated
	 */
	String getPrivate_vlan_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_IBM_SoftLayer#getPrivate_vlan_id <em>Private vlan id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private vlan id</em>' attribute.
	 * @see #getPrivate_vlan_id()
	 * @generated
	 */
	void setPrivate_vlan_id(String value);

} // Machine_IBM_SoftLayer

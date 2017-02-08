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
 * A representation of the model object '<em><b>Machine Open Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFlavor_id <em>Flavor id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFlavor_name <em>Flavor name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getImage_id <em>Image id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getImage_name <em>Image name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getAuth_url <em>Auth url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_name <em>Tenant name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getEndpoint_type <em>Endpoint type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getNet_id <em>Net id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getNet_name <em>Net name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSec_groups <em>Sec groups</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFloatingip_pool <em>Floatingip pool</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getActive_timeout <em>Active timeout</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getAvailability_zone <em>Availability zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getDomain_id <em>Domain id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getDomain_name <em>Domain name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#isInsecure <em>Insecure</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getIp_version <em>Ip version</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getKeypair_name <em>Keypair name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getPrivate_key_file <em>Private key file</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSsh_port <em>Ssh port</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSsh_user <em>Ssh user</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack()
 * @model annotation="OCCIE2Ecore title='Machine on OpenStack'"
 * @generated
 */
public interface Machine_OpenStack extends Machine {
	/**
	 * Returns the value of the '<em><b>Flavor id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flavor id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flavor id</em>' attribute.
	 * @see #setFlavor_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Flavor_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The flavor ID to use when creating the machine'"
	 * @generated
	 */
	String getFlavor_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFlavor_id <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor id</em>' attribute.
	 * @see #getFlavor_id()
	 * @generated
	 */
	void setFlavor_id(String value);

	/**
	 * Returns the value of the '<em><b>Flavor name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flavor name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flavor name</em>' attribute.
	 * @see #setFlavor_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Flavor_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The OS FLAVOR NAME'"
	 * @generated
	 */
	String getFlavor_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFlavor_name <em>Flavor name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor name</em>' attribute.
	 * @see #getFlavor_name()
	 * @generated
	 */
	void setFlavor_name(String value);

	/**
	 * Returns the value of the '<em><b>Image id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image id</em>' attribute.
	 * @see #setImage_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Image_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='The image ID to use when creating the machine'"
	 * @generated
	 */
	String getImage_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getImage_id <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image id</em>' attribute.
	 * @see #getImage_id()
	 * @generated
	 */
	void setImage_id(String value);

	/**
	 * Returns the value of the '<em><b>Image name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image name</em>' attribute.
	 * @see #setImage_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Image_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The OS IMAGE NAME'"
	 * @generated
	 */
	String getImage_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getImage_name <em>Image name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image name</em>' attribute.
	 * @see #getImage_name()
	 * @generated
	 */
	void setImage_name(String value);

	/**
	 * Returns the value of the '<em><b>Auth url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth url</em>' attribute.
	 * @see #setAuth_url(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Auth_url()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Keystone service base URL'"
	 * @generated
	 */
	String getAuth_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getAuth_url <em>Auth url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth url</em>' attribute.
	 * @see #getAuth_url()
	 * @generated
	 */
	void setAuth_url(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Username()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='User identifer to authenticate with'"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Password()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='User password. It can be omitted if the standard environment variable OS_PASSWORD is set.'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Tenant name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant name</em>' attribute.
	 * @see #setTenant_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Tenant_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Identify the tenant in which the machine will be created'"
	 * @generated
	 */
	String getTenant_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_name <em>Tenant name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant name</em>' attribute.
	 * @see #getTenant_name()
	 * @generated
	 */
	void setTenant_name(String value);

	/**
	 * Returns the value of the '<em><b>Tenant id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant id</em>' attribute.
	 * @see #setTenant_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Tenant_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Identify the tenant in which the machine will be created'"
	 * @generated
	 */
	String getTenant_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getTenant_id <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant id</em>' attribute.
	 * @see #getTenant_id()
	 * @generated
	 */
	void setTenant_id(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Region()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The region to work on. Can be omitted if there is only one region on the OpenStack'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint type</b></em>' attribute.
	 * The default value is <code>"publicURL"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint type</em>' attribute.
	 * @see #setEndpoint_type(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Endpoint_type()
	 * @model default="publicURL" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Endpoint type can be internalURL, adminURL on publicURL. If is a helper for the driver to choose the right URL in the OpenStack service catalog. If not provided the default id publicURL'"
	 * @generated
	 */
	String getEndpoint_type();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getEndpoint_type <em>Endpoint type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint type</em>' attribute.
	 * @see #getEndpoint_type()
	 * @generated
	 */
	void setEndpoint_type(String value);

	/**
	 * Returns the value of the '<em><b>Net id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net id</em>' attribute.
	 * @see #setNet_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Net_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The private network id the machine will be connected on. If your OpenStack project project contains only one private network it will be use automatically'"
	 * @generated
	 */
	String getNet_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getNet_id <em>Net id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net id</em>' attribute.
	 * @see #getNet_id()
	 * @generated
	 */
	void setNet_id(String value);

	/**
	 * Returns the value of the '<em><b>Net name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net name</em>' attribute.
	 * @see #setNet_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Net_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The OS NETWORK NAME'"
	 * @generated
	 */
	String getNet_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getNet_name <em>Net name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net name</em>' attribute.
	 * @see #getNet_name()
	 * @generated
	 */
	void setNet_name(String value);

	/**
	 * Returns the value of the '<em><b>Sec groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sec groups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sec groups</em>' attribute.
	 * @see #setSec_groups(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Sec_groups()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='If security groups are available on your OpenStack you can specify a comma separated list to use for the machine (e.g. secgrp001,secgrp002)'"
	 * @generated
	 */
	String getSec_groups();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSec_groups <em>Sec groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec groups</em>' attribute.
	 * @see #getSec_groups()
	 * @generated
	 */
	void setSec_groups(String value);

	/**
	 * Returns the value of the '<em><b>Floatingip pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floatingip pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floatingip pool</em>' attribute.
	 * @see #setFloatingip_pool(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Floatingip_pool()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The IP pool that will be used to get a public IP an assign it to the machine. If there is an IP address already allocated but not assigned to any machine, this IP will be chosen and assigned to the machine. If there is no IP address already allocated a new IP will be allocated and assigned to the machine'"
	 * @generated
	 */
	String getFloatingip_pool();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getFloatingip_pool <em>Floatingip pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floatingip pool</em>' attribute.
	 * @see #getFloatingip_pool()
	 * @generated
	 */
	void setFloatingip_pool(String value);

	/**
	 * Returns the value of the '<em><b>Active timeout</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active timeout</em>' attribute.
	 * @see #setActive_timeout(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Active_timeout()
	 * @model default="200" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The OS ACTIVE TIMEOUT'"
	 * @generated
	 */
	int getActive_timeout();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getActive_timeout <em>Active timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active timeout</em>' attribute.
	 * @see #getActive_timeout()
	 * @generated
	 */
	void setActive_timeout(int value);

	/**
	 * Returns the value of the '<em><b>Availability zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability zone</em>' attribute.
	 * @see #setAvailability_zone(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Availability_zone()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The OS AVAILABILITY ZONE'"
	 * @generated
	 */
	String getAvailability_zone();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getAvailability_zone <em>Availability zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability zone</em>' attribute.
	 * @see #getAvailability_zone()
	 * @generated
	 */
	void setAvailability_zone(String value);

	/**
	 * Returns the value of the '<em><b>Domain id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain id</em>' attribute.
	 * @see #setDomain_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Domain_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The OS DOMAIN ID'"
	 * @generated
	 */
	String getDomain_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getDomain_id <em>Domain id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain id</em>' attribute.
	 * @see #getDomain_id()
	 * @generated
	 */
	void setDomain_id(String value);

	/**
	 * Returns the value of the '<em><b>Domain name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain name</em>' attribute.
	 * @see #setDomain_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Domain_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The OS DOMAIN NAME'"
	 * @generated
	 */
	String getDomain_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getDomain_name <em>Domain name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain name</em>' attribute.
	 * @see #getDomain_name()
	 * @generated
	 */
	void setDomain_name(String value);

	/**
	 * Returns the value of the '<em><b>Insecure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insecure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insecure</em>' attribute.
	 * @see #setInsecure(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Insecure()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='The OS INSECURE'"
	 * @generated
	 */
	boolean isInsecure();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#isInsecure <em>Insecure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insecure</em>' attribute.
	 * @see #isInsecure()
	 * @generated
	 */
	void setInsecure(boolean value);

	/**
	 * Returns the value of the '<em><b>Ip version</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip version</em>' attribute.
	 * @see #setIp_version(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Ip_version()
	 * @model default="4" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The OS IP VERSION'"
	 * @generated
	 */
	int getIp_version();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getIp_version <em>Ip version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip version</em>' attribute.
	 * @see #getIp_version()
	 * @generated
	 */
	void setIp_version(int value);

	/**
	 * Returns the value of the '<em><b>Keypair name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keypair name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keypair name</em>' attribute.
	 * @see #setKeypair_name(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Keypair_name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The OS KEYPAIR NAME'"
	 * @generated
	 */
	String getKeypair_name();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getKeypair_name <em>Keypair name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keypair name</em>' attribute.
	 * @see #getKeypair_name()
	 * @generated
	 */
	void setKeypair_name(String value);

	/**
	 * Returns the value of the '<em><b>Private key file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private key file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private key file</em>' attribute.
	 * @see #setPrivate_key_file(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Private_key_file()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The OS PRIVATE KEY FILE'"
	 * @generated
	 */
	String getPrivate_key_file();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getPrivate_key_file <em>Private key file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private key file</em>' attribute.
	 * @see #getPrivate_key_file()
	 * @generated
	 */
	void setPrivate_key_file(String value);

	/**
	 * Returns the value of the '<em><b>Ssh port</b></em>' attribute.
	 * The default value is <code>"22"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh port</em>' attribute.
	 * @see #setSsh_port(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Ssh_port()
	 * @model default="22" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The OS SSH PORT'"
	 * @generated
	 */
	int getSsh_port();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSsh_port <em>Ssh port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh port</em>' attribute.
	 * @see #getSsh_port()
	 * @generated
	 */
	void setSsh_port(int value);

	/**
	 * Returns the value of the '<em><b>Ssh user</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh user</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh user</em>' attribute.
	 * @see #setSsh_user(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_OpenStack_Ssh_user()
	 * @model default="root" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The OS SSH USER'"
	 * @generated
	 */
	String getSsh_user();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_OpenStack#getSsh_user <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh user</em>' attribute.
	 * @see #getSsh_user()
	 * @generated
	 */
	void setSsh_user(String value);

} // Machine_OpenStack

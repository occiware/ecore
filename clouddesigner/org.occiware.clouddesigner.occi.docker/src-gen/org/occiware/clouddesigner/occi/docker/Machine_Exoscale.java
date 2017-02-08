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
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Exoscale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getUrl <em>Url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getApi_key <em>Api key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getApi_secret_key <em>Api secret key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getInstance_profile <em>Instance profile</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getImage <em>Image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getAvailability_zone <em>Availability zone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getSsh_user <em>Ssh user</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getUserdata <em>Userdata</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getAffinity_group <em>Affinity group</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale()
 * @model annotation="OCCIE2Ecore title='Machine Exoscale'"
 * @generated
 */
public interface Machine_Exoscale extends Machine {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * The default value is <code>"https://api.exoscale.ch/compute"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Url()
	 * @model default="https://api.exoscale.ch/compute" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Your API endpoint.'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Api_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='required Your API key.'"
	 * @generated
	 */
	String getApi_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getApi_key <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api key</em>' attribute.
	 * @see #getApi_key()
	 * @generated
	 */
	void setApi_key(String value);

	/**
	 * Returns the value of the '<em><b>Api secret key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api secret key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api secret key</em>' attribute.
	 * @see #setApi_secret_key(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Api_secret_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='required Your API secret key.'"
	 * @generated
	 */
	String getApi_secret_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getApi_secret_key <em>Api secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api secret key</em>' attribute.
	 * @see #getApi_secret_key()
	 * @generated
	 */
	void setApi_secret_key(String value);

	/**
	 * Returns the value of the '<em><b>Instance profile</b></em>' attribute.
	 * The default value is <code>"small"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance profile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance profile</em>' attribute.
	 * @see #setInstance_profile(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Instance_profile()
	 * @model default="small" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Instance profile.'"
	 * @generated
	 */
	String getInstance_profile();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getInstance_profile <em>Instance profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance profile</em>' attribute.
	 * @see #getInstance_profile()
	 * @generated
	 */
	void setInstance_profile(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * The default value is <code>"ubuntu-16.04"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Image()
	 * @model default="ubuntu-16.04" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Image template (e.g. ubuntu-16.04, ubuntu-15.10).'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Security group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security group</em>' attribute.
	 * @see #setSecurity_group(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Security_group()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Security group. It will be created if it doesn\u2019t exist.'"
	 * @generated
	 */
	String getSecurity_group();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getSecurity_group <em>Security group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security group</em>' attribute.
	 * @see #getSecurity_group()
	 * @generated
	 */
	void setSecurity_group(String value);

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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Availability_zone()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Exoscale availability zone.'"
	 * @generated
	 */
	String getAvailability_zone();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getAvailability_zone <em>Availability zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability zone</em>' attribute.
	 * @see #getAvailability_zone()
	 * @generated
	 */
	void setAvailability_zone(String value);

	/**
	 * Returns the value of the '<em><b>Ssh user</b></em>' attribute.
	 * The default value is <code>"ubuntu"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh user</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh user</em>' attribute.
	 * @see #setSsh_user(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Ssh_user()
	 * @model default="ubuntu" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='SSH username, which must match the default SSH user for the used image.'"
	 * @generated
	 */
	String getSsh_user();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getSsh_user <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh user</em>' attribute.
	 * @see #getSsh_user()
	 * @generated
	 */
	void setSsh_user(String value);

	/**
	 * Returns the value of the '<em><b>Userdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userdata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userdata</em>' attribute.
	 * @see #setUserdata(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Userdata()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Path to file containing user data for cloud-init.'"
	 * @generated
	 */
	String getUserdata();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getUserdata <em>Userdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userdata</em>' attribute.
	 * @see #getUserdata()
	 * @generated
	 */
	void setUserdata(String value);

	/**
	 * Returns the value of the '<em><b>Affinity group</b></em>' attribute.
	 * The default value is <code>"docker-machine"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affinity group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affinity group</em>' attribute.
	 * @see #setAffinity_group(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Exoscale_Affinity_group()
	 * @model default="docker-machine" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Affinity group the machine will be started in.'"
	 * @generated
	 */
	String getAffinity_group();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Exoscale#getAffinity_group <em>Affinity group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affinity group</em>' attribute.
	 * @see #getAffinity_group()
	 * @generated
	 */
	void setAffinity_group(String value);

} // Machine_Exoscale

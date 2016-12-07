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

import org.occiware.clouddesigner.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_install_url <em>Engine install url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_opt <em>Engine opt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_insecure_registry <em>Engine insecure registry</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_registry_mirror <em>Engine registry mirror</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_label <em>Engine label</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_storage_driver <em>Engine storage driver</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_env <em>Engine env</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#isSwarm <em>Swarm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_image <em>Swarm image</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#isSwarm_master <em>Swarm master</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_discovery <em>Swarm discovery</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_strategy <em>Swarm strategy</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_opt <em>Swarm opt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_host <em>Swarm host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_addr <em>Swarm addr</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_experimental <em>Swarm experimental</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine#getTls_san <em>Tls san</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine()
 * @model annotation="OCCIE2Ecore title='Machine Resource'"
 * @generated
 */
public interface Machine extends Compute {
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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Engine install url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine install url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine install url</em>' attribute.
	 * @see #setEngine_install_url(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Engine_install_url()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Custom URL to use for engine installation [$MACHINE_DOCKER_INSTALL_URL]'"
	 * @generated
	 */
	String getEngine_install_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_install_url <em>Engine install url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine install url</em>' attribute.
	 * @see #getEngine_install_url()
	 * @generated
	 */
	void setEngine_install_url(String value);

	/**
	 * Returns the value of the '<em><b>Engine opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine opt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine opt</em>' attribute.
	 * @see #setEngine_opt(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Engine_opt()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Specify arbitrary flags to include with the created engine in the form flag=value'"
	 * @generated
	 */
	String getEngine_opt();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_opt <em>Engine opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine opt</em>' attribute.
	 * @see #getEngine_opt()
	 * @generated
	 */
	void setEngine_opt(String value);

	/**
	 * Returns the value of the '<em><b>Engine insecure registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine insecure registry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine insecure registry</em>' attribute.
	 * @see #setEngine_insecure_registry(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Engine_insecure_registry()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Specify insecure registries to allow with the created engine'"
	 * @generated
	 */
	String getEngine_insecure_registry();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_insecure_registry <em>Engine insecure registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine insecure registry</em>' attribute.
	 * @see #getEngine_insecure_registry()
	 * @generated
	 */
	void setEngine_insecure_registry(String value);

	/**
	 * Returns the value of the '<em><b>Engine registry mirror</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine registry mirror</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine registry mirror</em>' attribute.
	 * @see #setEngine_registry_mirror(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Engine_registry_mirror()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Specify registry mirrors to use [$ENGINE_REGISTRY_MIRROR]'"
	 * @generated
	 */
	String getEngine_registry_mirror();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_registry_mirror <em>Engine registry mirror</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine registry mirror</em>' attribute.
	 * @see #getEngine_registry_mirror()
	 * @generated
	 */
	void setEngine_registry_mirror(String value);

	/**
	 * Returns the value of the '<em><b>Engine label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine label</em>' attribute.
	 * @see #setEngine_label(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Engine_label()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Specify labels for the created engine'"
	 * @generated
	 */
	String getEngine_label();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_label <em>Engine label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine label</em>' attribute.
	 * @see #getEngine_label()
	 * @generated
	 */
	void setEngine_label(String value);

	/**
	 * Returns the value of the '<em><b>Engine storage driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine storage driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine storage driver</em>' attribute.
	 * @see #setEngine_storage_driver(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Engine_storage_driver()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Specify a storage driver to use with the engine'"
	 * @generated
	 */
	String getEngine_storage_driver();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_storage_driver <em>Engine storage driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine storage driver</em>' attribute.
	 * @see #getEngine_storage_driver()
	 * @generated
	 */
	void setEngine_storage_driver(String value);

	/**
	 * Returns the value of the '<em><b>Engine env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine env</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine env</em>' attribute.
	 * @see #setEngine_env(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Engine_env()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Specify environment variables to set in the engine'"
	 * @generated
	 */
	String getEngine_env();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getEngine_env <em>Engine env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine env</em>' attribute.
	 * @see #getEngine_env()
	 * @generated
	 */
	void setEngine_env(String value);

	/**
	 * Returns the value of the '<em><b>Swarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm</em>' attribute.
	 * @see #setSwarm(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Swarm()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Configure Machine with Swarm'"
	 * @generated
	 */
	boolean isSwarm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#isSwarm <em>Swarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm</em>' attribute.
	 * @see #isSwarm()
	 * @generated
	 */
	void setSwarm(boolean value);

	/**
	 * Returns the value of the '<em><b>Swarm image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm image</em>' attribute.
	 * @see #setSwarm_image(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Swarm_image()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Specify Docker image to use for Swarm [$MACHINE_SWARM_IMAGE]'"
	 * @generated
	 */
	String getSwarm_image();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_image <em>Swarm image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm image</em>' attribute.
	 * @see #getSwarm_image()
	 * @generated
	 */
	void setSwarm_image(String value);

	/**
	 * Returns the value of the '<em><b>Swarm master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm master</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm master</em>' attribute.
	 * @see #setSwarm_master(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Swarm_master()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='Configure Machine to be a Swarm master'"
	 * @generated
	 */
	boolean isSwarm_master();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#isSwarm_master <em>Swarm master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm master</em>' attribute.
	 * @see #isSwarm_master()
	 * @generated
	 */
	void setSwarm_master(boolean value);

	/**
	 * Returns the value of the '<em><b>Swarm discovery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm discovery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm discovery</em>' attribute.
	 * @see #setSwarm_discovery(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Swarm_discovery()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Discovery service to use with Swarm'"
	 * @generated
	 */
	String getSwarm_discovery();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_discovery <em>Swarm discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm discovery</em>' attribute.
	 * @see #getSwarm_discovery()
	 * @generated
	 */
	void setSwarm_discovery(String value);

	/**
	 * Returns the value of the '<em><b>Swarm strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm strategy</em>' attribute.
	 * @see #setSwarm_strategy(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Swarm_strategy()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Define a default scheduling strategy for Swarm'"
	 * @generated
	 */
	String getSwarm_strategy();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_strategy <em>Swarm strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm strategy</em>' attribute.
	 * @see #getSwarm_strategy()
	 * @generated
	 */
	void setSwarm_strategy(String value);

	/**
	 * Returns the value of the '<em><b>Swarm opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm opt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm opt</em>' attribute.
	 * @see #setSwarm_opt(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Swarm_opt()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Define arbitrary flags for swarm'"
	 * @generated
	 */
	String getSwarm_opt();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_opt <em>Swarm opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm opt</em>' attribute.
	 * @see #getSwarm_opt()
	 * @generated
	 */
	void setSwarm_opt(String value);

	/**
	 * Returns the value of the '<em><b>Swarm host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm host</em>' attribute.
	 * @see #setSwarm_host(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Swarm_host()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='ip/socket to listen on for Swarm master'"
	 * @generated
	 */
	String getSwarm_host();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_host <em>Swarm host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm host</em>' attribute.
	 * @see #getSwarm_host()
	 * @generated
	 */
	void setSwarm_host(String value);

	/**
	 * Returns the value of the '<em><b>Swarm addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm addr</em>' attribute.
	 * @see #setSwarm_addr(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Swarm_addr()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='addr to advertise for Swarm (default: detect and use the machine IP)'"
	 * @generated
	 */
	String getSwarm_addr();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_addr <em>Swarm addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm addr</em>' attribute.
	 * @see #getSwarm_addr()
	 * @generated
	 */
	void setSwarm_addr(String value);

	/**
	 * Returns the value of the '<em><b>Swarm experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swarm experimental</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swarm experimental</em>' attribute.
	 * @see #setSwarm_experimental(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Swarm_experimental()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Enable Swarm experimental features'"
	 * @generated
	 */
	String getSwarm_experimental();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getSwarm_experimental <em>Swarm experimental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swarm experimental</em>' attribute.
	 * @see #getSwarm_experimental()
	 * @generated
	 */
	void setSwarm_experimental(String value);

	/**
	 * Returns the value of the '<em><b>Tls san</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tls san</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tls san</em>' attribute.
	 * @see #setTls_san(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Tls_san()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Support extra SANs for TLS certs'"
	 * @generated
	 */
	String getTls_san();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine#getTls_san <em>Tls san</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tls san</em>' attribute.
	 * @see #getTls_san()
	 * @generated
	 */
	void setTls_san(String value);

} // Machine

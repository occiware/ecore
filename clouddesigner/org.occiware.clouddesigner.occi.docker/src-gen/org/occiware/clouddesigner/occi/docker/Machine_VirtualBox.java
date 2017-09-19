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
 * A representation of the model object '<em><b>Machine Virtual Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getDisk_size <em>Disk size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#isHost_dns_resolver <em>Host dns resolver</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getImport_boot2docker_vm <em>Import boot2docker vm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getHostonly_cidr <em>Hostonly cidr</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getHostonly_nictype <em>Hostonly nictype</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getHostonly_nicpromisc <em>Hostonly nicpromisc</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#isNo_share <em>No share</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#isNo_dns_proxy <em>No dns proxy</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#isNo_vtx_check <em>No vtx check</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getShare_folder <em>Share folder</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox()
 * @model annotation="OCCIE2Ecore title='Machine on VirtualBox'"
 * @generated
 */
public interface Machine_VirtualBox extends Machine {
	/**
	 * Returns the value of the '<em><b>Boot2docker url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boot2docker url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot2docker url</em>' attribute.
	 * @see #setBoot2docker_url(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Boot2docker_url()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getBoot2docker_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getBoot2docker_url <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot2docker url</em>' attribute.
	 * @see #getBoot2docker_url()
	 * @generated
	 */
	void setBoot2docker_url(String value);

	/**
	 * Returns the value of the '<em><b>Disk size</b></em>' attribute.
	 * The default value is <code>"20000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk size</em>' attribute.
	 * @see #setDisk_size(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Disk_size()
	 * @model default="20000" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	int getDisk_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getDisk_size <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk size</em>' attribute.
	 * @see #getDisk_size()
	 * @generated
	 */
	void setDisk_size(int value);

	/**
	 * Returns the value of the '<em><b>Host dns resolver</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host dns resolver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host dns resolver</em>' attribute.
	 * @see #setHost_dns_resolver(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Host_dns_resolver()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	boolean isHost_dns_resolver();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#isHost_dns_resolver <em>Host dns resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host dns resolver</em>' attribute.
	 * @see #isHost_dns_resolver()
	 * @generated
	 */
	void setHost_dns_resolver(boolean value);

	/**
	 * Returns the value of the '<em><b>Import boot2docker vm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import boot2docker vm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import boot2docker vm</em>' attribute.
	 * @see #setImport_boot2docker_vm(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Import_boot2docker_vm()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getImport_boot2docker_vm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getImport_boot2docker_vm <em>Import boot2docker vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import boot2docker vm</em>' attribute.
	 * @see #getImport_boot2docker_vm()
	 * @generated
	 */
	void setImport_boot2docker_vm(String value);

	/**
	 * Returns the value of the '<em><b>Hostonly cidr</b></em>' attribute.
	 * The default value is <code>"192.168.99.1/24"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostonly cidr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostonly cidr</em>' attribute.
	 * @see #setHostonly_cidr(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Hostonly_cidr()
	 * @model default="192.168.99.1/24" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getHostonly_cidr();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getHostonly_cidr <em>Hostonly cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostonly cidr</em>' attribute.
	 * @see #getHostonly_cidr()
	 * @generated
	 */
	void setHostonly_cidr(String value);

	/**
	 * Returns the value of the '<em><b>Hostonly nictype</b></em>' attribute.
	 * The default value is <code>"82540EM"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostonly nictype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostonly nictype</em>' attribute.
	 * @see #setHostonly_nictype(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Hostonly_nictype()
	 * @model default="82540EM" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getHostonly_nictype();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getHostonly_nictype <em>Hostonly nictype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostonly nictype</em>' attribute.
	 * @see #getHostonly_nictype()
	 * @generated
	 */
	void setHostonly_nictype(String value);

	/**
	 * Returns the value of the '<em><b>Hostonly nicpromisc</b></em>' attribute.
	 * The default value is <code>"deny"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostonly nicpromisc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostonly nicpromisc</em>' attribute.
	 * @see #setHostonly_nicpromisc(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Hostonly_nicpromisc()
	 * @model default="deny" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getHostonly_nicpromisc();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getHostonly_nicpromisc <em>Hostonly nicpromisc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostonly nicpromisc</em>' attribute.
	 * @see #getHostonly_nicpromisc()
	 * @generated
	 */
	void setHostonly_nicpromisc(String value);

	/**
	 * Returns the value of the '<em><b>No share</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No share</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No share</em>' attribute.
	 * @see #setNo_share(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_No_share()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	boolean isNo_share();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#isNo_share <em>No share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No share</em>' attribute.
	 * @see #isNo_share()
	 * @generated
	 */
	void setNo_share(boolean value);

	/**
	 * Returns the value of the '<em><b>No dns proxy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No dns proxy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No dns proxy</em>' attribute.
	 * @see #setNo_dns_proxy(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_No_dns_proxy()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	boolean isNo_dns_proxy();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#isNo_dns_proxy <em>No dns proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No dns proxy</em>' attribute.
	 * @see #isNo_dns_proxy()
	 * @generated
	 */
	void setNo_dns_proxy(boolean value);

	/**
	 * Returns the value of the '<em><b>No vtx check</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No vtx check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No vtx check</em>' attribute.
	 * @see #setNo_vtx_check(boolean)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_No_vtx_check()
	 * @model default="false" dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	boolean isNo_vtx_check();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#isNo_vtx_check <em>No vtx check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No vtx check</em>' attribute.
	 * @see #isNo_vtx_check()
	 * @generated
	 */
	void setNo_vtx_check(boolean value);

	/**
	 * Returns the value of the '<em><b>Share folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share folder</em>' attribute.
	 * @see #setShare_folder(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Share_folder()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getShare_folder();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getShare_folder <em>Share folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share folder</em>' attribute.
	 * @see #getShare_folder()
	 * @generated
	 */
	void setShare_folder(String value);

} // Machine_VirtualBox

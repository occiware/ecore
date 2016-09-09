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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datacenter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Datacenter#getDefaultHardwareVersionKey <em>Default Hardware Version Key</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getDatacenter()
 * @model annotation="OCCIE2Ecore title='The interface to the common container object for hosts and virtual machines. Every host and virtual machine must be under a distinct datacenter in the inventory, and datacenters may not be nested under other datacenters.'"
 * @generated
 */
public interface Datacenter extends Folder {
	/**
	 * Returns the value of the '<em><b>Default Hardware Version Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Hardware Version Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Hardware Version Key</em>' attribute.
	 * @see #setDefaultHardwareVersionKey(String)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getDatacenter_DefaultHardwareVersionKey()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Key for Default Hardware Version to be used on this datacenter in the format of key. Setting this field affects defaultConfigOption returned by environmentBrowser of all its children with this field unset. See ReconfigureDatacenter_Task'"
	 * @generated
	 */
	String getDefaultHardwareVersionKey();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Datacenter#getDefaultHardwareVersionKey <em>Default Hardware Version Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Hardware Version Key</em>' attribute.
	 * @see #getDefaultHardwareVersionKey()
	 * @generated
	 */
	void setDefaultHardwareVersionKey(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void powerOnMultiVMs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='This action create or synchronize all the infrastructure elements detected on VMware in Cloud designer diagram, but does nothing on VMware. This make take some times to synchronize if there is a lot of elements'"
	 * @generated
	 */
	void discoverAll();

} // Datacenter

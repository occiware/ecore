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

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resourcepool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#isExpandablereservation <em>Expandablereservation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getReservation <em>Reservation</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getResourcepool()
 * @model annotation="OCCIE2Ecore title='A resource pool linked between a compute host (or a cluster) and a virtual machine, usage attributes part are for runtime information only'"
 * @generated
 */
public interface Resourcepool extends Resource {
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
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getResourcepool_Name()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='null'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expandablereservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expandablereservation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expandablereservation</em>' attribute.
	 * @see #setExpandablereservation(boolean)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getResourcepool_Expandablereservation()
	 * @model dataType="org.occiware.clouddesigner.occi.Boolean"
	 *        annotation="OCCIE2Ecore description='In a resource pool with an expandable reservation, the reservation on a resource pool can grow beyond the specified value, if the parent resource pool has unreserved resources. A non-expandable reservation is called a fixed reservation. This property is ignored for virtual machines. '"
	 * @generated
	 */
	boolean isExpandablereservation();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#isExpandablereservation <em>Expandablereservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expandablereservation</em>' attribute.
	 * @see #isExpandablereservation()
	 * @generated
	 */
	void setExpandablereservation(boolean value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(long)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getResourcepool_Limit()
	 * @model dataType="org.occiware.clouddesigner.occi.vmware.LongNumber"
	 *        annotation="OCCIE2Ecore description='The utilization of a virtual machine/resource pool will not exceed this limit, even if there are available resources. This is typically used to ensure a consistent performance of virtual machines / resource pools independent of available resources. If set to -1, then there is no fixed limit on resource usage (only bounded by available resources and shares). Units are MB for memory, MHz for CPU. '"
	 * @generated
	 */
	long getLimit();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(long value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' attribute.
	 * @see #setReservation(long)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getResourcepool_Reservation()
	 * @model dataType="org.occiware.clouddesigner.occi.vmware.LongNumber"
	 *        annotation="OCCIE2Ecore description='Amount of resource that is guaranteed available to the virtual machine or resource pool. Reserved resources are not wasted if they are not used. If the utilization is less than the reservation, the resources can be utilized by other running virtual machines. Units are MB for memory, MHz for CPU.'"
	 * @generated
	 */
	long getReservation();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getReservation <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' attribute.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(long value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.vmware.ResourcePoolState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.ResourcePoolState
	 * @see #setState(ResourcePoolState)
	 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getResourcepool_State()
	 * @model default="unknown"
	 *        annotation="OCCIE2Ecore description='unknown: The status is unknown. \nundercommitted: resource pool is in a good state. \ninconsistent: One or more nodes in the tree has children whose reservations are greater than the node is configured to support. For example, i) a resource pool with a fixed reservation has a running virtual machine with a reservation that is higher than the reservation on resource pool itself., or ii) the child reservations are greater than the limit.\nIn this state, the DRS algorithm is disabled until the resource pool tree\'s configuration has been brought back into a consistent state. We also restrict the resources that such invalid nodes request from their parents to the configured reservation/limit, in an attempt to isolate the problem to a small subtree. For the rest of the tree, we determine whether the cluster is undercommitted or overcommitted according to the existing rules and perform admission control accordingly.\n\nNote that since all changes to the resource settings are validated on the VirtualCenter server, the system cannot be brought into this state by simply manipulating a cluster resource pool tree through VirtualCenter. It can only happen if a virtual machine gets powered on directly on a host that is part of a DRS cluster.\novercommitted: In this state, the tree is consistent internally, but the root resource pool does not have the capacity at to meet the reservation of its children. We can only go from GREEN -> YELLOW if we lose resources at the root. For example, hosts becomes unavailable or is put into maintenance mode. Note that we will always have enough capacity at the root to run all currently powered on VMs. However, we may not be able to satisfy all resource pool reservations in the tree. In this state, the reservation configured for a resource pool is no longer guaranteed, but the limits are still enforced. This provides additional flexibility for bringing the tree back into a consistent state, without risking bringing the tree into a RED state. In more detail:\nResource Pool The root is considered to have unlimited capacity. You can reserve resources without any check except the requirement that the tree remains consistent. This means that nodes whose parents are all configured with expandable reservations and no limit will have unlimited available resources. However, if there is an ancestor with a fixed reservation or an expandable reservation with a limit somewhere, then the node will be limited by the reservation/limit of the ancestor.\nVirtual Machine Virtual machines are limited by ancestors with a fixed reservation and the capacity at the root. \nyellow: The entity might have a problem.'"
	 * @generated
	 */
	ResourcePoolState getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.vmware.Resourcepool#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.vmware.ResourcePoolState
	 * @see #getState()
	 * @generated
	 */
	void setState(ResourcePoolState value);

} // Resourcepool

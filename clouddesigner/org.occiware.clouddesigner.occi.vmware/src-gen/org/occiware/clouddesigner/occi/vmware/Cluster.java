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
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getCluster()
 * @model annotation="OCCIE2Ecore title='Represents a cluster of HostSystem objects as a unified compute resource for virtual machines.'"
 * @generated
 */
public interface Cluster extends Folder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='Add all hostsystem linked to this cluster and not already added on this cluster, if hostsystem are not connectable, the host will not be added'"
	 * @generated
	 */
	void addAllHostSystem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void applyRecommendation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void enterMaintenanceMode();

} // Cluster

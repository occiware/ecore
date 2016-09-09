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
package org.occiware.clouddesigner.occi.vmware.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>vmware</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmwareTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new VmwareTests("vmware Tests");
		suite.addTestSuite(DatastoreTest.class);
		suite.addTestSuite(ClusterTest.class);
		suite.addTestSuite(DatacenterTest.class);
		suite.addTestSuite(HostsystemTest.class);
		suite.addTestSuite(VmTest.class);
		suite.addTestSuite(FolderlinkTest.class);
		suite.addTestSuite(ResourcepoollinkTest.class);
		suite.addTestSuite(ClusterlinkTest.class);
		suite.addTestSuite(ResourcepoolTest.class);
		suite.addTestSuite(DatacenterlinkTest.class);
		suite.addTestSuite(HostsystemlinkTest.class);
		suite.addTestSuite(DatastorelinkTest.class);
		suite.addTestSuite(VirtualdiskTest.class);
		suite.addTestSuite(VswitchTest.class);
		suite.addTestSuite(PortgroupTest.class);
		suite.addTestSuite(VirtualnetworkadapterTest.class);
		suite.addTestSuite(VirtualdisknetworkTest.class);
		suite.addTestSuite(VirtualdisknetworklinkTest.class);
		suite.addTestSuite(HostnetworkadapterTest.class);
		suite.addTestSuite(DvswitchTest.class);
		suite.addTestSuite(SnapshotTest.class);
		suite.addTestSuite(SnapshotlinkTest.class);
		suite.addTestSuite(FolderTest.class);
		suite.addTestSuite(HostfolderTest.class);
		suite.addTestSuite(VcentercapabilityTest.class);
		suite.addTestSuite(HostfirewallsystemTest.class);
		suite.addTestSuite(HostfirewallrulesetTest.class);
		suite.addTestSuite(HostfirewallruleTest.class);
		suite.addTestSuite(HoststorageTest.class);
		suite.addTestSuite(HoststoragelinkTest.class);
		suite.addTestSuite(VmfolderTest.class);
		suite.addTestSuite(ServiceconsolenicTest.class);
		suite.addTestSuite(PortgrouplinkTest.class);
		suite.addTestSuite(HostnatruleTest.class);
		suite.addTestSuite(HostnatportforwardlinkTest.class);
		suite.addTestSuite(DistributedportgroupTest.class);
		suite.addTestSuite(VirtualcdromTest.class);
		suite.addTestSuite(VirtualfloppyTest.class);
		suite.addTestSuite(VirtualdisklinkTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareTests(String name) {
		super(name);
	}

} //VmwareTests

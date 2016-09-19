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
package vmwarecrtp.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import vmwarecrtp.GuestOsIdentifiers;
import vmwarecrtp.VmwarecrtpFactory;
import vmwarecrtp.VmwarecrtpPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmwarecrtpPackageImpl extends EPackageImpl implements VmwarecrtpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guestOsIdentifiersEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see vmwarecrtp.VmwarecrtpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VmwarecrtpPackageImpl() {
		super(eNS_URI, VmwarecrtpFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VmwarecrtpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VmwarecrtpPackage init() {
		if (isInited) return (VmwarecrtpPackage)EPackage.Registry.INSTANCE.getEPackage(VmwarecrtpPackage.eNS_URI);

		// Obtain or create and register package
		VmwarecrtpPackageImpl theVmwarecrtpPackage = (VmwarecrtpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VmwarecrtpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VmwarecrtpPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVmwarecrtpPackage.createPackageContents();

		// Initialize created meta-data
		theVmwarecrtpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVmwarecrtpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VmwarecrtpPackage.eNS_URI, theVmwarecrtpPackage);
		return theVmwarecrtpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuestOsIdentifiers() {
		return guestOsIdentifiersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwarecrtpFactory getVmwarecrtpFactory() {
		return (VmwarecrtpFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create enums
		guestOsIdentifiersEEnum = createEEnum(GUEST_OS_IDENTIFIERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(guestOsIdentifiersEEnum, GuestOsIdentifiers.class, "GuestOsIdentifiers");
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DOS_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN31_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN95_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN98_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_ME_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NT_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN2000_PRO_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN2000_SERV_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN2000_ADV_SERV_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_XP_HOME_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_XP_PRO_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_XP_PRO64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_WEB_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_STANDARD_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_ENTERPRISE_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_DATACENTER_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_BUSINESS_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_STANDARD64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_ENTERPRISE64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_LONGHORN_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_LONGHORN64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_NET_DATACENTER64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_VISTA_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WIN_VISTA64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS7_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS7_SERVER64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS8_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS8_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS8_SERVER64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS9_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS9_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS9_SERVER64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.WINDOWS_HYPER_VGUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.FREEBSD_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.FREEBSD64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.REDHAT_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL2_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL3_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL3_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL4_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL4_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL5_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL6_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.RHEL7_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.CENTOS_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.CENTOS64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ORACLE_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ORACLE_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SUSE_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SUSE64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES10_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES10_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES11_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES11_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES12_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SLES12_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.NLD9_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OES_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SJDS_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.MANDRAKE_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.MANDRIVA_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.MANDRIVA64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.TURBO_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.TURBO_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.UBUNTU_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.UBUNTU64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN4_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN4_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN5_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN6_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN7_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN8_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DEBIAN8_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX3_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX3_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX4_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX4_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ASIANUX5_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OPENSUSE_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OPENSUSE64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.FEDORA_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.FEDORA64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.COREOS64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER24X_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER26X_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER3X_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.GENERIC_LINUX_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER24X_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER26X_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER3X_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER_LINUX64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS8_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS9_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS10_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS10_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.SOLARIS11_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OS2_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ECOM_STATION_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.ECOM_STATION2_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.NETWARE4_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.NETWARE5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.NETWARE6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OPEN_SERVER5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OPEN_SERVER6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.UNIX_WARE7_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN10_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN10_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN11_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN11_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN12_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN13_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.DARWIN14_64_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.VMKERNEL_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.VMKERNEL5_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.VMKERNEL6_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER_GUEST);
		addEEnumLiteral(guestOsIdentifiersEEnum, GuestOsIdentifiers.OTHER_GUEST64);

		// Create resource
		createResource(eNS_URI);
	}

} //VmwarecrtpPackageImpl

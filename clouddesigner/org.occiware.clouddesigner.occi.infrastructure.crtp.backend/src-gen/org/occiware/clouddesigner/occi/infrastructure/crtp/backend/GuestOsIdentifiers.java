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
package org.occiware.clouddesigner.occi.infrastructure.crtp.backend;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Guest Os Identifiers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.infrastructure.crtp.backend.BackendPackage#getGuestOsIdentifiers()
 * @model
 * @generated
 */
public enum GuestOsIdentifiers implements Enumerator {
	/**
	 * The '<em><b>Dos Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOS_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DOS_GUEST(0, "dosGuest", "dosGuest"),

	/**
	 * The '<em><b>Win31 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN31_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN31_GUEST(1, "win31Guest", "win31Guest"),

	/**
	 * The '<em><b>Win95 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN95_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN95_GUEST(2, "win95Guest", "win95Guest"),

	/**
	 * The '<em><b>Win98 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN98_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN98_GUEST(3, "win98Guest", "win98Guest"),

	/**
	 * The '<em><b>Win Me Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_ME_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_ME_GUEST(4, "winMeGuest", "winMeGuest"),

	/**
	 * The '<em><b>Win NT Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_NT_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_NT_GUEST(5, "winNTGuest", "winNTGuest"),

	/**
	 * The '<em><b>Win2000 Pro Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN2000_PRO_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN2000_PRO_GUEST(6, "win2000ProGuest", "win2000ProGuest"),

	/**
	 * The '<em><b>Win2000 Serv Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN2000_SERV_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN2000_SERV_GUEST(7, "win2000ServGuest", "win2000ServGuest"),

	/**
	 * The '<em><b>Win2000 Adv Serv Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN2000_ADV_SERV_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN2000_ADV_SERV_GUEST(8, "win2000AdvServGuest", "win2000AdvServGuest"),

	/**
	 * The '<em><b>Win XP Home Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_XP_HOME_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_XP_HOME_GUEST(9, "winXPHomeGuest", "winXPHomeGuest"),

	/**
	 * The '<em><b>Win XP Pro Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_XP_PRO_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_XP_PRO_GUEST(10, "winXPProGuest", "winXPProGuest"),

	/**
	 * The '<em><b>Win XP Pro64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_XP_PRO64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_XP_PRO64_GUEST(11, "winXPPro64Guest", "winXPPro64Guest"),

	/**
	 * The '<em><b>Win Net Web Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_WEB_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_NET_WEB_GUEST(12, "winNetWebGuest", "winNetWebGuest"),

	/**
	 * The '<em><b>Win Net Standard Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_STANDARD_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_NET_STANDARD_GUEST(13, "winNetStandardGuest", "winNetStandardGuest"),

	/**
	 * The '<em><b>Win Net Enterprise Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_ENTERPRISE_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_NET_ENTERPRISE_GUEST(14, "winNetEnterpriseGuest", "winNetEnterpriseGuest"),

	/**
	 * The '<em><b>Win Net Datacenter Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_DATACENTER_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_NET_DATACENTER_GUEST(15, "winNetDatacenterGuest", "winNetDatacenterGuest"),

	/**
	 * The '<em><b>Win Net Business Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_BUSINESS_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_NET_BUSINESS_GUEST(16, "winNetBusinessGuest", "winNetBusinessGuest"),

	/**
	 * The '<em><b>Win Net Standard64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_STANDARD64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_NET_STANDARD64_GUEST(17, "winNetStandard64Guest", "winNetStandard64Guest"),

	/**
	 * The '<em><b>Win Net Enterprise64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_ENTERPRISE64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_NET_ENTERPRISE64_GUEST(18, "winNetEnterprise64Guest", "winNetEnterprise64Guest"),

	/**
	 * The '<em><b>Win Longhorn Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_LONGHORN_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_LONGHORN_GUEST(19, "winLonghornGuest", "winLonghornGuest"),

	/**
	 * The '<em><b>Win Longhorn64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_LONGHORN64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_LONGHORN64_GUEST(20, "winLonghorn64Guest", "winLonghorn64Guest"),

	/**
	 * The '<em><b>Win Net Datacenter64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_DATACENTER64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_NET_DATACENTER64_GUEST(21, "winNetDatacenter64Guest", "winNetDatacenter64Guest"),

	/**
	 * The '<em><b>Win Vista Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_VISTA_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_VISTA_GUEST(22, "winVistaGuest", "winVistaGuest"),

	/**
	 * The '<em><b>Win Vista64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_VISTA64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_VISTA64_GUEST(23, "winVista64Guest", "winVista64Guest"),

	/**
	 * The '<em><b>Windows7 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS7_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS7_GUEST(24, "windows7Guest", "windows7Guest"),

	/**
	 * The '<em><b>Windows7 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS7_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS7_64_GUEST(25, "windows7_64Guest", "windows7_64Guest"),

	/**
	 * The '<em><b>Windows7 Server64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS7_SERVER64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS7_SERVER64_GUEST(26, "windows7Server64Guest", "windows7Server64Guest"),

	/**
	 * The '<em><b>Windows8 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS8_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS8_GUEST(27, "windows8Guest", "windows8Guest"),

	/**
	 * The '<em><b>Windows8 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS8_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS8_64_GUEST(28, "windows8_64Guest", "windows8_64Guest"),

	/**
	 * The '<em><b>Windows8 Server64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS8_SERVER64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS8_SERVER64_GUEST(29, "windows8Server64Guest", "windows8Server64Guest"),

	/**
	 * The '<em><b>Windows9 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS9_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS9_GUEST(30, "windows9Guest", "windows9Guest"),

	/**
	 * The '<em><b>Windows9 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS9_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS9_64_GUEST(31, "windows9_64Guest", "windows9_64Guest"),

	/**
	 * The '<em><b>Windows9 Server64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS9_SERVER64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS9_SERVER64_GUEST(32, "windows9Server64Guest", "windows9Server64Guest"),

	/**
	 * The '<em><b>Windows Hyper VGuest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_HYPER_VGUEST_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS_HYPER_VGUEST(33, "windowsHyperVGuest", "windowsHyperVGuest"),

	/**
	 * The '<em><b>Freebsd Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREEBSD_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	FREEBSD_GUEST(34, "freebsdGuest", "freebsdGuest"),

	/**
	 * The '<em><b>Freebsd64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREEBSD64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	FREEBSD64_GUEST(35, "freebsd64Guest", "freebsd64Guest"),

	/**
	 * The '<em><b>Redhat Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDHAT_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	REDHAT_GUEST(36, "redhatGuest", "redhatGuest"),

	/**
	 * The '<em><b>Rhel2 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL2_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL2_GUEST(37, "rhel2Guest", "rhel2Guest"),

	/**
	 * The '<em><b>Rhel3 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL3_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL3_GUEST(38, "rhel3Guest", "rhel3Guest"),

	/**
	 * The '<em><b>Rhel3 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL3_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL3_64_GUEST(39, "rhel3_64Guest", "rhel3_64Guest"),

	/**
	 * The '<em><b>Rhel4 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL4_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL4_GUEST(40, "rhel4Guest", "rhel4Guest"),

	/**
	 * The '<em><b>Rhel4 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL4_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL4_64_GUEST(41, "rhel4_64Guest", "rhel4_64Guest"),

	/**
	 * The '<em><b>Rhel5 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL5_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL5_GUEST(42, "rhel5Guest", "rhel5Guest"),

	/**
	 * The '<em><b>Rhel5 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL5_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL5_64_GUEST(43, "rhel5_64Guest", "rhel5_64Guest"),

	/**
	 * The '<em><b>Rhel6 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL6_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL6_GUEST(44, "rhel6Guest", "rhel6Guest"),

	/**
	 * The '<em><b>Rhel6 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL6_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL6_64_GUEST(45, "rhel6_64Guest", "rhel6_64Guest"),

	/**
	 * The '<em><b>Rhel7 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL7_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL7_GUEST(46, "rhel7Guest", "rhel7Guest"),

	/**
	 * The '<em><b>Rhel7 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL7_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL7_64_GUEST(47, "rhel7_64Guest", "rhel7_64Guest"),

	/**
	 * The '<em><b>Centos Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTOS_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	CENTOS_GUEST(48, "centosGuest", "centosGuest"),

	/**
	 * The '<em><b>Centos64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTOS64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	CENTOS64_GUEST(49, "centos64Guest", "centos64Guest"),

	/**
	 * The '<em><b>Oracle Linux Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_LINUX_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE_LINUX_GUEST(50, "oracleLinuxGuest", "oracleLinuxGuest"),

	/**
	 * The '<em><b>Oracle Linux64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_LINUX64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE_LINUX64_GUEST(51, "oracleLinux64Guest", "oracleLinux64Guest"),

	/**
	 * The '<em><b>Suse Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSE_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SUSE_GUEST(52, "suseGuest", "suseGuest"),

	/**
	 * The '<em><b>Suse64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSE64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SUSE64_GUEST(53, "suse64Guest", "suse64Guest"),

	/**
	 * The '<em><b>Sles Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLES_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SLES_GUEST(54, "slesGuest", "slesGuest"),

	/**
	 * The '<em><b>Sles64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLES64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SLES64_GUEST(55, "sles64Guest", "sles64Guest"),

	/**
	 * The '<em><b>Sles10 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLES10_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SLES10_GUEST(56, "sles10Guest", "sles10Guest"),

	/**
	 * The '<em><b>Sles10 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLES10_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SLES10_64_GUEST(57, "sles10_64Guest", "sles10_64Guest"),

	/**
	 * The '<em><b>Sles11 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLES11_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SLES11_GUEST(58, "sles11Guest", "sles11Guest"),

	/**
	 * The '<em><b>Sles11 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLES11_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SLES11_64_GUEST(59, "sles11_64Guest", "sles11_64Guest"),

	/**
	 * The '<em><b>Sles12 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLES12_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SLES12_GUEST(60, "sles12Guest", "sles12Guest"),

	/**
	 * The '<em><b>Sles12 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLES12_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SLES12_64_GUEST(61, "sles12_64Guest", "sles12_64Guest"),

	/**
	 * The '<em><b>Nld9 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NLD9_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	NLD9_GUEST(62, "nld9Guest", "nld9Guest"),

	/**
	 * The '<em><b>Oes Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OES_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OES_GUEST(63, "oesGuest", "oesGuest"),

	/**
	 * The '<em><b>Sjds Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SJDS_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SJDS_GUEST(64, "sjdsGuest", "sjdsGuest"),

	/**
	 * The '<em><b>Mandrake Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDRAKE_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	MANDRAKE_GUEST(65, "mandrakeGuest", "mandrakeGuest"),

	/**
	 * The '<em><b>Mandriva Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDRIVA_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	MANDRIVA_GUEST(66, "mandrivaGuest", "mandrivaGuest"),

	/**
	 * The '<em><b>Mandriva64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDRIVA64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	MANDRIVA64_GUEST(67, "mandriva64Guest", "mandriva64Guest"),

	/**
	 * The '<em><b>Turbo Linux Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURBO_LINUX_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	TURBO_LINUX_GUEST(68, "turboLinuxGuest", "turboLinuxGuest"),

	/**
	 * The '<em><b>Turbo Linux64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURBO_LINUX64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	TURBO_LINUX64_GUEST(69, "turboLinux64Guest", "turboLinux64Guest"),

	/**
	 * The '<em><b>Ubuntu Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU_GUEST(70, "ubuntuGuest", "ubuntuGuest"),

	/**
	 * The '<em><b>Ubuntu64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU64_GUEST(71, "ubuntu64Guest", "ubuntu64Guest"),

	/**
	 * The '<em><b>Debian4 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN4_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN4_GUEST(72, "debian4Guest", "debian4Guest"),

	/**
	 * The '<em><b>Debian4 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN4_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN4_64_GUEST(73, "debian4_64Guest", "debian4_64Guest"),

	/**
	 * The '<em><b>Debian5 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN5_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN5_GUEST(74, "debian5Guest", "debian5Guest"),

	/**
	 * The '<em><b>Debian5 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN5_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN5_64_GUEST(75, "debian5_64Guest", "debian5_64Guest"),

	/**
	 * The '<em><b>Debian6 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN6_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN6_GUEST(76, "debian6Guest", "debian6Guest"),

	/**
	 * The '<em><b>Debian6 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN6_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN6_64_GUEST(77, "debian6_64Guest", "debian6_64Guest"),

	/**
	 * The '<em><b>Debian7 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN7_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN7_GUEST(78, "debian7Guest", "debian7Guest"),

	/**
	 * The '<em><b>Debian7 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN7_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN7_64_GUEST(79, "debian7_64Guest", "debian7_64Guest"),

	/**
	 * The '<em><b>Debian8 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN8_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN8_GUEST(80, "debian8Guest", "debian8Guest"),

	/**
	 * The '<em><b>Debian8 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN8_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN8_64_GUEST(81, "debian8_64Guest", "debian8_64Guest"),

	/**
	 * The '<em><b>Asianux3 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASIANUX3_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ASIANUX3_GUEST(82, "asianux3Guest", "asianux3Guest"),

	/**
	 * The '<em><b>Asianux3 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASIANUX3_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ASIANUX3_64_GUEST(83, "asianux3_64Guest", "asianux3_64Guest"),

	/**
	 * The '<em><b>Asianux4 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASIANUX4_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ASIANUX4_GUEST(84, "asianux4Guest", "asianux4Guest"),

	/**
	 * The '<em><b>Asianux4 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASIANUX4_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ASIANUX4_64_GUEST(85, "asianux4_64Guest", "asianux4_64Guest"),

	/**
	 * The '<em><b>Asianux5 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASIANUX5_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ASIANUX5_64_GUEST(86, "asianux5_64Guest", "asianux5_64Guest"),

	/**
	 * The '<em><b>Opensuse Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENSUSE_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OPENSUSE_GUEST(87, "opensuseGuest", "opensuseGuest"),

	/**
	 * The '<em><b>Opensuse64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENSUSE64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OPENSUSE64_GUEST(88, "opensuse64Guest", "opensuse64Guest"),

	/**
	 * The '<em><b>Fedora Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEDORA_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	FEDORA_GUEST(89, "fedoraGuest", "fedoraGuest"),

	/**
	 * The '<em><b>Fedora64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEDORA64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	FEDORA64_GUEST(90, "fedora64Guest", "fedora64Guest"),

	/**
	 * The '<em><b>Coreos64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COREOS64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	COREOS64_GUEST(91, "coreos64Guest", "coreos64Guest"),

	/**
	 * The '<em><b>Other24x Linux Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER24X_LINUX_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER24X_LINUX_GUEST(92, "other24xLinuxGuest", "other24xLinuxGuest"),

	/**
	 * The '<em><b>Other26x Linux Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER26X_LINUX_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER26X_LINUX_GUEST(93, "other26xLinuxGuest", "other26xLinuxGuest"),

	/**
	 * The '<em><b>Other Linux Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_LINUX_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_LINUX_GUEST(94, "otherLinuxGuest", "otherLinuxGuest"),

	/**
	 * The '<em><b>Other3x Linux Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER3X_LINUX_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER3X_LINUX_GUEST(95, "other3xLinuxGuest", "other3xLinuxGuest"),

	/**
	 * The '<em><b>Generic Linux Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_LINUX_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC_LINUX_GUEST(96, "genericLinuxGuest", "genericLinuxGuest"),

	/**
	 * The '<em><b>Other24x Linux64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER24X_LINUX64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER24X_LINUX64_GUEST(97, "other24xLinux64Guest", "other24xLinux64Guest"),

	/**
	 * The '<em><b>Other26x Linux64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER26X_LINUX64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER26X_LINUX64_GUEST(98, "other26xLinux64Guest", "other26xLinux64Guest"),

	/**
	 * The '<em><b>Other3x Linux64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER3X_LINUX64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER3X_LINUX64_GUEST(99, "other3xLinux64Guest", "other3xLinux64Guest"),

	/**
	 * The '<em><b>Other Linux64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_LINUX64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_LINUX64_GUEST(100, "otherLinux64Guest", "otherLinux64Guest"),

	/**
	 * The '<em><b>Solaris6 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS6_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS6_GUEST(101, "solaris6Guest", "solaris6Guest"),

	/**
	 * The '<em><b>Solaris7 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS7_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS7_GUEST(102, "solaris7Guest", "solaris7Guest"),

	/**
	 * The '<em><b>Solaris8 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS8_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS8_GUEST(103, "solaris8Guest", "solaris8Guest"),

	/**
	 * The '<em><b>Solaris9 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS9_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS9_GUEST(104, "solaris9Guest", "solaris9Guest"),

	/**
	 * The '<em><b>Solaris10 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS10_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS10_GUEST(105, "solaris10Guest", "solaris10Guest"),

	/**
	 * The '<em><b>Solaris10 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS10_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS10_64_GUEST(106, "solaris10_64Guest", "solaris10_64Guest"),

	/**
	 * The '<em><b>Solaris11 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS11_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS11_64_GUEST(107, "solaris11_64Guest", "solaris11_64Guest"),

	/**
	 * The '<em><b>Os2 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS2_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OS2_GUEST(108, "os2Guest", "os2Guest"),

	/**
	 * The '<em><b>ECom Station Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECOM_STATION_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ECOM_STATION_GUEST(109, "eComStationGuest", "eComStationGuest"),

	/**
	 * The '<em><b>ECom Station2 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECOM_STATION2_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ECOM_STATION2_GUEST(110, "eComStation2Guest", "eComStation2Guest"),

	/**
	 * The '<em><b>Netware4 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWARE4_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	NETWARE4_GUEST(111, "netware4Guest", "netware4Guest"),

	/**
	 * The '<em><b>Netware5 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWARE5_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	NETWARE5_GUEST(112, "netware5Guest", "netware5Guest"),

	/**
	 * The '<em><b>Netware6 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWARE6_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	NETWARE6_GUEST(113, "netware6Guest", "netware6Guest"),

	/**
	 * The '<em><b>Open Server5 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SERVER5_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SERVER5_GUEST(114, "openServer5Guest", "openServer5Guest"),

	/**
	 * The '<em><b>Open Server6 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SERVER6_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SERVER6_GUEST(115, "openServer6Guest", "openServer6Guest"),

	/**
	 * The '<em><b>Unix Ware7 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIX_WARE7_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	UNIX_WARE7_GUEST(116, "unixWare7Guest", "unixWare7Guest"),

	/**
	 * The '<em><b>Darwin Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN_GUEST(117, "darwinGuest", "darwinGuest"),

	/**
	 * The '<em><b>Darwin64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN64_GUEST(118, "darwin64Guest", "darwin64Guest"),

	/**
	 * The '<em><b>Darwin10 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN10_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN10_GUEST(119, "darwin10Guest", "darwin10Guest"),

	/**
	 * The '<em><b>Darwin10 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN10_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN10_64_GUEST(120, "darwin10_64Guest", "darwin10_64Guest"),

	/**
	 * The '<em><b>Darwin11 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN11_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN11_GUEST(121, "darwin11Guest", "darwin11Guest"),

	/**
	 * The '<em><b>Darwin11 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN11_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN11_64_GUEST(122, "darwin11_64Guest", "darwin11_64Guest"),

	/**
	 * The '<em><b>Darwin12 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN12_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN12_64_GUEST(123, "darwin12_64Guest", "darwin12_64Guest"),

	/**
	 * The '<em><b>Darwin13 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN13_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN13_64_GUEST(124, "darwin13_64Guest", "darwin13_64Guest"),

	/**
	 * The '<em><b>Darwin14 64 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN14_64_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN14_64_GUEST(125, "darwin14_64Guest", "darwin14_64Guest"),

	/**
	 * The '<em><b>Vmkernel Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VMKERNEL_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	VMKERNEL_GUEST(126, "vmkernelGuest", "vmkernelGuest"),

	/**
	 * The '<em><b>Vmkernel5 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VMKERNEL5_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	VMKERNEL5_GUEST(127, "vmkernel5Guest", "vmkernel5Guest"),

	/**
	 * The '<em><b>Vmkernel6 Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VMKERNEL6_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	VMKERNEL6_GUEST(128, "vmkernel6Guest", "vmkernel6Guest"),

	/**
	 * The '<em><b>Other Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_GUEST(129, "otherGuest", "otherGuest"),

	/**
	 * The '<em><b>Other Guest64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_GUEST64_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_GUEST64(130, "otherGuest64", "otherGuest64");

	/**
	 * The '<em><b>Dos Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dos Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOS_GUEST
	 * @model name="dosGuest"
	 * @generated
	 * @ordered
	 */
	public static final int DOS_GUEST_VALUE = 0;

	/**
	 * The '<em><b>Win31 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win31 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN31_GUEST
	 * @model name="win31Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN31_GUEST_VALUE = 1;

	/**
	 * The '<em><b>Win95 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win95 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN95_GUEST
	 * @model name="win95Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN95_GUEST_VALUE = 2;

	/**
	 * The '<em><b>Win98 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win98 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN98_GUEST
	 * @model name="win98Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN98_GUEST_VALUE = 3;

	/**
	 * The '<em><b>Win Me Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Me Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_ME_GUEST
	 * @model name="winMeGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_ME_GUEST_VALUE = 4;

	/**
	 * The '<em><b>Win NT Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win NT Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_NT_GUEST
	 * @model name="winNTGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_NT_GUEST_VALUE = 5;

	/**
	 * The '<em><b>Win2000 Pro Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win2000 Pro Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN2000_PRO_GUEST
	 * @model name="win2000ProGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN2000_PRO_GUEST_VALUE = 6;

	/**
	 * The '<em><b>Win2000 Serv Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win2000 Serv Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN2000_SERV_GUEST
	 * @model name="win2000ServGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN2000_SERV_GUEST_VALUE = 7;

	/**
	 * The '<em><b>Win2000 Adv Serv Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win2000 Adv Serv Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN2000_ADV_SERV_GUEST
	 * @model name="win2000AdvServGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN2000_ADV_SERV_GUEST_VALUE = 8;

	/**
	 * The '<em><b>Win XP Home Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win XP Home Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_XP_HOME_GUEST
	 * @model name="winXPHomeGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_XP_HOME_GUEST_VALUE = 9;

	/**
	 * The '<em><b>Win XP Pro Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win XP Pro Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_XP_PRO_GUEST
	 * @model name="winXPProGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_XP_PRO_GUEST_VALUE = 10;

	/**
	 * The '<em><b>Win XP Pro64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win XP Pro64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_XP_PRO64_GUEST
	 * @model name="winXPPro64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_XP_PRO64_GUEST_VALUE = 11;

	/**
	 * The '<em><b>Win Net Web Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Net Web Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_WEB_GUEST
	 * @model name="winNetWebGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_NET_WEB_GUEST_VALUE = 12;

	/**
	 * The '<em><b>Win Net Standard Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Net Standard Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_STANDARD_GUEST
	 * @model name="winNetStandardGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_NET_STANDARD_GUEST_VALUE = 13;

	/**
	 * The '<em><b>Win Net Enterprise Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Net Enterprise Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_ENTERPRISE_GUEST
	 * @model name="winNetEnterpriseGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_NET_ENTERPRISE_GUEST_VALUE = 14;

	/**
	 * The '<em><b>Win Net Datacenter Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Net Datacenter Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_DATACENTER_GUEST
	 * @model name="winNetDatacenterGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_NET_DATACENTER_GUEST_VALUE = 15;

	/**
	 * The '<em><b>Win Net Business Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Net Business Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_BUSINESS_GUEST
	 * @model name="winNetBusinessGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_NET_BUSINESS_GUEST_VALUE = 16;

	/**
	 * The '<em><b>Win Net Standard64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Net Standard64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_STANDARD64_GUEST
	 * @model name="winNetStandard64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_NET_STANDARD64_GUEST_VALUE = 17;

	/**
	 * The '<em><b>Win Net Enterprise64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Net Enterprise64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_ENTERPRISE64_GUEST
	 * @model name="winNetEnterprise64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_NET_ENTERPRISE64_GUEST_VALUE = 18;

	/**
	 * The '<em><b>Win Longhorn Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Longhorn Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_LONGHORN_GUEST
	 * @model name="winLonghornGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_LONGHORN_GUEST_VALUE = 19;

	/**
	 * The '<em><b>Win Longhorn64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Longhorn64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_LONGHORN64_GUEST
	 * @model name="winLonghorn64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_LONGHORN64_GUEST_VALUE = 20;

	/**
	 * The '<em><b>Win Net Datacenter64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Net Datacenter64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_NET_DATACENTER64_GUEST
	 * @model name="winNetDatacenter64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_NET_DATACENTER64_GUEST_VALUE = 21;

	/**
	 * The '<em><b>Win Vista Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Vista Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_VISTA_GUEST
	 * @model name="winVistaGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_VISTA_GUEST_VALUE = 22;

	/**
	 * The '<em><b>Win Vista64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Win Vista64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_VISTA64_GUEST
	 * @model name="winVista64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_VISTA64_GUEST_VALUE = 23;

	/**
	 * The '<em><b>Windows7 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows7 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS7_GUEST
	 * @model name="windows7Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS7_GUEST_VALUE = 24;

	/**
	 * The '<em><b>Windows7 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows7 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS7_64_GUEST
	 * @model name="windows7_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS7_64_GUEST_VALUE = 25;

	/**
	 * The '<em><b>Windows7 Server64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows7 Server64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS7_SERVER64_GUEST
	 * @model name="windows7Server64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS7_SERVER64_GUEST_VALUE = 26;

	/**
	 * The '<em><b>Windows8 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows8 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS8_GUEST
	 * @model name="windows8Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS8_GUEST_VALUE = 27;

	/**
	 * The '<em><b>Windows8 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows8 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS8_64_GUEST
	 * @model name="windows8_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS8_64_GUEST_VALUE = 28;

	/**
	 * The '<em><b>Windows8 Server64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows8 Server64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS8_SERVER64_GUEST
	 * @model name="windows8Server64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS8_SERVER64_GUEST_VALUE = 29;

	/**
	 * The '<em><b>Windows9 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows9 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS9_GUEST
	 * @model name="windows9Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS9_GUEST_VALUE = 30;

	/**
	 * The '<em><b>Windows9 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows9 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS9_64_GUEST
	 * @model name="windows9_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS9_64_GUEST_VALUE = 31;

	/**
	 * The '<em><b>Windows9 Server64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows9 Server64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS9_SERVER64_GUEST
	 * @model name="windows9Server64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS9_SERVER64_GUEST_VALUE = 32;

	/**
	 * The '<em><b>Windows Hyper VGuest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows Hyper VGuest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_HYPER_VGUEST
	 * @model name="windowsHyperVGuest"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_HYPER_VGUEST_VALUE = 33;

	/**
	 * The '<em><b>Freebsd Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Freebsd Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREEBSD_GUEST
	 * @model name="freebsdGuest"
	 * @generated
	 * @ordered
	 */
	public static final int FREEBSD_GUEST_VALUE = 34;

	/**
	 * The '<em><b>Freebsd64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Freebsd64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREEBSD64_GUEST
	 * @model name="freebsd64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int FREEBSD64_GUEST_VALUE = 35;

	/**
	 * The '<em><b>Redhat Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Redhat Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REDHAT_GUEST
	 * @model name="redhatGuest"
	 * @generated
	 * @ordered
	 */
	public static final int REDHAT_GUEST_VALUE = 36;

	/**
	 * The '<em><b>Rhel2 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel2 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL2_GUEST
	 * @model name="rhel2Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL2_GUEST_VALUE = 37;

	/**
	 * The '<em><b>Rhel3 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel3 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL3_GUEST
	 * @model name="rhel3Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL3_GUEST_VALUE = 38;

	/**
	 * The '<em><b>Rhel3 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel3 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL3_64_GUEST
	 * @model name="rhel3_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL3_64_GUEST_VALUE = 39;

	/**
	 * The '<em><b>Rhel4 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel4 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL4_GUEST
	 * @model name="rhel4Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL4_GUEST_VALUE = 40;

	/**
	 * The '<em><b>Rhel4 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel4 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL4_64_GUEST
	 * @model name="rhel4_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL4_64_GUEST_VALUE = 41;

	/**
	 * The '<em><b>Rhel5 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel5 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL5_GUEST
	 * @model name="rhel5Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL5_GUEST_VALUE = 42;

	/**
	 * The '<em><b>Rhel5 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel5 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL5_64_GUEST
	 * @model name="rhel5_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL5_64_GUEST_VALUE = 43;

	/**
	 * The '<em><b>Rhel6 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel6 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL6_GUEST
	 * @model name="rhel6Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL6_GUEST_VALUE = 44;

	/**
	 * The '<em><b>Rhel6 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel6 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL6_64_GUEST
	 * @model name="rhel6_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL6_64_GUEST_VALUE = 45;

	/**
	 * The '<em><b>Rhel7 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel7 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL7_GUEST
	 * @model name="rhel7Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL7_GUEST_VALUE = 46;

	/**
	 * The '<em><b>Rhel7 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhel7 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL7_64_GUEST
	 * @model name="rhel7_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int RHEL7_64_GUEST_VALUE = 47;

	/**
	 * The '<em><b>Centos Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Centos Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTOS_GUEST
	 * @model name="centosGuest"
	 * @generated
	 * @ordered
	 */
	public static final int CENTOS_GUEST_VALUE = 48;

	/**
	 * The '<em><b>Centos64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Centos64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTOS64_GUEST
	 * @model name="centos64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int CENTOS64_GUEST_VALUE = 49;

	/**
	 * The '<em><b>Oracle Linux Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oracle Linux Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORACLE_LINUX_GUEST
	 * @model name="oracleLinuxGuest"
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_LINUX_GUEST_VALUE = 50;

	/**
	 * The '<em><b>Oracle Linux64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oracle Linux64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORACLE_LINUX64_GUEST
	 * @model name="oracleLinux64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_LINUX64_GUEST_VALUE = 51;

	/**
	 * The '<em><b>Suse Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suse Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSE_GUEST
	 * @model name="suseGuest"
	 * @generated
	 * @ordered
	 */
	public static final int SUSE_GUEST_VALUE = 52;

	/**
	 * The '<em><b>Suse64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suse64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSE64_GUEST
	 * @model name="suse64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SUSE64_GUEST_VALUE = 53;

	/**
	 * The '<em><b>Sles Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sles Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLES_GUEST
	 * @model name="slesGuest"
	 * @generated
	 * @ordered
	 */
	public static final int SLES_GUEST_VALUE = 54;

	/**
	 * The '<em><b>Sles64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sles64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLES64_GUEST
	 * @model name="sles64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SLES64_GUEST_VALUE = 55;

	/**
	 * The '<em><b>Sles10 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sles10 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLES10_GUEST
	 * @model name="sles10Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SLES10_GUEST_VALUE = 56;

	/**
	 * The '<em><b>Sles10 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sles10 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLES10_64_GUEST
	 * @model name="sles10_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SLES10_64_GUEST_VALUE = 57;

	/**
	 * The '<em><b>Sles11 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sles11 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLES11_GUEST
	 * @model name="sles11Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SLES11_GUEST_VALUE = 58;

	/**
	 * The '<em><b>Sles11 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sles11 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLES11_64_GUEST
	 * @model name="sles11_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SLES11_64_GUEST_VALUE = 59;

	/**
	 * The '<em><b>Sles12 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sles12 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLES12_GUEST
	 * @model name="sles12Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SLES12_GUEST_VALUE = 60;

	/**
	 * The '<em><b>Sles12 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sles12 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLES12_64_GUEST
	 * @model name="sles12_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SLES12_64_GUEST_VALUE = 61;

	/**
	 * The '<em><b>Nld9 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nld9 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NLD9_GUEST
	 * @model name="nld9Guest"
	 * @generated
	 * @ordered
	 */
	public static final int NLD9_GUEST_VALUE = 62;

	/**
	 * The '<em><b>Oes Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oes Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OES_GUEST
	 * @model name="oesGuest"
	 * @generated
	 * @ordered
	 */
	public static final int OES_GUEST_VALUE = 63;

	/**
	 * The '<em><b>Sjds Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sjds Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SJDS_GUEST
	 * @model name="sjdsGuest"
	 * @generated
	 * @ordered
	 */
	public static final int SJDS_GUEST_VALUE = 64;

	/**
	 * The '<em><b>Mandrake Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mandrake Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANDRAKE_GUEST
	 * @model name="mandrakeGuest"
	 * @generated
	 * @ordered
	 */
	public static final int MANDRAKE_GUEST_VALUE = 65;

	/**
	 * The '<em><b>Mandriva Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mandriva Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANDRIVA_GUEST
	 * @model name="mandrivaGuest"
	 * @generated
	 * @ordered
	 */
	public static final int MANDRIVA_GUEST_VALUE = 66;

	/**
	 * The '<em><b>Mandriva64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mandriva64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANDRIVA64_GUEST
	 * @model name="mandriva64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int MANDRIVA64_GUEST_VALUE = 67;

	/**
	 * The '<em><b>Turbo Linux Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Turbo Linux Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TURBO_LINUX_GUEST
	 * @model name="turboLinuxGuest"
	 * @generated
	 * @ordered
	 */
	public static final int TURBO_LINUX_GUEST_VALUE = 68;

	/**
	 * The '<em><b>Turbo Linux64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Turbo Linux64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TURBO_LINUX64_GUEST
	 * @model name="turboLinux64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int TURBO_LINUX64_GUEST_VALUE = 69;

	/**
	 * The '<em><b>Ubuntu Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ubuntu Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_GUEST
	 * @model name="ubuntuGuest"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU_GUEST_VALUE = 70;

	/**
	 * The '<em><b>Ubuntu64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ubuntu64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UBUNTU64_GUEST
	 * @model name="ubuntu64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU64_GUEST_VALUE = 71;

	/**
	 * The '<em><b>Debian4 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian4 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN4_GUEST
	 * @model name="debian4Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN4_GUEST_VALUE = 72;

	/**
	 * The '<em><b>Debian4 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian4 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN4_64_GUEST
	 * @model name="debian4_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN4_64_GUEST_VALUE = 73;

	/**
	 * The '<em><b>Debian5 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian5 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN5_GUEST
	 * @model name="debian5Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN5_GUEST_VALUE = 74;

	/**
	 * The '<em><b>Debian5 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian5 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN5_64_GUEST
	 * @model name="debian5_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN5_64_GUEST_VALUE = 75;

	/**
	 * The '<em><b>Debian6 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian6 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN6_GUEST
	 * @model name="debian6Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN6_GUEST_VALUE = 76;

	/**
	 * The '<em><b>Debian6 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian6 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN6_64_GUEST
	 * @model name="debian6_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN6_64_GUEST_VALUE = 77;

	/**
	 * The '<em><b>Debian7 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian7 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN7_GUEST
	 * @model name="debian7Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN7_GUEST_VALUE = 78;

	/**
	 * The '<em><b>Debian7 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian7 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN7_64_GUEST
	 * @model name="debian7_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN7_64_GUEST_VALUE = 79;

	/**
	 * The '<em><b>Debian8 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian8 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN8_GUEST
	 * @model name="debian8Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN8_GUEST_VALUE = 80;

	/**
	 * The '<em><b>Debian8 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debian8 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN8_64_GUEST
	 * @model name="debian8_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN8_64_GUEST_VALUE = 81;

	/**
	 * The '<em><b>Asianux3 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asianux3 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASIANUX3_GUEST
	 * @model name="asianux3Guest"
	 * @generated
	 * @ordered
	 */
	public static final int ASIANUX3_GUEST_VALUE = 82;

	/**
	 * The '<em><b>Asianux3 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asianux3 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASIANUX3_64_GUEST
	 * @model name="asianux3_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int ASIANUX3_64_GUEST_VALUE = 83;

	/**
	 * The '<em><b>Asianux4 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asianux4 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASIANUX4_GUEST
	 * @model name="asianux4Guest"
	 * @generated
	 * @ordered
	 */
	public static final int ASIANUX4_GUEST_VALUE = 84;

	/**
	 * The '<em><b>Asianux4 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asianux4 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASIANUX4_64_GUEST
	 * @model name="asianux4_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int ASIANUX4_64_GUEST_VALUE = 85;

	/**
	 * The '<em><b>Asianux5 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asianux5 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASIANUX5_64_GUEST
	 * @model name="asianux5_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int ASIANUX5_64_GUEST_VALUE = 86;

	/**
	 * The '<em><b>Opensuse Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Opensuse Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPENSUSE_GUEST
	 * @model name="opensuseGuest"
	 * @generated
	 * @ordered
	 */
	public static final int OPENSUSE_GUEST_VALUE = 87;

	/**
	 * The '<em><b>Opensuse64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Opensuse64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPENSUSE64_GUEST
	 * @model name="opensuse64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int OPENSUSE64_GUEST_VALUE = 88;

	/**
	 * The '<em><b>Fedora Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fedora Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEDORA_GUEST
	 * @model name="fedoraGuest"
	 * @generated
	 * @ordered
	 */
	public static final int FEDORA_GUEST_VALUE = 89;

	/**
	 * The '<em><b>Fedora64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fedora64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEDORA64_GUEST
	 * @model name="fedora64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int FEDORA64_GUEST_VALUE = 90;

	/**
	 * The '<em><b>Coreos64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coreos64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COREOS64_GUEST
	 * @model name="coreos64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int COREOS64_GUEST_VALUE = 91;

	/**
	 * The '<em><b>Other24x Linux Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other24x Linux Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER24X_LINUX_GUEST
	 * @model name="other24xLinuxGuest"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER24X_LINUX_GUEST_VALUE = 92;

	/**
	 * The '<em><b>Other26x Linux Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other26x Linux Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER26X_LINUX_GUEST
	 * @model name="other26xLinuxGuest"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER26X_LINUX_GUEST_VALUE = 93;

	/**
	 * The '<em><b>Other Linux Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Linux Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_LINUX_GUEST
	 * @model name="otherLinuxGuest"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_LINUX_GUEST_VALUE = 94;

	/**
	 * The '<em><b>Other3x Linux Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other3x Linux Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER3X_LINUX_GUEST
	 * @model name="other3xLinuxGuest"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER3X_LINUX_GUEST_VALUE = 95;

	/**
	 * The '<em><b>Generic Linux Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generic Linux Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC_LINUX_GUEST
	 * @model name="genericLinuxGuest"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_LINUX_GUEST_VALUE = 96;

	/**
	 * The '<em><b>Other24x Linux64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other24x Linux64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER24X_LINUX64_GUEST
	 * @model name="other24xLinux64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER24X_LINUX64_GUEST_VALUE = 97;

	/**
	 * The '<em><b>Other26x Linux64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other26x Linux64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER26X_LINUX64_GUEST
	 * @model name="other26xLinux64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER26X_LINUX64_GUEST_VALUE = 98;

	/**
	 * The '<em><b>Other3x Linux64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other3x Linux64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER3X_LINUX64_GUEST
	 * @model name="other3xLinux64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER3X_LINUX64_GUEST_VALUE = 99;

	/**
	 * The '<em><b>Other Linux64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Linux64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_LINUX64_GUEST
	 * @model name="otherLinux64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_LINUX64_GUEST_VALUE = 100;

	/**
	 * The '<em><b>Solaris6 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris6 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS6_GUEST
	 * @model name="solaris6Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS6_GUEST_VALUE = 101;

	/**
	 * The '<em><b>Solaris7 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris7 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS7_GUEST
	 * @model name="solaris7Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS7_GUEST_VALUE = 102;

	/**
	 * The '<em><b>Solaris8 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris8 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS8_GUEST
	 * @model name="solaris8Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS8_GUEST_VALUE = 103;

	/**
	 * The '<em><b>Solaris9 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris9 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS9_GUEST
	 * @model name="solaris9Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS9_GUEST_VALUE = 104;

	/**
	 * The '<em><b>Solaris10 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris10 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS10_GUEST
	 * @model name="solaris10Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS10_GUEST_VALUE = 105;

	/**
	 * The '<em><b>Solaris10 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris10 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS10_64_GUEST
	 * @model name="solaris10_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS10_64_GUEST_VALUE = 106;

	/**
	 * The '<em><b>Solaris11 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris11 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS11_64_GUEST
	 * @model name="solaris11_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS11_64_GUEST_VALUE = 107;

	/**
	 * The '<em><b>Os2 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Os2 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS2_GUEST
	 * @model name="os2Guest"
	 * @generated
	 * @ordered
	 */
	public static final int OS2_GUEST_VALUE = 108;

	/**
	 * The '<em><b>ECom Station Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ECom Station Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECOM_STATION_GUEST
	 * @model name="eComStationGuest"
	 * @generated
	 * @ordered
	 */
	public static final int ECOM_STATION_GUEST_VALUE = 109;

	/**
	 * The '<em><b>ECom Station2 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ECom Station2 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECOM_STATION2_GUEST
	 * @model name="eComStation2Guest"
	 * @generated
	 * @ordered
	 */
	public static final int ECOM_STATION2_GUEST_VALUE = 110;

	/**
	 * The '<em><b>Netware4 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Netware4 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWARE4_GUEST
	 * @model name="netware4Guest"
	 * @generated
	 * @ordered
	 */
	public static final int NETWARE4_GUEST_VALUE = 111;

	/**
	 * The '<em><b>Netware5 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Netware5 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWARE5_GUEST
	 * @model name="netware5Guest"
	 * @generated
	 * @ordered
	 */
	public static final int NETWARE5_GUEST_VALUE = 112;

	/**
	 * The '<em><b>Netware6 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Netware6 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWARE6_GUEST
	 * @model name="netware6Guest"
	 * @generated
	 * @ordered
	 */
	public static final int NETWARE6_GUEST_VALUE = 113;

	/**
	 * The '<em><b>Open Server5 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Server5 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_SERVER5_GUEST
	 * @model name="openServer5Guest"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SERVER5_GUEST_VALUE = 114;

	/**
	 * The '<em><b>Open Server6 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Server6 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_SERVER6_GUEST
	 * @model name="openServer6Guest"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SERVER6_GUEST_VALUE = 115;

	/**
	 * The '<em><b>Unix Ware7 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unix Ware7 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIX_WARE7_GUEST
	 * @model name="unixWare7Guest"
	 * @generated
	 * @ordered
	 */
	public static final int UNIX_WARE7_GUEST_VALUE = 116;

	/**
	 * The '<em><b>Darwin Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Darwin Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN_GUEST
	 * @model name="darwinGuest"
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN_GUEST_VALUE = 117;

	/**
	 * The '<em><b>Darwin64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Darwin64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN64_GUEST
	 * @model name="darwin64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN64_GUEST_VALUE = 118;

	/**
	 * The '<em><b>Darwin10 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Darwin10 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN10_GUEST
	 * @model name="darwin10Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN10_GUEST_VALUE = 119;

	/**
	 * The '<em><b>Darwin10 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Darwin10 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN10_64_GUEST
	 * @model name="darwin10_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN10_64_GUEST_VALUE = 120;

	/**
	 * The '<em><b>Darwin11 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Darwin11 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN11_GUEST
	 * @model name="darwin11Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN11_GUEST_VALUE = 121;

	/**
	 * The '<em><b>Darwin11 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Darwin11 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN11_64_GUEST
	 * @model name="darwin11_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN11_64_GUEST_VALUE = 122;

	/**
	 * The '<em><b>Darwin12 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Darwin12 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN12_64_GUEST
	 * @model name="darwin12_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN12_64_GUEST_VALUE = 123;

	/**
	 * The '<em><b>Darwin13 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Darwin13 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN13_64_GUEST
	 * @model name="darwin13_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN13_64_GUEST_VALUE = 124;

	/**
	 * The '<em><b>Darwin14 64 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Darwin14 64 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN14_64_GUEST
	 * @model name="darwin14_64Guest"
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN14_64_GUEST_VALUE = 125;

	/**
	 * The '<em><b>Vmkernel Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vmkernel Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VMKERNEL_GUEST
	 * @model name="vmkernelGuest"
	 * @generated
	 * @ordered
	 */
	public static final int VMKERNEL_GUEST_VALUE = 126;

	/**
	 * The '<em><b>Vmkernel5 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vmkernel5 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VMKERNEL5_GUEST
	 * @model name="vmkernel5Guest"
	 * @generated
	 * @ordered
	 */
	public static final int VMKERNEL5_GUEST_VALUE = 127;

	/**
	 * The '<em><b>Vmkernel6 Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vmkernel6 Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VMKERNEL6_GUEST
	 * @model name="vmkernel6Guest"
	 * @generated
	 * @ordered
	 */
	public static final int VMKERNEL6_GUEST_VALUE = 128;

	/**
	 * The '<em><b>Other Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_GUEST
	 * @model name="otherGuest"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_GUEST_VALUE = 129;

	/**
	 * The '<em><b>Other Guest64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Guest64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_GUEST64
	 * @model name="otherGuest64"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_GUEST64_VALUE = 130;

	/**
	 * An array of all the '<em><b>Guest Os Identifiers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GuestOsIdentifiers[] VALUES_ARRAY =
		new GuestOsIdentifiers[] {
			DOS_GUEST,
			WIN31_GUEST,
			WIN95_GUEST,
			WIN98_GUEST,
			WIN_ME_GUEST,
			WIN_NT_GUEST,
			WIN2000_PRO_GUEST,
			WIN2000_SERV_GUEST,
			WIN2000_ADV_SERV_GUEST,
			WIN_XP_HOME_GUEST,
			WIN_XP_PRO_GUEST,
			WIN_XP_PRO64_GUEST,
			WIN_NET_WEB_GUEST,
			WIN_NET_STANDARD_GUEST,
			WIN_NET_ENTERPRISE_GUEST,
			WIN_NET_DATACENTER_GUEST,
			WIN_NET_BUSINESS_GUEST,
			WIN_NET_STANDARD64_GUEST,
			WIN_NET_ENTERPRISE64_GUEST,
			WIN_LONGHORN_GUEST,
			WIN_LONGHORN64_GUEST,
			WIN_NET_DATACENTER64_GUEST,
			WIN_VISTA_GUEST,
			WIN_VISTA64_GUEST,
			WINDOWS7_GUEST,
			WINDOWS7_64_GUEST,
			WINDOWS7_SERVER64_GUEST,
			WINDOWS8_GUEST,
			WINDOWS8_64_GUEST,
			WINDOWS8_SERVER64_GUEST,
			WINDOWS9_GUEST,
			WINDOWS9_64_GUEST,
			WINDOWS9_SERVER64_GUEST,
			WINDOWS_HYPER_VGUEST,
			FREEBSD_GUEST,
			FREEBSD64_GUEST,
			REDHAT_GUEST,
			RHEL2_GUEST,
			RHEL3_GUEST,
			RHEL3_64_GUEST,
			RHEL4_GUEST,
			RHEL4_64_GUEST,
			RHEL5_GUEST,
			RHEL5_64_GUEST,
			RHEL6_GUEST,
			RHEL6_64_GUEST,
			RHEL7_GUEST,
			RHEL7_64_GUEST,
			CENTOS_GUEST,
			CENTOS64_GUEST,
			ORACLE_LINUX_GUEST,
			ORACLE_LINUX64_GUEST,
			SUSE_GUEST,
			SUSE64_GUEST,
			SLES_GUEST,
			SLES64_GUEST,
			SLES10_GUEST,
			SLES10_64_GUEST,
			SLES11_GUEST,
			SLES11_64_GUEST,
			SLES12_GUEST,
			SLES12_64_GUEST,
			NLD9_GUEST,
			OES_GUEST,
			SJDS_GUEST,
			MANDRAKE_GUEST,
			MANDRIVA_GUEST,
			MANDRIVA64_GUEST,
			TURBO_LINUX_GUEST,
			TURBO_LINUX64_GUEST,
			UBUNTU_GUEST,
			UBUNTU64_GUEST,
			DEBIAN4_GUEST,
			DEBIAN4_64_GUEST,
			DEBIAN5_GUEST,
			DEBIAN5_64_GUEST,
			DEBIAN6_GUEST,
			DEBIAN6_64_GUEST,
			DEBIAN7_GUEST,
			DEBIAN7_64_GUEST,
			DEBIAN8_GUEST,
			DEBIAN8_64_GUEST,
			ASIANUX3_GUEST,
			ASIANUX3_64_GUEST,
			ASIANUX4_GUEST,
			ASIANUX4_64_GUEST,
			ASIANUX5_64_GUEST,
			OPENSUSE_GUEST,
			OPENSUSE64_GUEST,
			FEDORA_GUEST,
			FEDORA64_GUEST,
			COREOS64_GUEST,
			OTHER24X_LINUX_GUEST,
			OTHER26X_LINUX_GUEST,
			OTHER_LINUX_GUEST,
			OTHER3X_LINUX_GUEST,
			GENERIC_LINUX_GUEST,
			OTHER24X_LINUX64_GUEST,
			OTHER26X_LINUX64_GUEST,
			OTHER3X_LINUX64_GUEST,
			OTHER_LINUX64_GUEST,
			SOLARIS6_GUEST,
			SOLARIS7_GUEST,
			SOLARIS8_GUEST,
			SOLARIS9_GUEST,
			SOLARIS10_GUEST,
			SOLARIS10_64_GUEST,
			SOLARIS11_64_GUEST,
			OS2_GUEST,
			ECOM_STATION_GUEST,
			ECOM_STATION2_GUEST,
			NETWARE4_GUEST,
			NETWARE5_GUEST,
			NETWARE6_GUEST,
			OPEN_SERVER5_GUEST,
			OPEN_SERVER6_GUEST,
			UNIX_WARE7_GUEST,
			DARWIN_GUEST,
			DARWIN64_GUEST,
			DARWIN10_GUEST,
			DARWIN10_64_GUEST,
			DARWIN11_GUEST,
			DARWIN11_64_GUEST,
			DARWIN12_64_GUEST,
			DARWIN13_64_GUEST,
			DARWIN14_64_GUEST,
			VMKERNEL_GUEST,
			VMKERNEL5_GUEST,
			VMKERNEL6_GUEST,
			OTHER_GUEST,
			OTHER_GUEST64,
		};

	/**
	 * A public read-only list of all the '<em><b>Guest Os Identifiers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GuestOsIdentifiers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guest Os Identifiers</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuestOsIdentifiers get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuestOsIdentifiers result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guest Os Identifiers</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuestOsIdentifiers getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuestOsIdentifiers result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guest Os Identifiers</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuestOsIdentifiers get(int value) {
		switch (value) {
			case DOS_GUEST_VALUE: return DOS_GUEST;
			case WIN31_GUEST_VALUE: return WIN31_GUEST;
			case WIN95_GUEST_VALUE: return WIN95_GUEST;
			case WIN98_GUEST_VALUE: return WIN98_GUEST;
			case WIN_ME_GUEST_VALUE: return WIN_ME_GUEST;
			case WIN_NT_GUEST_VALUE: return WIN_NT_GUEST;
			case WIN2000_PRO_GUEST_VALUE: return WIN2000_PRO_GUEST;
			case WIN2000_SERV_GUEST_VALUE: return WIN2000_SERV_GUEST;
			case WIN2000_ADV_SERV_GUEST_VALUE: return WIN2000_ADV_SERV_GUEST;
			case WIN_XP_HOME_GUEST_VALUE: return WIN_XP_HOME_GUEST;
			case WIN_XP_PRO_GUEST_VALUE: return WIN_XP_PRO_GUEST;
			case WIN_XP_PRO64_GUEST_VALUE: return WIN_XP_PRO64_GUEST;
			case WIN_NET_WEB_GUEST_VALUE: return WIN_NET_WEB_GUEST;
			case WIN_NET_STANDARD_GUEST_VALUE: return WIN_NET_STANDARD_GUEST;
			case WIN_NET_ENTERPRISE_GUEST_VALUE: return WIN_NET_ENTERPRISE_GUEST;
			case WIN_NET_DATACENTER_GUEST_VALUE: return WIN_NET_DATACENTER_GUEST;
			case WIN_NET_BUSINESS_GUEST_VALUE: return WIN_NET_BUSINESS_GUEST;
			case WIN_NET_STANDARD64_GUEST_VALUE: return WIN_NET_STANDARD64_GUEST;
			case WIN_NET_ENTERPRISE64_GUEST_VALUE: return WIN_NET_ENTERPRISE64_GUEST;
			case WIN_LONGHORN_GUEST_VALUE: return WIN_LONGHORN_GUEST;
			case WIN_LONGHORN64_GUEST_VALUE: return WIN_LONGHORN64_GUEST;
			case WIN_NET_DATACENTER64_GUEST_VALUE: return WIN_NET_DATACENTER64_GUEST;
			case WIN_VISTA_GUEST_VALUE: return WIN_VISTA_GUEST;
			case WIN_VISTA64_GUEST_VALUE: return WIN_VISTA64_GUEST;
			case WINDOWS7_GUEST_VALUE: return WINDOWS7_GUEST;
			case WINDOWS7_64_GUEST_VALUE: return WINDOWS7_64_GUEST;
			case WINDOWS7_SERVER64_GUEST_VALUE: return WINDOWS7_SERVER64_GUEST;
			case WINDOWS8_GUEST_VALUE: return WINDOWS8_GUEST;
			case WINDOWS8_64_GUEST_VALUE: return WINDOWS8_64_GUEST;
			case WINDOWS8_SERVER64_GUEST_VALUE: return WINDOWS8_SERVER64_GUEST;
			case WINDOWS9_GUEST_VALUE: return WINDOWS9_GUEST;
			case WINDOWS9_64_GUEST_VALUE: return WINDOWS9_64_GUEST;
			case WINDOWS9_SERVER64_GUEST_VALUE: return WINDOWS9_SERVER64_GUEST;
			case WINDOWS_HYPER_VGUEST_VALUE: return WINDOWS_HYPER_VGUEST;
			case FREEBSD_GUEST_VALUE: return FREEBSD_GUEST;
			case FREEBSD64_GUEST_VALUE: return FREEBSD64_GUEST;
			case REDHAT_GUEST_VALUE: return REDHAT_GUEST;
			case RHEL2_GUEST_VALUE: return RHEL2_GUEST;
			case RHEL3_GUEST_VALUE: return RHEL3_GUEST;
			case RHEL3_64_GUEST_VALUE: return RHEL3_64_GUEST;
			case RHEL4_GUEST_VALUE: return RHEL4_GUEST;
			case RHEL4_64_GUEST_VALUE: return RHEL4_64_GUEST;
			case RHEL5_GUEST_VALUE: return RHEL5_GUEST;
			case RHEL5_64_GUEST_VALUE: return RHEL5_64_GUEST;
			case RHEL6_GUEST_VALUE: return RHEL6_GUEST;
			case RHEL6_64_GUEST_VALUE: return RHEL6_64_GUEST;
			case RHEL7_GUEST_VALUE: return RHEL7_GUEST;
			case RHEL7_64_GUEST_VALUE: return RHEL7_64_GUEST;
			case CENTOS_GUEST_VALUE: return CENTOS_GUEST;
			case CENTOS64_GUEST_VALUE: return CENTOS64_GUEST;
			case ORACLE_LINUX_GUEST_VALUE: return ORACLE_LINUX_GUEST;
			case ORACLE_LINUX64_GUEST_VALUE: return ORACLE_LINUX64_GUEST;
			case SUSE_GUEST_VALUE: return SUSE_GUEST;
			case SUSE64_GUEST_VALUE: return SUSE64_GUEST;
			case SLES_GUEST_VALUE: return SLES_GUEST;
			case SLES64_GUEST_VALUE: return SLES64_GUEST;
			case SLES10_GUEST_VALUE: return SLES10_GUEST;
			case SLES10_64_GUEST_VALUE: return SLES10_64_GUEST;
			case SLES11_GUEST_VALUE: return SLES11_GUEST;
			case SLES11_64_GUEST_VALUE: return SLES11_64_GUEST;
			case SLES12_GUEST_VALUE: return SLES12_GUEST;
			case SLES12_64_GUEST_VALUE: return SLES12_64_GUEST;
			case NLD9_GUEST_VALUE: return NLD9_GUEST;
			case OES_GUEST_VALUE: return OES_GUEST;
			case SJDS_GUEST_VALUE: return SJDS_GUEST;
			case MANDRAKE_GUEST_VALUE: return MANDRAKE_GUEST;
			case MANDRIVA_GUEST_VALUE: return MANDRIVA_GUEST;
			case MANDRIVA64_GUEST_VALUE: return MANDRIVA64_GUEST;
			case TURBO_LINUX_GUEST_VALUE: return TURBO_LINUX_GUEST;
			case TURBO_LINUX64_GUEST_VALUE: return TURBO_LINUX64_GUEST;
			case UBUNTU_GUEST_VALUE: return UBUNTU_GUEST;
			case UBUNTU64_GUEST_VALUE: return UBUNTU64_GUEST;
			case DEBIAN4_GUEST_VALUE: return DEBIAN4_GUEST;
			case DEBIAN4_64_GUEST_VALUE: return DEBIAN4_64_GUEST;
			case DEBIAN5_GUEST_VALUE: return DEBIAN5_GUEST;
			case DEBIAN5_64_GUEST_VALUE: return DEBIAN5_64_GUEST;
			case DEBIAN6_GUEST_VALUE: return DEBIAN6_GUEST;
			case DEBIAN6_64_GUEST_VALUE: return DEBIAN6_64_GUEST;
			case DEBIAN7_GUEST_VALUE: return DEBIAN7_GUEST;
			case DEBIAN7_64_GUEST_VALUE: return DEBIAN7_64_GUEST;
			case DEBIAN8_GUEST_VALUE: return DEBIAN8_GUEST;
			case DEBIAN8_64_GUEST_VALUE: return DEBIAN8_64_GUEST;
			case ASIANUX3_GUEST_VALUE: return ASIANUX3_GUEST;
			case ASIANUX3_64_GUEST_VALUE: return ASIANUX3_64_GUEST;
			case ASIANUX4_GUEST_VALUE: return ASIANUX4_GUEST;
			case ASIANUX4_64_GUEST_VALUE: return ASIANUX4_64_GUEST;
			case ASIANUX5_64_GUEST_VALUE: return ASIANUX5_64_GUEST;
			case OPENSUSE_GUEST_VALUE: return OPENSUSE_GUEST;
			case OPENSUSE64_GUEST_VALUE: return OPENSUSE64_GUEST;
			case FEDORA_GUEST_VALUE: return FEDORA_GUEST;
			case FEDORA64_GUEST_VALUE: return FEDORA64_GUEST;
			case COREOS64_GUEST_VALUE: return COREOS64_GUEST;
			case OTHER24X_LINUX_GUEST_VALUE: return OTHER24X_LINUX_GUEST;
			case OTHER26X_LINUX_GUEST_VALUE: return OTHER26X_LINUX_GUEST;
			case OTHER_LINUX_GUEST_VALUE: return OTHER_LINUX_GUEST;
			case OTHER3X_LINUX_GUEST_VALUE: return OTHER3X_LINUX_GUEST;
			case GENERIC_LINUX_GUEST_VALUE: return GENERIC_LINUX_GUEST;
			case OTHER24X_LINUX64_GUEST_VALUE: return OTHER24X_LINUX64_GUEST;
			case OTHER26X_LINUX64_GUEST_VALUE: return OTHER26X_LINUX64_GUEST;
			case OTHER3X_LINUX64_GUEST_VALUE: return OTHER3X_LINUX64_GUEST;
			case OTHER_LINUX64_GUEST_VALUE: return OTHER_LINUX64_GUEST;
			case SOLARIS6_GUEST_VALUE: return SOLARIS6_GUEST;
			case SOLARIS7_GUEST_VALUE: return SOLARIS7_GUEST;
			case SOLARIS8_GUEST_VALUE: return SOLARIS8_GUEST;
			case SOLARIS9_GUEST_VALUE: return SOLARIS9_GUEST;
			case SOLARIS10_GUEST_VALUE: return SOLARIS10_GUEST;
			case SOLARIS10_64_GUEST_VALUE: return SOLARIS10_64_GUEST;
			case SOLARIS11_64_GUEST_VALUE: return SOLARIS11_64_GUEST;
			case OS2_GUEST_VALUE: return OS2_GUEST;
			case ECOM_STATION_GUEST_VALUE: return ECOM_STATION_GUEST;
			case ECOM_STATION2_GUEST_VALUE: return ECOM_STATION2_GUEST;
			case NETWARE4_GUEST_VALUE: return NETWARE4_GUEST;
			case NETWARE5_GUEST_VALUE: return NETWARE5_GUEST;
			case NETWARE6_GUEST_VALUE: return NETWARE6_GUEST;
			case OPEN_SERVER5_GUEST_VALUE: return OPEN_SERVER5_GUEST;
			case OPEN_SERVER6_GUEST_VALUE: return OPEN_SERVER6_GUEST;
			case UNIX_WARE7_GUEST_VALUE: return UNIX_WARE7_GUEST;
			case DARWIN_GUEST_VALUE: return DARWIN_GUEST;
			case DARWIN64_GUEST_VALUE: return DARWIN64_GUEST;
			case DARWIN10_GUEST_VALUE: return DARWIN10_GUEST;
			case DARWIN10_64_GUEST_VALUE: return DARWIN10_64_GUEST;
			case DARWIN11_GUEST_VALUE: return DARWIN11_GUEST;
			case DARWIN11_64_GUEST_VALUE: return DARWIN11_64_GUEST;
			case DARWIN12_64_GUEST_VALUE: return DARWIN12_64_GUEST;
			case DARWIN13_64_GUEST_VALUE: return DARWIN13_64_GUEST;
			case DARWIN14_64_GUEST_VALUE: return DARWIN14_64_GUEST;
			case VMKERNEL_GUEST_VALUE: return VMKERNEL_GUEST;
			case VMKERNEL5_GUEST_VALUE: return VMKERNEL5_GUEST;
			case VMKERNEL6_GUEST_VALUE: return VMKERNEL6_GUEST;
			case OTHER_GUEST_VALUE: return OTHER_GUEST;
			case OTHER_GUEST64_VALUE: return OTHER_GUEST64;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GuestOsIdentifiers(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GuestOsIdentifiers

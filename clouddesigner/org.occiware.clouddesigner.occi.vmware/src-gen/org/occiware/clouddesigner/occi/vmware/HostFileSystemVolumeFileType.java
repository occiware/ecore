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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Host File System Volume File Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getHostFileSystemVolumeFileType()
 * @model
 * @generated
 */
public enum HostFileSystemVolumeFileType implements Enumerator {
	/**
	 * The '<em><b>CIFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIFS_VALUE
	 * @generated
	 * @ordered
	 */
	CIFS(0, "CIFS", "CIFS"),

	/**
	 * The '<em><b>NFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NFS_VALUE
	 * @generated
	 * @ordered
	 */
	NFS(1, "NFS", "NFS"),

	/**
	 * The '<em><b>NFS41</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NFS41_VALUE
	 * @generated
	 * @ordered
	 */
	NFS41(2, "NFS41", "NFS41"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "OTHER", "OTHER"),

	/**
	 * The '<em><b>VFFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VFFS_VALUE
	 * @generated
	 * @ordered
	 */
	VFFS(4, "VFFS", "VFFS"),

	/**
	 * The '<em><b>VMFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VMFS_VALUE
	 * @generated
	 * @ordered
	 */
	VMFS(5, "VMFS", "VMFS"),

	/**
	 * The '<em><b>Vsan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VSAN_VALUE
	 * @generated
	 * @ordered
	 */
	VSAN(6, "vsan", "vsan"),

	/**
	 * The '<em><b>VVOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VVOL_VALUE
	 * @generated
	 * @ordered
	 */
	VVOL(7, "VVOL", "VVOL");

	/**
	 * The '<em><b>CIFS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CIFS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIFS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIFS_VALUE = 0;

	/**
	 * The '<em><b>NFS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NFS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NFS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NFS_VALUE = 1;

	/**
	 * The '<em><b>NFS41</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NFS41</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NFS41
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NFS41_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * The '<em><b>VFFS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VFFS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VFFS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VFFS_VALUE = 4;

	/**
	 * The '<em><b>VMFS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VMFS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VMFS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VMFS_VALUE = 5;

	/**
	 * The '<em><b>Vsan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vsan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VSAN
	 * @model name="vsan"
	 * @generated
	 * @ordered
	 */
	public static final int VSAN_VALUE = 6;

	/**
	 * The '<em><b>VVOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VVOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VVOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VVOL_VALUE = 7;

	/**
	 * An array of all the '<em><b>Host File System Volume File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HostFileSystemVolumeFileType[] VALUES_ARRAY =
		new HostFileSystemVolumeFileType[] {
			CIFS,
			NFS,
			NFS41,
			OTHER,
			VFFS,
			VMFS,
			VSAN,
			VVOL,
		};

	/**
	 * A public read-only list of all the '<em><b>Host File System Volume File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HostFileSystemVolumeFileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Host File System Volume File Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HostFileSystemVolumeFileType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HostFileSystemVolumeFileType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Host File System Volume File Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HostFileSystemVolumeFileType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HostFileSystemVolumeFileType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Host File System Volume File Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HostFileSystemVolumeFileType get(int value) {
		switch (value) {
			case CIFS_VALUE: return CIFS;
			case NFS_VALUE: return NFS;
			case NFS41_VALUE: return NFS41;
			case OTHER_VALUE: return OTHER;
			case VFFS_VALUE: return VFFS;
			case VMFS_VALUE: return VMFS;
			case VSAN_VALUE: return VSAN;
			case VVOL_VALUE: return VVOL;
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
	private HostFileSystemVolumeFileType(int value, String name, String literal) {
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
	
} //HostFileSystemVolumeFileType

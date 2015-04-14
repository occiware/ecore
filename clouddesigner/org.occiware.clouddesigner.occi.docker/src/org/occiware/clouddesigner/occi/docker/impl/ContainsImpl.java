/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.ecore.EClass;

import org.occiware.clouddesigner.OCCI.impl.LinkImpl;

import org.occiware.clouddesigner.occi.docker.Contains;
import org.occiware.clouddesigner.occi.docker.DockerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContainsImpl extends LinkImpl implements Contains {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINS;
	}

} //ContainsImpl

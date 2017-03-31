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
package servicelevelagreements;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link servicelevelagreements.Agreement#getState <em>State</em>}</li>
 *   <li>{@link servicelevelagreements.Agreement#getAgreedAt <em>Agreed At</em>}</li>
 *   <li>{@link servicelevelagreements.Agreement#getEffectiveFrom <em>Effective From</em>}</li>
 *   <li>{@link servicelevelagreements.Agreement#getEffectiveUntil <em>Effective Until</em>}</li>
 * </ul>
 *
 * @see servicelevelagreements.ServicelevelagreementsPackage#getAgreement()
 * @model annotation="OCCIE2Ecore title='A Service Level Agreement'"
 * @generated
 */
public interface Agreement extends Resource {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link servicelevelagreements.AgreementStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see servicelevelagreements.AgreementStatus
	 * @see #setState(AgreementStatus)
	 * @see servicelevelagreements.ServicelevelagreementsPackage#getAgreement_State()
	 * @model required="true"
	 *        annotation="OCCIE2Ecore description='Current state of the instance'"
	 * @generated
	 */
	AgreementStatus getState();

	/**
	 * Sets the value of the '{@link servicelevelagreements.Agreement#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see servicelevelagreements.AgreementStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(AgreementStatus value);

	/**
	 * Returns the value of the '<em><b>Agreed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreed At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreed At</em>' attribute.
	 * @see #setAgreedAt(String)
	 * @see servicelevelagreements.ServicelevelagreementsPackage#getAgreement_AgreedAt()
	 * @model dataType="servicelevelagreements.DateTime"
	 *        annotation="OCCIE2Ecore description='The point in time when the agreement was made'"
	 * @generated
	 */
	String getAgreedAt();

	/**
	 * Sets the value of the '{@link servicelevelagreements.Agreement#getAgreedAt <em>Agreed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreed At</em>' attribute.
	 * @see #getAgreedAt()
	 * @generated
	 */
	void setAgreedAt(String value);

	/**
	 * Returns the value of the '<em><b>Effective From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective From</em>' attribute.
	 * @see #setEffectiveFrom(String)
	 * @see servicelevelagreements.ServicelevelagreementsPackage#getAgreement_EffectiveFrom()
	 * @model dataType="servicelevelagreements.DateTime"
	 *        annotation="OCCIE2Ecore description='The point in time when the agreement\u2019s effectiveness begins'"
	 * @generated
	 */
	String getEffectiveFrom();

	/**
	 * Sets the value of the '{@link servicelevelagreements.Agreement#getEffectiveFrom <em>Effective From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective From</em>' attribute.
	 * @see #getEffectiveFrom()
	 * @generated
	 */
	void setEffectiveFrom(String value);

	/**
	 * Returns the value of the '<em><b>Effective Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Until</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Until</em>' attribute.
	 * @see #setEffectiveUntil(String)
	 * @see servicelevelagreements.ServicelevelagreementsPackage#getAgreement_EffectiveUntil()
	 * @model dataType="servicelevelagreements.DateTime"
	 *        annotation="OCCIE2Ecore description='The point in time when the agreement\u2019s effectiveness ends'"
	 * @generated
	 */
	String getEffectiveUntil();

	/**
	 * Sets the value of the '{@link servicelevelagreements.Agreement#getEffectiveUntil <em>Effective Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Until</em>' attribute.
	 * @see #getEffectiveUntil()
	 * @generated
	 */
	void setEffectiveUntil(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void accept();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void reject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void suspend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void resume();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void terminate();

} // Agreement

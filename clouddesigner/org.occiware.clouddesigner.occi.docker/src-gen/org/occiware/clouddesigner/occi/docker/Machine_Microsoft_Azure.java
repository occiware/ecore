/**
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Microsoft Azure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure#getSubscription_id <em>Subscription id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure#getSubscription_cert <em>Subscription cert</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Azure()
 * @model annotation="OCCIE2Ecore title='Machine on Microsoft Azure'"
 * @generated
 */
public interface Machine_Microsoft_Azure extends Machine {
	/**
	 * Returns the value of the '<em><b>Subscription id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription id</em>' attribute.
	 * @see #setSubscription_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Azure_Subscription_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Your Azure subscription ID (A GUID like d255d8d7-5af0-4f5c-8a3e-1545044b861e)'"
	 * @generated
	 */
	String getSubscription_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure#getSubscription_id <em>Subscription id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription id</em>' attribute.
	 * @see #getSubscription_id()
	 * @generated
	 */
	void setSubscription_id(String value);

	/**
	 * Returns the value of the '<em><b>Subscription cert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription cert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription cert</em>' attribute.
	 * @see #setSubscription_cert(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Microsoft_Azure_Subscription_cert()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Your Azure subscription cert'"
	 * @generated
	 */
	String getSubscription_cert();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Microsoft_Azure#getSubscription_cert <em>Subscription cert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription cert</em>' attribute.
	 * @see #getSubscription_cert()
	 * @generated
	 */
	void setSubscription_cert(String value);

} // Machine_Microsoft_Azure

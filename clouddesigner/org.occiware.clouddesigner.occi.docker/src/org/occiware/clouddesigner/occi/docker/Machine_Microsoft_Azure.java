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
 * @model
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
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Microsoft_Azure!subscription_id'"
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
	 * @model dataType="org.occiware.clouddesigner.OCCI.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/docker!Machine_Microsoft_Azure!subscription_cert'"
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

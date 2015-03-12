/**
 */
package org.occiware.clouddesigner.occi.docker;

import org.occiware.clouddesigner.OCCI.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.DockerLink#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getDockerLink()
 * @model
 * @generated
 */
public interface DockerLink extends Link {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getDockerLink_Alias()
	 * @model dataType="org.occiware.clouddesigner.OCCI.String"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.DockerLink#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // DockerLink

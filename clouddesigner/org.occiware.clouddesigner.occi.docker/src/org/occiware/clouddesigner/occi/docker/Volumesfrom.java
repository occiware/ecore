/**
 */
package org.occiware.clouddesigner.occi.docker;

import org.occiware.clouddesigner.OCCI.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volumesfrom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Volumesfrom#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getVolumesfrom()
 * @model
 * @generated
 */
public interface Volumesfrom extends Link {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"read_write"</code>.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.docker.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.docker.Mode
	 * @see #setMode(Mode)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getVolumesfrom_Mode()
	 * @model default="read_write"
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Volumesfrom#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.docker.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

} // Volumesfrom

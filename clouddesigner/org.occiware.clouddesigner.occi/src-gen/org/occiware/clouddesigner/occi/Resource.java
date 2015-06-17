/**
 */
package org.occiware.clouddesigner.occi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.Resource#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.OCCIPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Entity {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.occiware.clouddesigner.occi.Link}.
	 * It is bidirectional and its opposite is '{@link org.occiware.clouddesigner.occi.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.occiware.clouddesigner.occi.OCCIPackage#getResource_Links()
	 * @see org.occiware.clouddesigner.occi.Link#getSource
	 * @model opposite="source" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi!Resource!links'"
	 * @generated
	 */
	EList<Link> getLinks();

} // Resource

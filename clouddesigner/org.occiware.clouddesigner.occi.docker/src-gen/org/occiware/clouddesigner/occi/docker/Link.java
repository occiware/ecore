/**
 */
package org.occiware.clouddesigner.occi.docker;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Link#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getLink()
 * @model annotation="OCCIE2Ecore title='Link between containers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LinkSourceAsContainer LinkTargetAsContainer LinkCanOnlyConnectColocalizedContainers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LinkSourceAsContainer='source.oclIsKindOf(Container)' LinkTargetAsContainer='target.oclIsKindOf(Container)' LinkCanOnlyConnectColocalizedContainers='\n\t\t\tContains.allInstances()->select(contains | contains.target = self.source).source = \n\t\t\tContains.allInstances()->select(contains | contains.target = self.target).source'"
 * @generated
 */
public interface Link extends org.occiware.clouddesigner.occi.Link {
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
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getLink_Alias()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The alias of this Link instance'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Link#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // Link

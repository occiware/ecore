/**
 */
package org.occiware.clouddesigner.occi.infrastructure;

import org.occiware.clouddesigner.occi.Resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getCores <em>Cores</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute()
 * @model
 * @generated
 */
public interface Compute extends Resource {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.Architecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Architecture
	 * @see #setArchitecture(Architecture)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Architecture()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!architecture'"
	 * @generated
	 */
	Architecture getArchitecture();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.Architecture
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(Architecture value);

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' attribute.
	 * @see #setCores(int)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Cores()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.PositiveInteger"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!cores'"
	 * @generated
	 */
	int getCores();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(int value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Hostname()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!hostname'"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Speed()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.GHz"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!speed'"
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(float)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_Memory()
	 * @model dataType="org.occiware.clouddesigner.occi.infrastructure.GiB"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!memory'"
	 * @generated
	 */
	float getMemory();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(float value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"inactive"</code>.
	 * The literals are from the enumeration {@link org.occiware.clouddesigner.occi.infrastructure.ComputeStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
	 * @see #setState(ComputeStatus)
	 * @see org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage#getCompute_State()
	 * @model default="inactive" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!state'"
	 * @generated
	 */
	ComputeStatus getState();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.infrastructure.Compute#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
	 * @see #getState()
	 * @generated
	 */
	void setState(ComputeStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!start()'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model methodRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!stop(http://schemas.ogf.org/occi/infrastructure!StopMethod)'"
	 * @generated
	 */
	void stop(StopMethod method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model methodRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!restart(http://schemas.ogf.org/occi/infrastructure!RestartMethod)'"
	 * @generated
	 */
	void restart(RestartMethod method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model methodRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure!Compute!suspend(http://schemas.ogf.org/occi/infrastructure!SuspendMethod)'"
	 * @generated
	 */
	void suspend(SuspendMethod method);

} // Compute

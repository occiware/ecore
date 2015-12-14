/**
 */
package org.occiware.clouddesigner.occi.cloud.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Resource;

import org.occiware.clouddesigner.occi.cloud.*;

import org.occiware.clouddesigner.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.cloud.CloudPackage
 * @generated
 */
public class CloudSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CloudPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudSwitch() {
		if (modelPackage == null) {
			modelPackage = CloudPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CloudPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseCompute(machine);
				if (result == null) result = caseResource(machine);
				if (result == null) result = caseEntity(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MACHINE_CLOUD_SIGMA: {
				Machine_CloudSigma machine_CloudSigma = (Machine_CloudSigma)theEObject;
				T result = caseMachine_CloudSigma(machine_CloudSigma);
				if (result == null) result = caseMachine(machine_CloudSigma);
				if (result == null) result = caseCompute(machine_CloudSigma);
				if (result == null) result = caseResource(machine_CloudSigma);
				if (result == null) result = caseEntity(machine_CloudSigma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MACHINE_AMAZON_EC2: {
				Machine_Amazon_EC2 machine_Amazon_EC2 = (Machine_Amazon_EC2)theEObject;
				T result = caseMachine_Amazon_EC2(machine_Amazon_EC2);
				if (result == null) result = caseMachine(machine_Amazon_EC2);
				if (result == null) result = caseCompute(machine_Amazon_EC2);
				if (result == null) result = caseResource(machine_Amazon_EC2);
				if (result == null) result = caseEntity(machine_Amazon_EC2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MACHINE_GOGRID: {
				Machine_Gogrid machine_Gogrid = (Machine_Gogrid)theEObject;
				T result = caseMachine_Gogrid(machine_Gogrid);
				if (result == null) result = caseMachine(machine_Gogrid);
				if (result == null) result = caseCompute(machine_Gogrid);
				if (result == null) result = caseResource(machine_Gogrid);
				if (result == null) result = caseEntity(machine_Gogrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MACHINE_HP_HELION: {
				Machine_Hp_Helion machine_Hp_Helion = (Machine_Hp_Helion)theEObject;
				T result = caseMachine_Hp_Helion(machine_Hp_Helion);
				if (result == null) result = caseMachine(machine_Hp_Helion);
				if (result == null) result = caseCompute(machine_Hp_Helion);
				if (result == null) result = caseResource(machine_Hp_Helion);
				if (result == null) result = caseEntity(machine_Hp_Helion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MACHINE_GCE: {
				Machine_GCE machine_GCE = (Machine_GCE)theEObject;
				T result = caseMachine_GCE(machine_GCE);
				if (result == null) result = caseMachine(machine_GCE);
				if (result == null) result = caseCompute(machine_GCE);
				if (result == null) result = caseResource(machine_GCE);
				if (result == null) result = caseEntity(machine_GCE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MACHINE_RACK_SPACE: {
				Machine_RackSpace machine_RackSpace = (Machine_RackSpace)theEObject;
				T result = caseMachine_RackSpace(machine_RackSpace);
				if (result == null) result = caseMachine(machine_RackSpace);
				if (result == null) result = caseCompute(machine_RackSpace);
				if (result == null) result = caseResource(machine_RackSpace);
				if (result == null) result = caseEntity(machine_RackSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MACHINE_PROFIT_BRICKS: {
				Machine_ProfitBricks machine_ProfitBricks = (Machine_ProfitBricks)theEObject;
				T result = caseMachine_ProfitBricks(machine_ProfitBricks);
				if (result == null) result = caseMachine(machine_ProfitBricks);
				if (result == null) result = caseCompute(machine_ProfitBricks);
				if (result == null) result = caseResource(machine_ProfitBricks);
				if (result == null) result = caseEntity(machine_ProfitBricks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MACHINE_OPEN_STACK: {
				Machine_OpenStack machine_OpenStack = (Machine_OpenStack)theEObject;
				T result = caseMachine_OpenStack(machine_OpenStack);
				if (result == null) result = caseMachine(machine_OpenStack);
				if (result == null) result = caseCompute(machine_OpenStack);
				if (result == null) result = caseResource(machine_OpenStack);
				if (result == null) result = caseEntity(machine_OpenStack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudPackage.MACHINE_SOFT_LAYER: {
				Machine_SoftLayer machine_SoftLayer = (Machine_SoftLayer)theEObject;
				T result = caseMachine_SoftLayer(machine_SoftLayer);
				if (result == null) result = caseMachine(machine_SoftLayer);
				if (result == null) result = caseCompute(machine_SoftLayer);
				if (result == null) result = caseResource(machine_SoftLayer);
				if (result == null) result = caseEntity(machine_SoftLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Cloud Sigma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Cloud Sigma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_CloudSigma(Machine_CloudSigma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Amazon EC2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Amazon EC2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Amazon_EC2(Machine_Amazon_EC2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Gogrid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Gogrid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Gogrid(Machine_Gogrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Hp Helion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Hp Helion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_Hp_Helion(Machine_Hp_Helion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine GCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine GCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_GCE(Machine_GCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Rack Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Rack Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_RackSpace(Machine_RackSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Profit Bricks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Profit Bricks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_ProfitBricks(Machine_ProfitBricks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Open Stack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Open Stack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_OpenStack(Machine_OpenStack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Soft Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Soft Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_SoftLayer(Machine_SoftLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CloudSwitch

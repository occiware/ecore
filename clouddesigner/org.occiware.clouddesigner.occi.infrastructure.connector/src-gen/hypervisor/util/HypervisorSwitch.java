/**
 */
package hypervisor.util;

import hypervisor.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.infrastructure.Compute;
import org.occiware.clouddesigner.occi.infrastructure.Network;
import org.occiware.clouddesigner.occi.infrastructure.Storage;

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
 * @see hypervisor.HypervisorPackage
 * @generated
 */
public class HypervisorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HypervisorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypervisorSwitch() {
		if (modelPackage == null) {
			modelPackage = HypervisorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case HypervisorPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseCompute(machine);
				if (result == null) result = caseResource(machine);
				if (result == null) result = caseEntity(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.CONTAINS: {
				Contains contains = (Contains)theEObject;
				T result = caseContains(contains);
				if (result == null) result = caseLink(contains);
				if (result == null) result = caseEntity(contains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.DISK: {
				Disk disk = (Disk)theEObject;
				T result = caseDisk(disk);
				if (result == null) result = caseStorage(disk);
				if (result == null) result = caseResource(disk);
				if (result == null) result = caseEntity(disk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseNetwork(interface_);
				if (result == null) result = caseResource(interface_);
				if (result == null) result = caseEntity(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.MACHINE_VIRTUAL_BOX: {
				Machine_VirtualBox machine_VirtualBox = (Machine_VirtualBox)theEObject;
				T result = caseMachine_VirtualBox(machine_VirtualBox);
				if (result == null) result = caseMachine(machine_VirtualBox);
				if (result == null) result = caseCompute(machine_VirtualBox);
				if (result == null) result = caseResource(machine_VirtualBox);
				if (result == null) result = caseEntity(machine_VirtualBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.BRIDGE: {
				Bridge bridge = (Bridge)theEObject;
				T result = caseBridge(bridge);
				if (result == null) result = caseInterface(bridge);
				if (result == null) result = caseNetwork(bridge);
				if (result == null) result = caseResource(bridge);
				if (result == null) result = caseEntity(bridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseInterface(user);
				if (result == null) result = caseNetwork(user);
				if (result == null) result = caseResource(user);
				if (result == null) result = caseEntity(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.PARALLEL: {
				Parallel parallel = (Parallel)theEObject;
				T result = caseParallel(parallel);
				if (result == null) result = caseResource(parallel);
				if (result == null) result = caseEntity(parallel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.SERIAL: {
				Serial serial = (Serial)theEObject;
				T result = caseSerial(serial);
				if (result == null) result = caseResource(serial);
				if (result == null) result = caseEntity(serial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.DIRECT: {
				Direct direct = (Direct)theEObject;
				T result = caseDirect(direct);
				if (result == null) result = caseInterface(direct);
				if (result == null) result = caseNetwork(direct);
				if (result == null) result = caseResource(direct);
				if (result == null) result = caseEntity(direct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.ETHERNET: {
				Ethernet ethernet = (Ethernet)theEObject;
				T result = caseEthernet(ethernet);
				if (result == null) result = caseResource(ethernet);
				if (result == null) result = caseEntity(ethernet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HypervisorPackage.FILESYSTEM: {
				Filesystem filesystem = (Filesystem)theEObject;
				T result = caseFilesystem(filesystem);
				if (result == null) result = caseResource(filesystem);
				if (result == null) result = caseEntity(filesystem);
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
	 * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContains(Contains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisk(Disk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Virtual Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Virtual Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine_VirtualBox(Machine_VirtualBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridge(Bridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallel(Parallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerial(Serial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirect(Direct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ethernet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ethernet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEthernet(Ethernet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filesystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filesystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilesystem(Filesystem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
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

} //HypervisorSwitch

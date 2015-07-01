/**
 */
package hypervisor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hypervisor.HypervisorPackage
 * @generated
 */
public interface HypervisorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HypervisorFactory eINSTANCE = hypervisor.impl.HypervisorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains</em>'.
	 * @generated
	 */
	Contains createContains();

	/**
	 * Returns a new object of class '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disk</em>'.
	 * @generated
	 */
	Disk createDisk();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Machine Virtual Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Virtual Box</em>'.
	 * @generated
	 */
	Machine_VirtualBox createMachine_VirtualBox();

	/**
	 * Returns a new object of class '<em>Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bridge</em>'.
	 * @generated
	 */
	Bridge createBridge();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel</em>'.
	 * @generated
	 */
	Parallel createParallel();

	/**
	 * Returns a new object of class '<em>Serial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serial</em>'.
	 * @generated
	 */
	Serial createSerial();

	/**
	 * Returns a new object of class '<em>Direct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct</em>'.
	 * @generated
	 */
	Direct createDirect();

	/**
	 * Returns a new object of class '<em>Ethernet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethernet</em>'.
	 * @generated
	 */
	Ethernet createEthernet();

	/**
	 * Returns a new object of class '<em>Filesystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filesystem</em>'.
	 * @generated
	 */
	Filesystem createFilesystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HypervisorPackage getHypervisorPackage();

} //HypervisorFactory

/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_Rackspace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Rackspace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl#getApi_key <em>Api key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl#getEndpoint_type <em>Endpoint type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl#getImage_id <em>Image id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl#getFlavor_id <em>Flavor id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl#getSsh_user <em>Ssh user</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_RackspaceImpl#getSsh_port <em>Ssh port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_RackspaceImpl extends MachineImpl implements Machine_Rackspace {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getApi_key() <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_key()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getApi_key() <em>Api key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi_key()
	 * @generated
	 * @ordered
	 */
	protected String api_key = API_KEY_EDEFAULT;
	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;
	/**
	 * The default value of the '{@link #getEndpoint_type() <em>Endpoint type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint_type()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_TYPE_EDEFAULT = "publicURL";
	/**
	 * The cached value of the '{@link #getEndpoint_type() <em>Endpoint type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint_type()
	 * @generated
	 * @ordered
	 */
	protected String endpoint_type = ENDPOINT_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getImage_id() <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_id()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = "Ubuntu 14.10 (Utopic Unicorn) (PVHVM)";
	/**
	 * The cached value of the '{@link #getImage_id() <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_id()
	 * @generated
	 * @ordered
	 */
	protected String image_id = IMAGE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getFlavor_id() <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_id()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_ID_EDEFAULT = "General Purpose 1GB";
	/**
	 * The cached value of the '{@link #getFlavor_id() <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_id()
	 * @generated
	 * @ordered
	 */
	protected String flavor_id = FLAVOR_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSsh_user() <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_user()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_USER_EDEFAULT = "root";
	/**
	 * The cached value of the '{@link #getSsh_user() <em>Ssh user</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_user()
	 * @generated
	 * @ordered
	 */
	protected String ssh_user = SSH_USER_EDEFAULT;
	/**
	 * The default value of the '{@link #getSsh_port() <em>Ssh port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_port()
	 * @generated
	 * @ordered
	 */
	protected static final int SSH_PORT_EDEFAULT = 22;
	/**
	 * The cached value of the '{@link #getSsh_port() <em>Ssh port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_port()
	 * @generated
	 * @ordered
	 */
	protected int ssh_port = SSH_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_RackspaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_RACKSPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_RACKSPACE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApi_key() {
		return api_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi_key(String newApi_key) {
		String oldApi_key = api_key;
		api_key = newApi_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_RACKSPACE__API_KEY, oldApi_key, api_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_RACKSPACE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint_type() {
		return endpoint_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint_type(String newEndpoint_type) {
		String oldEndpoint_type = endpoint_type;
		endpoint_type = newEndpoint_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_RACKSPACE__ENDPOINT_TYPE, oldEndpoint_type, endpoint_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_id() {
		return image_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_id(String newImage_id) {
		String oldImage_id = image_id;
		image_id = newImage_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_RACKSPACE__IMAGE_ID, oldImage_id, image_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavor_id() {
		return flavor_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavor_id(String newFlavor_id) {
		String oldFlavor_id = flavor_id;
		flavor_id = newFlavor_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_RACKSPACE__FLAVOR_ID, oldFlavor_id, flavor_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsh_user() {
		return ssh_user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsh_user(String newSsh_user) {
		String oldSsh_user = ssh_user;
		ssh_user = newSsh_user;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_RACKSPACE__SSH_USER, oldSsh_user, ssh_user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSsh_port() {
		return ssh_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsh_port(int newSsh_port) {
		int oldSsh_port = ssh_port;
		ssh_port = newSsh_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_RACKSPACE__SSH_PORT, oldSsh_port, ssh_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_RACKSPACE__USERNAME:
				return getUsername();
			case DockerPackage.MACHINE_RACKSPACE__API_KEY:
				return getApi_key();
			case DockerPackage.MACHINE_RACKSPACE__REGION:
				return getRegion();
			case DockerPackage.MACHINE_RACKSPACE__ENDPOINT_TYPE:
				return getEndpoint_type();
			case DockerPackage.MACHINE_RACKSPACE__IMAGE_ID:
				return getImage_id();
			case DockerPackage.MACHINE_RACKSPACE__FLAVOR_ID:
				return getFlavor_id();
			case DockerPackage.MACHINE_RACKSPACE__SSH_USER:
				return getSsh_user();
			case DockerPackage.MACHINE_RACKSPACE__SSH_PORT:
				return getSsh_port();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.MACHINE_RACKSPACE__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINE_RACKSPACE__API_KEY:
				setApi_key((String)newValue);
				return;
			case DockerPackage.MACHINE_RACKSPACE__REGION:
				setRegion((String)newValue);
				return;
			case DockerPackage.MACHINE_RACKSPACE__ENDPOINT_TYPE:
				setEndpoint_type((String)newValue);
				return;
			case DockerPackage.MACHINE_RACKSPACE__IMAGE_ID:
				setImage_id((String)newValue);
				return;
			case DockerPackage.MACHINE_RACKSPACE__FLAVOR_ID:
				setFlavor_id((String)newValue);
				return;
			case DockerPackage.MACHINE_RACKSPACE__SSH_USER:
				setSsh_user((String)newValue);
				return;
			case DockerPackage.MACHINE_RACKSPACE__SSH_PORT:
				setSsh_port((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DockerPackage.MACHINE_RACKSPACE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_RACKSPACE__API_KEY:
				setApi_key(API_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_RACKSPACE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DockerPackage.MACHINE_RACKSPACE__ENDPOINT_TYPE:
				setEndpoint_type(ENDPOINT_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_RACKSPACE__IMAGE_ID:
				setImage_id(IMAGE_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_RACKSPACE__FLAVOR_ID:
				setFlavor_id(FLAVOR_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_RACKSPACE__SSH_USER:
				setSsh_user(SSH_USER_EDEFAULT);
				return;
			case DockerPackage.MACHINE_RACKSPACE__SSH_PORT:
				setSsh_port(SSH_PORT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DockerPackage.MACHINE_RACKSPACE__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINE_RACKSPACE__API_KEY:
				return API_KEY_EDEFAULT == null ? api_key != null : !API_KEY_EDEFAULT.equals(api_key);
			case DockerPackage.MACHINE_RACKSPACE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DockerPackage.MACHINE_RACKSPACE__ENDPOINT_TYPE:
				return ENDPOINT_TYPE_EDEFAULT == null ? endpoint_type != null : !ENDPOINT_TYPE_EDEFAULT.equals(endpoint_type);
			case DockerPackage.MACHINE_RACKSPACE__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? image_id != null : !IMAGE_ID_EDEFAULT.equals(image_id);
			case DockerPackage.MACHINE_RACKSPACE__FLAVOR_ID:
				return FLAVOR_ID_EDEFAULT == null ? flavor_id != null : !FLAVOR_ID_EDEFAULT.equals(flavor_id);
			case DockerPackage.MACHINE_RACKSPACE__SSH_USER:
				return SSH_USER_EDEFAULT == null ? ssh_user != null : !SSH_USER_EDEFAULT.equals(ssh_user);
			case DockerPackage.MACHINE_RACKSPACE__SSH_PORT:
				return ssh_port != SSH_PORT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (username: ");
		result.append(username);
		result.append(", api_key: ");
		result.append(api_key);
		result.append(", region: ");
		result.append(region);
		result.append(", endpoint_type: ");
		result.append(endpoint_type);
		result.append(", image_id: ");
		result.append(image_id);
		result.append(", flavor_id: ");
		result.append(flavor_id);
		result.append(", ssh_user: ");
		result.append(ssh_user);
		result.append(", ssh_port: ");
		result.append(ssh_port);
		result.append(')');
		return result.toString();
	}

} //Machine_RackspaceImpl

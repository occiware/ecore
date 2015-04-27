/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_OpenStack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Open Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getFlavor_id <em>Flavor id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getImage_id <em>Image id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getAuth_url <em>Auth url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getTenant_name <em>Tenant name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getTenant_id <em>Tenant id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getEndpoint_type <em>Endpoint type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getNet_id <em>Net id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getSec_groups <em>Sec groups</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl#getFloatingip_pool <em>Floatingip pool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_OpenStackImpl extends MachineImpl implements Machine_OpenStack {
	/**
	 * The default value of the '{@link #getFlavor_id() <em>Flavor id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor_id()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_ID_EDEFAULT = null;
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
	 * The default value of the '{@link #getImage_id() <em>Image id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_id()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;
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
	 * The default value of the '{@link #getAuth_url() <em>Auth url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth_url()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuth_url() <em>Auth url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth_url()
	 * @generated
	 * @ordered
	 */
	protected String auth_url = AUTH_URL_EDEFAULT;
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
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getTenant_name() <em>Tenant name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_name()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTenant_name() <em>Tenant name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_name()
	 * @generated
	 * @ordered
	 */
	protected String tenant_name = TENANT_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTenant_id() <em>Tenant id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant_id()
	 * @generated
	 * @ordered
	 */
	protected String tenant_id = TENANT_ID_EDEFAULT;
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
	protected static final String ENDPOINT_TYPE_EDEFAULT = null;
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
	 * The default value of the '{@link #getNet_id() <em>Net id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet_id()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNet_id() <em>Net id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet_id()
	 * @generated
	 * @ordered
	 */
	protected String net_id = NET_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSec_groups() <em>Sec groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec_groups()
	 * @generated
	 * @ordered
	 */
	protected static final String SEC_GROUPS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSec_groups() <em>Sec groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec_groups()
	 * @generated
	 * @ordered
	 */
	protected String sec_groups = SEC_GROUPS_EDEFAULT;
	/**
	 * The default value of the '{@link #getFloatingip_pool() <em>Floatingip pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingip_pool()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATINGIP_POOL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFloatingip_pool() <em>Floatingip pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingip_pool()
	 * @generated
	 * @ordered
	 */
	protected String floatingip_pool = FLOATINGIP_POOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_OpenStackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_OPEN_STACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID, oldFlavor_id, flavor_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID, oldImage_id, image_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuth_url() {
		return auth_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuth_url(String newAuth_url) {
		String oldAuth_url = auth_url;
		auth_url = newAuth_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__AUTH_URL, oldAuth_url, auth_url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenant_name() {
		return tenant_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant_name(String newTenant_name) {
		String oldTenant_name = tenant_name;
		tenant_name = newTenant_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME, oldTenant_name, tenant_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenant_id() {
		return tenant_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant_id(String newTenant_id) {
		String oldTenant_id = tenant_id;
		tenant_id = newTenant_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__TENANT_ID, oldTenant_id, tenant_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__REGION, oldRegion, region));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE, oldEndpoint_type, endpoint_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNet_id() {
		return net_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet_id(String newNet_id) {
		String oldNet_id = net_id;
		net_id = newNet_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__NET_ID, oldNet_id, net_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSec_groups() {
		return sec_groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSec_groups(String newSec_groups) {
		String oldSec_groups = sec_groups;
		sec_groups = newSec_groups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS, oldSec_groups, sec_groups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloatingip_pool() {
		return floatingip_pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingip_pool(String newFloatingip_pool) {
		String oldFloatingip_pool = floatingip_pool;
		floatingip_pool = newFloatingip_pool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL, oldFloatingip_pool, floatingip_pool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				return getFlavor_id();
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				return getImage_id();
			case DockerPackage.MACHINE_OPEN_STACK__AUTH_URL:
				return getAuth_url();
			case DockerPackage.MACHINE_OPEN_STACK__USERNAME:
				return getUsername();
			case DockerPackage.MACHINE_OPEN_STACK__PASSWORD:
				return getPassword();
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME:
				return getTenant_name();
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_ID:
				return getTenant_id();
			case DockerPackage.MACHINE_OPEN_STACK__REGION:
				return getRegion();
			case DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE:
				return getEndpoint_type();
			case DockerPackage.MACHINE_OPEN_STACK__NET_ID:
				return getNet_id();
			case DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS:
				return getSec_groups();
			case DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL:
				return getFloatingip_pool();
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
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				setFlavor_id((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				setImage_id((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__AUTH_URL:
				setAuth_url((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__USERNAME:
				setUsername((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__PASSWORD:
				setPassword((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME:
				setTenant_name((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_ID:
				setTenant_id((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__REGION:
				setRegion((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE:
				setEndpoint_type((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__NET_ID:
				setNet_id((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS:
				setSec_groups((String)newValue);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL:
				setFloatingip_pool((String)newValue);
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
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				setFlavor_id(FLAVOR_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				setImage_id(IMAGE_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__AUTH_URL:
				setAuth_url(AUTH_URL_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME:
				setTenant_name(TENANT_NAME_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_ID:
				setTenant_id(TENANT_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE:
				setEndpoint_type(ENDPOINT_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__NET_ID:
				setNet_id(NET_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS:
				setSec_groups(SEC_GROUPS_EDEFAULT);
				return;
			case DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL:
				setFloatingip_pool(FLOATINGIP_POOL_EDEFAULT);
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
			case DockerPackage.MACHINE_OPEN_STACK__FLAVOR_ID:
				return FLAVOR_ID_EDEFAULT == null ? flavor_id != null : !FLAVOR_ID_EDEFAULT.equals(flavor_id);
			case DockerPackage.MACHINE_OPEN_STACK__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? image_id != null : !IMAGE_ID_EDEFAULT.equals(image_id);
			case DockerPackage.MACHINE_OPEN_STACK__AUTH_URL:
				return AUTH_URL_EDEFAULT == null ? auth_url != null : !AUTH_URL_EDEFAULT.equals(auth_url);
			case DockerPackage.MACHINE_OPEN_STACK__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case DockerPackage.MACHINE_OPEN_STACK__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_NAME:
				return TENANT_NAME_EDEFAULT == null ? tenant_name != null : !TENANT_NAME_EDEFAULT.equals(tenant_name);
			case DockerPackage.MACHINE_OPEN_STACK__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenant_id != null : !TENANT_ID_EDEFAULT.equals(tenant_id);
			case DockerPackage.MACHINE_OPEN_STACK__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DockerPackage.MACHINE_OPEN_STACK__ENDPOINT_TYPE:
				return ENDPOINT_TYPE_EDEFAULT == null ? endpoint_type != null : !ENDPOINT_TYPE_EDEFAULT.equals(endpoint_type);
			case DockerPackage.MACHINE_OPEN_STACK__NET_ID:
				return NET_ID_EDEFAULT == null ? net_id != null : !NET_ID_EDEFAULT.equals(net_id);
			case DockerPackage.MACHINE_OPEN_STACK__SEC_GROUPS:
				return SEC_GROUPS_EDEFAULT == null ? sec_groups != null : !SEC_GROUPS_EDEFAULT.equals(sec_groups);
			case DockerPackage.MACHINE_OPEN_STACK__FLOATINGIP_POOL:
				return FLOATINGIP_POOL_EDEFAULT == null ? floatingip_pool != null : !FLOATINGIP_POOL_EDEFAULT.equals(floatingip_pool);
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
		result.append(" (flavor_id: ");
		result.append(flavor_id);
		result.append(", image_id: ");
		result.append(image_id);
		result.append(", auth_url: ");
		result.append(auth_url);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", tenant_name: ");
		result.append(tenant_name);
		result.append(", tenant_id: ");
		result.append(tenant_id);
		result.append(", region: ");
		result.append(region);
		result.append(", endpoint_type: ");
		result.append(endpoint_type);
		result.append(", net_id: ");
		result.append(net_id);
		result.append(", sec_groups: ");
		result.append(sec_groups);
		result.append(", floatingip_pool: ");
		result.append(floatingip_pool);
		result.append(')');
		return result.toString();
	}

} //Machine_OpenStackImpl

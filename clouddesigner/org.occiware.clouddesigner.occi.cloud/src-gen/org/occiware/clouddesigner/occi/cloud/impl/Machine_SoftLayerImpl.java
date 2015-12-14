/**
 */
package org.occiware.clouddesigner.occi.cloud.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.cloud.CloudPackage;
import org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Soft Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl#getApi_key <em>Api key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl#getLocation_id <em>Location id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl#getImage_id <em>Image id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl#getDomain_name <em>Domain name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl#getDisk_type <em>Disk type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.cloud.impl.Machine_SoftLayerImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_SoftLayerImpl extends MachineImpl implements Machine_SoftLayer {
	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

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
	 * The default value of the '{@link #getLocation_id() <em>Location id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation_id()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation_id() <em>Location id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation_id()
	 * @generated
	 * @ordered
	 */
	protected String location_id = LOCATION_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDomain_name() <em>Domain name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain_name()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain_name() <em>Domain name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain_name()
	 * @generated
	 * @ordered
	 */
	protected String domain_name = DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_type() <em>Disk type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_type()
	 * @generated
	 * @ordered
	 */
	protected static final String DISK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_type() <em>Disk type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_type()
	 * @generated
	 * @ordered
	 */
	protected String disk_type = DISK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected String tenant = TENANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String endpoint = ENDPOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_SoftLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudPackage.Literals.MACHINE_SOFT_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_SOFT_LAYER__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_SOFT_LAYER__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_SOFT_LAYER__API_KEY, oldApi_key, api_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation_id() {
		return location_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation_id(String newLocation_id) {
		String oldLocation_id = location_id;
		location_id = newLocation_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_SOFT_LAYER__LOCATION_ID, oldLocation_id, location_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_SOFT_LAYER__IMAGE_ID, oldImage_id, image_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain_name() {
		return domain_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain_name(String newDomain_name) {
		String oldDomain_name = domain_name;
		domain_name = newDomain_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_SOFT_LAYER__DOMAIN_NAME, oldDomain_name, domain_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisk_type() {
		return disk_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_type(String newDisk_type) {
		String oldDisk_type = disk_type;
		disk_type = newDisk_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_SOFT_LAYER__DISK_TYPE, oldDisk_type, disk_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant(String newTenant) {
		String oldTenant = tenant;
		tenant = newTenant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_SOFT_LAYER__TENANT, oldTenant, tenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(String newEndpoint) {
		String oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudPackage.MACHINE_SOFT_LAYER__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudPackage.MACHINE_SOFT_LAYER__PROVIDER:
				return getProvider();
			case CloudPackage.MACHINE_SOFT_LAYER__USERNAME:
				return getUsername();
			case CloudPackage.MACHINE_SOFT_LAYER__API_KEY:
				return getApi_key();
			case CloudPackage.MACHINE_SOFT_LAYER__LOCATION_ID:
				return getLocation_id();
			case CloudPackage.MACHINE_SOFT_LAYER__IMAGE_ID:
				return getImage_id();
			case CloudPackage.MACHINE_SOFT_LAYER__DOMAIN_NAME:
				return getDomain_name();
			case CloudPackage.MACHINE_SOFT_LAYER__DISK_TYPE:
				return getDisk_type();
			case CloudPackage.MACHINE_SOFT_LAYER__TENANT:
				return getTenant();
			case CloudPackage.MACHINE_SOFT_LAYER__ENDPOINT:
				return getEndpoint();
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
			case CloudPackage.MACHINE_SOFT_LAYER__PROVIDER:
				setProvider((String)newValue);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__USERNAME:
				setUsername((String)newValue);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__API_KEY:
				setApi_key((String)newValue);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__LOCATION_ID:
				setLocation_id((String)newValue);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__IMAGE_ID:
				setImage_id((String)newValue);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__DOMAIN_NAME:
				setDomain_name((String)newValue);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__DISK_TYPE:
				setDisk_type((String)newValue);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__TENANT:
				setTenant((String)newValue);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__ENDPOINT:
				setEndpoint((String)newValue);
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
			case CloudPackage.MACHINE_SOFT_LAYER__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__API_KEY:
				setApi_key(API_KEY_EDEFAULT);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__LOCATION_ID:
				setLocation_id(LOCATION_ID_EDEFAULT);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__IMAGE_ID:
				setImage_id(IMAGE_ID_EDEFAULT);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__DOMAIN_NAME:
				setDomain_name(DOMAIN_NAME_EDEFAULT);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__DISK_TYPE:
				setDisk_type(DISK_TYPE_EDEFAULT);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__TENANT:
				setTenant(TENANT_EDEFAULT);
				return;
			case CloudPackage.MACHINE_SOFT_LAYER__ENDPOINT:
				setEndpoint(ENDPOINT_EDEFAULT);
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
			case CloudPackage.MACHINE_SOFT_LAYER__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case CloudPackage.MACHINE_SOFT_LAYER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case CloudPackage.MACHINE_SOFT_LAYER__API_KEY:
				return API_KEY_EDEFAULT == null ? api_key != null : !API_KEY_EDEFAULT.equals(api_key);
			case CloudPackage.MACHINE_SOFT_LAYER__LOCATION_ID:
				return LOCATION_ID_EDEFAULT == null ? location_id != null : !LOCATION_ID_EDEFAULT.equals(location_id);
			case CloudPackage.MACHINE_SOFT_LAYER__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? image_id != null : !IMAGE_ID_EDEFAULT.equals(image_id);
			case CloudPackage.MACHINE_SOFT_LAYER__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domain_name != null : !DOMAIN_NAME_EDEFAULT.equals(domain_name);
			case CloudPackage.MACHINE_SOFT_LAYER__DISK_TYPE:
				return DISK_TYPE_EDEFAULT == null ? disk_type != null : !DISK_TYPE_EDEFAULT.equals(disk_type);
			case CloudPackage.MACHINE_SOFT_LAYER__TENANT:
				return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
			case CloudPackage.MACHINE_SOFT_LAYER__ENDPOINT:
				return ENDPOINT_EDEFAULT == null ? endpoint != null : !ENDPOINT_EDEFAULT.equals(endpoint);
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
		result.append(" (provider: ");
		result.append(provider);
		result.append(", username: ");
		result.append(username);
		result.append(", api_key: ");
		result.append(api_key);
		result.append(", location_id: ");
		result.append(location_id);
		result.append(", image_id: ");
		result.append(image_id);
		result.append(", domain_name: ");
		result.append(domain_name);
		result.append(", disk_type: ");
		result.append(disk_type);
		result.append(", tenant: ");
		result.append(tenant);
		result.append(", endpoint: ");
		result.append(endpoint);
		result.append(')');
		return result.toString();
	}

} //Machine_SoftLayerImpl

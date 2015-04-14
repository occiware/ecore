/**
 */
package org.occiware.clouddesigner.occi.docker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Amazon EC2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getAccess_key <em>Access key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getAmi <em>Ami</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getInstance_type <em>Instance type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getRoot_size <em>Root size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getSecret_key <em>Secret key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getSession_token <em>Session token</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getSubnet_id <em>Subnet id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getVpc_id <em>Vpc id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.impl.Machine_Amazon_EC2Impl#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_Amazon_EC2Impl extends MachineImpl implements Machine_Amazon_EC2 {
	/**
	 * The default value of the '{@link #getAccess_key() <em>Access key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_key()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_KEY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAccess_key() <em>Access key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_key()
	 * @generated
	 * @ordered
	 */
	protected String access_key = ACCESS_KEY_EDEFAULT;
	/**
	 * The default value of the '{@link #getAmi() <em>Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmi()
	 * @generated
	 * @ordered
	 */
	protected static final String AMI_EDEFAULT = "ami-4ae27e22";
	/**
	 * The cached value of the '{@link #getAmi() <em>Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmi()
	 * @generated
	 * @ordered
	 */
	protected String ami = AMI_EDEFAULT;
	/**
	 * The default value of the '{@link #getInstance_type() <em>Instance type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_type()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_EDEFAULT = "t2.micro";
	/**
	 * The cached value of the '{@link #getInstance_type() <em>Instance type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance_type()
	 * @generated
	 * @ordered
	 */
	protected String instance_type = INSTANCE_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = "us-east-1";
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
	 * The default value of the '{@link #getRoot_size() <em>Root size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot_size()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOT_SIZE_EDEFAULT = 16;
	/**
	 * The cached value of the '{@link #getRoot_size() <em>Root size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot_size()
	 * @generated
	 * @ordered
	 */
	protected int root_size = ROOT_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSecret_key() <em>Secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret_key()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_KEY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSecret_key() <em>Secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret_key()
	 * @generated
	 * @ordered
	 */
	protected String secret_key = SECRET_KEY_EDEFAULT;
	/**
	 * The default value of the '{@link #getSecurity_group() <em>Security group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_group()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_EDEFAULT = "docker-machine";
	/**
	 * The cached value of the '{@link #getSecurity_group() <em>Security group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_group()
	 * @generated
	 * @ordered
	 */
	protected String security_group = SECURITY_GROUP_EDEFAULT;
	/**
	 * The default value of the '{@link #getSession_token() <em>Session token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession_token()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_TOKEN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSession_token() <em>Session token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession_token()
	 * @generated
	 * @ordered
	 */
	protected String session_token = SESSION_TOKEN_EDEFAULT;
	/**
	 * The default value of the '{@link #getSubnet_id() <em>Subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubnet_id() <em>Subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet_id()
	 * @generated
	 * @ordered
	 */
	protected String subnet_id = SUBNET_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getVpc_id() <em>Vpc id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc_id()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVpc_id() <em>Vpc id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc_id()
	 * @generated
	 * @ordered
	 */
	protected String vpc_id = VPC_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_EDEFAULT = "a";
	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected String zone = ZONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Machine_Amazon_EC2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.MACHINE_AMAZON_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess_key() {
		return access_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess_key(String newAccess_key) {
		String oldAccess_key = access_key;
		access_key = newAccess_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__ACCESS_KEY, oldAccess_key, access_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmi() {
		return ami;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmi(String newAmi) {
		String oldAmi = ami;
		ami = newAmi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__AMI, oldAmi, ami));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstance_type() {
		return instance_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance_type(String newInstance_type) {
		String oldInstance_type = instance_type;
		instance_type = newInstance_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__INSTANCE_TYPE, oldInstance_type, instance_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoot_size() {
		return root_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot_size(int newRoot_size) {
		int oldRoot_size = root_size;
		root_size = newRoot_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__ROOT_SIZE, oldRoot_size, root_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecret_key() {
		return secret_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecret_key(String newSecret_key) {
		String oldSecret_key = secret_key;
		secret_key = newSecret_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__SECRET_KEY, oldSecret_key, secret_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurity_group() {
		return security_group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity_group(String newSecurity_group) {
		String oldSecurity_group = security_group;
		security_group = newSecurity_group;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP, oldSecurity_group, security_group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSession_token() {
		return session_token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession_token(String newSession_token) {
		String oldSession_token = session_token;
		session_token = newSession_token;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__SESSION_TOKEN, oldSession_token, session_token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnet_id() {
		return subnet_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnet_id(String newSubnet_id) {
		String oldSubnet_id = subnet_id;
		subnet_id = newSubnet_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__SUBNET_ID, oldSubnet_id, subnet_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVpc_id() {
		return vpc_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpc_id(String newVpc_id) {
		String oldVpc_id = vpc_id;
		vpc_id = newVpc_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__VPC_ID, oldVpc_id, vpc_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(String newZone) {
		String oldZone = zone;
		zone = newZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.MACHINE_AMAZON_EC2__ZONE, oldZone, zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
				return getAccess_key();
			case DockerPackage.MACHINE_AMAZON_EC2__AMI:
				return getAmi();
			case DockerPackage.MACHINE_AMAZON_EC2__INSTANCE_TYPE:
				return getInstance_type();
			case DockerPackage.MACHINE_AMAZON_EC2__REGION:
				return getRegion();
			case DockerPackage.MACHINE_AMAZON_EC2__ROOT_SIZE:
				return getRoot_size();
			case DockerPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
				return getSecret_key();
			case DockerPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
				return getSecurity_group();
			case DockerPackage.MACHINE_AMAZON_EC2__SESSION_TOKEN:
				return getSession_token();
			case DockerPackage.MACHINE_AMAZON_EC2__SUBNET_ID:
				return getSubnet_id();
			case DockerPackage.MACHINE_AMAZON_EC2__VPC_ID:
				return getVpc_id();
			case DockerPackage.MACHINE_AMAZON_EC2__ZONE:
				return getZone();
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
			case DockerPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
				setAccess_key((String)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__AMI:
				setAmi((String)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__INSTANCE_TYPE:
				setInstance_type((String)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__REGION:
				setRegion((String)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__ROOT_SIZE:
				setRoot_size((Integer)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
				setSecret_key((String)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
				setSecurity_group((String)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__SESSION_TOKEN:
				setSession_token((String)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__SUBNET_ID:
				setSubnet_id((String)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__VPC_ID:
				setVpc_id((String)newValue);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__ZONE:
				setZone((String)newValue);
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
			case DockerPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
				setAccess_key(ACCESS_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__AMI:
				setAmi(AMI_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__INSTANCE_TYPE:
				setInstance_type(INSTANCE_TYPE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__ROOT_SIZE:
				setRoot_size(ROOT_SIZE_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
				setSecret_key(SECRET_KEY_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
				setSecurity_group(SECURITY_GROUP_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__SESSION_TOKEN:
				setSession_token(SESSION_TOKEN_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__SUBNET_ID:
				setSubnet_id(SUBNET_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__VPC_ID:
				setVpc_id(VPC_ID_EDEFAULT);
				return;
			case DockerPackage.MACHINE_AMAZON_EC2__ZONE:
				setZone(ZONE_EDEFAULT);
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
			case DockerPackage.MACHINE_AMAZON_EC2__ACCESS_KEY:
				return ACCESS_KEY_EDEFAULT == null ? access_key != null : !ACCESS_KEY_EDEFAULT.equals(access_key);
			case DockerPackage.MACHINE_AMAZON_EC2__AMI:
				return AMI_EDEFAULT == null ? ami != null : !AMI_EDEFAULT.equals(ami);
			case DockerPackage.MACHINE_AMAZON_EC2__INSTANCE_TYPE:
				return INSTANCE_TYPE_EDEFAULT == null ? instance_type != null : !INSTANCE_TYPE_EDEFAULT.equals(instance_type);
			case DockerPackage.MACHINE_AMAZON_EC2__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case DockerPackage.MACHINE_AMAZON_EC2__ROOT_SIZE:
				return root_size != ROOT_SIZE_EDEFAULT;
			case DockerPackage.MACHINE_AMAZON_EC2__SECRET_KEY:
				return SECRET_KEY_EDEFAULT == null ? secret_key != null : !SECRET_KEY_EDEFAULT.equals(secret_key);
			case DockerPackage.MACHINE_AMAZON_EC2__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? security_group != null : !SECURITY_GROUP_EDEFAULT.equals(security_group);
			case DockerPackage.MACHINE_AMAZON_EC2__SESSION_TOKEN:
				return SESSION_TOKEN_EDEFAULT == null ? session_token != null : !SESSION_TOKEN_EDEFAULT.equals(session_token);
			case DockerPackage.MACHINE_AMAZON_EC2__SUBNET_ID:
				return SUBNET_ID_EDEFAULT == null ? subnet_id != null : !SUBNET_ID_EDEFAULT.equals(subnet_id);
			case DockerPackage.MACHINE_AMAZON_EC2__VPC_ID:
				return VPC_ID_EDEFAULT == null ? vpc_id != null : !VPC_ID_EDEFAULT.equals(vpc_id);
			case DockerPackage.MACHINE_AMAZON_EC2__ZONE:
				return ZONE_EDEFAULT == null ? zone != null : !ZONE_EDEFAULT.equals(zone);
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
		result.append(" (access_key: ");
		result.append(access_key);
		result.append(", ami: ");
		result.append(ami);
		result.append(", instance_type: ");
		result.append(instance_type);
		result.append(", region: ");
		result.append(region);
		result.append(", root_size: ");
		result.append(root_size);
		result.append(", secret_key: ");
		result.append(secret_key);
		result.append(", security_group: ");
		result.append(security_group);
		result.append(", session_token: ");
		result.append(session_token);
		result.append(", subnet_id: ");
		result.append(subnet_id);
		result.append(", vpc_id: ");
		result.append(vpc_id);
		result.append(", zone: ");
		result.append(zone);
		result.append(')');
		return result.toString();
	}

} //Machine_Amazon_EC2Impl

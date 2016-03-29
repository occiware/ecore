/**
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Amazon EC2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getAccess_key <em>Access key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getAmi <em>Ami</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getInstance_type <em>Instance type</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getRegion <em>Region</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getRoot_size <em>Root size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSecret_key <em>Secret key</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSecurity_group <em>Security group</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSession_token <em>Session token</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSubnet_id <em>Subnet id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getVpc_id <em>Vpc id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2()
 * @model annotation="OCCIE2Ecore title='Machine on Amazon EC2'"
 * @generated
 */
public interface Machine_Amazon_EC2 extends Machine {
	/**
	 * Returns the value of the '<em><b>Access key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access key</em>' attribute.
	 * @see #setAccess_key(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Access_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Your access key id for the Amazon Web Services API'"
	 * @generated
	 */
	String getAccess_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getAccess_key <em>Access key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access key</em>' attribute.
	 * @see #getAccess_key()
	 * @generated
	 */
	void setAccess_key(String value);

	/**
	 * Returns the value of the '<em><b>Ami</b></em>' attribute.
	 * The default value is <code>"ami-4ae27e22"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ami</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ami</em>' attribute.
	 * @see #setAmi(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Ami()
	 * @model default="ami-4ae27e22" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The AMI ID of the instance to use'"
	 * @generated
	 */
	String getAmi();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getAmi <em>Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ami</em>' attribute.
	 * @see #getAmi()
	 * @generated
	 */
	void setAmi(String value);

	/**
	 * Returns the value of the '<em><b>Instance type</b></em>' attribute.
	 * The default value is <code>"t2.micro"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance type</em>' attribute.
	 * @see #setInstance_type(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Instance_type()
	 * @model default="t2.micro" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The instance type to run'"
	 * @generated
	 */
	String getInstance_type();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getInstance_type <em>Instance type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance type</em>' attribute.
	 * @see #getInstance_type()
	 * @generated
	 */
	void setInstance_type(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * The default value is <code>"us-east-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Region()
	 * @model default="us-east-1" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The region to use when launching the instance'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Root size</b></em>' attribute.
	 * The default value is <code>"16"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root size</em>' attribute.
	 * @see #setRoot_size(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Root_size()
	 * @model default="16" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='The root disk size of the instance (in GB)'"
	 * @generated
	 */
	int getRoot_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getRoot_size <em>Root size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root size</em>' attribute.
	 * @see #getRoot_size()
	 * @generated
	 */
	void setRoot_size(int value);

	/**
	 * Returns the value of the '<em><b>Secret key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret key</em>' attribute.
	 * @see #setSecret_key(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Secret_key()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Your secret access key for the Amazon Web Services API'"
	 * @generated
	 */
	String getSecret_key();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSecret_key <em>Secret key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret key</em>' attribute.
	 * @see #getSecret_key()
	 * @generated
	 */
	void setSecret_key(String value);

	/**
	 * Returns the value of the '<em><b>Security group</b></em>' attribute.
	 * The default value is <code>"docker-machine"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security group</em>' attribute.
	 * @see #setSecurity_group(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Security_group()
	 * @model default="docker-machine" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='AWS VPC security group name'"
	 * @generated
	 */
	String getSecurity_group();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSecurity_group <em>Security group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security group</em>' attribute.
	 * @see #getSecurity_group()
	 * @generated
	 */
	void setSecurity_group(String value);

	/**
	 * Returns the value of the '<em><b>Session token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session token</em>' attribute.
	 * @see #setSession_token(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Session_token()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='Your session token for the Amazon Web Services API'"
	 * @generated
	 */
	String getSession_token();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSession_token <em>Session token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session token</em>' attribute.
	 * @see #getSession_token()
	 * @generated
	 */
	void setSession_token(String value);

	/**
	 * Returns the value of the '<em><b>Subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnet id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet id</em>' attribute.
	 * @see #setSubnet_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Subnet_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='AWS VPC subnet id'"
	 * @generated
	 */
	String getSubnet_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getSubnet_id <em>Subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet id</em>' attribute.
	 * @see #getSubnet_id()
	 * @generated
	 */
	void setSubnet_id(String value);

	/**
	 * Returns the value of the '<em><b>Vpc id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc id</em>' attribute.
	 * @see #setVpc_id(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Vpc_id()
	 * @model dataType="org.occiware.clouddesigner.occi.String" required="true"
	 *        annotation="OCCIE2Ecore description='Your VPC ID to launch the instance in'"
	 * @generated
	 */
	String getVpc_id();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getVpc_id <em>Vpc id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc id</em>' attribute.
	 * @see #getVpc_id()
	 * @generated
	 */
	void setVpc_id(String value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * The default value is <code>"a"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_Amazon_EC2_Zone()
	 * @model default="a" dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The AWS zone launch the instance in (i.e. one of a,b,c,d,e)'"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_Amazon_EC2#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

} // Machine_Amazon_EC2

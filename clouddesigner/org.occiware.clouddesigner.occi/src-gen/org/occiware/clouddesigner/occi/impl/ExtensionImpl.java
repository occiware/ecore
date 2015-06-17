/**
 */
package org.occiware.clouddesigner.occi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getKinds <em>Kinds</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionImpl extends MinimalEObjectImpl.Container implements Extension {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> import_;

	/**
	 * The cached value of the '{@link #getKinds() <em>Kinds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinds()
	 * @generated
	 * @ordered
	 */
	protected EList<Kind> kinds;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<Mixin> mixins;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EDataType> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getImport() {
		if (import_ == null) {
			import_ = new EObjectResolvingEList<Extension>(Extension.class, this, OCCIPackage.EXTENSION__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kind> getKinds() {
		if (kinds == null) {
			kinds = new EObjectContainmentEList<Kind>(Kind.class, this, OCCIPackage.EXTENSION__KINDS);
		}
		return kinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectContainmentEList<Mixin>(Mixin.class, this, OCCIPackage.EXTENSION__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDataType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<EDataType>(EDataType.class, this, OCCIPackage.EXTENSION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.EXTENSION__KINDS:
				return ((InternalEList<?>)getKinds()).basicRemove(otherEnd, msgs);
			case OCCIPackage.EXTENSION__MIXINS:
				return ((InternalEList<?>)getMixins()).basicRemove(otherEnd, msgs);
			case OCCIPackage.EXTENSION__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.EXTENSION__NAME:
				return getName();
			case OCCIPackage.EXTENSION__SCHEME:
				return getScheme();
			case OCCIPackage.EXTENSION__IMPORT:
				return getImport();
			case OCCIPackage.EXTENSION__KINDS:
				return getKinds();
			case OCCIPackage.EXTENSION__MIXINS:
				return getMixins();
			case OCCIPackage.EXTENSION__TYPES:
				return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCCIPackage.EXTENSION__NAME:
				setName((String)newValue);
				return;
			case OCCIPackage.EXTENSION__SCHEME:
				setScheme((String)newValue);
				return;
			case OCCIPackage.EXTENSION__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Extension>)newValue);
				return;
			case OCCIPackage.EXTENSION__KINDS:
				getKinds().clear();
				getKinds().addAll((Collection<? extends Kind>)newValue);
				return;
			case OCCIPackage.EXTENSION__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends Mixin>)newValue);
				return;
			case OCCIPackage.EXTENSION__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends EDataType>)newValue);
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
			case OCCIPackage.EXTENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCCIPackage.EXTENSION__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case OCCIPackage.EXTENSION__IMPORT:
				getImport().clear();
				return;
			case OCCIPackage.EXTENSION__KINDS:
				getKinds().clear();
				return;
			case OCCIPackage.EXTENSION__MIXINS:
				getMixins().clear();
				return;
			case OCCIPackage.EXTENSION__TYPES:
				getTypes().clear();
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
			case OCCIPackage.EXTENSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCCIPackage.EXTENSION__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case OCCIPackage.EXTENSION__IMPORT:
				return import_ != null && !import_.isEmpty();
			case OCCIPackage.EXTENSION__KINDS:
				return kinds != null && !kinds.isEmpty();
			case OCCIPackage.EXTENSION__MIXINS:
				return mixins != null && !mixins.isEmpty();
			case OCCIPackage.EXTENSION__TYPES:
				return types != null && !types.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl

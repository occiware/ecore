/**
 */
package org.occiware.clouddesigner.occi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.OCCIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface OCCIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "occi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "occi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OCCIPackage eINSTANCE = org.occiware.clouddesigner.occi.impl.OCCIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.CategoryImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TERM = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Identity Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Scheme Ends With Sharp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.AttributeImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MUTABLE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Multiple values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MULTIPLE_VALUES = 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.KindImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getKind()
	 * @generated
	 */
	int KIND = 2;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__TERM = CATEGORY__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__SCHEME = CATEGORY__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__TITLE = CATEGORY__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ATTRIBUTES = CATEGORY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__PARENT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ACTIONS = CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ENTITIES = CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Identity Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP = CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Scheme Ends With Sharp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP = CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Correct Scheme</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>No Cyclic Inheritance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Attributes Name Not Already Defined In Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Action Term Unicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Entity Kind Is Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___ENTITY_KIND_IS_ROOT_PARENT__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.ActionImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TERM = CATEGORY__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SCHEME = CATEGORY__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TITLE = CATEGORY__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ATTRIBUTES = CATEGORY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Identity Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP = CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Scheme Ends With Sharp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP = CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Correct Scheme</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.MixinImpl <em>Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.MixinImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getMixin()
	 * @generated
	 */
	int MIXIN = 4;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__TERM = CATEGORY__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__SCHEME = CATEGORY__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__TITLE = CATEGORY__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ATTRIBUTES = CATEGORY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ACTIONS = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__DEPENDS = CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__APPLIES = CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ENTITIES = CATEGORY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Identity Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP = CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Scheme Ends With Sharp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP = CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Action Term Unicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>No Cyclic Inheritance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Correct Scheme</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Attributes Name Not Already Defined In Depends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS__DIAGNOSTICCHAIN_MAP = CATEGORY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.EntityImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KIND = 1;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MIXINS = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Kind Compatible With One Applies Of Each Mixin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.AttributeStateImpl <em>Attribute State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.AttributeStateImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getAttributeState()
	 * @generated
	 */
	int ATTRIBUTE_STATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.ResourceImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__KIND = ENTITY__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MIXINS = ENTITY__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ATTRIBUTES = ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LINKS = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Kind Compatible With One Applies Of Each Mixin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP = ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Resource Kind Is In Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___RESOURCE_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.LinkImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__KIND = ENTITY__KIND;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MIXINS = ENTITY__MIXINS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ATTRIBUTES = ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Kind Compatible With One Applies Of Each Mixin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP = ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Link Kind Is In Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___LINK_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.ExtensionImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__KINDS = 3;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MIXINS = 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TYPES = 5;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Kinds Scheme Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___KINDS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Kind Parent Local Or Imported</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___KIND_PARENT_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Mixins Scheme Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MIXINS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Term Unicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___TERM_UNICITY__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Mixin Applies Local Or Imported</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MIXIN_APPLIES_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Scheme Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___SCHEME_UNIQUE__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Mixin Depends Local Or Imported</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MIXIN_DEPENDS_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.ConfigurationImpl
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 10;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__USE = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>All Resources Links Kinds In Use</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_LINKS_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>All Resources Links Targets In Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>All Resources Kinds In Use</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>All Resources Mixins In Use</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>All Resources Links Mixins In Use</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_LINKS_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getURI()
	 * @generated
	 */
	int URI = 11;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getString()
	 * @generated
	 */
	int STRING = 12;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 13;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 14;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.occiware.clouddesigner.occi.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Category#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.occiware.clouddesigner.occi.Category#getTerm()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Category#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see org.occiware.clouddesigner.occi.Category#getScheme()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Category#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.occiware.clouddesigner.occi.Category#getTitle()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.occi.Category#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.occiware.clouddesigner.occi.Category#getAttributes()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Attributes();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Category#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attributes Name Unique</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Category#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCategory__AttributesNameUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Category#IdentityUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Identity Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identity Unique</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Category#IdentityUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCategory__IdentityUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Category#SchemeEndsWithSharp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Scheme Ends With Sharp</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scheme Ends With Sharp</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Category#SchemeEndsWithSharp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCategory__SchemeEndsWithSharp__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.occiware.clouddesigner.occi.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Attribute#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.occiware.clouddesigner.occi.Attribute#isMutable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.occiware.clouddesigner.occi.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.occiware.clouddesigner.occi.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.occiware.clouddesigner.occi.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for the reference '{@link org.occiware.clouddesigner.occi.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.occiware.clouddesigner.occi.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Attribute#isMultiple_values <em>Multiple values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple values</em>'.
	 * @see org.occiware.clouddesigner.occi.Attribute#isMultiple_values()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Multiple_values();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see org.occiware.clouddesigner.occi.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for the reference '{@link org.occiware.clouddesigner.occi.Kind#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.occiware.clouddesigner.occi.Kind#getParent()
	 * @see #getKind()
	 * @generated
	 */
	EReference getKind_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.occi.Kind#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.occiware.clouddesigner.occi.Kind#getActions()
	 * @see #getKind()
	 * @generated
	 */
	EReference getKind_Actions();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.occi.Kind#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see org.occiware.clouddesigner.occi.Kind#getEntities()
	 * @see #getKind()
	 * @generated
	 */
	EReference getKind_Entities();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Kind#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Scheme</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Correct Scheme</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Kind#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKind__CorrectScheme__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Kind#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Cyclic Inheritance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Cyclic Inheritance</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Kind#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKind__NoCyclicInheritance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Kind#AttributesNameNotAlreadyDefinedInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Not Already Defined In Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attributes Name Not Already Defined In Parent</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Kind#AttributesNameNotAlreadyDefinedInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKind__AttributesNameNotAlreadyDefinedInParent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Kind#ActionTermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Action Term Unicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Term Unicity</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Kind#ActionTermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKind__ActionTermUnicity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Kind#EntityKindIsRootParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Entity Kind Is Root Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entity Kind Is Root Parent</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Kind#EntityKindIsRootParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKind__EntityKindIsRootParent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.occiware.clouddesigner.occi.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Action#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Scheme</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Correct Scheme</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Action#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAction__CorrectScheme__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Mixin <em>Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixin</em>'.
	 * @see org.occiware.clouddesigner.occi.Mixin
	 * @generated
	 */
	EClass getMixin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.occi.Mixin#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.occiware.clouddesigner.occi.Mixin#getActions()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Actions();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.occi.Mixin#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends</em>'.
	 * @see org.occiware.clouddesigner.occi.Mixin#getDepends()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Depends();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.occi.Mixin#getApplies <em>Applies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies</em>'.
	 * @see org.occiware.clouddesigner.occi.Mixin#getApplies()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Applies();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.occi.Mixin#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see org.occiware.clouddesigner.occi.Mixin#getEntities()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Entities();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Mixin#ActionTermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Action Term Unicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Term Unicity</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Mixin#ActionTermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMixin__ActionTermUnicity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Mixin#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Cyclic Inheritance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Cyclic Inheritance</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Mixin#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMixin__NoCyclicInheritance__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Mixin#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Scheme</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Correct Scheme</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Mixin#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMixin__CorrectScheme__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Mixin#AttributesNameNotAlreadyDefinedInDepends(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Not Already Defined In Depends</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attributes Name Not Already Defined In Depends</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Mixin#AttributesNameNotAlreadyDefinedInDepends(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMixin__AttributesNameNotAlreadyDefinedInDepends__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.occiware.clouddesigner.occi.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.occiware.clouddesigner.occi.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the reference '{@link org.occiware.clouddesigner.occi.Entity#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see org.occiware.clouddesigner.occi.Entity#getKind()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Kind();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.occi.Entity#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mixins</em>'.
	 * @see org.occiware.clouddesigner.occi.Entity#getMixins()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Mixins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.occi.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.occiware.clouddesigner.occi.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Entity#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attributes Name Unique</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Entity#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__AttributesNameUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Entity#KindCompatibleWithOneAppliesOfEachMixin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Kind Compatible With One Applies Of Each Mixin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kind Compatible With One Applies Of Each Mixin</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Entity#KindCompatibleWithOneAppliesOfEachMixin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__KindCompatibleWithOneAppliesOfEachMixin__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Entity#IdUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id Unique</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Entity#IdUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__IdUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.AttributeState <em>Attribute State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute State</em>'.
	 * @see org.occiware.clouddesigner.occi.AttributeState
	 * @generated
	 */
	EClass getAttributeState();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.AttributeState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.AttributeState#getName()
	 * @see #getAttributeState()
	 * @generated
	 */
	EAttribute getAttributeState_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.AttributeState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.occiware.clouddesigner.occi.AttributeState#getValue()
	 * @see #getAttributeState()
	 * @generated
	 */
	EAttribute getAttributeState_Value();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.occiware.clouddesigner.occi.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.occi.Resource#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.occiware.clouddesigner.occi.Resource#getLinks()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Links();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Resource#ResourceKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Resource Kind Is In Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resource Kind Is In Parent</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Resource#ResourceKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResource__ResourceKindIsInParent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.occiware.clouddesigner.occi.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the container reference '{@link org.occiware.clouddesigner.occi.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see org.occiware.clouddesigner.occi.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link org.occiware.clouddesigner.occi.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.occiware.clouddesigner.occi.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Link#LinkKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Link Kind Is In Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Link Kind Is In Parent</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Link#LinkKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLink__LinkKindIsInParent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.occiware.clouddesigner.occi.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Extension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.Extension#getName()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.Extension#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see org.occiware.clouddesigner.occi.Extension#getScheme()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Scheme();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.occi.Extension#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import</em>'.
	 * @see org.occiware.clouddesigner.occi.Extension#getImport()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.occi.Extension#getKinds <em>Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kinds</em>'.
	 * @see org.occiware.clouddesigner.occi.Extension#getKinds()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Kinds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.occi.Extension#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mixins</em>'.
	 * @see org.occiware.clouddesigner.occi.Extension#getMixins()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Mixins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.occi.Extension#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.occiware.clouddesigner.occi.Extension#getTypes()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Types();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Extension#KindsSchemeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Kinds Scheme Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kinds Scheme Valid</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Extension#KindsSchemeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__KindsSchemeValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Extension#KindParentLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Kind Parent Local Or Imported</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kind Parent Local Or Imported</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Extension#KindParentLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__KindParentLocalOrImported__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Extension#MixinsSchemeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Mixins Scheme Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mixins Scheme Valid</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Extension#MixinsSchemeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__MixinsSchemeValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Extension#TermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Term Unicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Term Unicity</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Extension#TermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__TermUnicity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Extension#MixinAppliesLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Mixin Applies Local Or Imported</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mixin Applies Local Or Imported</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Extension#MixinAppliesLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__MixinAppliesLocalOrImported__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Extension#SchemeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Scheme Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scheme Unique</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Extension#SchemeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__SchemeUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Extension#MixinDependsLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Mixin Depends Local Or Imported</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mixin Depends Local Or Imported</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Extension#MixinDependsLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__MixinDependsLocalOrImported__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.occiware.clouddesigner.occi.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.occiware.clouddesigner.occi.Configuration#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see org.occiware.clouddesigner.occi.Configuration#getUse()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Use();

	/**
	 * Returns the meta object for the containment reference list '{@link org.occiware.clouddesigner.occi.Configuration#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.occiware.clouddesigner.occi.Configuration#getResources()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Resources();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Configuration#AllResourcesLinksKindsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Links Kinds In Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Links Kinds In Use</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Configuration#AllResourcesLinksKindsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesLinksKindsInUse__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Configuration#AllResourcesLinksTargetsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Links Targets In Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Links Targets In Configuration</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Configuration#AllResourcesLinksTargetsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesLinksTargetsInConfiguration__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Configuration#AllResourcesKindsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Kinds In Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Kinds In Use</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Configuration#AllResourcesKindsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesKindsInUse__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Configuration#AllResourcesMixinsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Mixins In Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Mixins In Use</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Configuration#AllResourcesMixinsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesMixinsInUse__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.Configuration#AllResourcesLinksMixinsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Links Mixins In Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Links Mixins In Use</em>' operation.
	 * @see org.occiware.clouddesigner.occi.Configuration#AllResourcesLinksMixinsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesLinksMixinsInUse__DiagnosticChain_Map();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getNumber();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OCCIFactory getOCCIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.CategoryImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TERM = eINSTANCE.getCategory_Term();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__SCHEME = eINSTANCE.getCategory_Scheme();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TITLE = eINSTANCE.getCategory_Title();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ATTRIBUTES = eINSTANCE.getCategory_Attributes();

		/**
		 * The meta object literal for the '<em><b>Attributes Name Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCategory__AttributesNameUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Identity Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCategory__IdentityUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Scheme Ends With Sharp</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCategory__SchemeEndsWithSharp__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.AttributeImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MUTABLE = eINSTANCE.getAttribute_Mutable();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Multiple values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MULTIPLE_VALUES = eINSTANCE.getAttribute_Multiple_values();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.KindImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND__PARENT = eINSTANCE.getKind_Parent();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND__ACTIONS = eINSTANCE.getKind_Actions();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND__ENTITIES = eINSTANCE.getKind_Entities();

		/**
		 * The meta object literal for the '<em><b>Correct Scheme</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KIND___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getKind__CorrectScheme__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Cyclic Inheritance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KIND___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getKind__NoCyclicInheritance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Attributes Name Not Already Defined In Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KIND___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getKind__AttributesNameNotAlreadyDefinedInParent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Action Term Unicity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KIND___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getKind__ActionTermUnicity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Entity Kind Is Root Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KIND___ENTITY_KIND_IS_ROOT_PARENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getKind__EntityKindIsRootParent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.ActionImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Correct Scheme</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAction__CorrectScheme__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.MixinImpl <em>Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.MixinImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getMixin()
		 * @generated
		 */
		EClass MIXIN = eINSTANCE.getMixin();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__ACTIONS = eINSTANCE.getMixin_Actions();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__DEPENDS = eINSTANCE.getMixin_Depends();

		/**
		 * The meta object literal for the '<em><b>Applies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__APPLIES = eINSTANCE.getMixin_Applies();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__ENTITIES = eINSTANCE.getMixin_Entities();

		/**
		 * The meta object literal for the '<em><b>Action Term Unicity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIXIN___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMixin__ActionTermUnicity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Cyclic Inheritance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIXIN___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMixin__NoCyclicInheritance__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Correct Scheme</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIXIN___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMixin__CorrectScheme__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Attributes Name Not Already Defined In Depends</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIXIN___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMixin__AttributesNameNotAlreadyDefinedInDepends__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.EntityImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__KIND = eINSTANCE.getEntity_Kind();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__MIXINS = eINSTANCE.getEntity_Mixins();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Attributes Name Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__AttributesNameUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Kind Compatible With One Applies Of Each Mixin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__KindCompatibleWithOneAppliesOfEachMixin__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Id Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntity__IdUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.AttributeStateImpl <em>Attribute State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.AttributeStateImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getAttributeState()
		 * @generated
		 */
		EClass ATTRIBUTE_STATE = eINSTANCE.getAttributeState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_STATE__NAME = eINSTANCE.getAttributeState_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_STATE__VALUE = eINSTANCE.getAttributeState_Value();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.ResourceImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__LINKS = eINSTANCE.getResource_Links();

		/**
		 * The meta object literal for the '<em><b>Resource Kind Is In Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___RESOURCE_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResource__ResourceKindIsInParent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.LinkImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '<em><b>Link Kind Is In Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___LINK_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLink__LinkKindIsInParent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.ExtensionImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__NAME = eINSTANCE.getExtension_Name();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__SCHEME = eINSTANCE.getExtension_Scheme();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__IMPORT = eINSTANCE.getExtension_Import();

		/**
		 * The meta object literal for the '<em><b>Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__KINDS = eINSTANCE.getExtension_Kinds();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__MIXINS = eINSTANCE.getExtension_Mixins();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__TYPES = eINSTANCE.getExtension_Types();

		/**
		 * The meta object literal for the '<em><b>Kinds Scheme Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___KINDS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExtension__KindsSchemeValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Kind Parent Local Or Imported</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___KIND_PARENT_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExtension__KindParentLocalOrImported__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Mixins Scheme Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___MIXINS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExtension__MixinsSchemeValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Term Unicity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___TERM_UNICITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExtension__TermUnicity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Mixin Applies Local Or Imported</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___MIXIN_APPLIES_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExtension__MixinAppliesLocalOrImported__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Scheme Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___SCHEME_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExtension__SchemeUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Mixin Depends Local Or Imported</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___MIXIN_DEPENDS_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getExtension__MixinDependsLocalOrImported__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.ConfigurationImpl
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__USE = eINSTANCE.getConfiguration_Use();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__RESOURCES = eINSTANCE.getConfiguration_Resources();

		/**
		 * The meta object literal for the '<em><b>All Resources Links Kinds In Use</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_LINKS_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__AllResourcesLinksKindsInUse__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>All Resources Links Targets In Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__AllResourcesLinksTargetsInConfiguration__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>All Resources Kinds In Use</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__AllResourcesKindsInUse__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>All Resources Mixins In Use</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__AllResourcesMixinsInUse__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>All Resources Links Mixins In Use</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_LINKS_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConfiguration__AllResourcesLinksMixinsInUse__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.impl.OCCIPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

	}

} //OCCIPackage

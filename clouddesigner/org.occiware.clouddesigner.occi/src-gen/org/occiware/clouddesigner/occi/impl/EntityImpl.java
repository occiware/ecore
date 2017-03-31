/**
 * Copyright (c) 2015-2016 Obeo, Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 * 
 */
package org.occiware.clouddesigner.occi.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;

import org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIKindResolver;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.OCCITables;
import org.occiware.clouddesigner.occi.util.Occi2Ecore;
import org.occiware.clouddesigner.occi.util.OcciHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.occiware.clouddesigner.occi.impl.EntityImpl#getId <em>Id</em>}
 * </li>
 * <li>{@link org.occiware.clouddesigner.occi.impl.EntityImpl#getTitle
 * <em>Title</em>}</li>
 * <li>{@link org.occiware.clouddesigner.occi.impl.EntityImpl#getKind
 * <em>Kind</em>}</li>
 * <li>{@link org.occiware.clouddesigner.occi.impl.EntityImpl#getMixins
 * <em>Mixins</em>}</li>
 * <li>{@link org.occiware.clouddesigner.occi.impl.EntityImpl#getAttributes
 * <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {

	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(EntityImpl.class);

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<Mixin> mixins;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeState> attributes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected EntityImpl() {
		super();

		// Generate a new ID for this entity.
		setId(UUID.randomUUID().toString());
		// If kind is not set then
		if (kind == null) {
			try {
				// Try to resolve it automatically.
				kind = OCCIKindResolver.resolveKind(this);
			} catch (Exception exc) {
				LOGGER.warn("SHOULD NEVER HAPPEN!", exc);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ENTITY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Kind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject) kind;
			kind = (Kind) eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.ENTITY__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Kind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKind(Kind newKind) {
		Kind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ENTITY__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Mixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectResolvingEList<Mixin>(Mixin.class, this, OCCIPackage.ENTITY__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<AttributeState> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeState>(AttributeState.class, this,
					OCCIPackage.ENTITY__ATTRIBUTES);
		}
		
		//
		// Synchronize OCCI attributes from EMF attributes.
		//

		// Array to store doublons of OCCI attribute states.
		final ArrayList<AttributeState> toRemove = new ArrayList<AttributeState>();

		// Compute a map of all current OCCI attribute state instances.
		final HashMap<String, AttributeState> map = new HashMap<String, AttributeState>();
		for(AttributeState attributeState : attributes) {
			String attributeStateName = attributeState.getName();
			AttributeState oldAttributeState = map.get(attributeStateName);
			if(oldAttributeState != null) {
				toRemove.add(oldAttributeState);
			}
			map.put(attributeStateName, attributeState);
		}

		// Remove doublons of OCCI attribute state instances.
		for(AttributeState attributeState : toRemove) {
			attributes.remove(attributeState);
		}
		
//
// Since attribute occi.core.id was added to entity kind, following code is not necessary.
//

		// Add a default attribute occi.core.id (mandatory ref. GFD.185 section 3.1 p6).
		// only if occi.core.id does not exist.
//		boolean occiCoreIdExist = false;
//		for (AttributeState attributeState : attributes) {
//			if (attributeState.getName().equals("occi.core.id")) {
//				occiCoreIdExist = true;
//				break;
//			}
//		}
//		if (!occiCoreIdExist) {
//			AttributeState attrState = OCCIFactory.eINSTANCE.createAttributeState();
//			attrState.setName("occi.core.id");
//			attrState.setValue(getId());
//			attributes.add(attrState);
//		}

		// Iterate over all OCCI attributes of this entity.
		for(Attribute attribute : OcciHelper.getAllAttributes(this)) {
			final String attributeName = attribute.getName();
			// Search the Ecore structural feature associated to this OCCI attribute.
			final EStructuralFeature eStructuralFeature = eClass().getEStructuralFeature(Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attributeName));
			// If this is an Ecore attribute then
			if(eStructuralFeature != null && eStructuralFeature instanceof EAttribute) {
				final int featureId = eStructuralFeature.getFeatureID();
				// If this Ecore attribute is set then
				if(eIsSet(featureId)) {
					// Search the associated attribute state from the map.
					AttributeState attributeState = map.get(attributeName);
					// If not found then create it.
					if(attributeState == null) {
						attributeState = new AttributeStateImpl();
						attributeState.setName(attributeName);
						try {
							attributes.add(attributeState);
						} catch (Exception e) {
							// FIXME: Don't understand why an exception is thrown!!!
							LOGGER.warn("Exception when add attribute state '" + attributeName + "': " + e.getMessage() + "!!!");
						}
					}
					// Get the Ecore attribute value.
					final String valueAsString = eGet(featureId, true, true).toString();
					// If this value has changed then
					if(!valueAsString.equals(attributeState.getValue())) {
						// Set the attribute set value.
						try {
							attributeState.setValue(valueAsString);
						} catch (Exception e) {
							// FIXME: Don't understand why an exception is thrown!!!
							LOGGER.warn("Exception when set attribute state '" + attributeName + "': " + e.getMessage() + "!!!");
						}
					}
				}
			}
		}
		
		return attributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void occiCreate() {
		LOGGER.debug("occiCreate() called on " + this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean AttributesNameUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AttributesNameUnique: let severity : Integer[1] =
		 * 'Entity::AttributesNameUnique'.getSeverity() in if severity <= 0 then
		 * true else let status : OclAny[1] = attributes->isUnique(name) in
		 * 'Entity::AttributesNameUnique'.logDiagnostic(self, null, diagnostics,
		 * context, null, severity, status, 0) endif
		 */
		final /* @NonInvalid */ Executor executor = PivotUtilInternal.getExecutor(this);
		final /* @NonInvalid */ IdResolver idResolver = executor.getIdResolver();
		final /* @NonInvalid */ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
				OCCITables.STR_Entity_c_c_AttributesNameUnique);
		final /* @NonInvalid */ boolean le = OclComparableLessThanEqualOperation.INSTANCE
				.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/* @NonInvalid */ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		} else {
			/* @Caught */ /* @NonNull */ Object CAUGHT_status;
			try {
				final /* @Thrown */ List<AttributeState> attributes = this.getAttributes();
				final /* @Thrown */ OrderedSetValue BOXED_attributes = idResolver
						.createOrderedSetOfAll(OCCITables.ORD_CLSSid_AttributeState, attributes);
				/* @Thrown */ SetValue.Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(OCCITables.ORD_CLSSid_AttributeState);
				/* @NonNull */ Iterator<Object> ITERATOR__1 = BOXED_attributes.iterator();
				/* @Thrown */ boolean status;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						status = ValueUtil.TRUE_VALUE;
						break;
					}
					/* @NonInvalid */ AttributeState _1 = (AttributeState) ITERATOR__1.next();
					/**
					 * name
					 */
					final /* @Thrown */ String name = _1.getName();
					//
					if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
						status = ValueUtil.FALSE_VALUE; // Abort after second
														// find
						break;
					} else {
						accumulator.add(name);
					}
				}
				CAUGHT_status = status;
			} catch (Exception e) {
				CAUGHT_status = ValueUtil.createInvalidValue(e);
			}
			final /* @NonInvalid */ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
					.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Entity_c_c_AttributesNameUnique, this, null,
							diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0)
					.booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean KindCompatibleWithOneAppliesOfEachMixin(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		/**
		 * 
		 * inv KindCompatibleWithOneAppliesOfEachMixin: let severity :
		 * Integer[1] =
		 * 'Entity::KindCompatibleWithOneAppliesOfEachMixin'.getSeverity() in if
		 * severity <= 0 then true else let status : OclAny[?] =
		 * mixins->forAll(m | m.applies->notEmpty() implies m.applies->exists(k
		 * | kind->closure(parent)->includes(k))) in
		 * 'Entity::KindCompatibleWithOneAppliesOfEachMixin'.logDiagnostic(self,
		 * null, diagnostics, context, null, severity, status, 0) endif
		 */
		final /* @NonInvalid */ Executor executor = PivotUtilInternal.getExecutor(this);
		final /* @NonInvalid */ IdResolver idResolver = executor.getIdResolver();
		final /* @NonInvalid */ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
				OCCITables.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin);
		final /* @NonInvalid */ boolean le = OclComparableLessThanEqualOperation.INSTANCE
				.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/* @NonInvalid */ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		} else {
			/* @Caught */ /* @Nullable */ Object CAUGHT_status;
			try {
				final /* @Thrown */ List<Mixin> mixins = this.getMixins();
				final /* @Thrown */ OrderedSetValue BOXED_mixins = idResolver
						.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
				/* @Thrown */ Object accumulator = ValueUtil.TRUE_VALUE;
				/* @NonNull */ Iterator<Object> ITERATOR_m = BOXED_mixins.iterator();
				/* @Thrown */ Boolean status;
				while (true) {
					if (!ITERATOR_m.hasNext()) {
						if (accumulator == null) {
							status = null;
						} else if (accumulator == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/* @NonInvalid */ Mixin m = (Mixin) ITERATOR_m.next();
					/**
					 * 
					 * m.applies->notEmpty() implies m.applies->exists(k |
					 * kind->closure(parent)->includes(k))
					 */
					/* @Caught */ /* @Nullable */ Object CAUGHT_implies;
					try {
						/* @Caught */ /* @NonNull */ Object CAUGHT_notEmpty;
						try {
							final /* @Thrown */ List<Kind> applies = m.getApplies();
							final /* @Thrown */ OrderedSetValue BOXED_applies = idResolver
									.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, applies);
							final /* @Thrown */ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE
									.evaluate(BOXED_applies).booleanValue();
							CAUGHT_notEmpty = notEmpty;
						} catch (Exception e) {
							CAUGHT_notEmpty = ValueUtil.createInvalidValue(e);
						}
						/* @Caught */ /* @NonNull */ Object CAUGHT_exists;
						try {
							final /* @Thrown */ List<Kind> applies_0 = m.getApplies();
							final /* @Thrown */ OrderedSetValue BOXED_applies_0 = idResolver
									.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, applies_0);
							/* @Thrown */ Object accumulator_0 = ValueUtil.FALSE_VALUE;
							/* @NonNull */ Iterator<Object> ITERATOR_k = BOXED_applies_0.iterator();
							/* @Thrown */ boolean exists;
							while (true) {
								if (!ITERATOR_k.hasNext()) {
									if (accumulator_0 == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator_0;
									}
									break;
								}
								/* @NonInvalid */ Kind k = (Kind) ITERATOR_k.next();
								/**
								 * kind->closure(parent)->includes(k)
								 */
								final /* @NonInvalid */ StandardLibrary standardLibrary = idResolver
										.getStandardLibrary();
								/* @Caught */ /* @NonNull */ Object CAUGHT_includes;
								try {
									final /* @Thrown */ Kind kind = this.getKind();
									final /* @Thrown */ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE
											.evaluate(executor, OCCITables.SET_CLSSid_Kind, kind);
									final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor
											.getStaticTypeOf(oclAsSet);
									final LibraryIteration.LibraryIterationExtension IMPL_closure_0 = (LibraryIteration.LibraryIterationExtension) TYPE_closure_0
											.lookupImplementation(standardLibrary,
													OCLstdlibTables.Operations._Set__closure);
									final /* @NonNull */ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(
											executor, OCCITables.SET_CLSSid_Kind, OCCITables.CLSSid_Kind);
									/**
									 * Implementation of the iterator body.
									 */
									final /* @NonNull */ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
										/**
										 * parent
										 */
										@Override
										public /* @Nullable */ Object evaluate(final /* @NonNull */ Executor executor,
												final /* @NonNull */ TypeId typeId,
												final /* @Nullable */ Object oclAsSet,
												final /* @NonInvalid */ Object _1) {
											final /* @NonInvalid */ Kind symbol_0 = (Kind) _1;
											if (symbol_0 == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Kind::parent\'");
											}
											final /* @Thrown */ Kind parent = symbol_0.getParent();
											return parent;
										}
									};
									final /* @NonNull */ ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(
											executor, OCCITables.SET_CLSSid_Kind, BODY_closure_0, oclAsSet,
											ACC_closure_0);
									final /* @Thrown */ SetValue closure = ClassUtil
											.nonNullState((SetValue) IMPL_closure_0.evaluateIteration(MGR_closure_0));
									final /* @Thrown */ boolean includes = CollectionIncludesOperation.INSTANCE
											.evaluate(closure, k).booleanValue();
									CAUGHT_includes = includes;
								} catch (Exception e) {
									CAUGHT_includes = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_includes == ValueUtil.TRUE_VALUE) { // Normal
																				// successful
																				// body
																				// evaluation
																				// result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (CAUGHT_includes == ValueUtil.FALSE_VALUE) { // Normal
																						// unsuccessful
																						// body
																						// evaluation
																						// result
									; // Carry on
								} else if (CAUGHT_includes instanceof InvalidValueException) { // Abnormal
																								// exception
																								// evaluation
																								// result
									accumulator_0 = CAUGHT_includes; // Cache an
																		// exception
																		// failure
								} else { // Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							CAUGHT_exists = exists;
						} catch (Exception e) {
							CAUGHT_exists = ValueUtil.createInvalidValue(e);
						}
						final /* @Thrown */ Boolean implies = BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_notEmpty,
								CAUGHT_exists);
						CAUGHT_implies = implies;
					} catch (Exception e) {
						CAUGHT_implies = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_implies == ValueUtil.FALSE_VALUE) { // Normal
																	// unsuccessful
																	// body
																	// evaluation
																	// result
						status = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) { // Normal
																			// successful
																			// body
																			// evaluation
																			// result
						; // Carry on
					} else if (CAUGHT_implies == null) { // Abnormal null body
															// evaluation result
						if (accumulator == ValueUtil.TRUE_VALUE) {
							accumulator = null; // Cache a null failure
						}
					} else if (CAUGHT_implies instanceof InvalidValueException) { // Abnormal
																					// exception
																					// evaluation
																					// result
						accumulator = CAUGHT_implies; // Cache an exception
														// failure
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_status = status;
			} catch (Exception e) {
				CAUGHT_status = ValueUtil.createInvalidValue(e);
			}
			final /* @NonInvalid */ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor,
					TypeId.BOOLEAN, OCCITables.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin, this, null,
					diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue();
			symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean IdUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv IdUnique: let severity : Integer[1] =
		 * 'Entity::IdUnique'.getSeverity() in if severity <= 0 then true else
		 * let status : OclAny[1] = Entity.allInstances()->isUnique(id) in
		 * 'Entity::IdUnique'.logDiagnostic(self, null, diagnostics, context,
		 * null, severity, status, 0) endif
		 */
		final /* @NonInvalid */ Executor executor = PivotUtilInternal.getExecutor(this);
		final /* @NonInvalid */ IdResolver idResolver = executor.getIdResolver();
		final /* @NonInvalid */ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
				OCCITables.STR_Entity_c_c_IdUnique);
		final /* @NonInvalid */ boolean le = OclComparableLessThanEqualOperation.INSTANCE
				.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/* @NonInvalid */ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		} else {
			/* @Caught */ /* @NonNull */ Object CAUGHT_status;
			try {
				final /* @NonInvalid */ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Entity_0 = idResolver
						.getClass(OCCITables.CLSSid_Entity, null);
				final /* @NonInvalid */ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
						.evaluate(executor, OCCITables.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0);
				/* @Thrown */ SetValue.Accumulator accumulator = ValueUtil
						.createSetAccumulatorValue(OCCITables.SET_CLSSid_Entity);
				/* @NonNull */ Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/* @Thrown */ boolean status;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						status = ValueUtil.TRUE_VALUE;
						break;
					}
					/* @NonInvalid */ Entity _1 = (Entity) ITERATOR__1.next();
					/**
					 * id
					 */
					final /* @Thrown */ String id = _1.getId();
					//
					if (accumulator.includes(id) == ValueUtil.TRUE_VALUE) {
						status = ValueUtil.FALSE_VALUE; // Abort after second
														// find
						break;
					} else {
						accumulator.add(id);
					}
				}
				CAUGHT_status = status;
			} catch (Exception e) {
				CAUGHT_status = ValueUtil.createInvalidValue(e);
			}
			final /* @NonInvalid */ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
					.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Entity_c_c_IdUnique, this, null, diagnostics,
							context, null, severity_0, CAUGHT_status, OCCITables.INT_0)
					.booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OCCIPackage.ENTITY__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OCCIPackage.ENTITY__ID:
			return getId();
		case OCCIPackage.ENTITY__TITLE:
			return getTitle();
		case OCCIPackage.ENTITY__KIND:
			if (resolve)
				return getKind();
			return basicGetKind();
		case OCCIPackage.ENTITY__MIXINS:
			return getMixins();
		case OCCIPackage.ENTITY__ATTRIBUTES:
			return getAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OCCIPackage.ENTITY__ID:
			setId((String) newValue);
			return;
		case OCCIPackage.ENTITY__TITLE:
			setTitle((String) newValue);
			return;
		case OCCIPackage.ENTITY__KIND:
			setKind((Kind) newValue);
			return;
		case OCCIPackage.ENTITY__MIXINS:
			getMixins().clear();
			getMixins().addAll((Collection<? extends Mixin>) newValue);
			return;
		case OCCIPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends AttributeState>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OCCIPackage.ENTITY__ID:
			setId(ID_EDEFAULT);
			return;
		case OCCIPackage.ENTITY__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case OCCIPackage.ENTITY__KIND:
			setKind((Kind) null);
			return;
		case OCCIPackage.ENTITY__MIXINS:
			getMixins().clear();
			return;
		case OCCIPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OCCIPackage.ENTITY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case OCCIPackage.ENTITY__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case OCCIPackage.ENTITY__KIND:
			return kind != null;
		case OCCIPackage.ENTITY__MIXINS:
			return mixins != null && !mixins.isEmpty();
		case OCCIPackage.ENTITY__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case OCCIPackage.ENTITY___OCCI_CREATE:
			occiCreate();
			return null;
		case OCCIPackage.ENTITY___OCCI_RETRIEVE:
			occiRetrieve();
			return null;
		case OCCIPackage.ENTITY___OCCI_UPDATE:
			occiUpdate();
			return null;
		case OCCIPackage.ENTITY___OCCI_DELETE:
			occiDelete();
			return null;
		case OCCIPackage.ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP:
			return AttributesNameUnique((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case OCCIPackage.ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP:
			return KindCompatibleWithOneAppliesOfEachMixin((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case OCCIPackage.ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP:
			return IdUnique((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} // EntityImpl

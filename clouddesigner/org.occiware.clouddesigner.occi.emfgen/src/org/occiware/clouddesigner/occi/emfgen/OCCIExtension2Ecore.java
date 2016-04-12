/*******************************************************************************
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   William Piers <william.piers@obeo.fr>
 *     Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.emfgen;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.util.Occi2Ecore;

/**
 * Convert an OCCI Extension to Ecore.
 */
public class OCCIExtension2Ecore {
	private static final String EANNOTATION_SOURCE = "OCCIE2Ecore";
	/**
	 * Store mapping from OCCI Kind to Ecore EClass.
	 */
	private Map<Kind, EClass> occiKind2emfEclass = new HashMap<Kind, EClass>();

	/**
	 * Get the EClass associated to an OCCI Kind.
	 * 
	 * @param kind
	 *            the given OCCI kind.
	 * @return the EClass.
	 */
	private EClass getMappedEClass(Kind kind) {
		EClass res = null;
		if (kind != null) {
			// retrieve from currently converted kinds
			res = occiKind2emfEclass.get(kind);
			if (res == null) {
				// retrieve from installed extensions.
				EPackage p = ConverterUtils.getEPackage(kind);
				res = (EClass) p.getEClassifier(ConverterUtils.toU1Case(kind.getTerm()));
				// Cache it for optimizing next searches.
				occiKind2emfEclass.put(kind, res);
			}
		}
		return res;
	}

	/**
	 * Store mapping from OCCI EDataType to Ecore EClassifier.
	 */
	private Map<EDataType, EClassifier> occiType2emfType = new HashMap<EDataType, EClassifier>();

	/**
	 * Get the EMF data type associated to an OCCI data type.
	 * 
	 * @param type
	 *            the given OCCI data type.
	 * @return the EMF data type.
	 */
	private EClassifier getMappedType(EDataType type) {
		EClassifier res = null;
		if (type == null) {
			res = EcorePackage.eINSTANCE.getEString();
		} else {
			// retrieve from currently converted data types
			res = occiType2emfType.get(type);
			if (res == null) {
				// retrieve from installed extensions.
				EPackage p = ConverterUtils.getEPackage(type);
				res = p.getEClassifier(type.getName());
				// Cache it for optimizing next searches.
				occiType2emfType.put(type, res);
			}
		}
		return res;
	}

	/**
	 * Convert an OCCI extension to an Ecore package.
	 * 
	 * @param extension
	 *            the OCCI extension to convert.
	 * @return the resulting Ecore package.
	 */
	public EPackage convertExtension(Extension extension) {
		// Create the Ecore package.
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		// Set the name of the Ecore package.
		String formattedName = ConverterUtils
				.formatName(extension.getName().replaceFirst("OCCI ", "").replaceFirst("OCCIware ", "").toLowerCase());
		ePackage.setName(formattedName);
		// Set the name space prefix of the Ecore package.
		ePackage.setNsPrefix(formattedName);
		// Set the URI of the Ecore package.
		ePackage.setNsURI(Occi2Ecore.convertOcciScheme2EcoreNamespace(extension.getScheme()));

		// TODO fetch occi package
		// but won't solve issue if user wants to use types from installed
		// models
		// EClass root = EcoreFactory.eINSTANCE.createEClass();
		// ePackage.getEClassifiers().add(root);
		// root.setName(ConverterUtils.toU1Case(extension.getName()+"Configuration"));
		// root.getESuperTypes().add(OCCIPackage.eINSTANCE.getConfiguration());

		// Convert all data types of the OCCI extension to data types of the
		// Ecore package.
		for (EDataType type : extension.getTypes()) {
			// Copy the OCCI data type.
			EDataType copiedType = EcoreUtil.copy(type);
			// Cache the copied data type to search it later.
			occiType2emfType.put(type, copiedType);
			// Add the data type to the Ecore package.
			ePackage.getEClassifiers().add(copiedType);
		}

		// Convert all OCCI kinds.
		for (Kind kind : extension.getKinds()) {
			// Convert each OCCI kind to an Ecore class.
			EClass convertKind = convertKind(kind);
			// Add the Ecore class to the Ecore package.
			if (convertKind != null) {
				ePackage.getEClassifiers().add(convertKind);
			}
		}

		// Convert all OCCI mixins.
		// TODO
		// for (Mixin mixin : extension.getMixins()) {
		// EClass convertMixin = convertMixin(mixin);
		// if (convertMixin != null) {
		// ePackage.getEClassifiers().add(convertMixin);
		// }
		// }

		// Resolve inheritance between OCCI kinds.
		for (Kind kind : extension.getKinds()) {
			// Get the Ecore class of this OCCI kind.
			EClass mappedEClass = getMappedEClass(kind);
			// If kind has a parent kind then
			if (kind.getParent() != null) {
				// Get the Ecore class of the OCCI kind's parent.
				EClass mappedParentEClass = getMappedEClass(kind.getParent());
				if (mappedParentEClass != null) {
					// The Ecore class of the kind's parent is a super type of
					// the Ecore class of the OCCI kind.
					mappedEClass.getESuperTypes().add(mappedParentEClass);
				} else {
					// Should never happen!
					throw new IllegalArgumentException("Not found: " + kind.getParent());
				}
			}
		}
		return ePackage;
	}

	// protected EClass convertMixin(Mixin mixin) {
	// EClass eClass = EcoreFactory.eINSTANCE.createEClass();
	// eClass.setName(ConverterUtils.toU1Case(ConverterUtils.formatName(mixin
	// .getTerm())));
	// eClass.setAbstract(true);
	// for (Attribute attribute : mixin.getAttributes()) {
	// EAttribute convertAttribute = convertAttribute(attribute);
	// if (convertAttribute != null) {
	// eClass.getEStructuralFeatures().add(convertAttribute);
	// }
	// }
	// for (Action action : mixin.getActions()) {
	// EOperation convertAction = convertAction(action);
	// if (convertAction != null) {
	// eClass.getEOperations().add(convertAction);
	// }
	// }
	// return eClass;
	// }

	/**
	 * Convert an OCCI kind to an Ecore class.
	 * 
	 * @param kind
	 *            the OCCI kind to convert.
	 * @return the resulting Ecore class.
	 */
	protected EClass convertKind(Kind kind) {
		// Create the Ecore class.
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		// Set the name of the Ecore class.
		eClass.setName(ConverterUtils.toU1Case(ConverterUtils.formatName(kind.getTerm())));
		// Convert all attributes of the OCCI kind.
		for (Attribute attribute : kind.getAttributes()) {
			// Convert each OCCI attribute to an Ecore attribute.
			EAttribute convertAttribute = convertAttribute(attribute);
			if (convertAttribute != null) {
				// Add the Ecore attribute as a structural feature of the Ecore
				// class.
				eClass.getEStructuralFeatures().add(convertAttribute);
			}
		}
		// Convert all actions of the OCCI kind.
		for (Action action : kind.getActions()) {
			// Convert each OCCI action to an Ecore operation.
			EOperation convertAction = convertAction(action);
			if (convertAction != null) {
				// Add the Ecore action as an operation of the Ecore class.
				eClass.getEOperations().add(convertAction);
			}
		}
		attachInfo(eClass, "title", kind.getTitle());
		// Keep the Ecore class into a cache to search it later.
		occiKind2emfEclass.put(kind, eClass);
		return eClass;
	}

	/**
	 * Convert an OCCI action to an Ecore operation.
	 * 
	 * @param action
	 *            the OCCI action to convert.
	 * @return the resulting Ecore operation.
	 */
	protected EOperation convertAction(Action action) {
		// Create the Ecore operation.
		EOperation eOperation = EcoreFactory.eINSTANCE.createEOperation();
		// Set the name of the Ecore operation.
		eOperation.setName(ConverterUtils.formatName(action.getTerm()));
		// Convert all attributes of the OCCI action.
		for (Attribute attribute : action.getAttributes()) {
			// Each OCCI attribute of the OCCI action is converted to an Ecore
			// parameter of the Ecore operation.
			EParameter convertParameter = convertParameter(attribute);
			if (convertParameter != null) {
				// Add the Ecore parameter to the Ecore operation.
				eOperation.getEParameters().add(convertParameter);
			}
		}
		attachInfo(eOperation, "title", action.getTitle());
		return eOperation;
	}

	/**
	 * Convert an OCCI action's attribute to an Ecore operation parameter.
	 * 
	 * @param attribute
	 *            the OCCI attribute to convert.
	 * @return the resulting Ecore operation parameter.
	 */
	protected EParameter convertParameter(Attribute attribute) {
		// Create an Ecore parameter.
		EParameter eParam = EcoreFactory.eINSTANCE.createEParameter();
		// Set the name of the Ecore parameter.
		eParam.setName(ConverterUtils.formatName(attribute.getName()));
		// Set the type of the Ecore parameter.
		eParam.setEType(getMappedType(attribute.getType()));
		// If the OCCI attribute is required then the Ecore parameter is also
		// required.
		if (attribute.isRequired()) {
			eParam.setLowerBound(1);
		}
		attachInfo(eParam, "description", attribute.getDescription());
		return eParam;
	}

	/**
	 * Convert an OCCI attribute to an Ecore attribute.
	 * 
	 * @param attribute
	 *            the OCCI attribute to convert.
	 * @return the resulting Ecore attribute.
	 */
	protected EAttribute convertAttribute(Attribute attribute) {
		// Create an Ecore attribute.
		EAttribute eAttr = EcoreFactory.eINSTANCE.createEAttribute();
		// Set the name of the Ecore attribute.
		eAttr.setName(ConverterUtils.formatName(attribute.getName()));
		// Set the type of the Ecore attribute.
		eAttr.setEType(getMappedType(attribute.getType()));
		// Set the default value of the Ecore attribute.
		String defaultValue = attribute.getDefault();
		if (defaultValue != null && !defaultValue.isEmpty()) {
			eAttr.setDefaultValue(defaultValue);
		}
		// The Ecore attribute is required when the OCCI attribute is required.
		if (attribute.isRequired()) {
			eAttr.setLowerBound(1);
		}
		attachInfo(eAttr, "description", attribute.getDescription());
		// TODO: setUpperBound(-1) if attribute.multiple_value
		return eAttr;
	}

	private void attachInfo(EModelElement element, String key, String value) {
		EAnnotation annotation = element.getEAnnotation(EANNOTATION_SOURCE);
		if (annotation == null) {
			annotation = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation.setSource(EANNOTATION_SOURCE);
			element.getEAnnotations().add(annotation);
		}
		annotation.getDetails().put(key, value);
	}
}

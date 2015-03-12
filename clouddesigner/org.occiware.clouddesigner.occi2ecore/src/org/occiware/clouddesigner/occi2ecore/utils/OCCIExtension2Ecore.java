package org.occiware.clouddesigner.occi2ecore.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.occiware.clouddesigner.OCCI.Action;
import org.occiware.clouddesigner.OCCI.Attribute;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.Kind;

public abstract class OCCIExtension2Ecore {

	private Map<EDataType, EDataType> copiedTypes = new HashMap<EDataType, EDataType>();
	private Map<String, EClass> parentKindMappings = null;

	public abstract Map<String, EClass> initParentKindMappings();

	public EPackage convertExtension(Extension extension) {
		parentKindMappings = initParentKindMappings();
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		String formattedName = ConverterUtils.formatName(extension.getName()
				.replaceFirst("OCCI ", "").replaceFirst("OCCIware ", "")
				.toLowerCase());
		ePackage.setName(formattedName);
		ePackage.setNsPrefix(formattedName);
		ePackage.setNsURI(extension.getScheme());
		for (EDataType type : extension.getTypes()) {
			EDataType copiedType = EcoreUtil.copy(type);
			copiedTypes.put(type, copiedType);
			ePackage.getEClassifiers().add(copiedType);
		}
		for (Kind kind : extension.getKinds()) {
			ePackage.getEClassifiers().add(convertKind(kind));
		}
		// for (Mixin mixin : extension.getMixins()) {
		// ePackage.getEClassifiers().add(convertMixin(mixin));
		// }
		// resolve links
		for (Kind kind : extension.getKinds()) {
			EClass mappedEClass = parentKindMappings.get(ConverterUtils
					.getKindTerm(kind));
			String kindTerm = ConverterUtils.getKindTerm(kind.getParent());
			EClass mappedParentEClass = parentKindMappings.get(kindTerm);
			if (mappedParentEClass != null) {
				mappedEClass.getESuperTypes().add(mappedParentEClass);
			} else {
				throw new IllegalArgumentException("Not found: " + kindTerm);
			}
		}
		return ePackage;
	}

	// private EClass convertMixin(Mixin mixin) {
	// EClass eClass = EcoreFactory.eINSTANCE.createEClass();
	// eClass.setName(toU1Case(formatName(mixin.getTerm())));
	// for (Attribute attribute : mixin.getAttributes()) {
	// eClass.getEStructuralFeatures().add(convertAttribute(attribute));
	// }
	// for (Action action : mixin.getActions()) {
	// eClass.getEOperations().add(convertAction(action));
	// }
	// return eClass;
	// }

	private EClass convertKind(Kind kind) {
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(ConverterUtils.toU1Case(ConverterUtils.formatName(kind
				.getTerm())));
		for (Attribute attribute : kind.getAttributes()) {
			eClass.getEStructuralFeatures().add(convertAttribute(attribute));
		}
		for (Action action : kind.getActions()) {
			eClass.getEOperations().add(convertAction(action));
		}
		if (parentKindMappings.containsKey(kind.getTerm())) {
			throw new IllegalArgumentException("Already exists: "
					+ parentKindMappings.get(kind.getTerm()));
		} else {
			parentKindMappings.put(kind.getTerm(), eClass);
		}
		return eClass;
	}

	private EOperation convertAction(Action action) {
		EOperation eOperation = EcoreFactory.eINSTANCE.createEOperation();
		eOperation.setName(ConverterUtils.formatName(action.getTerm()));
		for (Attribute attribute : action.getAttributes()) {
			eOperation.getEParameters().add(convertParameter(attribute));
		}
		return eOperation;
	}

	private EParameter convertParameter(Attribute attribute) {
		EParameter eParam = EcoreFactory.eINSTANCE.createEParameter();
		eParam.setName(ConverterUtils.formatName(attribute.getName()));
		eParam.setEType(getActualType(attribute.getType()));
		return eParam;
	}

	private EAttribute convertAttribute(Attribute attribute) {
		EAttribute eAttr = EcoreFactory.eINSTANCE.createEAttribute();
		eAttr.setName(ConverterUtils.formatName(attribute.getName()));
		eAttr.setEType(getActualType(attribute.getType()));
		String defaultValue = attribute.getDefault();
		if (defaultValue != null) {
			eAttr.setDefaultValue(defaultValue);
		}
		return eAttr;
	}

	protected EClassifier getActualType(EDataType type) {
		EClassifier res = null;
		if (type == null) {
			res = EcorePackage.eINSTANCE.getEString();
		} else if (copiedTypes.containsKey(type)) {
			res = copiedTypes.get(type);
		} else {
			res = type;
		}
		return res;
	}

}

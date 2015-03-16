package org.occiware.clouddesigner.occi2ecore.utils;

import java.io.File;
import java.io.IOException;
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

	public static void fixMetamodelRefs(File metamodelFile) throws IOException {
		String content = ConverterUtils.readFileAsString(metamodelFile);
		content = content.replaceAll("http://schemas.ogf.org/occi#",
				"../../org.occiware.clouddesigner.occi/model/OCCI.ecore#");
		content = content
				.replaceAll(
						"http://schemas.ogf.org/occi/infrastructure#",
						"../../org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.ecore#");
		ConverterUtils.writeStringToFile(metamodelFile, content);
	}

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
			EClass convertKind = convertKind(kind);
			if (convertKind != null) {
				ePackage.getEClassifiers().add(convertKind);
			}
		}
		// for (Mixin mixin : extension.getMixins()) {
		// EClass convertMixin = convertMixin(mixin);
		// if (convertMixin != null) {
		// ePackage.getEClassifiers().add(convertMixin);
		// }
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

//	protected EClass convertMixin(Mixin mixin) {
//		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
//		eClass.setName(ConverterUtils.toU1Case(ConverterUtils.formatName(mixin
//				.getTerm())));
//		eClass.setAbstract(true);
//		for (Attribute attribute : mixin.getAttributes()) {
//			EAttribute convertAttribute = convertAttribute(attribute);
//			if (convertAttribute != null) {
//				eClass.getEStructuralFeatures().add(convertAttribute);
//			}
//		}
//		for (Action action : mixin.getActions()) {
//			EOperation convertAction = convertAction(action);
//			if (convertAction != null) {
//				eClass.getEOperations().add(convertAction);
//			}
//		}
//		return eClass;
//	}

	protected EClass convertKind(Kind kind) {
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(ConverterUtils.toU1Case(ConverterUtils.formatName(kind
				.getTerm())));
		for (Attribute attribute : kind.getAttributes()) {
			EAttribute convertAttribute = convertAttribute(attribute);
			if (convertAttribute != null) {
				eClass.getEStructuralFeatures().add(convertAttribute);
			}
		}
		for (Action action : kind.getActions()) {
			EOperation convertAction = convertAction(action);
			if (convertAction != null) {
				eClass.getEOperations().add(convertAction);
			}
		}
		if (parentKindMappings.containsKey(kind.getTerm())) {
			throw new IllegalArgumentException("Already exists: "
					+ parentKindMappings.get(kind.getTerm()));
		} else {
			parentKindMappings.put(kind.getTerm(), eClass);
		}
		return eClass;
	}

	protected EOperation convertAction(Action action) {
		EOperation eOperation = EcoreFactory.eINSTANCE.createEOperation();
		eOperation.setName(ConverterUtils.formatName(action.getTerm()));
		for (Attribute attribute : action.getAttributes()) {
			EParameter convertParameter = convertParameter(attribute);
			if (convertParameter != null) {
				eOperation.getEParameters().add(convertParameter);
			}
		}
		return eOperation;
	}

	protected EParameter convertParameter(Attribute attribute) {
		EParameter eParam = EcoreFactory.eINSTANCE.createEParameter();
		eParam.setName(ConverterUtils.formatName(attribute.getName()));
		eParam.setEType(getActualType(attribute.getType()));
		if (attribute.isRequired()) {
			eParam.setLowerBound(1);
		}
		return eParam;
	}

	protected EAttribute convertAttribute(Attribute attribute) {
		EAttribute eAttr = EcoreFactory.eINSTANCE.createEAttribute();
		eAttr.setName(ConverterUtils.formatName(attribute.getName()));
		eAttr.setEType(getActualType(attribute.getType()));
		String defaultValue = attribute.getDefault();
		if (defaultValue != null) {
			eAttr.setDefaultValue(defaultValue);
		}
		if (attribute.isRequired()) {
			eAttr.setLowerBound(1);
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

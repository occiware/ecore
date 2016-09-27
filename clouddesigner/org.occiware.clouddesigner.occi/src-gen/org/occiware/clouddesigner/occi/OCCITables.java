/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.occiware.clouddesigner.occi/model/OCCI.ecore
 * using:
 *   /org.occiware.clouddesigner.occi/model/OCCI.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.occiware.clouddesigner.occi;

import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.occiware.clouddesigner.occi.OCCITables;

/**
 * OCCITables provides the dispatch tables for the occi for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class OCCITables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OCCIPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", null, org.occiware.clouddesigner.occi.OCCIPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_PRIMid_String = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.STRING);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Action = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Action", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Attribute = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Attribute", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AttributeState = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("AttributeState", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Category = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Category", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.occiware.clouddesigner.occi.OCCITables.PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Configuration = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Configuration", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_EDataType = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EDataType", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Extension = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Extension", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Kind = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Kind", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Link = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Link", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Mixin = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Mixin", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_OclElement = org.occiware.clouddesigner.occi.OCCITables.PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_URI = org.occiware.clouddesigner.occi.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getDataTypeId("URI", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_1 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("1");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_PRIMid_String = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.STRING);
    public static final /*@NonInvalid*/ java.lang.String STR_Action_c_c_CorrectScheme = "Action::CorrectScheme";
    public static final /*@NonInvalid*/ java.lang.String STR_Category_c_c_AttributesNameUnique = "Category::AttributesNameUnique";
    public static final /*@NonInvalid*/ java.lang.String STR_Category_c_c_IdentityUnique = "Category::IdentityUnique";
    public static final /*@NonInvalid*/ java.lang.String STR_Category_c_c_SchemeEndsWithSharp = "Category::SchemeEndsWithSharp";
    public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllMixinsAreTags = "Configuration::AllMixinsAreTags";
    public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesKindsInUse = "Configuration::AllResourcesKindsInUse";
    public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesLinksKindsInUse = "Configuration::AllResourcesLinksKindsInUse";
    public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesLinksMixinsInUse = "Configuration::AllResourcesLinksMixinsInUse";
    public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesLinksTargetsInConfiguration = "Configuration::AllResourcesLinksTargetsInConfiguration";
    public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesMixinsInUse = "Configuration::AllResourcesMixinsInUse";
    public static final /*@NonInvalid*/ java.lang.String STR_Entity_c_c_AttributesNameUnique = "Entity::AttributesNameUnique";
    public static final /*@NonInvalid*/ java.lang.String STR_Entity_c_c_IdUnique = "Entity::IdUnique";
    public static final /*@NonInvalid*/ java.lang.String STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin = "Entity::KindCompatibleWithOneAppliesOfEachMixin";
    public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_KindParentLocalOrImported = "Extension::KindParentLocalOrImported";
    public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_KindsSchemeValid = "Extension::KindsSchemeValid";
    public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_MixinAppliesLocalOrImported = "Extension::MixinAppliesLocalOrImported";
    public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_MixinDependsLocalOrImported = "Extension::MixinDependsLocalOrImported";
    public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_MixinsSchemeValid = "Extension::MixinsSchemeValid";
    public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_SchemeUnique = "Extension::SchemeUnique";
    public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_TermUnicity = "Extension::TermUnicity";
    public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_ActionTermUnicity = "Kind::ActionTermUnicity";
    public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_AttributesNameNotAlreadyDefinedInParent = "Kind::AttributesNameNotAlreadyDefinedInParent";
    public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_CorrectScheme = "Kind::CorrectScheme";
    public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_EntityKindIsRootParent = "Kind::EntityKindIsRootParent";
    public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_NoCyclicInheritance = "Kind::NoCyclicInheritance";
    public static final /*@NonInvalid*/ java.lang.String STR_Link_c_c_LinkKindIsInParent = "Link::LinkKindIsInParent";
    public static final /*@NonInvalid*/ java.lang.String STR_Mixin_c_c_ActionTermUnicity = "Mixin::ActionTermUnicity";
    public static final /*@NonInvalid*/ java.lang.String STR_Mixin_c_c_AttributesNameNotAlreadyDefinedInDepends = "Mixin::AttributesNameNotAlreadyDefinedInDepends";
    public static final /*@NonInvalid*/ java.lang.String STR_Mixin_c_c_CorrectScheme = "Mixin::CorrectScheme";
    public static final /*@NonInvalid*/ java.lang.String STR_Mixin_c_c_NoCyclicInheritance = "Mixin::NoCyclicInheritance";
    public static final /*@NonInvalid*/ java.lang.String STR_Resource_c_c_ResourceKindIsInParent = "Resource::ResourceKindIsInParent";
    public static final /*@NonInvalid*/ java.lang.String STR__35 = "#";
    public static final /*@NonInvalid*/ java.lang.String STR__s_action_35 = "/action#";
    public static final /*@NonInvalid*/ java.lang.String STR_entity = "entity";
    public static final /*@NonInvalid*/ java.lang.String STR_http_c_s_s_schemas_ogf_org_s_occi_s_core_35 = "http://schemas.ogf.org/occi/core#";
    public static final /*@NonInvalid*/ java.lang.String STR_link = "link";
    public static final /*@NonInvalid*/ java.lang.String STR_quot = "/";
    public static final /*@NonInvalid*/ java.lang.String STR_resource = "resource";
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Attribute = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Attribute);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Configuration = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Configuration);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Entity = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Entity);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Extension = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Extension);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Kind = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Kind);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Link = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Link);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Mixin = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Mixin);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Action = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Action);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Attribute = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Attribute);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_AttributeState = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_AttributeState);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_EDataType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_EDataType);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Extension = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Extension);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Kind = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Kind);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Link = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Link);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Mixin = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Mixin);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Resource = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Resource);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Attribute = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Attribute);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Kind = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Kind);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Link = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Link);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Mixin = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Mixin);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_OclElement = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_OclElement);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Resource = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Resource);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Category = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Category);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Entity = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Entity);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Extension = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Extension);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Kind = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.occiware.clouddesigner.occi.OCCITables.CLSSid_Kind);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			OCCITables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Action = new EcoreExecutorType(OCCIPackage.Literals.ACTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Attribute = new EcoreExecutorType(OCCIPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AttributeState = new EcoreExecutorType(OCCIPackage.Literals.ATTRIBUTE_STATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Boolean = new EcoreExecutorType(TypeId.BOOLEAN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Category = new EcoreExecutorType(OCCIPackage.Literals.CATEGORY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Configuration = new EcoreExecutorType(OCCIPackage.Literals.CONFIGURATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Entity = new EcoreExecutorType(OCCIPackage.Literals.ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Extension = new EcoreExecutorType(OCCIPackage.Literals.EXTENSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Kind = new EcoreExecutorType(OCCIPackage.Literals.KIND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Link = new EcoreExecutorType(OCCIPackage.Literals.LINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mixin = new EcoreExecutorType(OCCIPackage.Literals.MIXIN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Number = new EcoreExecutorType("Number", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Resource = new EcoreExecutorType(OCCIPackage.Literals.RESOURCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _String = new EcoreExecutorType(TypeId.STRING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _URI = new EcoreExecutorType("URI", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_Attribute,
			_AttributeState,
			_Boolean,
			_Category,
			_Configuration,
			_Entity,
			_Extension,
			_Kind,
			_Link,
			_Mixin,
			_Number,
			_Resource,
			_String,
			_URI
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, OCCITables.Types._Action);
		private static final /*@NonNull*/ ExecutorFragment _Action__Category = new ExecutorFragment(Types._Action, OCCITables.Types._Category);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, OCCITables.Types._Attribute);
		private static final /*@NonNull*/ ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AttributeState__AttributeState = new ExecutorFragment(Types._AttributeState, OCCITables.Types._AttributeState);
		private static final /*@NonNull*/ ExecutorFragment _AttributeState__OclAny = new ExecutorFragment(Types._AttributeState, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AttributeState__OclElement = new ExecutorFragment(Types._AttributeState, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Boolean__Boolean = new ExecutorFragment(Types._Boolean, OCCITables.Types._Boolean);
		private static final /*@NonNull*/ ExecutorFragment _Boolean__OclAny = new ExecutorFragment(Types._Boolean, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Category__Category = new ExecutorFragment(Types._Category, OCCITables.Types._Category);
		private static final /*@NonNull*/ ExecutorFragment _Category__OclAny = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Category__OclElement = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Configuration__Configuration = new ExecutorFragment(Types._Configuration, OCCITables.Types._Configuration);
		private static final /*@NonNull*/ ExecutorFragment _Configuration__OclAny = new ExecutorFragment(Types._Configuration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Configuration__OclElement = new ExecutorFragment(Types._Configuration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Extension__Extension = new ExecutorFragment(Types._Extension, OCCITables.Types._Extension);
		private static final /*@NonNull*/ ExecutorFragment _Extension__OclAny = new ExecutorFragment(Types._Extension, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Extension__OclElement = new ExecutorFragment(Types._Extension, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Kind__Category = new ExecutorFragment(Types._Kind, OCCITables.Types._Category);
		private static final /*@NonNull*/ ExecutorFragment _Kind__Kind = new ExecutorFragment(Types._Kind, OCCITables.Types._Kind);
		private static final /*@NonNull*/ ExecutorFragment _Kind__OclAny = new ExecutorFragment(Types._Kind, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Kind__OclElement = new ExecutorFragment(Types._Kind, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Link__Entity = new ExecutorFragment(Types._Link, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Link__Link = new ExecutorFragment(Types._Link, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Link__OclAny = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Link__OclElement = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mixin__Category = new ExecutorFragment(Types._Mixin, OCCITables.Types._Category);
		private static final /*@NonNull*/ ExecutorFragment _Mixin__Mixin = new ExecutorFragment(Types._Mixin, OCCITables.Types._Mixin);
		private static final /*@NonNull*/ ExecutorFragment _Mixin__OclAny = new ExecutorFragment(Types._Mixin, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mixin__OclElement = new ExecutorFragment(Types._Mixin, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Number__Number = new ExecutorFragment(Types._Number, OCCITables.Types._Number);
		private static final /*@NonNull*/ ExecutorFragment _Number__OclAny = new ExecutorFragment(Types._Number, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Resource__Entity = new ExecutorFragment(Types._Resource, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Resource__OclAny = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Resource__OclElement = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Resource__Resource = new ExecutorFragment(Types._Resource, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _String__OclAny = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _String__OclComparable = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _String__OclElement = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _String__OclSummable = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _String__String = new ExecutorFragment(Types._String, OCCITables.Types._String);

		private static final /*@NonNull*/ ExecutorFragment _URI__OclAny = new ExecutorFragment(Types._URI, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _URI__URI = new ExecutorFragment(Types._URI, OCCITables.Types._URI);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final /*@NonNull*/ ParameterTypes _Boolean = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Boolean);
		public static final /*@NonNull*/ ParameterTypes _Integer = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _Integer___Integer = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Integer, OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _OclAny___OclAny___OclAny___Integer___Boolean___Integer = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._Integer, OCLstdlibTables.Types._Boolean, OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _OclAny___OclAny___OclAny___OclAny___String___Integer___OclAny___Integer = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._String, OCLstdlibTables.Types._Integer, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _OclSelf = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclSelf);
		public static final /*@NonNull*/ ParameterTypes _String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _String___Boolean = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String, OCLstdlibTables.Types._Boolean);
		public static final /*@NonNull*/ ParameterTypes _String___String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String, OCLstdlibTables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Boolean___lt__gt_ = new ExecutorOperation("<>", Parameters._OclSelf, Types._Boolean,
			0, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean___eq_ = new ExecutorOperation("=", Parameters._OclSelf, Types._Boolean,
			1, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__and = new ExecutorOperation("and", Parameters._Boolean, Types._Boolean,
			2, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanAndOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__implies = new ExecutorOperation("implies", Parameters._Boolean, Types._Boolean,
			3, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__not = new ExecutorOperation("not", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Boolean,
			4, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanNotOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__or = new ExecutorOperation("or", Parameters._Boolean, Types._Boolean,
			5, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanOrOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__xor = new ExecutorOperation("xor", Parameters._Boolean, Types._Boolean,
			6, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanXorOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__allInstances = new ExecutorOperation("allInstances", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Boolean,
			7, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanAllInstancesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Boolean,
			8, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);

		public static final /*@NonNull*/ ExecutorOperation _Entity__occiCreate = new ExecutorOperation("occiCreate", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Entity,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Entity__occiDelete = new ExecutorOperation("occiDelete", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Entity,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Entity__occiRetrieve = new ExecutorOperation("occiRetrieve", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Entity,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Entity__occiUpdate = new ExecutorOperation("occiUpdate", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Entity,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _String___add_ = new ExecutorOperation("+", Parameters._String, Types._String,
			0, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___lt_ = new ExecutorOperation("<", Parameters._OclSelf, Types._String,
			1, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringLessThanOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___lt__eq_ = new ExecutorOperation("<=", Parameters._OclSelf, Types._String,
			2, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringLessThanEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___lt__gt_ = new ExecutorOperation("<>", Parameters._OclSelf, Types._String,
			3, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___eq_ = new ExecutorOperation("=", Parameters._OclSelf, Types._String,
			4, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___gt_ = new ExecutorOperation(">", Parameters._OclSelf, Types._String,
			5, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringGreaterThanOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___gt__eq_ = new ExecutorOperation(">=", Parameters._OclSelf, Types._String,
			6, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringGreaterThanEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__at = new ExecutorOperation("at", Parameters._Integer, Types._String,
			7, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringAtOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__characters = new ExecutorOperation("characters", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			8, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringCharactersOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._String,
			9, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringCompareToOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__concat = new ExecutorOperation("concat", Parameters._String, Types._String,
			10, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__endsWith = new ExecutorOperation("endsWith", Parameters._String, Types._String,
			11, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringEndsWithOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__equalsIgnoreCase = new ExecutorOperation("equalsIgnoreCase", Parameters._String, Types._String,
			12, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__getSeverity = new ExecutorOperation("getSeverity", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			13, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__indexOf = new ExecutorOperation("indexOf", Parameters._String, Types._String,
			14, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringIndexOfOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__lastIndexOf = new ExecutorOperation("lastIndexOf", Parameters._String, Types._String,
			15, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__0_logDiagnostic = new ExecutorOperation("logDiagnostic", Parameters._OclAny___OclAny___OclAny___Integer___Boolean___Integer, Types._String,
			16, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__1_logDiagnostic = new ExecutorOperation("logDiagnostic", Parameters._OclAny___OclAny___OclAny___OclAny___String___Integer___OclAny___Integer, Types._String,
			17, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__matches = new ExecutorOperation("matches", Parameters._String, Types._String,
			18, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringMatchesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__replaceAll = new ExecutorOperation("replaceAll", Parameters._String___String, Types._String,
			19, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringReplaceAllOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__replaceFirst = new ExecutorOperation("replaceFirst", Parameters._String___String, Types._String,
			20, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringReplaceFirstOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__size = new ExecutorOperation("size", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			21, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringSizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__startsWith = new ExecutorOperation("startsWith", Parameters._String, Types._String,
			22, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringStartsWithOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__substituteAll = new ExecutorOperation("substituteAll", Parameters._String___String, Types._String,
			23, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringSubstituteAllOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__substituteFirst = new ExecutorOperation("substituteFirst", Parameters._String___String, Types._String,
			24, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringSubstituteFirstOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__substring = new ExecutorOperation("substring", Parameters._Integer___Integer, Types._String,
			25, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringSubstringOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toBoolean = new ExecutorOperation("toBoolean", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			26, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToBooleanOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toInteger = new ExecutorOperation("toInteger", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			27, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToIntegerOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toLower = new ExecutorOperation("toLower", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			28, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toLowerCase = new ExecutorOperation("toLowerCase", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			29, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toReal = new ExecutorOperation("toReal", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			30, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToRealOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			31, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toUpper = new ExecutorOperation("toUpper", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			32, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toUpperCase = new ExecutorOperation("toUpperCase", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			33, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__0_tokenize = new ExecutorOperation("tokenize", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			34, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringTokenizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__1_tokenize = new ExecutorOperation("tokenize", Parameters._String, Types._String,
			35, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringTokenizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__2_tokenize = new ExecutorOperation("tokenize", Parameters._String___Boolean, Types._String,
			36, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringTokenizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__trim = new ExecutorOperation("trim", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			37, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringTrimOperation.INSTANCE);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Action__Kind__actions = new ExecutorPropertyWithImplementation("Kind", Types._Action, 0, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.KIND__ACTIONS));
		public static final /*@NonNull*/ ExecutorProperty _Action__Mixin__actions = new ExecutorPropertyWithImplementation("Mixin", Types._Action, 1, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN__ACTIONS));

		public static final /*@NonNull*/ ExecutorProperty _Attribute__default = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__DEFAULT, Types._Attribute, 0);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__description = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__DESCRIPTION, Types._Attribute, 1);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__multiple_values = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__MULTIPLE_VALUES, Types._Attribute, 2);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__mutable = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__MUTABLE, Types._Attribute, 3);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__name = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__NAME, Types._Attribute, 4);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__required = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__REQUIRED, Types._Attribute, 5);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__type = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 6);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__Category__attributes = new ExecutorPropertyWithImplementation("Category", Types._Attribute, 7, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CATEGORY__ATTRIBUTES));

		public static final /*@NonNull*/ ExecutorProperty _AttributeState__name = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE_STATE__NAME, Types._AttributeState, 0);
		public static final /*@NonNull*/ ExecutorProperty _AttributeState__value = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE_STATE__VALUE, Types._AttributeState, 1);
		public static final /*@NonNull*/ ExecutorProperty _AttributeState__Entity__attributes = new ExecutorPropertyWithImplementation("Entity", Types._AttributeState, 2, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ENTITY__ATTRIBUTES));

		public static final /*@NonNull*/ ExecutorProperty _Category__attributes = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__ATTRIBUTES, Types._Category, 0);
		public static final /*@NonNull*/ ExecutorProperty _Category__scheme = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__SCHEME, Types._Category, 1);
		public static final /*@NonNull*/ ExecutorProperty _Category__term = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__TERM, Types._Category, 2);
		public static final /*@NonNull*/ ExecutorProperty _Category__title = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__TITLE, Types._Category, 3);

		public static final /*@NonNull*/ ExecutorProperty _Configuration__description = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__DESCRIPTION, Types._Configuration, 0);
		public static final /*@NonNull*/ ExecutorProperty _Configuration__location = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__LOCATION, Types._Configuration, 1);
		public static final /*@NonNull*/ ExecutorProperty _Configuration__mixins = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__MIXINS, Types._Configuration, 2);
		public static final /*@NonNull*/ ExecutorProperty _Configuration__resources = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__RESOURCES, Types._Configuration, 3);
		public static final /*@NonNull*/ ExecutorProperty _Configuration__use = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__USE, Types._Configuration, 4);

		public static final /*@NonNull*/ ExecutorProperty _Entity__attributes = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__ATTRIBUTES, Types._Entity, 0);
		public static final /*@NonNull*/ ExecutorProperty _Entity__id = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__ID, Types._Entity, 1);
		public static final /*@NonNull*/ ExecutorProperty _Entity__kind = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__KIND, Types._Entity, 2);
		public static final /*@NonNull*/ ExecutorProperty _Entity__mixins = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__MIXINS, Types._Entity, 3);
		public static final /*@NonNull*/ ExecutorProperty _Entity__title = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__TITLE, Types._Entity, 4);
		public static final /*@NonNull*/ ExecutorProperty _Entity__Kind__entities = new ExecutorPropertyWithImplementation("Kind", Types._Entity, 5, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.KIND__ENTITIES));
		public static final /*@NonNull*/ ExecutorProperty _Entity__Mixin__entities = new ExecutorPropertyWithImplementation("Mixin", Types._Entity, 6, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN__ENTITIES));

		public static final /*@NonNull*/ ExecutorProperty _Extension__description = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__DESCRIPTION, Types._Extension, 0);
		public static final /*@NonNull*/ ExecutorProperty _Extension__import = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__IMPORT, Types._Extension, 1);
		public static final /*@NonNull*/ ExecutorProperty _Extension__kinds = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__KINDS, Types._Extension, 2);
		public static final /*@NonNull*/ ExecutorProperty _Extension__mixins = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__MIXINS, Types._Extension, 3);
		public static final /*@NonNull*/ ExecutorProperty _Extension__name = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__NAME, Types._Extension, 4);
		public static final /*@NonNull*/ ExecutorProperty _Extension__scheme = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__SCHEME, Types._Extension, 5);
		public static final /*@NonNull*/ ExecutorProperty _Extension__types = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__TYPES, Types._Extension, 6);
		public static final /*@NonNull*/ ExecutorProperty _Extension__Configuration__use = new ExecutorPropertyWithImplementation("Configuration", Types._Extension, 7, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CONFIGURATION__USE));
		public static final /*@NonNull*/ ExecutorProperty _Extension__Extension__import = new ExecutorPropertyWithImplementation("Extension", Types._Extension, 8, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.EXTENSION__IMPORT));

		public static final /*@NonNull*/ ExecutorProperty _Kind__actions = new EcoreExecutorProperty(OCCIPackage.Literals.KIND__ACTIONS, Types._Kind, 0);
		public static final /*@NonNull*/ ExecutorProperty _Kind__entities = new EcoreExecutorProperty(OCCIPackage.Literals.KIND__ENTITIES, Types._Kind, 1);
		public static final /*@NonNull*/ ExecutorProperty _Kind__parent = new EcoreExecutorProperty(OCCIPackage.Literals.KIND__PARENT, Types._Kind, 2);
		public static final /*@NonNull*/ ExecutorProperty _Kind__Entity__kind = new ExecutorPropertyWithImplementation("Entity", Types._Kind, 3, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ENTITY__KIND));
		public static final /*@NonNull*/ ExecutorProperty _Kind__Extension__kinds = new ExecutorPropertyWithImplementation("Extension", Types._Kind, 4, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.EXTENSION__KINDS));
		public static final /*@NonNull*/ ExecutorProperty _Kind__Kind__parent = new ExecutorPropertyWithImplementation("Kind", Types._Kind, 5, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.KIND__PARENT));
		public static final /*@NonNull*/ ExecutorProperty _Kind__Mixin__applies = new ExecutorPropertyWithImplementation("Mixin", Types._Kind, 6, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN__APPLIES));

		public static final /*@NonNull*/ ExecutorProperty _Link__source = new EcoreExecutorProperty(OCCIPackage.Literals.LINK__SOURCE, Types._Link, 0);
		public static final /*@NonNull*/ ExecutorProperty _Link__target = new EcoreExecutorProperty(OCCIPackage.Literals.LINK__TARGET, Types._Link, 1);

		public static final /*@NonNull*/ ExecutorProperty _Mixin__actions = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN__ACTIONS, Types._Mixin, 0);
		public static final /*@NonNull*/ ExecutorProperty _Mixin__applies = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN__APPLIES, Types._Mixin, 1);
		public static final /*@NonNull*/ ExecutorProperty _Mixin__depends = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN__DEPENDS, Types._Mixin, 2);
		public static final /*@NonNull*/ ExecutorProperty _Mixin__entities = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN__ENTITIES, Types._Mixin, 3);
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Configuration__mixins = new ExecutorPropertyWithImplementation("Configuration", Types._Mixin, 4, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CONFIGURATION__MIXINS));
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Entity__mixins = new ExecutorPropertyWithImplementation("Entity", Types._Mixin, 5, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ENTITY__MIXINS));
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Extension__mixins = new ExecutorPropertyWithImplementation("Extension", Types._Mixin, 6, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.EXTENSION__MIXINS));
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Mixin__depends = new ExecutorPropertyWithImplementation("Mixin", Types._Mixin, 7, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN__DEPENDS));

		public static final /*@NonNull*/ ExecutorProperty _Resource__links = new EcoreExecutorProperty(OCCIPackage.Literals.RESOURCE__LINKS, Types._Resource, 0);
		public static final /*@NonNull*/ ExecutorProperty _Resource__summary = new EcoreExecutorProperty(OCCIPackage.Literals.RESOURCE__SUMMARY, Types._Resource, 1);
		public static final /*@NonNull*/ ExecutorProperty _Resource__Configuration__resources = new ExecutorPropertyWithImplementation("Configuration", Types._Resource, 2, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CONFIGURATION__RESOURCES));
		public static final /*@NonNull*/ ExecutorProperty _Resource__Link__target = new ExecutorPropertyWithImplementation("Link", Types._Resource, 3, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.LINK__TARGET));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Action =
		{
			Fragments._Action__OclAny /* 0 */,
			Fragments._Action__OclElement /* 1 */,
			Fragments._Action__Category /* 2 */,
			Fragments._Action__Action /* 3 */
		};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Attribute =
		{
			Fragments._Attribute__OclAny /* 0 */,
			Fragments._Attribute__OclElement /* 1 */,
			Fragments._Attribute__Attribute /* 2 */
		};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AttributeState =
		{
			Fragments._AttributeState__OclAny /* 0 */,
			Fragments._AttributeState__OclElement /* 1 */,
			Fragments._AttributeState__AttributeState /* 2 */
		};
		private static final int /*@NonNull*/ [] __AttributeState = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Boolean =
		{
			Fragments._Boolean__OclAny /* 0 */,
			Fragments._Boolean__Boolean /* 1 */
		};
		private static final int /*@NonNull*/ [] __Boolean = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Category =
		{
			Fragments._Category__OclAny /* 0 */,
			Fragments._Category__OclElement /* 1 */,
			Fragments._Category__Category /* 2 */
		};
		private static final int /*@NonNull*/ [] __Category = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Configuration =
		{
			Fragments._Configuration__OclAny /* 0 */,
			Fragments._Configuration__OclElement /* 1 */,
			Fragments._Configuration__Configuration /* 2 */
		};
		private static final int /*@NonNull*/ [] __Configuration = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Entity =
		{
			Fragments._Entity__OclAny /* 0 */,
			Fragments._Entity__OclElement /* 1 */,
			Fragments._Entity__Entity /* 2 */
		};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Extension =
		{
			Fragments._Extension__OclAny /* 0 */,
			Fragments._Extension__OclElement /* 1 */,
			Fragments._Extension__Extension /* 2 */
		};
		private static final int /*@NonNull*/ [] __Extension = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Kind =
		{
			Fragments._Kind__OclAny /* 0 */,
			Fragments._Kind__OclElement /* 1 */,
			Fragments._Kind__Category /* 2 */,
			Fragments._Kind__Kind /* 3 */
		};
		private static final int /*@NonNull*/ [] __Kind = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Link =
		{
			Fragments._Link__OclAny /* 0 */,
			Fragments._Link__OclElement /* 1 */,
			Fragments._Link__Entity /* 2 */,
			Fragments._Link__Link /* 3 */
		};
		private static final int /*@NonNull*/ [] __Link = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mixin =
		{
			Fragments._Mixin__OclAny /* 0 */,
			Fragments._Mixin__OclElement /* 1 */,
			Fragments._Mixin__Category /* 2 */,
			Fragments._Mixin__Mixin /* 3 */
		};
		private static final int /*@NonNull*/ [] __Mixin = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Number =
		{
			Fragments._Number__OclAny /* 0 */,
			Fragments._Number__Number /* 1 */
		};
		private static final int /*@NonNull*/ [] __Number = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Resource =
		{
			Fragments._Resource__OclAny /* 0 */,
			Fragments._Resource__OclElement /* 1 */,
			Fragments._Resource__Entity /* 2 */,
			Fragments._Resource__Resource /* 3 */
		};
		private static final int /*@NonNull*/ [] __Resource = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _String =
		{
			Fragments._String__OclAny /* 0 */,
			Fragments._String__OclComparable /* 1 */,
			Fragments._String__OclElement /* 1 */,
			Fragments._String__OclSummable /* 1 */,
			Fragments._String__String /* 2 */
		};
		private static final int /*@NonNull*/ [] __String = { 1,3,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _URI =
		{
			Fragments._URI__OclAny /* 0 */,
			Fragments._URI__URI /* 1 */
		};
		private static final int /*@NonNull*/ [] __URI = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._AttributeState.initFragments(_AttributeState, __AttributeState);
			Types._Boolean.initFragments(_Boolean, __Boolean);
			Types._Category.initFragments(_Category, __Category);
			Types._Configuration.initFragments(_Configuration, __Configuration);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._Extension.initFragments(_Extension, __Extension);
			Types._Kind.initFragments(_Kind, __Kind);
			Types._Link.initFragments(_Link, __Link);
			Types._Mixin.initFragments(_Mixin, __Mixin);
			Types._Number.initFragments(_Number, __Number);
			Types._Resource.initFragments(_Resource, __Resource);
			Types._String.initFragments(_String, __String);
			Types._URI.initFragments(_URI, __URI);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__Category = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AttributeState__AttributeState = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AttributeState__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AttributeState__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Boolean__Boolean = {
			OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._Boolean__and /* _'and'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__implies /* _'implies'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__not /* _'not'() */,
			OCLstdlibTables.Operations._Boolean__or /* _'or'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__xor /* _'xor'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._Boolean__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Boolean__OclAny = {
			OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._Boolean__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Category__Category = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Category__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Category__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configuration__Configuration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configuration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configuration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Extension__Extension = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Extension__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Extension__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__Kind = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__Category = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__Mixin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__Category = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Number__Number = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Number__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _String__String = {
			OCLstdlibTables.Operations._String___add_ /* _'+'(String[?]) */,
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__at /* at(Integer[?]) */,
			OCLstdlibTables.Operations._String__characters /* characters() */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__concat /* concat(String[?]) */,
			OCLstdlibTables.Operations._String__endsWith /* endsWith(String[?]) */,
			OCLstdlibTables.Operations._String__equalsIgnoreCase /* equalsIgnoreCase(String[?]) */,
//			OCLstdlibTables.Operations._String__getSeverity /* getSeverity() */,
			OCLstdlibTables.Operations._String__indexOf /* indexOf(String[?]) */,
			OCLstdlibTables.Operations._String__lastIndexOf /* lastIndexOf(String[?]) */,
//			OCLstdlibTables.Operations._String__0_logDiagnostic /* logDiagnostic(OclAny[1],OclAny[?],OclAny[?],Integer[1],Boolean[?],Integer[1]) */,
//			OCLstdlibTables.Operations._String__1_logDiagnostic /* logDiagnostic(OclAny[1],OclAny[?],OclAny[?],OclAny[?],String[?],Integer[1],OclAny[?],Integer[1]) */,
			OCLstdlibTables.Operations._String__matches /* matches(String[?]) */,
			OCLstdlibTables.Operations._String__replaceAll /* replaceAll(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__replaceFirst /* replaceFirst(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__size /* size() */,
			OCLstdlibTables.Operations._String__startsWith /* startsWith(String[?]) */,
			OCLstdlibTables.Operations._String__substituteAll /* substituteAll(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__substituteFirst /* substituteFirst(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__substring /* substring(Integer[?],Integer[?]) */,
			OCLstdlibTables.Operations._String__toBoolean /* toBoolean() */,
			OCLstdlibTables.Operations._String__toInteger /* toInteger() */,
			OCLstdlibTables.Operations._String__toLower /* toLower() */,
			OCLstdlibTables.Operations._String__toLowerCase /* toLowerCase() */,
			OCLstdlibTables.Operations._String__toReal /* toReal() */,
			OCLstdlibTables.Operations._String__toString /* toString() */,
			OCLstdlibTables.Operations._String__toUpper /* toUpper() */,
			OCLstdlibTables.Operations._String__toUpperCase /* toUpperCase() */,
			OCLstdlibTables.Operations._String__0_tokenize /* tokenize() */,
			OCLstdlibTables.Operations._String__1_tokenize /* tokenize(String[?]) */,
			OCLstdlibTables.Operations._String__2_tokenize /* tokenize(String[?],Boolean[?]) */,
			OCLstdlibTables.Operations._String__trim /* trim() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _String__OclAny = {
			OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._String__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _String__OclComparable = {
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _String__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _String__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _URI__URI = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _URI__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__Category.initOperations(_Action__Category);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._AttributeState__AttributeState.initOperations(_AttributeState__AttributeState);
			Fragments._AttributeState__OclAny.initOperations(_AttributeState__OclAny);
			Fragments._AttributeState__OclElement.initOperations(_AttributeState__OclElement);

			Fragments._Boolean__Boolean.initOperations(_Boolean__Boolean);
			Fragments._Boolean__OclAny.initOperations(_Boolean__OclAny);

			Fragments._Category__Category.initOperations(_Category__Category);
			Fragments._Category__OclAny.initOperations(_Category__OclAny);
			Fragments._Category__OclElement.initOperations(_Category__OclElement);

			Fragments._Configuration__Configuration.initOperations(_Configuration__Configuration);
			Fragments._Configuration__OclAny.initOperations(_Configuration__OclAny);
			Fragments._Configuration__OclElement.initOperations(_Configuration__OclElement);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._Extension__Extension.initOperations(_Extension__Extension);
			Fragments._Extension__OclAny.initOperations(_Extension__OclAny);
			Fragments._Extension__OclElement.initOperations(_Extension__OclElement);

			Fragments._Kind__Category.initOperations(_Kind__Category);
			Fragments._Kind__Kind.initOperations(_Kind__Kind);
			Fragments._Kind__OclAny.initOperations(_Kind__OclAny);
			Fragments._Kind__OclElement.initOperations(_Kind__OclElement);

			Fragments._Link__Entity.initOperations(_Link__Entity);
			Fragments._Link__Link.initOperations(_Link__Link);
			Fragments._Link__OclAny.initOperations(_Link__OclAny);
			Fragments._Link__OclElement.initOperations(_Link__OclElement);

			Fragments._Mixin__Category.initOperations(_Mixin__Category);
			Fragments._Mixin__Mixin.initOperations(_Mixin__Mixin);
			Fragments._Mixin__OclAny.initOperations(_Mixin__OclAny);
			Fragments._Mixin__OclElement.initOperations(_Mixin__OclElement);

			Fragments._Number__Number.initOperations(_Number__Number);
			Fragments._Number__OclAny.initOperations(_Number__OclAny);

			Fragments._Resource__Entity.initOperations(_Resource__Entity);
			Fragments._Resource__OclAny.initOperations(_Resource__OclAny);
			Fragments._Resource__OclElement.initOperations(_Resource__OclElement);
			Fragments._Resource__Resource.initOperations(_Resource__Resource);

			Fragments._String__OclAny.initOperations(_String__OclAny);
			Fragments._String__OclComparable.initOperations(_String__OclComparable);
			Fragments._String__OclElement.initOperations(_String__OclElement);
			Fragments._String__OclSummable.initOperations(_String__OclSummable);
			Fragments._String__String.initOperations(_String__String);

			Fragments._URI__OclAny.initOperations(_URI__OclAny);
			Fragments._URI__URI.initOperations(_URI__URI);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Action = {
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title,
			OCCITables.Properties._Action__Kind__actions,
			OCCITables.Properties._Action__Mixin__actions
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Attribute = {
			OCCITables.Properties._Attribute__default,
			OCCITables.Properties._Attribute__description,
			OCCITables.Properties._Attribute__multiple_values,
			OCCITables.Properties._Attribute__mutable,
			OCCITables.Properties._Attribute__name,
			OCCITables.Properties._Attribute__required,
			OCCITables.Properties._Attribute__type,
			OCCITables.Properties._Attribute__Category__attributes
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AttributeState = {
			OCCITables.Properties._AttributeState__name,
			OCCITables.Properties._AttributeState__value,
			OCCITables.Properties._AttributeState__Entity__attributes
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Boolean = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Category = {
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Configuration = {
			OCCITables.Properties._Configuration__description,
			OCCITables.Properties._Configuration__location,
			OCCITables.Properties._Configuration__mixins,
			OCCITables.Properties._Configuration__resources,
			OCCITables.Properties._Configuration__use
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Entity = {
			OCCITables.Properties._Entity__attributes,
			OCCITables.Properties._Entity__id,
			OCCITables.Properties._Entity__kind,
			OCCITables.Properties._Entity__mixins,
			OCCITables.Properties._Entity__title,
			OCCITables.Properties._Entity__Kind__entities,
			OCCITables.Properties._Entity__Mixin__entities
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Extension = {
			OCCITables.Properties._Extension__description,
			OCCITables.Properties._Extension__import,
			OCCITables.Properties._Extension__kinds,
			OCCITables.Properties._Extension__mixins,
			OCCITables.Properties._Extension__name,
			OCCITables.Properties._Extension__scheme,
			OCCITables.Properties._Extension__types,
			OCCITables.Properties._Extension__Configuration__use,
			OCCITables.Properties._Extension__Extension__import
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Kind = {
			OCCITables.Properties._Kind__actions,
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Kind__entities,
			OCCITables.Properties._Kind__parent,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title,
			OCCITables.Properties._Kind__Entity__kind,
			OCCITables.Properties._Kind__Extension__kinds,
			OCCITables.Properties._Kind__Kind__parent,
			OCCITables.Properties._Kind__Mixin__applies
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Link = {
			OCCITables.Properties._Entity__attributes,
			OCCITables.Properties._Entity__id,
			OCCITables.Properties._Entity__kind,
			OCCITables.Properties._Entity__mixins,
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target,
			OCCITables.Properties._Entity__title,
			OCCITables.Properties._Entity__Kind__entities,
			OCCITables.Properties._Entity__Mixin__entities
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mixin = {
			OCCITables.Properties._Mixin__actions,
			OCCITables.Properties._Mixin__applies,
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Mixin__depends,
			OCCITables.Properties._Mixin__entities,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title,
			OCCITables.Properties._Mixin__Configuration__mixins,
			OCCITables.Properties._Mixin__Entity__mixins,
			OCCITables.Properties._Mixin__Extension__mixins,
			OCCITables.Properties._Mixin__Mixin__depends
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Number = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Resource = {
			OCCITables.Properties._Entity__attributes,
			OCCITables.Properties._Entity__id,
			OCCITables.Properties._Entity__kind,
			OCCITables.Properties._Resource__links,
			OCCITables.Properties._Entity__mixins,
			OCCITables.Properties._Resource__summary,
			OCCITables.Properties._Entity__title,
			OCCITables.Properties._Resource__Configuration__resources,
			OCCITables.Properties._Entity__Kind__entities,
			OCCITables.Properties._Resource__Link__target,
			OCCITables.Properties._Entity__Mixin__entities
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _String = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _URI = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._AttributeState__AttributeState.initProperties(_AttributeState);
			Fragments._Boolean__Boolean.initProperties(_Boolean);
			Fragments._Category__Category.initProperties(_Category);
			Fragments._Configuration__Configuration.initProperties(_Configuration);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._Extension__Extension.initProperties(_Extension);
			Fragments._Kind__Kind.initProperties(_Kind);
			Fragments._Link__Link.initProperties(_Link);
			Fragments._Mixin__Mixin.initProperties(_Mixin);
			Fragments._Number__Number.initProperties(_Number);
			Fragments._Resource__Resource.initProperties(_Resource);
			Fragments._String__String.initProperties(_String);
			Fragments._URI__URI.initProperties(_URI);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}

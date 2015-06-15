/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   platform:/resource/org.occiware.clouddesigner.occi/model/OCCI.ecore
 * using:
 *   platform:/resource/org.occiware.clouddesigner.occi/model/OCCI.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.occiware.clouddesigner.occi;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.examples.domain.elements.DomainParameterTypes;
import org.eclipse.ocl.examples.domain.elements.DomainTypeParameters;
import org.eclipse.ocl.examples.domain.ids.ClassId;
import org.eclipse.ocl.examples.domain.ids.CollectionTypeId;
import org.eclipse.ocl.examples.domain.ids.DataTypeId;
import org.eclipse.ocl.examples.domain.ids.IdManager;
import org.eclipse.ocl.examples.domain.ids.MetaclassId;
import org.eclipse.ocl.examples.domain.ids.NsURIPackageId;
import org.eclipse.ocl.examples.domain.ids.RootPackageId;
import org.eclipse.ocl.examples.domain.ids.TypeId;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.examples.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.examples.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;

/**
 * OCCITables provides the dispatch tables for the occi for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class OCCITables
{
	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OCCIPackage.eINSTANCE, null);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
    public static final /*@NonNull*/ /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi = IdManager.getNsURIPackageId("http://schemas.ogf.org/occi", null, OCCIPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Action = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Action", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Attribute = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Attribute", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_AttributeState = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("AttributeState", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Category = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Category", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Configuration = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Configuration", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_EDataType = OCCITables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getClassId("EDataType", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Entity = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Entity", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Extension = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Extension", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Kind = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Kind", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Link = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Link", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Mixin = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Mixin", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_OclElement = OCCITables.PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Resource = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Resource", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_URI = OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getDataTypeId("URI", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Configuration = TypeId.BAG.getSpecializedId(OCCITables.CLSSid_Configuration);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Entity = TypeId.BAG.getSpecializedId(OCCITables.CLSSid_Entity);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Extension = TypeId.BAG.getSpecializedId(OCCITables.CLSSid_Extension);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Kind = TypeId.BAG.getSpecializedId(OCCITables.CLSSid_Kind);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Link = TypeId.BAG.getSpecializedId(OCCITables.CLSSid_Link);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Mixin = TypeId.BAG.getSpecializedId(OCCITables.CLSSid_Mixin);
    public static final /*@NonNull*/ /*@NonInvalid*/ MetaclassId METAid_Metaclass = TypeId.METACLASS.getSpecializedId(OCCITables.CLSSid_Entity);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Action = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_Action);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Attribute = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_Attribute);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_AttributeState = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_AttributeState);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EDataType = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_EDataType);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entity = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_Entity);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Extension = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_Extension);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Kind = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_Kind);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Link = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_Link);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Mixin = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_Mixin);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Resource = TypeId.ORDERED_SET.getSpecializedId(OCCITables.CLSSid_Resource);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Link = TypeId.SEQUENCE.getSpecializedId(OCCITables.CLSSid_Link);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Resource = TypeId.SEQUENCE.getSpecializedId(OCCITables.CLSSid_Resource);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Entity = TypeId.SET.getSpecializedId(OCCITables.CLSSid_Entity);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		public static final /*@NonNull*/ EcoreExecutorType _Action = new EcoreExecutorType(OCCIPackage.Literals.ACTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Attribute = new EcoreExecutorType(OCCIPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AttributeState = new EcoreExecutorType(OCCIPackage.Literals.ATTRIBUTE_STATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Boolean = new EcoreExecutorType(TypeId.BOOLEAN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Category = new EcoreExecutorType(OCCIPackage.Literals.CATEGORY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Configuration = new EcoreExecutorType(OCCIPackage.Literals.CONFIGURATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Entity = new EcoreExecutorType(OCCIPackage.Literals.ENTITY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Extension = new EcoreExecutorType(OCCIPackage.Literals.EXTENSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Kind = new EcoreExecutorType(OCCIPackage.Literals.KIND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Link = new EcoreExecutorType(OCCIPackage.Literals.LINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mixin = new EcoreExecutorType(OCCIPackage.Literals.MIXIN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Number = new EcoreExecutorType("Number", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Resource = new EcoreExecutorType(OCCIPackage.Literals.RESOURCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _String = new EcoreExecutorType(TypeId.STRING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _URI = new EcoreExecutorType("URI", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType[] types = {
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
			TypeFragments.init();
			FragmentOperations.init();
			FragmentProperties.init();
		}

		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
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

		private static final /*@NonNull*/ ExecutorFragment _Boolean__Boolean = new ExecutorFragment(Types._Boolean, OCLstdlibTables.Types._Boolean);
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
		private static final /*@NonNull*/ ExecutorFragment _String__OclSummable = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _String__String = new ExecutorFragment(Types._String, OCLstdlibTables.Types._String);

		private static final /*@NonNull*/ ExecutorFragment _URI__OclAny = new ExecutorFragment(Types._URI, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _URI__URI = new ExecutorFragment(Types._URI, OCCITables.Types._URI);

		/*
		 * Force initialization.
		 */
		public static void init() {
			Types.init();
		}
	}

	/**
	 *	The parameter lists shared by operations.
	 */
	public static class Parameters {
		public static final /*@NonNull*/ DomainParameterTypes _ = new DomainParameterTypes();
		public static final /*@NonNull*/ DomainParameterTypes _Boolean = new DomainParameterTypes(OCLstdlibTables.Types._Boolean);
		public static final /*@NonNull*/ DomainParameterTypes _Integer = new DomainParameterTypes(OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ DomainParameterTypes _Integer___Integer = new DomainParameterTypes(OCLstdlibTables.Types._Integer, OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ DomainParameterTypes _OclSelf = new DomainParameterTypes(OCLstdlibTables.Types._OclSelf);
		public static final /*@NonNull*/ DomainParameterTypes _String = new DomainParameterTypes(OCLstdlibTables.Types._String);
		public static final /*@NonNull*/ DomainParameterTypes _String___Boolean = new DomainParameterTypes(OCLstdlibTables.Types._String, OCLstdlibTables.Types._Boolean);
		public static final /*@NonNull*/ DomainParameterTypes _String___String = new DomainParameterTypes(OCLstdlibTables.Types._String, OCLstdlibTables.Types._String);
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
		public static final /*@NonNull*/ ExecutorOperation _Boolean___lt__gt_ = new ExecutorOperation("<>", Parameters._OclSelf, Types._Boolean,
			0, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean___eq_ = new ExecutorOperation("=", Parameters._OclSelf, Types._Boolean,
			1, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__and = new ExecutorOperation("and", Parameters._Boolean, Types._Boolean,
			2, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.logical.BooleanAndOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__implies = new ExecutorOperation("implies", Parameters._Boolean, Types._Boolean,
			3, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.logical.BooleanImpliesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__not = new ExecutorOperation("not", Parameters._, Types._Boolean,
			4, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.logical.BooleanNotOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__or = new ExecutorOperation("or", Parameters._Boolean, Types._Boolean,
			5, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.logical.BooleanOrOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__xor = new ExecutorOperation("xor", Parameters._Boolean, Types._Boolean,
			6, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.logical.BooleanXorOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__allInstances = new ExecutorOperation("allInstances", Parameters._, Types._Boolean,
			7, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.logical.BooleanAllInstancesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__toString = new ExecutorOperation("toString", Parameters._, Types._Boolean,
			8, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);

		public static final /*@NonNull*/ ExecutorOperation _String___add_ = new ExecutorOperation("+", Parameters._String, Types._String,
			0, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___lt_ = new ExecutorOperation("<", Parameters._OclSelf, Types._String,
			1, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringLessThanOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___lt__eq_ = new ExecutorOperation("<=", Parameters._OclSelf, Types._String,
			2, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringLessThanEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___lt__gt_ = new ExecutorOperation("<>", Parameters._OclSelf, Types._String,
			3, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___eq_ = new ExecutorOperation("=", Parameters._OclSelf, Types._String,
			4, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___gt_ = new ExecutorOperation(">", Parameters._OclSelf, Types._String,
			5, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringGreaterThanOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___gt__eq_ = new ExecutorOperation(">=", Parameters._OclSelf, Types._String,
			6, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringGreaterThanEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__at = new ExecutorOperation("at", Parameters._Integer, Types._String,
			7, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringAtOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__characters = new ExecutorOperation("characters", Parameters._, Types._String,
			8, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringCharactersOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._String,
			9, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringCompareToOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__concat = new ExecutorOperation("concat", Parameters._String, Types._String,
			10, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringConcatOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__endsWith = new ExecutorOperation("endsWith", Parameters._String, Types._String,
			11, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringEndsWithOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__equalsIgnoreCase = new ExecutorOperation("equalsIgnoreCase", Parameters._String, Types._String,
			12, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__indexOf = new ExecutorOperation("indexOf", Parameters._String, Types._String,
			13, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringIndexOfOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__lastIndexOf = new ExecutorOperation("lastIndexOf", Parameters._String, Types._String,
			14, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringLastIndexOfOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__matches = new ExecutorOperation("matches", Parameters._String, Types._String,
			15, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringMatchesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__replaceAll = new ExecutorOperation("replaceAll", Parameters._String___String, Types._String,
			16, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringReplaceAllOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__replaceFirst = new ExecutorOperation("replaceFirst", Parameters._String___String, Types._String,
			17, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringReplaceFirstOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__size = new ExecutorOperation("size", Parameters._, Types._String,
			18, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringSizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__startsWith = new ExecutorOperation("startsWith", Parameters._String, Types._String,
			19, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringStartsWithOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__substituteAll = new ExecutorOperation("substituteAll", Parameters._String___String, Types._String,
			20, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringSubstituteAllOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__substituteFirst = new ExecutorOperation("substituteFirst", Parameters._String___String, Types._String,
			21, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringSubstituteFirstOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__substring = new ExecutorOperation("substring", Parameters._Integer___Integer, Types._String,
			22, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringSubstringOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toBoolean = new ExecutorOperation("toBoolean", Parameters._, Types._String,
			23, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringToBooleanOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toInteger = new ExecutorOperation("toInteger", Parameters._, Types._String,
			24, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringToIntegerOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toLower = new ExecutorOperation("toLower", Parameters._, Types._String,
			25, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toLowerCase = new ExecutorOperation("toLowerCase", Parameters._, Types._String,
			26, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toReal = new ExecutorOperation("toReal", Parameters._, Types._String,
			27, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringToRealOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toString = new ExecutorOperation("toString", Parameters._, Types._String,
			28, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toUpper = new ExecutorOperation("toUpper", Parameters._, Types._String,
			29, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toUpperCase = new ExecutorOperation("toUpperCase", Parameters._, Types._String,
			30, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__0_tokenize = new ExecutorOperation("tokenize", Parameters._, Types._String,
			31, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringTokenizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__1_tokenize = new ExecutorOperation("tokenize", Parameters._String, Types._String,
			32, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringTokenizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__2_tokenize = new ExecutorOperation("tokenize", Parameters._String___Boolean, Types._String,
			33, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringTokenizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__trim = new ExecutorOperation("trim", Parameters._, Types._String,
			34, DomainTypeParameters.EMPTY_LIST, org.eclipse.ocl.examples.library.string.StringTrimOperation.INSTANCE);

	}

	/**
	 *	The property descriptors for each property of each type.
	 */
	public static class Properties {

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

		public static final /*@NonNull*/ ExecutorProperty _Configuration__resources = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__RESOURCES, Types._Configuration, 0);
		public static final /*@NonNull*/ ExecutorProperty _Configuration__use = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__USE, Types._Configuration, 1);

		public static final /*@NonNull*/ ExecutorProperty _Entity__attributes = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__ATTRIBUTES, Types._Entity, 0);
		public static final /*@NonNull*/ ExecutorProperty _Entity__id = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__ID, Types._Entity, 1);
		public static final /*@NonNull*/ ExecutorProperty _Entity__kind = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__KIND, Types._Entity, 2);
		public static final /*@NonNull*/ ExecutorProperty _Entity__mixins = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__MIXINS, Types._Entity, 3);
		public static final /*@NonNull*/ ExecutorProperty _Entity__Kind__entities = new ExecutorPropertyWithImplementation("Kind", Types._Entity, 4, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.KIND__ENTITIES));
		public static final /*@NonNull*/ ExecutorProperty _Entity__Mixin__entities = new ExecutorPropertyWithImplementation("Mixin", Types._Entity, 5, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN__ENTITIES));

		public static final /*@NonNull*/ ExecutorProperty _Extension__import = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__IMPORT, Types._Extension, 0);
		public static final /*@NonNull*/ ExecutorProperty _Extension__kinds = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__KINDS, Types._Extension, 1);
		public static final /*@NonNull*/ ExecutorProperty _Extension__mixins = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__MIXINS, Types._Extension, 2);
		public static final /*@NonNull*/ ExecutorProperty _Extension__name = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__NAME, Types._Extension, 3);
		public static final /*@NonNull*/ ExecutorProperty _Extension__scheme = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__SCHEME, Types._Extension, 4);
		public static final /*@NonNull*/ ExecutorProperty _Extension__types = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__TYPES, Types._Extension, 5);
		public static final /*@NonNull*/ ExecutorProperty _Extension__Configuration__use = new ExecutorPropertyWithImplementation("Configuration", Types._Extension, 6, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CONFIGURATION__USE));
		public static final /*@NonNull*/ ExecutorProperty _Extension__Extension__import = new ExecutorPropertyWithImplementation("Extension", Types._Extension, 7, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.EXTENSION__IMPORT));

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
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Entity__mixins = new ExecutorPropertyWithImplementation("Entity", Types._Mixin, 4, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ENTITY__MIXINS));
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Extension__mixins = new ExecutorPropertyWithImplementation("Extension", Types._Mixin, 5, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.EXTENSION__MIXINS));
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Mixin__depends = new ExecutorPropertyWithImplementation("Mixin", Types._Mixin, 6, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN__DEPENDS));

		public static final /*@NonNull*/ ExecutorProperty _Resource__links = new EcoreExecutorProperty(OCCIPackage.Literals.RESOURCE__LINKS, Types._Resource, 0);
		public static final /*@NonNull*/ ExecutorProperty _Resource__Configuration__resources = new ExecutorPropertyWithImplementation("Configuration", Types._Resource, 1, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CONFIGURATION__RESOURCES));
		public static final /*@NonNull*/ ExecutorProperty _Resource__Link__target = new ExecutorPropertyWithImplementation("Link", Types._Resource, 2, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.LINK__TARGET));

		/*
		 * Force initialization.
		 */
		public static void init() {
			Types.init();
		}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		private static final /*@NonNull*/ ExecutorFragment[] _Action =
		{
			Fragments._Action__OclAny /* 0 */,
			Fragments._Action__OclElement /* 1 */,
			Fragments._Action__Category /* 2 */,
			Fragments._Action__Action /* 3 */
		};
		private static final /*@NonNull*/ int[] __Action = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Attribute =
		{
			Fragments._Attribute__OclAny /* 0 */,
			Fragments._Attribute__OclElement /* 1 */,
			Fragments._Attribute__Attribute /* 2 */
		};
		private static final /*@NonNull*/ int[] __Attribute = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _AttributeState =
		{
			Fragments._AttributeState__OclAny /* 0 */,
			Fragments._AttributeState__OclElement /* 1 */,
			Fragments._AttributeState__AttributeState /* 2 */
		};
		private static final /*@NonNull*/ int[] __AttributeState = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Boolean =
		{
			Fragments._Boolean__OclAny /* 0 */,
			Fragments._Boolean__Boolean /* 1 */
		};
		private static final /*@NonNull*/ int[] __Boolean = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Category =
		{
			Fragments._Category__OclAny /* 0 */,
			Fragments._Category__OclElement /* 1 */,
			Fragments._Category__Category /* 2 */
		};
		private static final /*@NonNull*/ int[] __Category = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Configuration =
		{
			Fragments._Configuration__OclAny /* 0 */,
			Fragments._Configuration__OclElement /* 1 */,
			Fragments._Configuration__Configuration /* 2 */
		};
		private static final /*@NonNull*/ int[] __Configuration = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Entity =
		{
			Fragments._Entity__OclAny /* 0 */,
			Fragments._Entity__OclElement /* 1 */,
			Fragments._Entity__Entity /* 2 */
		};
		private static final /*@NonNull*/ int[] __Entity = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Extension =
		{
			Fragments._Extension__OclAny /* 0 */,
			Fragments._Extension__OclElement /* 1 */,
			Fragments._Extension__Extension /* 2 */
		};
		private static final /*@NonNull*/ int[] __Extension = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Kind =
		{
			Fragments._Kind__OclAny /* 0 */,
			Fragments._Kind__OclElement /* 1 */,
			Fragments._Kind__Category /* 2 */,
			Fragments._Kind__Kind /* 3 */
		};
		private static final /*@NonNull*/ int[] __Kind = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Link =
		{
			Fragments._Link__OclAny /* 0 */,
			Fragments._Link__OclElement /* 1 */,
			Fragments._Link__Entity /* 2 */,
			Fragments._Link__Link /* 3 */
		};
		private static final /*@NonNull*/ int[] __Link = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Mixin =
		{
			Fragments._Mixin__OclAny /* 0 */,
			Fragments._Mixin__OclElement /* 1 */,
			Fragments._Mixin__Category /* 2 */,
			Fragments._Mixin__Mixin /* 3 */
		};
		private static final /*@NonNull*/ int[] __Mixin = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Number =
		{
			Fragments._Number__OclAny /* 0 */,
			Fragments._Number__Number /* 1 */
		};
		private static final /*@NonNull*/ int[] __Number = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Resource =
		{
			Fragments._Resource__OclAny /* 0 */,
			Fragments._Resource__OclElement /* 1 */,
			Fragments._Resource__Entity /* 2 */,
			Fragments._Resource__Resource /* 3 */
		};
		private static final /*@NonNull*/ int[] __Resource = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _String =
		{
			Fragments._String__OclAny /* 0 */,
			Fragments._String__OclComparable /* 1 */,
			Fragments._String__OclSummable /* 1 */,
			Fragments._String__String /* 2 */
		};
		private static final /*@NonNull*/ int[] __String = { 1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _URI =
		{
			Fragments._URI__OclAny /* 0 */,
			Fragments._URI__URI /* 1 */
		};
		private static final /*@NonNull*/ int[] __URI = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		public static void init() {
			Fragments.init();
			Properties.init();

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
		}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		private static final /*@NonNull*/ ExecutorOperation[] _Action__Action = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Action__Category = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Attribute__Attribute = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _AttributeState__AttributeState = {};
		private static final /*@NonNull*/ ExecutorOperation[] _AttributeState__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _AttributeState__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Boolean__Boolean = {
			OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._Boolean__and /* _'and'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__implies /* _'implies'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__not /* _'not'() */,
			OCLstdlibTables.Operations._Boolean__or /* _'or'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__xor /* _'xor'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._Boolean__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Boolean__OclAny = {
			OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._Boolean__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Category__Category = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Category__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Category__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Configuration__Configuration = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Configuration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Configuration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Entity__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Extension__Extension = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Extension__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Extension__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Kind__Kind = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Kind__Category = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Kind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Kind__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Link__Link = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Link__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Link__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Link__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Mixin__Mixin = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Mixin__Category = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Mixin__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Mixin__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Number__Number = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Number__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Resource__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Resource__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Resource__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Resource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _String__String = {
			OCLstdlibTables.Operations._String___add_ /* _'+'(String) */,
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf) */,
			OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf) */,
			OCLstdlibTables.Operations._String__at /* at(Integer) */,
			OCLstdlibTables.Operations._String__characters /* characters() */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf) */,
			OCLstdlibTables.Operations._String__concat /* concat(String) */,
			OCLstdlibTables.Operations._String__endsWith /* endsWith(String) */,
			OCLstdlibTables.Operations._String__equalsIgnoreCase /* equalsIgnoreCase(String) */,
			OCLstdlibTables.Operations._String__indexOf /* indexOf(String) */,
			OCLstdlibTables.Operations._String__lastIndexOf /* lastIndexOf(String) */,
			OCLstdlibTables.Operations._String__matches /* matches(String) */,
			OCLstdlibTables.Operations._String__replaceAll /* replaceAll(String,String) */,
			OCLstdlibTables.Operations._String__replaceFirst /* replaceFirst(String,String) */,
			OCLstdlibTables.Operations._String__size /* size() */,
			OCLstdlibTables.Operations._String__startsWith /* startsWith(String) */,
			OCLstdlibTables.Operations._String__substituteAll /* substituteAll(String,String) */,
			OCLstdlibTables.Operations._String__substituteFirst /* substituteFirst(String,String) */,
			OCLstdlibTables.Operations._String__substring /* substring(Integer,Integer) */,
			OCLstdlibTables.Operations._String__toBoolean /* toBoolean() */,
			OCLstdlibTables.Operations._String__toInteger /* toInteger() */,
			OCLstdlibTables.Operations._String__toLower /* toLower() */,
			OCLstdlibTables.Operations._String__toLowerCase /* toLowerCase() */,
			OCLstdlibTables.Operations._String__toReal /* toReal() */,
			OCLstdlibTables.Operations._String__toString /* toString() */,
			OCLstdlibTables.Operations._String__toUpper /* toUpper() */,
			OCLstdlibTables.Operations._String__toUpperCase /* toUpperCase() */,
			OCLstdlibTables.Operations._String__0_tokenize /* tokenize() */,
			OCLstdlibTables.Operations._String__1_tokenize /* tokenize(String) */,
			OCLstdlibTables.Operations._String__2_tokenize /* tokenize(String,Boolean) */,
			OCLstdlibTables.Operations._String__trim /* trim() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _String__OclAny = {
			OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._String__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _String__OclComparable = {
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf) */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _String__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _URI__URI = {};
		private static final /*@NonNull*/ ExecutorOperation[] _URI__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(Metaclass(TT)) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(T)(Metaclass(T)) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		public static void init() {
			TypeFragments.init();

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
			Fragments._String__OclSummable.initOperations(_String__OclSummable);
			Fragments._String__String.initOperations(_String__String);

			Fragments._URI__OclAny.initOperations(_URI__OclAny);
			Fragments._URI__URI.initOperations(_URI__URI);
		}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		private static final /*@NonNull*/ ExecutorProperty[] _Action = {
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title,
			OCCITables.Properties._Action__Kind__actions,
			OCCITables.Properties._Action__Mixin__actions
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Attribute = {
			OCCITables.Properties._Attribute__default,
			OCCITables.Properties._Attribute__description,
			OCCITables.Properties._Attribute__multiple_values,
			OCCITables.Properties._Attribute__mutable,
			OCCITables.Properties._Attribute__name,
			OCCITables.Properties._Attribute__required,
			OCCITables.Properties._Attribute__type,
			OCCITables.Properties._Attribute__Category__attributes
		};

		private static final /*@NonNull*/ ExecutorProperty[] _AttributeState = {
			OCCITables.Properties._AttributeState__name,
			OCCITables.Properties._AttributeState__value,
			OCCITables.Properties._AttributeState__Entity__attributes
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Boolean = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Category = {
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Configuration = {
			OCCITables.Properties._Configuration__resources,
			OCCITables.Properties._Configuration__use
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Entity = {
			OCCITables.Properties._Entity__attributes,
			OCCITables.Properties._Entity__id,
			OCCITables.Properties._Entity__kind,
			OCCITables.Properties._Entity__mixins,
			OCCITables.Properties._Entity__Kind__entities,
			OCCITables.Properties._Entity__Mixin__entities
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Extension = {
			OCCITables.Properties._Extension__import,
			OCCITables.Properties._Extension__kinds,
			OCCITables.Properties._Extension__mixins,
			OCCITables.Properties._Extension__name,
			OCCITables.Properties._Extension__scheme,
			OCCITables.Properties._Extension__types,
			OCCITables.Properties._Extension__Configuration__use,
			OCCITables.Properties._Extension__Extension__import
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Kind = {
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

		private static final /*@NonNull*/ ExecutorProperty[] _Link = {
			OCCITables.Properties._Entity__attributes,
			OCCITables.Properties._Entity__id,
			OCCITables.Properties._Entity__kind,
			OCCITables.Properties._Entity__mixins,
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target,
			OCCITables.Properties._Entity__Kind__entities,
			OCCITables.Properties._Entity__Mixin__entities
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Mixin = {
			OCCITables.Properties._Mixin__actions,
			OCCITables.Properties._Mixin__applies,
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Mixin__depends,
			OCCITables.Properties._Mixin__entities,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title,
			OCCITables.Properties._Mixin__Entity__mixins,
			OCCITables.Properties._Mixin__Extension__mixins,
			OCCITables.Properties._Mixin__Mixin__depends
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Number = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Resource = {
			OCCITables.Properties._Entity__attributes,
			OCCITables.Properties._Entity__id,
			OCCITables.Properties._Entity__kind,
			OCCITables.Properties._Resource__links,
			OCCITables.Properties._Entity__mixins,
			OCCITables.Properties._Resource__Configuration__resources,
			OCCITables.Properties._Entity__Kind__entities,
			OCCITables.Properties._Resource__Link__target,
			OCCITables.Properties._Entity__Mixin__entities
		};

		private static final /*@NonNull*/ ExecutorProperty[] _String = {};

		private static final /*@NonNull*/ ExecutorProperty[] _URI = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		public static void init() {
			TypeFragments.init();

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
		}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
		}

		public static void init() {}
	}

	/*
	 * Force initialization.
	 */
	static {
		Types.init();
	}
}

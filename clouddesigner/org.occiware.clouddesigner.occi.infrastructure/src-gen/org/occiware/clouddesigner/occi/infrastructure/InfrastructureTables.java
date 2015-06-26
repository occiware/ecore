/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.ecore
 * using:
 *   /org.occiware.clouddesigner.occi.infrastructure/model/Infrastructure.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.occiware.clouddesigner.occi.infrastructure;

import java.lang.String;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.PivotTables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.occiware.clouddesigner.occi.OCCITables;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructureTables;

/**
 * InfrastructureTables provides the dispatch tables for the infrastructure for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class InfrastructureTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(InfrastructurePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure = IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure", null, InfrastructurePackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_GHz = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getDataTypeId("GHz", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_GiB = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getDataTypeId("GiB", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_Integer4095 = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getDataTypeId("Integer4095", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_PositiveInteger = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getDataTypeId("PositiveInteger", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_Token = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getDataTypeId("Token", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ EnumerationId ENUMid_Architecture = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getEnumerationId("Architecture");
    public static final /*@NonNull*/ /*@NonInvalid*/ EnumerationId ENUMid_ComputeStatus = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getEnumerationId("ComputeStatus");
    public static final /*@NonNull*/ /*@NonInvalid*/ EnumerationId ENUMid_NetworkInterfaceStatus = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getEnumerationId("NetworkInterfaceStatus");
    public static final /*@NonNull*/ /*@NonInvalid*/ EnumerationId ENUMid_StorageLinkStatus = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getEnumerationId("StorageLinkStatus");
    public static final /*@NonNull*/ /*@NonInvalid*/ EnumerationId ENUMid_StorageStatus = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getEnumerationId("StorageStatus");
    public static final /*@NonNull*/ /*@NonInvalid*/ EnumerationId ENUMid_SuspendMethod = InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getEnumerationId("SuspendMethod");
    public static final /*@NonNull*/ /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR_SuspendMethod_c_c_dummy = "SuspendMethod::dummy";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			InfrastructureTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumeration _Allocation = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.ALLOCATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Architecture = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.ARCHITECTURE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Compute = new EcoreExecutorType(InfrastructurePackage.Literals.COMPUTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ComputeStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.COMPUTE_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _GHz = new EcoreExecutorType("GHz", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _GiB = new EcoreExecutorType("GiB", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Integer4095 = new EcoreExecutorType("Integer4095", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _IpAddress = new EcoreExecutorType("IpAddress", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _IpAddressRange = new EcoreExecutorType("IpAddressRange", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Network = new EcoreExecutorType(InfrastructurePackage.Literals.NETWORK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _NetworkInterfaceStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.NETWORK_INTERFACE_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _NetworkStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.NETWORK_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Networkinterface = new EcoreExecutorType(InfrastructurePackage.Literals.NETWORKINTERFACE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PositiveInteger = new EcoreExecutorType("PositiveInteger", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _RestartMethod = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.RESTART_METHOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _StopMethod = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.STOP_METHOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Storage = new EcoreExecutorType(InfrastructurePackage.Literals.STORAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _StorageLinkStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.STORAGE_LINK_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _StorageStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.STORAGE_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Storagelink = new EcoreExecutorType(InfrastructurePackage.Literals.STORAGELINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _SuspendMethod = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.SUSPEND_METHOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Token = new EcoreExecutorType("Token", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType[] types = {
			_Allocation,
			_Architecture,
			_Compute,
			_ComputeStatus,
			_GHz,
			_GiB,
			_Integer4095,
			_IpAddress,
			_IpAddressRange,
			_Network,
			_NetworkInterfaceStatus,
			_NetworkStatus,
			_Networkinterface,
			_PositiveInteger,
			_RestartMethod,
			_StopMethod,
			_Storage,
			_StorageLinkStatus,
			_StorageStatus,
			_Storagelink,
			_SuspendMethod,
			_Token
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Allocation__Allocation = new ExecutorFragment(Types._Allocation, InfrastructureTables.Types._Allocation);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__Class = new ExecutorFragment(Types._Allocation, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__DataType = new ExecutorFragment(Types._Allocation, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__Element = new ExecutorFragment(Types._Allocation, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__Enumeration = new ExecutorFragment(Types._Allocation, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__Nameable = new ExecutorFragment(Types._Allocation, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__NamedElement = new ExecutorFragment(Types._Allocation, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__Namespace = new ExecutorFragment(Types._Allocation, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__OclAny = new ExecutorFragment(Types._Allocation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__OclElement = new ExecutorFragment(Types._Allocation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__OclType = new ExecutorFragment(Types._Allocation, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__TemplateableElement = new ExecutorFragment(Types._Allocation, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__Type = new ExecutorFragment(Types._Allocation, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__Visitable = new ExecutorFragment(Types._Allocation, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _Architecture__Architecture = new ExecutorFragment(Types._Architecture, InfrastructureTables.Types._Architecture);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__Class = new ExecutorFragment(Types._Architecture, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__DataType = new ExecutorFragment(Types._Architecture, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__Element = new ExecutorFragment(Types._Architecture, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__Enumeration = new ExecutorFragment(Types._Architecture, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__Nameable = new ExecutorFragment(Types._Architecture, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__NamedElement = new ExecutorFragment(Types._Architecture, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__Namespace = new ExecutorFragment(Types._Architecture, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__OclAny = new ExecutorFragment(Types._Architecture, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__OclElement = new ExecutorFragment(Types._Architecture, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__OclType = new ExecutorFragment(Types._Architecture, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__TemplateableElement = new ExecutorFragment(Types._Architecture, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__Type = new ExecutorFragment(Types._Architecture, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__Visitable = new ExecutorFragment(Types._Architecture, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _Compute__Compute = new ExecutorFragment(Types._Compute, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Compute__Entity = new ExecutorFragment(Types._Compute, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Compute__OclAny = new ExecutorFragment(Types._Compute, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Compute__OclElement = new ExecutorFragment(Types._Compute, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Compute__Resource = new ExecutorFragment(Types._Compute, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__Class = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__ComputeStatus = new ExecutorFragment(Types._ComputeStatus, InfrastructureTables.Types._ComputeStatus);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__DataType = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__Element = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__Enumeration = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__Nameable = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__NamedElement = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__Namespace = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__OclAny = new ExecutorFragment(Types._ComputeStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__OclElement = new ExecutorFragment(Types._ComputeStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__OclType = new ExecutorFragment(Types._ComputeStatus, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__TemplateableElement = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__Type = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__Visitable = new ExecutorFragment(Types._ComputeStatus, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _GHz__GHz = new ExecutorFragment(Types._GHz, InfrastructureTables.Types._GHz);
		private static final /*@NonNull*/ ExecutorFragment _GHz__OclAny = new ExecutorFragment(Types._GHz, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _GHz__OclComparable = new ExecutorFragment(Types._GHz, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _GHz__OclSummable = new ExecutorFragment(Types._GHz, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _GHz__Real = new ExecutorFragment(Types._GHz, OCLstdlibTables.Types._Real);

		private static final /*@NonNull*/ ExecutorFragment _GiB__GiB = new ExecutorFragment(Types._GiB, InfrastructureTables.Types._GiB);
		private static final /*@NonNull*/ ExecutorFragment _GiB__OclAny = new ExecutorFragment(Types._GiB, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _GiB__OclComparable = new ExecutorFragment(Types._GiB, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _GiB__OclSummable = new ExecutorFragment(Types._GiB, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _GiB__Real = new ExecutorFragment(Types._GiB, OCLstdlibTables.Types._Real);

		private static final /*@NonNull*/ ExecutorFragment _Integer4095__Integer = new ExecutorFragment(Types._Integer4095, OCLstdlibTables.Types._Integer);
		private static final /*@NonNull*/ ExecutorFragment _Integer4095__Integer4095 = new ExecutorFragment(Types._Integer4095, InfrastructureTables.Types._Integer4095);
		private static final /*@NonNull*/ ExecutorFragment _Integer4095__OclAny = new ExecutorFragment(Types._Integer4095, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Integer4095__OclComparable = new ExecutorFragment(Types._Integer4095, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _Integer4095__OclSummable = new ExecutorFragment(Types._Integer4095, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _Integer4095__Real = new ExecutorFragment(Types._Integer4095, OCLstdlibTables.Types._Real);

		private static final /*@NonNull*/ ExecutorFragment _IpAddress__IpAddress = new ExecutorFragment(Types._IpAddress, InfrastructureTables.Types._IpAddress);
		private static final /*@NonNull*/ ExecutorFragment _IpAddress__OclAny = new ExecutorFragment(Types._IpAddress, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _IpAddress__OclComparable = new ExecutorFragment(Types._IpAddress, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _IpAddress__OclElement = new ExecutorFragment(Types._IpAddress, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _IpAddress__OclSummable = new ExecutorFragment(Types._IpAddress, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _IpAddress__String = new ExecutorFragment(Types._IpAddress, OCLstdlibTables.Types._String);

		private static final /*@NonNull*/ ExecutorFragment _IpAddressRange__IpAddressRange = new ExecutorFragment(Types._IpAddressRange, InfrastructureTables.Types._IpAddressRange);
		private static final /*@NonNull*/ ExecutorFragment _IpAddressRange__OclAny = new ExecutorFragment(Types._IpAddressRange, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _IpAddressRange__OclComparable = new ExecutorFragment(Types._IpAddressRange, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _IpAddressRange__OclElement = new ExecutorFragment(Types._IpAddressRange, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _IpAddressRange__OclSummable = new ExecutorFragment(Types._IpAddressRange, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _IpAddressRange__String = new ExecutorFragment(Types._IpAddressRange, OCLstdlibTables.Types._String);

		private static final /*@NonNull*/ ExecutorFragment _Network__Entity = new ExecutorFragment(Types._Network, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Network__Network = new ExecutorFragment(Types._Network, InfrastructureTables.Types._Network);
		private static final /*@NonNull*/ ExecutorFragment _Network__OclAny = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Network__OclElement = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Network__Resource = new ExecutorFragment(Types._Network, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__Class = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__DataType = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__Element = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__Enumeration = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__Nameable = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__NamedElement = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__Namespace = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__NetworkInterfaceStatus = new ExecutorFragment(Types._NetworkInterfaceStatus, InfrastructureTables.Types._NetworkInterfaceStatus);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__OclAny = new ExecutorFragment(Types._NetworkInterfaceStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__OclElement = new ExecutorFragment(Types._NetworkInterfaceStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__OclType = new ExecutorFragment(Types._NetworkInterfaceStatus, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__TemplateableElement = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__Type = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__Visitable = new ExecutorFragment(Types._NetworkInterfaceStatus, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__Class = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__DataType = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__Element = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__Enumeration = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__Nameable = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__NamedElement = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__Namespace = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__NetworkStatus = new ExecutorFragment(Types._NetworkStatus, InfrastructureTables.Types._NetworkStatus);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__OclAny = new ExecutorFragment(Types._NetworkStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__OclElement = new ExecutorFragment(Types._NetworkStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__OclType = new ExecutorFragment(Types._NetworkStatus, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__TemplateableElement = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__Type = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__Visitable = new ExecutorFragment(Types._NetworkStatus, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__Entity = new ExecutorFragment(Types._Networkinterface, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__Link = new ExecutorFragment(Types._Networkinterface, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__Networkinterface = new ExecutorFragment(Types._Networkinterface, InfrastructureTables.Types._Networkinterface);
		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__OclAny = new ExecutorFragment(Types._Networkinterface, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__OclElement = new ExecutorFragment(Types._Networkinterface, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _PositiveInteger__Integer = new ExecutorFragment(Types._PositiveInteger, OCLstdlibTables.Types._Integer);
		private static final /*@NonNull*/ ExecutorFragment _PositiveInteger__OclAny = new ExecutorFragment(Types._PositiveInteger, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PositiveInteger__OclComparable = new ExecutorFragment(Types._PositiveInteger, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _PositiveInteger__OclSummable = new ExecutorFragment(Types._PositiveInteger, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _PositiveInteger__PositiveInteger = new ExecutorFragment(Types._PositiveInteger, InfrastructureTables.Types._PositiveInteger);
		private static final /*@NonNull*/ ExecutorFragment _PositiveInteger__Real = new ExecutorFragment(Types._PositiveInteger, OCLstdlibTables.Types._Real);

		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__Class = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__DataType = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__Element = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__Enumeration = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__Nameable = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__NamedElement = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__Namespace = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__OclAny = new ExecutorFragment(Types._RestartMethod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__OclElement = new ExecutorFragment(Types._RestartMethod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__OclType = new ExecutorFragment(Types._RestartMethod, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__RestartMethod = new ExecutorFragment(Types._RestartMethod, InfrastructureTables.Types._RestartMethod);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__TemplateableElement = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__Type = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__Visitable = new ExecutorFragment(Types._RestartMethod, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _StopMethod__Class = new ExecutorFragment(Types._StopMethod, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__DataType = new ExecutorFragment(Types._StopMethod, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__Element = new ExecutorFragment(Types._StopMethod, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__Enumeration = new ExecutorFragment(Types._StopMethod, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__Nameable = new ExecutorFragment(Types._StopMethod, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__NamedElement = new ExecutorFragment(Types._StopMethod, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__Namespace = new ExecutorFragment(Types._StopMethod, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__OclAny = new ExecutorFragment(Types._StopMethod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__OclElement = new ExecutorFragment(Types._StopMethod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__OclType = new ExecutorFragment(Types._StopMethod, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__StopMethod = new ExecutorFragment(Types._StopMethod, InfrastructureTables.Types._StopMethod);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__TemplateableElement = new ExecutorFragment(Types._StopMethod, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__Type = new ExecutorFragment(Types._StopMethod, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__Visitable = new ExecutorFragment(Types._StopMethod, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _Storage__Entity = new ExecutorFragment(Types._Storage, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Storage__OclAny = new ExecutorFragment(Types._Storage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Storage__OclElement = new ExecutorFragment(Types._Storage, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Storage__Resource = new ExecutorFragment(Types._Storage, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Storage__Storage = new ExecutorFragment(Types._Storage, InfrastructureTables.Types._Storage);

		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__Class = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__DataType = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__Element = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__Enumeration = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__Nameable = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__NamedElement = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__Namespace = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__OclAny = new ExecutorFragment(Types._StorageLinkStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__OclElement = new ExecutorFragment(Types._StorageLinkStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__OclType = new ExecutorFragment(Types._StorageLinkStatus, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__StorageLinkStatus = new ExecutorFragment(Types._StorageLinkStatus, InfrastructureTables.Types._StorageLinkStatus);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__TemplateableElement = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__Type = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__Visitable = new ExecutorFragment(Types._StorageLinkStatus, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__Class = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__DataType = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__Element = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__Enumeration = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__Nameable = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__NamedElement = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__Namespace = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__OclAny = new ExecutorFragment(Types._StorageStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__OclElement = new ExecutorFragment(Types._StorageStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__OclType = new ExecutorFragment(Types._StorageStatus, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__StorageStatus = new ExecutorFragment(Types._StorageStatus, InfrastructureTables.Types._StorageStatus);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__TemplateableElement = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__Type = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__Visitable = new ExecutorFragment(Types._StorageStatus, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _Storagelink__Entity = new ExecutorFragment(Types._Storagelink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Storagelink__Link = new ExecutorFragment(Types._Storagelink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Storagelink__OclAny = new ExecutorFragment(Types._Storagelink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Storagelink__OclElement = new ExecutorFragment(Types._Storagelink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Storagelink__Storagelink = new ExecutorFragment(Types._Storagelink, InfrastructureTables.Types._Storagelink);

		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__Class = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__DataType = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__Element = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__Enumeration = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__Nameable = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__NamedElement = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__Namespace = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__OclAny = new ExecutorFragment(Types._SuspendMethod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__OclElement = new ExecutorFragment(Types._SuspendMethod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__OclType = new ExecutorFragment(Types._SuspendMethod, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__SuspendMethod = new ExecutorFragment(Types._SuspendMethod, InfrastructureTables.Types._SuspendMethod);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__TemplateableElement = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__Type = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__Visitable = new ExecutorFragment(Types._SuspendMethod, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _Token__OclAny = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Token__OclComparable = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _Token__OclElement = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Token__OclSummable = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _Token__String = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._String);
		private static final /*@NonNull*/ ExecutorFragment _Token__Token = new ExecutorFragment(Types._Token, InfrastructureTables.Types._Token);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Fragments and all preceding sub-packages.
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

		public static final /*@NonNull*/ ParameterTypes _ = TypeUtil.createParameterTypes();
		public static final /*@NonNull*/ ParameterTypes _GiB = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Real);
		public static final /*@NonNull*/ ParameterTypes _RestartMethod = TypeUtil.createParameterTypes(InfrastructureTables.Types._RestartMethod);
		public static final /*@NonNull*/ ParameterTypes _StopMethod = TypeUtil.createParameterTypes(InfrastructureTables.Types._StopMethod);
		public static final /*@NonNull*/ ParameterTypes _SuspendMethod = TypeUtil.createParameterTypes(InfrastructureTables.Types._SuspendMethod);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Compute__restart = new ExecutorOperation("restart", Parameters._RestartMethod, Types._Compute,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Compute__start = new ExecutorOperation("start", Parameters._, Types._Compute,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Compute__stop = new ExecutorOperation("stop", Parameters._StopMethod, Types._Compute,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Compute__suspend = new ExecutorOperation("suspend", Parameters._SuspendMethod, Types._Compute,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Network__down = new ExecutorOperation("down", Parameters._, Types._Network,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Network__up = new ExecutorOperation("up", Parameters._, Types._Network,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Storage__backup = new ExecutorOperation("backup", Parameters._, Types._Storage,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Storage__offline = new ExecutorOperation("offline", Parameters._, Types._Storage,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Storage__online = new ExecutorOperation("online", Parameters._, Types._Storage,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Storage__resize = new ExecutorOperation("resize", Parameters._GiB, Types._Storage,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Storage__snapshot = new ExecutorOperation("snapshot", Parameters._, Types._Storage,
			4, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Compute__architecture = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__ARCHITECTURE, Types._Compute, 0);
		public static final /*@NonNull*/ ExecutorProperty _Compute__cores = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__CORES, Types._Compute, 1);
		public static final /*@NonNull*/ ExecutorProperty _Compute__hostname = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__HOSTNAME, Types._Compute, 2);
		public static final /*@NonNull*/ ExecutorProperty _Compute__memory = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__MEMORY, Types._Compute, 3);
		public static final /*@NonNull*/ ExecutorProperty _Compute__speed = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__SPEED, Types._Compute, 4);
		public static final /*@NonNull*/ ExecutorProperty _Compute__state = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__STATE, Types._Compute, 5);

		public static final /*@NonNull*/ ExecutorProperty _Network__label = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORK__LABEL, Types._Network, 0);
		public static final /*@NonNull*/ ExecutorProperty _Network__state = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORK__STATE, Types._Network, 1);
		public static final /*@NonNull*/ ExecutorProperty _Network__vlan = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORK__VLAN, Types._Network, 2);

		public static final /*@NonNull*/ ExecutorProperty _Networkinterface__interface = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORKINTERFACE__INTERFACE, Types._Networkinterface, 0);
		public static final /*@NonNull*/ ExecutorProperty _Networkinterface__mac = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORKINTERFACE__MAC, Types._Networkinterface, 1);
		public static final /*@NonNull*/ ExecutorProperty _Networkinterface__state = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORKINTERFACE__STATE, Types._Networkinterface, 2);

		public static final /*@NonNull*/ ExecutorProperty _Storage__size = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGE__SIZE, Types._Storage, 0);
		public static final /*@NonNull*/ ExecutorProperty _Storage__state = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGE__STATE, Types._Storage, 1);

		public static final /*@NonNull*/ ExecutorProperty _Storagelink__deviceid = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGELINK__DEVICEID, Types._Storagelink, 0);
		public static final /*@NonNull*/ ExecutorProperty _Storagelink__mountpoint = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGELINK__MOUNTPOINT, Types._Storagelink, 1);
		public static final /*@NonNull*/ ExecutorProperty _Storagelink__state = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGELINK__STATE, Types._Storagelink, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment[] _Allocation =
		{
			Fragments._Allocation__OclAny /* 0 */,
			Fragments._Allocation__OclElement /* 1 */,
			Fragments._Allocation__Nameable /* 2 */,
			Fragments._Allocation__OclType /* 2 */,
			Fragments._Allocation__Visitable /* 2 */,
			Fragments._Allocation__Element /* 3 */,
			Fragments._Allocation__NamedElement /* 4 */,
			Fragments._Allocation__TemplateableElement /* 4 */,
			Fragments._Allocation__Namespace /* 5 */,
			Fragments._Allocation__Type /* 5 */,
			Fragments._Allocation__Class /* 6 */,
			Fragments._Allocation__DataType /* 7 */,
			Fragments._Allocation__Enumeration /* 8 */,
			Fragments._Allocation__Allocation /* 9 */
		};
		private static final /*@NonNull*/ int[] __Allocation = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Architecture =
		{
			Fragments._Architecture__OclAny /* 0 */,
			Fragments._Architecture__OclElement /* 1 */,
			Fragments._Architecture__Nameable /* 2 */,
			Fragments._Architecture__OclType /* 2 */,
			Fragments._Architecture__Visitable /* 2 */,
			Fragments._Architecture__Element /* 3 */,
			Fragments._Architecture__NamedElement /* 4 */,
			Fragments._Architecture__TemplateableElement /* 4 */,
			Fragments._Architecture__Namespace /* 5 */,
			Fragments._Architecture__Type /* 5 */,
			Fragments._Architecture__Class /* 6 */,
			Fragments._Architecture__DataType /* 7 */,
			Fragments._Architecture__Enumeration /* 8 */,
			Fragments._Architecture__Architecture /* 9 */
		};
		private static final /*@NonNull*/ int[] __Architecture = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Compute =
		{
			Fragments._Compute__OclAny /* 0 */,
			Fragments._Compute__OclElement /* 1 */,
			Fragments._Compute__Entity /* 2 */,
			Fragments._Compute__Resource /* 3 */,
			Fragments._Compute__Compute /* 4 */
		};
		private static final /*@NonNull*/ int[] __Compute = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _ComputeStatus =
		{
			Fragments._ComputeStatus__OclAny /* 0 */,
			Fragments._ComputeStatus__OclElement /* 1 */,
			Fragments._ComputeStatus__Nameable /* 2 */,
			Fragments._ComputeStatus__OclType /* 2 */,
			Fragments._ComputeStatus__Visitable /* 2 */,
			Fragments._ComputeStatus__Element /* 3 */,
			Fragments._ComputeStatus__NamedElement /* 4 */,
			Fragments._ComputeStatus__TemplateableElement /* 4 */,
			Fragments._ComputeStatus__Namespace /* 5 */,
			Fragments._ComputeStatus__Type /* 5 */,
			Fragments._ComputeStatus__Class /* 6 */,
			Fragments._ComputeStatus__DataType /* 7 */,
			Fragments._ComputeStatus__Enumeration /* 8 */,
			Fragments._ComputeStatus__ComputeStatus /* 9 */
		};
		private static final /*@NonNull*/ int[] __ComputeStatus = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _GHz =
		{
			Fragments._GHz__OclAny /* 0 */,
			Fragments._GHz__OclComparable /* 1 */,
			Fragments._GHz__OclSummable /* 1 */,
			Fragments._GHz__Real /* 2 */,
			Fragments._GHz__GHz /* 3 */
		};
		private static final /*@NonNull*/ int[] __GHz = { 1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _GiB =
		{
			Fragments._GiB__OclAny /* 0 */,
			Fragments._GiB__OclComparable /* 1 */,
			Fragments._GiB__OclSummable /* 1 */,
			Fragments._GiB__Real /* 2 */,
			Fragments._GiB__GiB /* 3 */
		};
		private static final /*@NonNull*/ int[] __GiB = { 1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Integer4095 =
		{
			Fragments._Integer4095__OclAny /* 0 */,
			Fragments._Integer4095__OclComparable /* 1 */,
			Fragments._Integer4095__OclSummable /* 1 */,
			Fragments._Integer4095__Real /* 2 */,
			Fragments._Integer4095__Integer /* 3 */,
			Fragments._Integer4095__Integer4095 /* 4 */
		};
		private static final /*@NonNull*/ int[] __Integer4095 = { 1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _IpAddress =
		{
			Fragments._IpAddress__OclAny /* 0 */,
			Fragments._IpAddress__OclComparable /* 1 */,
			Fragments._IpAddress__OclElement /* 1 */,
			Fragments._IpAddress__OclSummable /* 1 */,
			Fragments._IpAddress__String /* 2 */,
			Fragments._IpAddress__IpAddress /* 3 */
		};
		private static final /*@NonNull*/ int[] __IpAddress = { 1,3,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _IpAddressRange =
		{
			Fragments._IpAddressRange__OclAny /* 0 */,
			Fragments._IpAddressRange__OclComparable /* 1 */,
			Fragments._IpAddressRange__OclElement /* 1 */,
			Fragments._IpAddressRange__OclSummable /* 1 */,
			Fragments._IpAddressRange__String /* 2 */,
			Fragments._IpAddressRange__IpAddressRange /* 3 */
		};
		private static final /*@NonNull*/ int[] __IpAddressRange = { 1,3,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Network =
		{
			Fragments._Network__OclAny /* 0 */,
			Fragments._Network__OclElement /* 1 */,
			Fragments._Network__Entity /* 2 */,
			Fragments._Network__Resource /* 3 */,
			Fragments._Network__Network /* 4 */
		};
		private static final /*@NonNull*/ int[] __Network = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _NetworkInterfaceStatus =
		{
			Fragments._NetworkInterfaceStatus__OclAny /* 0 */,
			Fragments._NetworkInterfaceStatus__OclElement /* 1 */,
			Fragments._NetworkInterfaceStatus__Nameable /* 2 */,
			Fragments._NetworkInterfaceStatus__OclType /* 2 */,
			Fragments._NetworkInterfaceStatus__Visitable /* 2 */,
			Fragments._NetworkInterfaceStatus__Element /* 3 */,
			Fragments._NetworkInterfaceStatus__NamedElement /* 4 */,
			Fragments._NetworkInterfaceStatus__TemplateableElement /* 4 */,
			Fragments._NetworkInterfaceStatus__Namespace /* 5 */,
			Fragments._NetworkInterfaceStatus__Type /* 5 */,
			Fragments._NetworkInterfaceStatus__Class /* 6 */,
			Fragments._NetworkInterfaceStatus__DataType /* 7 */,
			Fragments._NetworkInterfaceStatus__Enumeration /* 8 */,
			Fragments._NetworkInterfaceStatus__NetworkInterfaceStatus /* 9 */
		};
		private static final /*@NonNull*/ int[] __NetworkInterfaceStatus = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _NetworkStatus =
		{
			Fragments._NetworkStatus__OclAny /* 0 */,
			Fragments._NetworkStatus__OclElement /* 1 */,
			Fragments._NetworkStatus__Nameable /* 2 */,
			Fragments._NetworkStatus__OclType /* 2 */,
			Fragments._NetworkStatus__Visitable /* 2 */,
			Fragments._NetworkStatus__Element /* 3 */,
			Fragments._NetworkStatus__NamedElement /* 4 */,
			Fragments._NetworkStatus__TemplateableElement /* 4 */,
			Fragments._NetworkStatus__Namespace /* 5 */,
			Fragments._NetworkStatus__Type /* 5 */,
			Fragments._NetworkStatus__Class /* 6 */,
			Fragments._NetworkStatus__DataType /* 7 */,
			Fragments._NetworkStatus__Enumeration /* 8 */,
			Fragments._NetworkStatus__NetworkStatus /* 9 */
		};
		private static final /*@NonNull*/ int[] __NetworkStatus = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Networkinterface =
		{
			Fragments._Networkinterface__OclAny /* 0 */,
			Fragments._Networkinterface__OclElement /* 1 */,
			Fragments._Networkinterface__Entity /* 2 */,
			Fragments._Networkinterface__Link /* 3 */,
			Fragments._Networkinterface__Networkinterface /* 4 */
		};
		private static final /*@NonNull*/ int[] __Networkinterface = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _PositiveInteger =
		{
			Fragments._PositiveInteger__OclAny /* 0 */,
			Fragments._PositiveInteger__OclComparable /* 1 */,
			Fragments._PositiveInteger__OclSummable /* 1 */,
			Fragments._PositiveInteger__Real /* 2 */,
			Fragments._PositiveInteger__Integer /* 3 */,
			Fragments._PositiveInteger__PositiveInteger /* 4 */
		};
		private static final /*@NonNull*/ int[] __PositiveInteger = { 1,2,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _RestartMethod =
		{
			Fragments._RestartMethod__OclAny /* 0 */,
			Fragments._RestartMethod__OclElement /* 1 */,
			Fragments._RestartMethod__Nameable /* 2 */,
			Fragments._RestartMethod__OclType /* 2 */,
			Fragments._RestartMethod__Visitable /* 2 */,
			Fragments._RestartMethod__Element /* 3 */,
			Fragments._RestartMethod__NamedElement /* 4 */,
			Fragments._RestartMethod__TemplateableElement /* 4 */,
			Fragments._RestartMethod__Namespace /* 5 */,
			Fragments._RestartMethod__Type /* 5 */,
			Fragments._RestartMethod__Class /* 6 */,
			Fragments._RestartMethod__DataType /* 7 */,
			Fragments._RestartMethod__Enumeration /* 8 */,
			Fragments._RestartMethod__RestartMethod /* 9 */
		};
		private static final /*@NonNull*/ int[] __RestartMethod = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _StopMethod =
		{
			Fragments._StopMethod__OclAny /* 0 */,
			Fragments._StopMethod__OclElement /* 1 */,
			Fragments._StopMethod__Nameable /* 2 */,
			Fragments._StopMethod__OclType /* 2 */,
			Fragments._StopMethod__Visitable /* 2 */,
			Fragments._StopMethod__Element /* 3 */,
			Fragments._StopMethod__NamedElement /* 4 */,
			Fragments._StopMethod__TemplateableElement /* 4 */,
			Fragments._StopMethod__Namespace /* 5 */,
			Fragments._StopMethod__Type /* 5 */,
			Fragments._StopMethod__Class /* 6 */,
			Fragments._StopMethod__DataType /* 7 */,
			Fragments._StopMethod__Enumeration /* 8 */,
			Fragments._StopMethod__StopMethod /* 9 */
		};
		private static final /*@NonNull*/ int[] __StopMethod = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Storage =
		{
			Fragments._Storage__OclAny /* 0 */,
			Fragments._Storage__OclElement /* 1 */,
			Fragments._Storage__Entity /* 2 */,
			Fragments._Storage__Resource /* 3 */,
			Fragments._Storage__Storage /* 4 */
		};
		private static final /*@NonNull*/ int[] __Storage = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _StorageLinkStatus =
		{
			Fragments._StorageLinkStatus__OclAny /* 0 */,
			Fragments._StorageLinkStatus__OclElement /* 1 */,
			Fragments._StorageLinkStatus__Nameable /* 2 */,
			Fragments._StorageLinkStatus__OclType /* 2 */,
			Fragments._StorageLinkStatus__Visitable /* 2 */,
			Fragments._StorageLinkStatus__Element /* 3 */,
			Fragments._StorageLinkStatus__NamedElement /* 4 */,
			Fragments._StorageLinkStatus__TemplateableElement /* 4 */,
			Fragments._StorageLinkStatus__Namespace /* 5 */,
			Fragments._StorageLinkStatus__Type /* 5 */,
			Fragments._StorageLinkStatus__Class /* 6 */,
			Fragments._StorageLinkStatus__DataType /* 7 */,
			Fragments._StorageLinkStatus__Enumeration /* 8 */,
			Fragments._StorageLinkStatus__StorageLinkStatus /* 9 */
		};
		private static final /*@NonNull*/ int[] __StorageLinkStatus = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _StorageStatus =
		{
			Fragments._StorageStatus__OclAny /* 0 */,
			Fragments._StorageStatus__OclElement /* 1 */,
			Fragments._StorageStatus__Nameable /* 2 */,
			Fragments._StorageStatus__OclType /* 2 */,
			Fragments._StorageStatus__Visitable /* 2 */,
			Fragments._StorageStatus__Element /* 3 */,
			Fragments._StorageStatus__NamedElement /* 4 */,
			Fragments._StorageStatus__TemplateableElement /* 4 */,
			Fragments._StorageStatus__Namespace /* 5 */,
			Fragments._StorageStatus__Type /* 5 */,
			Fragments._StorageStatus__Class /* 6 */,
			Fragments._StorageStatus__DataType /* 7 */,
			Fragments._StorageStatus__Enumeration /* 8 */,
			Fragments._StorageStatus__StorageStatus /* 9 */
		};
		private static final /*@NonNull*/ int[] __StorageStatus = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Storagelink =
		{
			Fragments._Storagelink__OclAny /* 0 */,
			Fragments._Storagelink__OclElement /* 1 */,
			Fragments._Storagelink__Entity /* 2 */,
			Fragments._Storagelink__Link /* 3 */,
			Fragments._Storagelink__Storagelink /* 4 */
		};
		private static final /*@NonNull*/ int[] __Storagelink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _SuspendMethod =
		{
			Fragments._SuspendMethod__OclAny /* 0 */,
			Fragments._SuspendMethod__OclElement /* 1 */,
			Fragments._SuspendMethod__Nameable /* 2 */,
			Fragments._SuspendMethod__OclType /* 2 */,
			Fragments._SuspendMethod__Visitable /* 2 */,
			Fragments._SuspendMethod__Element /* 3 */,
			Fragments._SuspendMethod__NamedElement /* 4 */,
			Fragments._SuspendMethod__TemplateableElement /* 4 */,
			Fragments._SuspendMethod__Namespace /* 5 */,
			Fragments._SuspendMethod__Type /* 5 */,
			Fragments._SuspendMethod__Class /* 6 */,
			Fragments._SuspendMethod__DataType /* 7 */,
			Fragments._SuspendMethod__Enumeration /* 8 */,
			Fragments._SuspendMethod__SuspendMethod /* 9 */
		};
		private static final /*@NonNull*/ int[] __SuspendMethod = { 1,1,3,1,2,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Token =
		{
			Fragments._Token__OclAny /* 0 */,
			Fragments._Token__OclComparable /* 1 */,
			Fragments._Token__OclElement /* 1 */,
			Fragments._Token__OclSummable /* 1 */,
			Fragments._Token__String /* 2 */,
			Fragments._Token__Token /* 3 */
		};
		private static final /*@NonNull*/ int[] __Token = { 1,3,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Allocation.initFragments(_Allocation, __Allocation);
			Types._Architecture.initFragments(_Architecture, __Architecture);
			Types._Compute.initFragments(_Compute, __Compute);
			Types._ComputeStatus.initFragments(_ComputeStatus, __ComputeStatus);
			Types._GHz.initFragments(_GHz, __GHz);
			Types._GiB.initFragments(_GiB, __GiB);
			Types._Integer4095.initFragments(_Integer4095, __Integer4095);
			Types._IpAddress.initFragments(_IpAddress, __IpAddress);
			Types._IpAddressRange.initFragments(_IpAddressRange, __IpAddressRange);
			Types._Network.initFragments(_Network, __Network);
			Types._NetworkInterfaceStatus.initFragments(_NetworkInterfaceStatus, __NetworkInterfaceStatus);
			Types._NetworkStatus.initFragments(_NetworkStatus, __NetworkStatus);
			Types._Networkinterface.initFragments(_Networkinterface, __Networkinterface);
			Types._PositiveInteger.initFragments(_PositiveInteger, __PositiveInteger);
			Types._RestartMethod.initFragments(_RestartMethod, __RestartMethod);
			Types._StopMethod.initFragments(_StopMethod, __StopMethod);
			Types._Storage.initFragments(_Storage, __Storage);
			Types._StorageLinkStatus.initFragments(_StorageLinkStatus, __StorageLinkStatus);
			Types._StorageStatus.initFragments(_StorageStatus, __StorageStatus);
			Types._Storagelink.initFragments(_Storagelink, __Storagelink);
			Types._SuspendMethod.initFragments(_SuspendMethod, __SuspendMethod);
			Types._Token.initFragments(_Token, __Token);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__Allocation = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Allocation__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__Architecture = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Architecture__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Compute__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[1]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[1]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Compute__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Compute__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Compute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Compute__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__ComputeStatus = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _ComputeStatus__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _GHz__GHz = {};
		private static final /*@NonNull*/ ExecutorOperation[] _GHz__OclAny = {
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
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
			OCLstdlibTables.Operations._Real__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _GHz__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _GHz__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _GHz__Real = {
			OCLstdlibTables.Operations._Real___mul_ /* _'*'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___add_ /* _'+'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___neg_ /* _'-'() */,
			OCLstdlibTables.Operations._Real___sub_ /* _'-'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___div_ /* _'/'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__abs /* abs() */,
			OCLstdlibTables.Operations._Real__floor /* floor() */,
			OCLstdlibTables.Operations._Real__max /* max(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__min /* min(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__round /* round() */,
			OCLstdlibTables.Operations._Real__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _GiB__GiB = {};
		private static final /*@NonNull*/ ExecutorOperation[] _GiB__OclAny = {
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
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
			OCLstdlibTables.Operations._Real__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _GiB__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _GiB__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _GiB__Real = {
			OCLstdlibTables.Operations._Real___mul_ /* _'*'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___add_ /* _'+'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___neg_ /* _'-'() */,
			OCLstdlibTables.Operations._Real___sub_ /* _'-'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___div_ /* _'/'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__abs /* abs() */,
			OCLstdlibTables.Operations._Real__floor /* floor() */,
			OCLstdlibTables.Operations._Real__max /* max(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__min /* min(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__round /* round() */,
			OCLstdlibTables.Operations._Real__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Integer4095__Integer4095 = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Integer4095__Integer = {
			OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___neg_ /* _'-'() */,
			OCLstdlibTables.Operations._Integer___sub_ /* _'-'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__abs /* abs() */,
			OCLstdlibTables.Operations._Integer__div /* div(Integer[?]) */,
			OCLstdlibTables.Operations._Integer__max /* max(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__min /* min(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__mod /* mod(Integer[?]) */,
			OCLstdlibTables.Operations._Integer__toString /* toString() */,
			OCLstdlibTables.Operations._Integer__toUnlimitedNatural /* toUnlimitedNatural() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Integer4095__OclAny = {
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
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
			OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Integer4095__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Integer4095__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Integer4095__Real = {
			OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___neg_ /* _'-'() */,
			OCLstdlibTables.Operations._Integer___sub_ /* _'-'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__abs /* abs() */,
			OCLstdlibTables.Operations._Real__floor /* floor() */,
			OCLstdlibTables.Operations._Integer__max /* max(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__min /* min(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__round /* round() */,
			OCLstdlibTables.Operations._Integer__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _IpAddress__IpAddress = {};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddress__OclAny = {
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
			OCLstdlibTables.Operations._String__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddress__OclComparable = {
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddress__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddress__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddress__String = {
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
			OCLstdlibTables.Operations._String__indexOf /* indexOf(String[?]) */,
			OCLstdlibTables.Operations._String__lastIndexOf /* lastIndexOf(String[?]) */,
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

		private static final /*@NonNull*/ ExecutorOperation[] _IpAddressRange__IpAddressRange = {};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddressRange__OclAny = {
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
			OCLstdlibTables.Operations._String__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddressRange__OclComparable = {
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddressRange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddressRange__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _IpAddressRange__String = {
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
			OCLstdlibTables.Operations._String__indexOf /* indexOf(String[?]) */,
			OCLstdlibTables.Operations._String__lastIndexOf /* lastIndexOf(String[?]) */,
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

		private static final /*@NonNull*/ ExecutorOperation[] _Network__Network = {
			InfrastructureTables.Operations._Network__down /* down() */,
			InfrastructureTables.Operations._Network__up /* up() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Network__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Network__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Network__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Network__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__NetworkInterfaceStatus = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkInterfaceStatus__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__NetworkStatus = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _NetworkStatus__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Networkinterface__Networkinterface = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Networkinterface__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Networkinterface__Link = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Networkinterface__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Networkinterface__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _PositiveInteger__PositiveInteger = {};
		private static final /*@NonNull*/ ExecutorOperation[] _PositiveInteger__Integer = {
			OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___neg_ /* _'-'() */,
			OCLstdlibTables.Operations._Integer___sub_ /* _'-'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__abs /* abs() */,
			OCLstdlibTables.Operations._Integer__div /* div(Integer[?]) */,
			OCLstdlibTables.Operations._Integer__max /* max(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__min /* min(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__mod /* mod(Integer[?]) */,
			OCLstdlibTables.Operations._Integer__toString /* toString() */,
			OCLstdlibTables.Operations._Integer__toUnlimitedNatural /* toUnlimitedNatural() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _PositiveInteger__OclAny = {
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
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
			OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _PositiveInteger__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _PositiveInteger__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _PositiveInteger__Real = {
			OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___neg_ /* _'-'() */,
			OCLstdlibTables.Operations._Integer___sub_ /* _'-'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__abs /* abs() */,
			OCLstdlibTables.Operations._Real__floor /* floor() */,
			OCLstdlibTables.Operations._Integer__max /* max(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__min /* min(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__round /* round() */,
			OCLstdlibTables.Operations._Integer__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__RestartMethod = {};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _RestartMethod__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__StopMethod = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StopMethod__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Storage__Storage = {
			InfrastructureTables.Operations._Storage__backup /* backup() */,
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__online /* online() */,
			InfrastructureTables.Operations._Storage__resize /* resize(GiB[1]) */,
			InfrastructureTables.Operations._Storage__snapshot /* snapshot() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Storage__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Storage__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Storage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Storage__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__StorageLinkStatus = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageLinkStatus__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__StorageStatus = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _StorageStatus__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Storagelink__Storagelink = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Storagelink__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Storagelink__Link = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Storagelink__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Storagelink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__SuspendMethod = {};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__OclAny = {
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
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__TemplateableElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _SuspendMethod__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Token__Token = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Token__OclAny = {
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
			OCLstdlibTables.Operations._String__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Token__OclComparable = {
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Token__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Token__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Token__String = {
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
			OCLstdlibTables.Operations._String__indexOf /* indexOf(String[?]) */,
			OCLstdlibTables.Operations._String__lastIndexOf /* lastIndexOf(String[?]) */,
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Allocation__Allocation.initOperations(_Allocation__Allocation);
			Fragments._Allocation__Class.initOperations(_Allocation__Class);
			Fragments._Allocation__DataType.initOperations(_Allocation__DataType);
			Fragments._Allocation__Element.initOperations(_Allocation__Element);
			Fragments._Allocation__Enumeration.initOperations(_Allocation__Enumeration);
			Fragments._Allocation__Nameable.initOperations(_Allocation__Nameable);
			Fragments._Allocation__NamedElement.initOperations(_Allocation__NamedElement);
			Fragments._Allocation__Namespace.initOperations(_Allocation__Namespace);
			Fragments._Allocation__OclAny.initOperations(_Allocation__OclAny);
			Fragments._Allocation__OclElement.initOperations(_Allocation__OclElement);
			Fragments._Allocation__OclType.initOperations(_Allocation__OclType);
			Fragments._Allocation__TemplateableElement.initOperations(_Allocation__TemplateableElement);
			Fragments._Allocation__Type.initOperations(_Allocation__Type);
			Fragments._Allocation__Visitable.initOperations(_Allocation__Visitable);

			Fragments._Architecture__Architecture.initOperations(_Architecture__Architecture);
			Fragments._Architecture__Class.initOperations(_Architecture__Class);
			Fragments._Architecture__DataType.initOperations(_Architecture__DataType);
			Fragments._Architecture__Element.initOperations(_Architecture__Element);
			Fragments._Architecture__Enumeration.initOperations(_Architecture__Enumeration);
			Fragments._Architecture__Nameable.initOperations(_Architecture__Nameable);
			Fragments._Architecture__NamedElement.initOperations(_Architecture__NamedElement);
			Fragments._Architecture__Namespace.initOperations(_Architecture__Namespace);
			Fragments._Architecture__OclAny.initOperations(_Architecture__OclAny);
			Fragments._Architecture__OclElement.initOperations(_Architecture__OclElement);
			Fragments._Architecture__OclType.initOperations(_Architecture__OclType);
			Fragments._Architecture__TemplateableElement.initOperations(_Architecture__TemplateableElement);
			Fragments._Architecture__Type.initOperations(_Architecture__Type);
			Fragments._Architecture__Visitable.initOperations(_Architecture__Visitable);

			Fragments._Compute__Compute.initOperations(_Compute__Compute);
			Fragments._Compute__Entity.initOperations(_Compute__Entity);
			Fragments._Compute__OclAny.initOperations(_Compute__OclAny);
			Fragments._Compute__OclElement.initOperations(_Compute__OclElement);
			Fragments._Compute__Resource.initOperations(_Compute__Resource);

			Fragments._ComputeStatus__Class.initOperations(_ComputeStatus__Class);
			Fragments._ComputeStatus__ComputeStatus.initOperations(_ComputeStatus__ComputeStatus);
			Fragments._ComputeStatus__DataType.initOperations(_ComputeStatus__DataType);
			Fragments._ComputeStatus__Element.initOperations(_ComputeStatus__Element);
			Fragments._ComputeStatus__Enumeration.initOperations(_ComputeStatus__Enumeration);
			Fragments._ComputeStatus__Nameable.initOperations(_ComputeStatus__Nameable);
			Fragments._ComputeStatus__NamedElement.initOperations(_ComputeStatus__NamedElement);
			Fragments._ComputeStatus__Namespace.initOperations(_ComputeStatus__Namespace);
			Fragments._ComputeStatus__OclAny.initOperations(_ComputeStatus__OclAny);
			Fragments._ComputeStatus__OclElement.initOperations(_ComputeStatus__OclElement);
			Fragments._ComputeStatus__OclType.initOperations(_ComputeStatus__OclType);
			Fragments._ComputeStatus__TemplateableElement.initOperations(_ComputeStatus__TemplateableElement);
			Fragments._ComputeStatus__Type.initOperations(_ComputeStatus__Type);
			Fragments._ComputeStatus__Visitable.initOperations(_ComputeStatus__Visitable);

			Fragments._GHz__GHz.initOperations(_GHz__GHz);
			Fragments._GHz__OclAny.initOperations(_GHz__OclAny);
			Fragments._GHz__OclComparable.initOperations(_GHz__OclComparable);
			Fragments._GHz__OclSummable.initOperations(_GHz__OclSummable);
			Fragments._GHz__Real.initOperations(_GHz__Real);

			Fragments._GiB__GiB.initOperations(_GiB__GiB);
			Fragments._GiB__OclAny.initOperations(_GiB__OclAny);
			Fragments._GiB__OclComparable.initOperations(_GiB__OclComparable);
			Fragments._GiB__OclSummable.initOperations(_GiB__OclSummable);
			Fragments._GiB__Real.initOperations(_GiB__Real);

			Fragments._Integer4095__Integer.initOperations(_Integer4095__Integer);
			Fragments._Integer4095__Integer4095.initOperations(_Integer4095__Integer4095);
			Fragments._Integer4095__OclAny.initOperations(_Integer4095__OclAny);
			Fragments._Integer4095__OclComparable.initOperations(_Integer4095__OclComparable);
			Fragments._Integer4095__OclSummable.initOperations(_Integer4095__OclSummable);
			Fragments._Integer4095__Real.initOperations(_Integer4095__Real);

			Fragments._IpAddress__IpAddress.initOperations(_IpAddress__IpAddress);
			Fragments._IpAddress__OclAny.initOperations(_IpAddress__OclAny);
			Fragments._IpAddress__OclComparable.initOperations(_IpAddress__OclComparable);
			Fragments._IpAddress__OclElement.initOperations(_IpAddress__OclElement);
			Fragments._IpAddress__OclSummable.initOperations(_IpAddress__OclSummable);
			Fragments._IpAddress__String.initOperations(_IpAddress__String);

			Fragments._IpAddressRange__IpAddressRange.initOperations(_IpAddressRange__IpAddressRange);
			Fragments._IpAddressRange__OclAny.initOperations(_IpAddressRange__OclAny);
			Fragments._IpAddressRange__OclComparable.initOperations(_IpAddressRange__OclComparable);
			Fragments._IpAddressRange__OclElement.initOperations(_IpAddressRange__OclElement);
			Fragments._IpAddressRange__OclSummable.initOperations(_IpAddressRange__OclSummable);
			Fragments._IpAddressRange__String.initOperations(_IpAddressRange__String);

			Fragments._Network__Entity.initOperations(_Network__Entity);
			Fragments._Network__Network.initOperations(_Network__Network);
			Fragments._Network__OclAny.initOperations(_Network__OclAny);
			Fragments._Network__OclElement.initOperations(_Network__OclElement);
			Fragments._Network__Resource.initOperations(_Network__Resource);

			Fragments._NetworkInterfaceStatus__Class.initOperations(_NetworkInterfaceStatus__Class);
			Fragments._NetworkInterfaceStatus__DataType.initOperations(_NetworkInterfaceStatus__DataType);
			Fragments._NetworkInterfaceStatus__Element.initOperations(_NetworkInterfaceStatus__Element);
			Fragments._NetworkInterfaceStatus__Enumeration.initOperations(_NetworkInterfaceStatus__Enumeration);
			Fragments._NetworkInterfaceStatus__Nameable.initOperations(_NetworkInterfaceStatus__Nameable);
			Fragments._NetworkInterfaceStatus__NamedElement.initOperations(_NetworkInterfaceStatus__NamedElement);
			Fragments._NetworkInterfaceStatus__Namespace.initOperations(_NetworkInterfaceStatus__Namespace);
			Fragments._NetworkInterfaceStatus__NetworkInterfaceStatus.initOperations(_NetworkInterfaceStatus__NetworkInterfaceStatus);
			Fragments._NetworkInterfaceStatus__OclAny.initOperations(_NetworkInterfaceStatus__OclAny);
			Fragments._NetworkInterfaceStatus__OclElement.initOperations(_NetworkInterfaceStatus__OclElement);
			Fragments._NetworkInterfaceStatus__OclType.initOperations(_NetworkInterfaceStatus__OclType);
			Fragments._NetworkInterfaceStatus__TemplateableElement.initOperations(_NetworkInterfaceStatus__TemplateableElement);
			Fragments._NetworkInterfaceStatus__Type.initOperations(_NetworkInterfaceStatus__Type);
			Fragments._NetworkInterfaceStatus__Visitable.initOperations(_NetworkInterfaceStatus__Visitable);

			Fragments._NetworkStatus__Class.initOperations(_NetworkStatus__Class);
			Fragments._NetworkStatus__DataType.initOperations(_NetworkStatus__DataType);
			Fragments._NetworkStatus__Element.initOperations(_NetworkStatus__Element);
			Fragments._NetworkStatus__Enumeration.initOperations(_NetworkStatus__Enumeration);
			Fragments._NetworkStatus__Nameable.initOperations(_NetworkStatus__Nameable);
			Fragments._NetworkStatus__NamedElement.initOperations(_NetworkStatus__NamedElement);
			Fragments._NetworkStatus__Namespace.initOperations(_NetworkStatus__Namespace);
			Fragments._NetworkStatus__NetworkStatus.initOperations(_NetworkStatus__NetworkStatus);
			Fragments._NetworkStatus__OclAny.initOperations(_NetworkStatus__OclAny);
			Fragments._NetworkStatus__OclElement.initOperations(_NetworkStatus__OclElement);
			Fragments._NetworkStatus__OclType.initOperations(_NetworkStatus__OclType);
			Fragments._NetworkStatus__TemplateableElement.initOperations(_NetworkStatus__TemplateableElement);
			Fragments._NetworkStatus__Type.initOperations(_NetworkStatus__Type);
			Fragments._NetworkStatus__Visitable.initOperations(_NetworkStatus__Visitable);

			Fragments._Networkinterface__Entity.initOperations(_Networkinterface__Entity);
			Fragments._Networkinterface__Link.initOperations(_Networkinterface__Link);
			Fragments._Networkinterface__Networkinterface.initOperations(_Networkinterface__Networkinterface);
			Fragments._Networkinterface__OclAny.initOperations(_Networkinterface__OclAny);
			Fragments._Networkinterface__OclElement.initOperations(_Networkinterface__OclElement);

			Fragments._PositiveInteger__Integer.initOperations(_PositiveInteger__Integer);
			Fragments._PositiveInteger__OclAny.initOperations(_PositiveInteger__OclAny);
			Fragments._PositiveInteger__OclComparable.initOperations(_PositiveInteger__OclComparable);
			Fragments._PositiveInteger__OclSummable.initOperations(_PositiveInteger__OclSummable);
			Fragments._PositiveInteger__PositiveInteger.initOperations(_PositiveInteger__PositiveInteger);
			Fragments._PositiveInteger__Real.initOperations(_PositiveInteger__Real);

			Fragments._RestartMethod__Class.initOperations(_RestartMethod__Class);
			Fragments._RestartMethod__DataType.initOperations(_RestartMethod__DataType);
			Fragments._RestartMethod__Element.initOperations(_RestartMethod__Element);
			Fragments._RestartMethod__Enumeration.initOperations(_RestartMethod__Enumeration);
			Fragments._RestartMethod__Nameable.initOperations(_RestartMethod__Nameable);
			Fragments._RestartMethod__NamedElement.initOperations(_RestartMethod__NamedElement);
			Fragments._RestartMethod__Namespace.initOperations(_RestartMethod__Namespace);
			Fragments._RestartMethod__OclAny.initOperations(_RestartMethod__OclAny);
			Fragments._RestartMethod__OclElement.initOperations(_RestartMethod__OclElement);
			Fragments._RestartMethod__OclType.initOperations(_RestartMethod__OclType);
			Fragments._RestartMethod__RestartMethod.initOperations(_RestartMethod__RestartMethod);
			Fragments._RestartMethod__TemplateableElement.initOperations(_RestartMethod__TemplateableElement);
			Fragments._RestartMethod__Type.initOperations(_RestartMethod__Type);
			Fragments._RestartMethod__Visitable.initOperations(_RestartMethod__Visitable);

			Fragments._StopMethod__Class.initOperations(_StopMethod__Class);
			Fragments._StopMethod__DataType.initOperations(_StopMethod__DataType);
			Fragments._StopMethod__Element.initOperations(_StopMethod__Element);
			Fragments._StopMethod__Enumeration.initOperations(_StopMethod__Enumeration);
			Fragments._StopMethod__Nameable.initOperations(_StopMethod__Nameable);
			Fragments._StopMethod__NamedElement.initOperations(_StopMethod__NamedElement);
			Fragments._StopMethod__Namespace.initOperations(_StopMethod__Namespace);
			Fragments._StopMethod__OclAny.initOperations(_StopMethod__OclAny);
			Fragments._StopMethod__OclElement.initOperations(_StopMethod__OclElement);
			Fragments._StopMethod__OclType.initOperations(_StopMethod__OclType);
			Fragments._StopMethod__StopMethod.initOperations(_StopMethod__StopMethod);
			Fragments._StopMethod__TemplateableElement.initOperations(_StopMethod__TemplateableElement);
			Fragments._StopMethod__Type.initOperations(_StopMethod__Type);
			Fragments._StopMethod__Visitable.initOperations(_StopMethod__Visitable);

			Fragments._Storage__Entity.initOperations(_Storage__Entity);
			Fragments._Storage__OclAny.initOperations(_Storage__OclAny);
			Fragments._Storage__OclElement.initOperations(_Storage__OclElement);
			Fragments._Storage__Resource.initOperations(_Storage__Resource);
			Fragments._Storage__Storage.initOperations(_Storage__Storage);

			Fragments._StorageLinkStatus__Class.initOperations(_StorageLinkStatus__Class);
			Fragments._StorageLinkStatus__DataType.initOperations(_StorageLinkStatus__DataType);
			Fragments._StorageLinkStatus__Element.initOperations(_StorageLinkStatus__Element);
			Fragments._StorageLinkStatus__Enumeration.initOperations(_StorageLinkStatus__Enumeration);
			Fragments._StorageLinkStatus__Nameable.initOperations(_StorageLinkStatus__Nameable);
			Fragments._StorageLinkStatus__NamedElement.initOperations(_StorageLinkStatus__NamedElement);
			Fragments._StorageLinkStatus__Namespace.initOperations(_StorageLinkStatus__Namespace);
			Fragments._StorageLinkStatus__OclAny.initOperations(_StorageLinkStatus__OclAny);
			Fragments._StorageLinkStatus__OclElement.initOperations(_StorageLinkStatus__OclElement);
			Fragments._StorageLinkStatus__OclType.initOperations(_StorageLinkStatus__OclType);
			Fragments._StorageLinkStatus__StorageLinkStatus.initOperations(_StorageLinkStatus__StorageLinkStatus);
			Fragments._StorageLinkStatus__TemplateableElement.initOperations(_StorageLinkStatus__TemplateableElement);
			Fragments._StorageLinkStatus__Type.initOperations(_StorageLinkStatus__Type);
			Fragments._StorageLinkStatus__Visitable.initOperations(_StorageLinkStatus__Visitable);

			Fragments._StorageStatus__Class.initOperations(_StorageStatus__Class);
			Fragments._StorageStatus__DataType.initOperations(_StorageStatus__DataType);
			Fragments._StorageStatus__Element.initOperations(_StorageStatus__Element);
			Fragments._StorageStatus__Enumeration.initOperations(_StorageStatus__Enumeration);
			Fragments._StorageStatus__Nameable.initOperations(_StorageStatus__Nameable);
			Fragments._StorageStatus__NamedElement.initOperations(_StorageStatus__NamedElement);
			Fragments._StorageStatus__Namespace.initOperations(_StorageStatus__Namespace);
			Fragments._StorageStatus__OclAny.initOperations(_StorageStatus__OclAny);
			Fragments._StorageStatus__OclElement.initOperations(_StorageStatus__OclElement);
			Fragments._StorageStatus__OclType.initOperations(_StorageStatus__OclType);
			Fragments._StorageStatus__StorageStatus.initOperations(_StorageStatus__StorageStatus);
			Fragments._StorageStatus__TemplateableElement.initOperations(_StorageStatus__TemplateableElement);
			Fragments._StorageStatus__Type.initOperations(_StorageStatus__Type);
			Fragments._StorageStatus__Visitable.initOperations(_StorageStatus__Visitable);

			Fragments._Storagelink__Entity.initOperations(_Storagelink__Entity);
			Fragments._Storagelink__Link.initOperations(_Storagelink__Link);
			Fragments._Storagelink__OclAny.initOperations(_Storagelink__OclAny);
			Fragments._Storagelink__OclElement.initOperations(_Storagelink__OclElement);
			Fragments._Storagelink__Storagelink.initOperations(_Storagelink__Storagelink);

			Fragments._SuspendMethod__Class.initOperations(_SuspendMethod__Class);
			Fragments._SuspendMethod__DataType.initOperations(_SuspendMethod__DataType);
			Fragments._SuspendMethod__Element.initOperations(_SuspendMethod__Element);
			Fragments._SuspendMethod__Enumeration.initOperations(_SuspendMethod__Enumeration);
			Fragments._SuspendMethod__Nameable.initOperations(_SuspendMethod__Nameable);
			Fragments._SuspendMethod__NamedElement.initOperations(_SuspendMethod__NamedElement);
			Fragments._SuspendMethod__Namespace.initOperations(_SuspendMethod__Namespace);
			Fragments._SuspendMethod__OclAny.initOperations(_SuspendMethod__OclAny);
			Fragments._SuspendMethod__OclElement.initOperations(_SuspendMethod__OclElement);
			Fragments._SuspendMethod__OclType.initOperations(_SuspendMethod__OclType);
			Fragments._SuspendMethod__SuspendMethod.initOperations(_SuspendMethod__SuspendMethod);
			Fragments._SuspendMethod__TemplateableElement.initOperations(_SuspendMethod__TemplateableElement);
			Fragments._SuspendMethod__Type.initOperations(_SuspendMethod__Type);
			Fragments._SuspendMethod__Visitable.initOperations(_SuspendMethod__Visitable);

			Fragments._Token__OclAny.initOperations(_Token__OclAny);
			Fragments._Token__OclComparable.initOperations(_Token__OclComparable);
			Fragments._Token__OclElement.initOperations(_Token__OclElement);
			Fragments._Token__OclSummable.initOperations(_Token__OclSummable);
			Fragments._Token__String.initOperations(_Token__String);
			Fragments._Token__Token.initOperations(_Token__Token);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty[] _Allocation = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Architecture = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Compute = {
			InfrastructureTables.Properties._Compute__architecture,
			InfrastructureTables.Properties._Compute__cores,
			InfrastructureTables.Properties._Compute__hostname,
			InfrastructureTables.Properties._Compute__memory,
			InfrastructureTables.Properties._Compute__speed,
			InfrastructureTables.Properties._Compute__state
		};

		private static final /*@NonNull*/ ExecutorProperty[] _ComputeStatus = {};

		private static final /*@NonNull*/ ExecutorProperty[] _GHz = {};

		private static final /*@NonNull*/ ExecutorProperty[] _GiB = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Integer4095 = {};

		private static final /*@NonNull*/ ExecutorProperty[] _IpAddress = {};

		private static final /*@NonNull*/ ExecutorProperty[] _IpAddressRange = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Network = {
			InfrastructureTables.Properties._Network__label,
			InfrastructureTables.Properties._Network__state,
			InfrastructureTables.Properties._Network__vlan
		};

		private static final /*@NonNull*/ ExecutorProperty[] _NetworkInterfaceStatus = {};

		private static final /*@NonNull*/ ExecutorProperty[] _NetworkStatus = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Networkinterface = {
			InfrastructureTables.Properties._Networkinterface__interface,
			InfrastructureTables.Properties._Networkinterface__mac,
			InfrastructureTables.Properties._Networkinterface__state
		};

		private static final /*@NonNull*/ ExecutorProperty[] _PositiveInteger = {};

		private static final /*@NonNull*/ ExecutorProperty[] _RestartMethod = {};

		private static final /*@NonNull*/ ExecutorProperty[] _StopMethod = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Storage = {
			InfrastructureTables.Properties._Storage__size,
			InfrastructureTables.Properties._Storage__state
		};

		private static final /*@NonNull*/ ExecutorProperty[] _StorageLinkStatus = {};

		private static final /*@NonNull*/ ExecutorProperty[] _StorageStatus = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Storagelink = {
			InfrastructureTables.Properties._Storagelink__deviceid,
			InfrastructureTables.Properties._Storagelink__mountpoint,
			InfrastructureTables.Properties._Storagelink__state
		};

		private static final /*@NonNull*/ ExecutorProperty[] _SuspendMethod = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Token = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Allocation__Allocation.initProperties(_Allocation);
			Fragments._Architecture__Architecture.initProperties(_Architecture);
			Fragments._Compute__Compute.initProperties(_Compute);
			Fragments._ComputeStatus__ComputeStatus.initProperties(_ComputeStatus);
			Fragments._GHz__GHz.initProperties(_GHz);
			Fragments._GiB__GiB.initProperties(_GiB);
			Fragments._Integer4095__Integer4095.initProperties(_Integer4095);
			Fragments._IpAddress__IpAddress.initProperties(_IpAddress);
			Fragments._IpAddressRange__IpAddressRange.initProperties(_IpAddressRange);
			Fragments._Network__Network.initProperties(_Network);
			Fragments._NetworkInterfaceStatus__NetworkInterfaceStatus.initProperties(_NetworkInterfaceStatus);
			Fragments._NetworkStatus__NetworkStatus.initProperties(_NetworkStatus);
			Fragments._Networkinterface__Networkinterface.initProperties(_Networkinterface);
			Fragments._PositiveInteger__PositiveInteger.initProperties(_PositiveInteger);
			Fragments._RestartMethod__RestartMethod.initProperties(_RestartMethod);
			Fragments._StopMethod__StopMethod.initProperties(_StopMethod);
			Fragments._Storage__Storage.initProperties(_Storage);
			Fragments._StorageLinkStatus__StorageLinkStatus.initProperties(_StorageLinkStatus);
			Fragments._StorageStatus__StorageStatus.initProperties(_StorageStatus);
			Fragments._Storagelink__Storagelink.initProperties(_Storagelink);
			Fragments._SuspendMethod__SuspendMethod.initProperties(_SuspendMethod);
			Fragments._Token__Token.initProperties(_Token);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Allocation__dynamic = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.ALLOCATION.getEEnumLiteral("dynamic"), Types._Allocation, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Allocation__static = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.ALLOCATION.getEEnumLiteral("static"), Types._Allocation, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _Allocation = {
			_Allocation__dynamic,
			_Allocation__static
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Architecture__x86 = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.ARCHITECTURE.getEEnumLiteral("x86"), Types._Architecture, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Architecture__x64 = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.ARCHITECTURE.getEEnumLiteral("x64"), Types._Architecture, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _Architecture = {
			_Architecture__x86,
			_Architecture__x64
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComputeStatus__active = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.COMPUTE_STATUS.getEEnumLiteral("active"), Types._ComputeStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComputeStatus__inactive = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.COMPUTE_STATUS.getEEnumLiteral("inactive"), Types._ComputeStatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComputeStatus__suspended = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.COMPUTE_STATUS.getEEnumLiteral("suspended"), Types._ComputeStatus, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _ComputeStatus = {
			_ComputeStatus__active,
			_ComputeStatus__inactive,
			_ComputeStatus__suspended
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkInterfaceStatus__active = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_INTERFACE_STATUS.getEEnumLiteral("active"), Types._NetworkInterfaceStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkInterfaceStatus__inactive = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_INTERFACE_STATUS.getEEnumLiteral("inactive"), Types._NetworkInterfaceStatus, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _NetworkInterfaceStatus = {
			_NetworkInterfaceStatus__active,
			_NetworkInterfaceStatus__inactive
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkStatus__active = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_STATUS.getEEnumLiteral("active"), Types._NetworkStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkStatus__inactive = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_STATUS.getEEnumLiteral("inactive"), Types._NetworkStatus, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _NetworkStatus = {
			_NetworkStatus__active,
			_NetworkStatus__inactive
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _RestartMethod__graceful = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.RESTART_METHOD.getEEnumLiteral("graceful"), Types._RestartMethod, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _RestartMethod__warm = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.RESTART_METHOD.getEEnumLiteral("warm"), Types._RestartMethod, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _RestartMethod__cold = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.RESTART_METHOD.getEEnumLiteral("cold"), Types._RestartMethod, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _RestartMethod = {
			_RestartMethod__graceful,
			_RestartMethod__warm,
			_RestartMethod__cold
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StopMethod__graceful = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STOP_METHOD.getEEnumLiteral("graceful"), Types._StopMethod, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StopMethod__acpioff = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STOP_METHOD.getEEnumLiteral("acpioff"), Types._StopMethod, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StopMethod__poweroff = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STOP_METHOD.getEEnumLiteral("poweroff"), Types._StopMethod, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _StopMethod = {
			_StopMethod__graceful,
			_StopMethod__acpioff,
			_StopMethod__poweroff
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageLinkStatus__active = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_LINK_STATUS.getEEnumLiteral("active"), Types._StorageLinkStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageLinkStatus__inactive = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_LINK_STATUS.getEEnumLiteral("inactive"), Types._StorageLinkStatus, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _StorageLinkStatus = {
			_StorageLinkStatus__active,
			_StorageLinkStatus__inactive
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageStatus__online = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_STATUS.getEEnumLiteral("online"), Types._StorageStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageStatus__offline = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_STATUS.getEEnumLiteral("offline"), Types._StorageStatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageStatus__backup = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_STATUS.getEEnumLiteral("backup"), Types._StorageStatus, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageStatus__snapshot = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_STATUS.getEEnumLiteral("snapshot"), Types._StorageStatus, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageStatus__resize = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_STATUS.getEEnumLiteral("resize"), Types._StorageStatus, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageStatus__degraded = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_STATUS.getEEnumLiteral("degraded"), Types._StorageStatus, 5);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _StorageStatus = {
			_StorageStatus__online,
			_StorageStatus__offline,
			_StorageStatus__backup,
			_StorageStatus__snapshot,
			_StorageStatus__resize,
			_StorageStatus__degraded
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SuspendMethod__hibernate = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.SUSPEND_METHOD.getEEnumLiteral("hibernate"), Types._SuspendMethod, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SuspendMethod__suspend = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.SUSPEND_METHOD.getEEnumLiteral("suspend"), Types._SuspendMethod, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _SuspendMethod = {
			_SuspendMethod__hibernate,
			_SuspendMethod__suspend
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Allocation.initLiterals(_Allocation);
			Types._Architecture.initLiterals(_Architecture);
			Types._ComputeStatus.initLiterals(_ComputeStatus);
			Types._NetworkInterfaceStatus.initLiterals(_NetworkInterfaceStatus);
			Types._NetworkStatus.initLiterals(_NetworkStatus);
			Types._RestartMethod.initLiterals(_RestartMethod);
			Types._StopMethod.initLiterals(_StopMethod);
			Types._StorageLinkStatus.initLiterals(_StorageLinkStatus);
			Types._StorageStatus.initLiterals(_StorageStatus);
			Types._SuspendMethod.initLiterals(_SuspendMethod);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::EnumerationLiterals and all preceding sub-packages.
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

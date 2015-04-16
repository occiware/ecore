/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   platform:/resource/org.occiware.clouddesigner.occi.docker/model/Docker.ecore
 * using:
 *   platform:/resource/org.occiware.clouddesigner.occi.docker/model/Docker.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.occiware.clouddesigner.occi.docker;

import java.lang.String;
import org.eclipse.ocl.examples.domain.elements.DomainParameterTypes;
import org.eclipse.ocl.examples.domain.elements.DomainTypeParameters;
import org.eclipse.ocl.examples.domain.ids.ClassId;
import org.eclipse.ocl.examples.domain.ids.CollectionTypeId;
import org.eclipse.ocl.examples.domain.ids.DataTypeId;
import org.eclipse.ocl.examples.domain.ids.EnumerationId;
import org.eclipse.ocl.examples.domain.ids.IdManager;
import org.eclipse.ocl.examples.domain.ids.MetaclassId;
import org.eclipse.ocl.examples.domain.ids.NsURIPackageId;
import org.eclipse.ocl.examples.domain.ids.PropertyId;
import org.eclipse.ocl.examples.domain.ids.TuplePartId;
import org.eclipse.ocl.examples.domain.ids.TupleTypeId;
import org.eclipse.ocl.examples.domain.ids.TypeId;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorOperation;
import org.eclipse.ocl.examples.library.executor.ExecutorProperty;
import org.eclipse.ocl.examples.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.examples.pivot.PivotTables;
import org.occiware.clouddesigner.OCCI.OCCIPackage;
import org.occiware.clouddesigner.OCCI.OCCITables;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.DockerTables;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructureTables;

/**
 * DockerTables provides the dispatch tables for the docker for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class DockerTables
{
	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DockerPackage.eINSTANCE, null);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_occiware_org_s_docker = IdManager.getNsURIPackageId("http://occiware.org/docker", null, DockerPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi = IdManager.getNsURIPackageId("http://schemas.ogf.org/occi", null, OCCIPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure = IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure", null, null);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Compute = DockerTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getClassId("Compute", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Container = DockerTables.PACKid_http_c_s_s_occiware_org_s_docker.getClassId("Container", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Contains = DockerTables.PACKid_http_c_s_s_occiware_org_s_docker.getClassId("Contains", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Link = DockerTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Link", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Link_0 = DockerTables.PACKid_http_c_s_s_occiware_org_s_docker.getClassId("Link", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Machine = DockerTables.PACKid_http_c_s_s_occiware_org_s_docker.getClassId("Machine", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Machine_VirtualBox = DockerTables.PACKid_http_c_s_s_occiware_org_s_docker.getClassId("Machine_VirtualBox", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Resource = DockerTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getClassId("Resource", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Volumesfrom = DockerTables.PACKid_http_c_s_s_occiware_org_s_docker.getClassId("Volumesfrom", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_GiB = DockerTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure.getDataTypeId("GiB", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ DataTypeId DATAid_Number = DockerTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi.getDataTypeId("Number", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ EnumerationId ENUMid_Mode = DockerTables.PACKid_http_c_s_s_occiware_org_s_docker.getEnumerationId("Mode");
    public static final /*@NonNull*/ /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
    public static final /*@NonNull*/ /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_Real = TypeId.SEQUENCE.getSpecializedId(TypeId.REAL);
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR_Containers_32_consume_32 = "Containers consume ";
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR__32_when_32_memory_32_is_32_equa = " when memory is equals to ";
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Resource = TypeId.BAG.getSpecializedId(DockerTables.CLSSid_Resource);
    public static final /*@NonNull*/ /*@NonInvalid*/ MetaclassId METAid_Metaclass = TypeId.METACLASS.getSpecializedId(DockerTables.CLSSid_Link_0);
    public static final /*@NonNull*/ /*@NonInvalid*/ MetaclassId METAid_Metaclass_0 = TypeId.METACLASS.getSpecializedId(DockerTables.CLSSid_Volumesfrom);
    public static final /*@NonNull*/ /*@NonInvalid*/ MetaclassId METAid_Metaclass_1 = TypeId.METACLASS.getSpecializedId(DockerTables.CLSSid_Container);
    public static final /*@NonNull*/ /*@NonInvalid*/ MetaclassId METAid_Metaclass_2 = TypeId.METACLASS.getSpecializedId(DockerTables.CLSSid_Contains);
    public static final /*@NonNull*/ /*@NonInvalid*/ MetaclassId METAid_Metaclass_3 = TypeId.METACLASS.getSpecializedId(DockerTables.CLSSid_Machine);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Link = TypeId.ORDERED_SET.getSpecializedId(DockerTables.CLSSid_Link);
    public static final /*@NonNull*/ /*@NonInvalid*/ PropertyId PROPid_memory = DockerTables.CLSSid_Compute.getPropertyId("memory");
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Container = TypeId.SEQUENCE.getSpecializedId(DockerTables.CLSSid_Container);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Link = TypeId.SEQUENCE.getSpecializedId(DockerTables.CLSSid_Link);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Resource = TypeId.SEQUENCE.getSpecializedId(DockerTables.CLSSid_Resource);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Contains = TypeId.SET.getSpecializedId(DockerTables.CLSSid_Contains);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Machine = TypeId.SET.getSpecializedId(DockerTables.CLSSid_Machine);
    public static final /*@NonNull*/ /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", DockerTables.PARTid_, DockerTables.PARTid__0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		public static final /*@NonNull*/ EcoreExecutorType _Container = new EcoreExecutorType(DockerPackage.Literals.CONTAINER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Contains = new EcoreExecutorType(DockerPackage.Literals.CONTAINS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Link = new EcoreExecutorType(DockerPackage.Literals.LINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine = new EcoreExecutorType(DockerPackage.Literals.MACHINE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_Amazon_EC2 = new EcoreExecutorType(DockerPackage.Literals.MACHINE_AMAZON_EC2, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_Digital_Ocean = new EcoreExecutorType(DockerPackage.Literals.MACHINE_DIGITAL_OCEAN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_Google_Compute_Engine = new EcoreExecutorType(DockerPackage.Literals.MACHINE_GOOGLE_COMPUTE_ENGINE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_IBM_SoftLayer = new EcoreExecutorType(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_Microsoft_Azure = new EcoreExecutorType(DockerPackage.Literals.MACHINE_MICROSOFT_AZURE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_Microsoft_Hyper_V = new EcoreExecutorType(DockerPackage.Literals.MACHINE_MICROSOFT_HYPER_V, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_OpenStack = new EcoreExecutorType(DockerPackage.Literals.MACHINE_OPEN_STACK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_Rackspace = new EcoreExecutorType(DockerPackage.Literals.MACHINE_RACKSPACE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_VMware_Fusion = new EcoreExecutorType(DockerPackage.Literals.MACHINE_VMWARE_FUSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_VMware_vCloud_Air = new EcoreExecutorType(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_VMware_vSphere = new EcoreExecutorType(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Machine_VirtualBox = new EcoreExecutorType(DockerPackage.Literals.MACHINE_VIRTUAL_BOX, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Mode = new EcoreExecutorEnumeration(DockerPackage.Literals.MODE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Volumesfrom = new EcoreExecutorType(DockerPackage.Literals.VOLUMESFROM, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType[] types = {
			_Container,
			_Contains,
			_Link,
			_Machine,
			_Machine_Amazon_EC2,
			_Machine_Digital_Ocean,
			_Machine_Google_Compute_Engine,
			_Machine_IBM_SoftLayer,
			_Machine_Microsoft_Azure,
			_Machine_Microsoft_Hyper_V,
			_Machine_OpenStack,
			_Machine_Rackspace,
			_Machine_VMware_Fusion,
			_Machine_VMware_vCloud_Air,
			_Machine_VMware_vSphere,
			_Machine_VirtualBox,
			_Mode,
			_Volumesfrom
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			TypeFragments.init();
			FragmentOperations.init();
			FragmentProperties.init();
			EnumerationLiterals.init();
		}

		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		private static final /*@NonNull*/ ExecutorFragment _Container__Compute = new ExecutorFragment(Types._Container, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Container__Container = new ExecutorFragment(Types._Container, DockerTables.Types._Container);
		private static final /*@NonNull*/ ExecutorFragment _Container__Entity = new ExecutorFragment(Types._Container, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Container__OclAny = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Container__OclElement = new ExecutorFragment(Types._Container, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Container__Resource = new ExecutorFragment(Types._Container, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Contains__Contains = new ExecutorFragment(Types._Contains, DockerTables.Types._Contains);
		private static final /*@NonNull*/ ExecutorFragment _Contains__Entity = new ExecutorFragment(Types._Contains, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Contains__Link = new ExecutorFragment(Types._Contains, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Contains__OclAny = new ExecutorFragment(Types._Contains, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Contains__OclElement = new ExecutorFragment(Types._Contains, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Link__Entity = new ExecutorFragment(Types._Link, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Link__Link_1 = new ExecutorFragment(Types._Link, DockerTables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Link__Link = new ExecutorFragment(Types._Link, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Link__OclAny = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Link__OclElement = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Machine__Compute = new ExecutorFragment(Types._Machine, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine__Entity = new ExecutorFragment(Types._Machine, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine__Machine = new ExecutorFragment(Types._Machine, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine__OclAny = new ExecutorFragment(Types._Machine, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine__OclElement = new ExecutorFragment(Types._Machine, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine__Resource = new ExecutorFragment(Types._Machine, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_Amazon_EC2__Compute = new ExecutorFragment(Types._Machine_Amazon_EC2, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Amazon_EC2__Entity = new ExecutorFragment(Types._Machine_Amazon_EC2, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Amazon_EC2__Machine = new ExecutorFragment(Types._Machine_Amazon_EC2, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Amazon_EC2__Machine_Amazon_EC2 = new ExecutorFragment(Types._Machine_Amazon_EC2, DockerTables.Types._Machine_Amazon_EC2);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Amazon_EC2__OclAny = new ExecutorFragment(Types._Machine_Amazon_EC2, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Amazon_EC2__OclElement = new ExecutorFragment(Types._Machine_Amazon_EC2, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Amazon_EC2__Resource = new ExecutorFragment(Types._Machine_Amazon_EC2, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_Digital_Ocean__Compute = new ExecutorFragment(Types._Machine_Digital_Ocean, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Digital_Ocean__Entity = new ExecutorFragment(Types._Machine_Digital_Ocean, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Digital_Ocean__Machine = new ExecutorFragment(Types._Machine_Digital_Ocean, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Digital_Ocean__Machine_Digital_Ocean = new ExecutorFragment(Types._Machine_Digital_Ocean, DockerTables.Types._Machine_Digital_Ocean);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Digital_Ocean__OclAny = new ExecutorFragment(Types._Machine_Digital_Ocean, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Digital_Ocean__OclElement = new ExecutorFragment(Types._Machine_Digital_Ocean, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Digital_Ocean__Resource = new ExecutorFragment(Types._Machine_Digital_Ocean, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_Google_Compute_Engine__Compute = new ExecutorFragment(Types._Machine_Google_Compute_Engine, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Google_Compute_Engine__Entity = new ExecutorFragment(Types._Machine_Google_Compute_Engine, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Google_Compute_Engine__Machine = new ExecutorFragment(Types._Machine_Google_Compute_Engine, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Google_Compute_Engine__Machine_Google_Compute_Engine = new ExecutorFragment(Types._Machine_Google_Compute_Engine, DockerTables.Types._Machine_Google_Compute_Engine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Google_Compute_Engine__OclAny = new ExecutorFragment(Types._Machine_Google_Compute_Engine, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Google_Compute_Engine__OclElement = new ExecutorFragment(Types._Machine_Google_Compute_Engine, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Google_Compute_Engine__Resource = new ExecutorFragment(Types._Machine_Google_Compute_Engine, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_IBM_SoftLayer__Compute = new ExecutorFragment(Types._Machine_IBM_SoftLayer, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_IBM_SoftLayer__Entity = new ExecutorFragment(Types._Machine_IBM_SoftLayer, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_IBM_SoftLayer__Machine = new ExecutorFragment(Types._Machine_IBM_SoftLayer, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_IBM_SoftLayer__Machine_IBM_SoftLayer = new ExecutorFragment(Types._Machine_IBM_SoftLayer, DockerTables.Types._Machine_IBM_SoftLayer);
		private static final /*@NonNull*/ ExecutorFragment _Machine_IBM_SoftLayer__OclAny = new ExecutorFragment(Types._Machine_IBM_SoftLayer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_IBM_SoftLayer__OclElement = new ExecutorFragment(Types._Machine_IBM_SoftLayer, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_IBM_SoftLayer__Resource = new ExecutorFragment(Types._Machine_IBM_SoftLayer, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Azure__Compute = new ExecutorFragment(Types._Machine_Microsoft_Azure, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Azure__Entity = new ExecutorFragment(Types._Machine_Microsoft_Azure, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Azure__Machine = new ExecutorFragment(Types._Machine_Microsoft_Azure, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Azure__Machine_Microsoft_Azure = new ExecutorFragment(Types._Machine_Microsoft_Azure, DockerTables.Types._Machine_Microsoft_Azure);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Azure__OclAny = new ExecutorFragment(Types._Machine_Microsoft_Azure, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Azure__OclElement = new ExecutorFragment(Types._Machine_Microsoft_Azure, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Azure__Resource = new ExecutorFragment(Types._Machine_Microsoft_Azure, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Hyper_V__Compute = new ExecutorFragment(Types._Machine_Microsoft_Hyper_V, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Hyper_V__Entity = new ExecutorFragment(Types._Machine_Microsoft_Hyper_V, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Hyper_V__Machine = new ExecutorFragment(Types._Machine_Microsoft_Hyper_V, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Hyper_V__Machine_Microsoft_Hyper_V = new ExecutorFragment(Types._Machine_Microsoft_Hyper_V, DockerTables.Types._Machine_Microsoft_Hyper_V);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Hyper_V__OclAny = new ExecutorFragment(Types._Machine_Microsoft_Hyper_V, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Hyper_V__OclElement = new ExecutorFragment(Types._Machine_Microsoft_Hyper_V, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Microsoft_Hyper_V__Resource = new ExecutorFragment(Types._Machine_Microsoft_Hyper_V, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_OpenStack__Compute = new ExecutorFragment(Types._Machine_OpenStack, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_OpenStack__Entity = new ExecutorFragment(Types._Machine_OpenStack, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_OpenStack__Machine = new ExecutorFragment(Types._Machine_OpenStack, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_OpenStack__Machine_OpenStack = new ExecutorFragment(Types._Machine_OpenStack, DockerTables.Types._Machine_OpenStack);
		private static final /*@NonNull*/ ExecutorFragment _Machine_OpenStack__OclAny = new ExecutorFragment(Types._Machine_OpenStack, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_OpenStack__OclElement = new ExecutorFragment(Types._Machine_OpenStack, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_OpenStack__Resource = new ExecutorFragment(Types._Machine_OpenStack, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_Rackspace__Compute = new ExecutorFragment(Types._Machine_Rackspace, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Rackspace__Entity = new ExecutorFragment(Types._Machine_Rackspace, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Rackspace__Machine = new ExecutorFragment(Types._Machine_Rackspace, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Rackspace__Machine_Rackspace = new ExecutorFragment(Types._Machine_Rackspace, DockerTables.Types._Machine_Rackspace);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Rackspace__OclAny = new ExecutorFragment(Types._Machine_Rackspace, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Rackspace__OclElement = new ExecutorFragment(Types._Machine_Rackspace, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_Rackspace__Resource = new ExecutorFragment(Types._Machine_Rackspace, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_Fusion__Compute = new ExecutorFragment(Types._Machine_VMware_Fusion, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_Fusion__Entity = new ExecutorFragment(Types._Machine_VMware_Fusion, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_Fusion__Machine = new ExecutorFragment(Types._Machine_VMware_Fusion, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_Fusion__Machine_VMware_Fusion = new ExecutorFragment(Types._Machine_VMware_Fusion, DockerTables.Types._Machine_VMware_Fusion);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_Fusion__OclAny = new ExecutorFragment(Types._Machine_VMware_Fusion, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_Fusion__OclElement = new ExecutorFragment(Types._Machine_VMware_Fusion, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_Fusion__Resource = new ExecutorFragment(Types._Machine_VMware_Fusion, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vCloud_Air__Compute = new ExecutorFragment(Types._Machine_VMware_vCloud_Air, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vCloud_Air__Entity = new ExecutorFragment(Types._Machine_VMware_vCloud_Air, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vCloud_Air__Machine = new ExecutorFragment(Types._Machine_VMware_vCloud_Air, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vCloud_Air__Machine_VMware_vCloud_Air = new ExecutorFragment(Types._Machine_VMware_vCloud_Air, DockerTables.Types._Machine_VMware_vCloud_Air);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vCloud_Air__OclAny = new ExecutorFragment(Types._Machine_VMware_vCloud_Air, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vCloud_Air__OclElement = new ExecutorFragment(Types._Machine_VMware_vCloud_Air, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vCloud_Air__Resource = new ExecutorFragment(Types._Machine_VMware_vCloud_Air, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vSphere__Compute = new ExecutorFragment(Types._Machine_VMware_vSphere, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vSphere__Entity = new ExecutorFragment(Types._Machine_VMware_vSphere, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vSphere__Machine = new ExecutorFragment(Types._Machine_VMware_vSphere, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vSphere__Machine_VMware_vSphere = new ExecutorFragment(Types._Machine_VMware_vSphere, DockerTables.Types._Machine_VMware_vSphere);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vSphere__OclAny = new ExecutorFragment(Types._Machine_VMware_vSphere, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vSphere__OclElement = new ExecutorFragment(Types._Machine_VMware_vSphere, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VMware_vSphere__Resource = new ExecutorFragment(Types._Machine_VMware_vSphere, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Machine_VirtualBox__Compute = new ExecutorFragment(Types._Machine_VirtualBox, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VirtualBox__Entity = new ExecutorFragment(Types._Machine_VirtualBox, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VirtualBox__Machine = new ExecutorFragment(Types._Machine_VirtualBox, DockerTables.Types._Machine);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VirtualBox__Machine_VirtualBox = new ExecutorFragment(Types._Machine_VirtualBox, DockerTables.Types._Machine_VirtualBox);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VirtualBox__OclAny = new ExecutorFragment(Types._Machine_VirtualBox, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VirtualBox__OclElement = new ExecutorFragment(Types._Machine_VirtualBox, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Machine_VirtualBox__Resource = new ExecutorFragment(Types._Machine_VirtualBox, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Mode__Class = new ExecutorFragment(Types._Mode, PivotTables.Types._Class);
		private static final /*@NonNull*/ ExecutorFragment _Mode__DataType = new ExecutorFragment(Types._Mode, PivotTables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _Mode__Element = new ExecutorFragment(Types._Mode, PivotTables.Types._Element);
		private static final /*@NonNull*/ ExecutorFragment _Mode__Enumeration = new ExecutorFragment(Types._Mode, PivotTables.Types._Enumeration);
		private static final /*@NonNull*/ ExecutorFragment _Mode__Mode = new ExecutorFragment(Types._Mode, DockerTables.Types._Mode);
		private static final /*@NonNull*/ ExecutorFragment _Mode__Nameable = new ExecutorFragment(Types._Mode, PivotTables.Types._Nameable);
		private static final /*@NonNull*/ ExecutorFragment _Mode__NamedElement = new ExecutorFragment(Types._Mode, PivotTables.Types._NamedElement);
		private static final /*@NonNull*/ ExecutorFragment _Mode__Namespace = new ExecutorFragment(Types._Mode, PivotTables.Types._Namespace);
		private static final /*@NonNull*/ ExecutorFragment _Mode__OclAny = new ExecutorFragment(Types._Mode, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mode__OclElement = new ExecutorFragment(Types._Mode, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Mode__OclType = new ExecutorFragment(Types._Mode, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Mode__ParameterableElement = new ExecutorFragment(Types._Mode, PivotTables.Types._ParameterableElement);
		private static final /*@NonNull*/ ExecutorFragment _Mode__TemplateableElement = new ExecutorFragment(Types._Mode, PivotTables.Types._TemplateableElement);
		private static final /*@NonNull*/ ExecutorFragment _Mode__Type = new ExecutorFragment(Types._Mode, PivotTables.Types._Type);
		private static final /*@NonNull*/ ExecutorFragment _Mode__Visitable = new ExecutorFragment(Types._Mode, PivotTables.Types._Visitable);

		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__Entity = new ExecutorFragment(Types._Volumesfrom, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__Link = new ExecutorFragment(Types._Volumesfrom, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__OclAny = new ExecutorFragment(Types._Volumesfrom, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__OclElement = new ExecutorFragment(Types._Volumesfrom, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Volumesfrom__Volumesfrom = new ExecutorFragment(Types._Volumesfrom, DockerTables.Types._Volumesfrom);

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
		public static final /*@NonNull*/ DomainParameterTypes _String = new DomainParameterTypes(OCCITables.Types._String);
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 */
	public static class Operations {
		public static final /*@NonNull*/ ExecutorOperation _Container__create = new ExecutorOperation("create", Parameters._, Types._Container,
			0, DomainTypeParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Container__kill = new ExecutorOperation("kill", Parameters._String, Types._Container,
			1, DomainTypeParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Container__pause = new ExecutorOperation("pause", Parameters._, Types._Container,
			2, DomainTypeParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Container__run = new ExecutorOperation("run", Parameters._, Types._Container,
			3, DomainTypeParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Container__unpause = new ExecutorOperation("unpause", Parameters._, Types._Container,
			4, DomainTypeParameters.EMPTY_LIST, null);

	}

	/**
	 *	The property descriptors for each property of each type.
	 */
	public static class Properties {

		public static final /*@NonNull*/ ExecutorProperty _Container__add_host = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__ADD_HOST, Types._Container, 0);
		public static final /*@NonNull*/ ExecutorProperty _Container__build = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__BUILD, Types._Container, 1);
		public static final /*@NonNull*/ ExecutorProperty _Container__cap_add = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CAP_ADD, Types._Container, 2);
		public static final /*@NonNull*/ ExecutorProperty _Container__cap_drop = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CAP_DROP, Types._Container, 3);
		public static final /*@NonNull*/ ExecutorProperty _Container__command = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__COMMAND, Types._Container, 4);
		public static final /*@NonNull*/ ExecutorProperty _Container__containerid = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CONTAINERID, Types._Container, 5);
		public static final /*@NonNull*/ ExecutorProperty _Container__cpu_shares = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CPU_SHARES, Types._Container, 6);
		public static final /*@NonNull*/ ExecutorProperty _Container__cpuset = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__CPUSET, Types._Container, 7);
		public static final /*@NonNull*/ ExecutorProperty _Container__device = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DEVICE, Types._Container, 8);
		public static final /*@NonNull*/ ExecutorProperty _Container__dns = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DNS, Types._Container, 9);
		public static final /*@NonNull*/ ExecutorProperty _Container__dns_search = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DNS_SEARCH, Types._Container, 10);
		public static final /*@NonNull*/ ExecutorProperty _Container__domainname = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__DOMAINNAME, Types._Container, 11);
		public static final /*@NonNull*/ ExecutorProperty _Container__entrypoint = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__ENTRYPOINT, Types._Container, 12);
		public static final /*@NonNull*/ ExecutorProperty _Container__env_file = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__ENV_FILE, Types._Container, 13);
		public static final /*@NonNull*/ ExecutorProperty _Container__environment = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__ENVIRONMENT, Types._Container, 14);
		public static final /*@NonNull*/ ExecutorProperty _Container__expose = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__EXPOSE, Types._Container, 15);
		public static final /*@NonNull*/ ExecutorProperty _Container__image = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__IMAGE, Types._Container, 16);
		public static final /*@NonNull*/ ExecutorProperty _Container__interactive = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__INTERACTIVE, Types._Container, 17);
		public static final /*@NonNull*/ ExecutorProperty _Container__ipc = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__IPC, Types._Container, 18);
		public static final /*@NonNull*/ ExecutorProperty _Container__lxc_conf = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__LXC_CONF, Types._Container, 19);
		public static final /*@NonNull*/ ExecutorProperty _Container__mac_address = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MAC_ADDRESS, Types._Container, 20);
		public static final /*@NonNull*/ ExecutorProperty _Container__mem_limit = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MEM_LIMIT, Types._Container, 21);
		public static final /*@NonNull*/ ExecutorProperty _Container__memory_swap = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__MEMORY_SWAP, Types._Container, 22);
		public static final /*@NonNull*/ ExecutorProperty _Container__name = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__NAME, Types._Container, 23);
		public static final /*@NonNull*/ ExecutorProperty _Container__net = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__NET, Types._Container, 24);
		public static final /*@NonNull*/ ExecutorProperty _Container__pid = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__PID, Types._Container, 25);
		public static final /*@NonNull*/ ExecutorProperty _Container__ports = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__PORTS, Types._Container, 26);
		public static final /*@NonNull*/ ExecutorProperty _Container__privileged = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__PRIVILEGED, Types._Container, 27);
		public static final /*@NonNull*/ ExecutorProperty _Container__publish_all = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__PUBLISH_ALL, Types._Container, 28);
		public static final /*@NonNull*/ ExecutorProperty _Container__read_only = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__READ_ONLY, Types._Container, 29);
		public static final /*@NonNull*/ ExecutorProperty _Container__restart = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__RESTART, Types._Container, 30);
		public static final /*@NonNull*/ ExecutorProperty _Container__rm = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__RM, Types._Container, 31);
		public static final /*@NonNull*/ ExecutorProperty _Container__security_opt = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__SECURITY_OPT, Types._Container, 32);
		public static final /*@NonNull*/ ExecutorProperty _Container__stdin_open = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__STDIN_OPEN, Types._Container, 33);
		public static final /*@NonNull*/ ExecutorProperty _Container__tty = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__TTY, Types._Container, 34);
		public static final /*@NonNull*/ ExecutorProperty _Container__user = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__USER, Types._Container, 35);
		public static final /*@NonNull*/ ExecutorProperty _Container__volumes = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__VOLUMES, Types._Container, 36);
		public static final /*@NonNull*/ ExecutorProperty _Container__working_dir = new EcoreExecutorProperty(DockerPackage.Literals.CONTAINER__WORKING_DIR, Types._Container, 37);

		public static final /*@NonNull*/ ExecutorProperty _Link__alias = new EcoreExecutorProperty(DockerPackage.Literals.LINK__ALIAS, Types._Link, 0);

		public static final /*@NonNull*/ ExecutorProperty _Machine__name = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE__NAME, Types._Machine, 0);

		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__access_key = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__ACCESS_KEY, Types._Machine_Amazon_EC2, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__ami = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__AMI, Types._Machine_Amazon_EC2, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__instance_type = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__INSTANCE_TYPE, Types._Machine_Amazon_EC2, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__REGION, Types._Machine_Amazon_EC2, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__root_size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__ROOT_SIZE, Types._Machine_Amazon_EC2, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__secret_key = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__SECRET_KEY, Types._Machine_Amazon_EC2, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__security_group = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__SECURITY_GROUP, Types._Machine_Amazon_EC2, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__session_token = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__SESSION_TOKEN, Types._Machine_Amazon_EC2, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__subnet_id = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__SUBNET_ID, Types._Machine_Amazon_EC2, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__vpc_id = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__VPC_ID, Types._Machine_Amazon_EC2, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Amazon_EC2__zone = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_AMAZON_EC2__ZONE, Types._Machine_Amazon_EC2, 10);

		public static final /*@NonNull*/ ExecutorProperty _Machine_Digital_Ocean__access_token = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_DIGITAL_OCEAN__ACCESS_TOKEN, Types._Machine_Digital_Ocean, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Digital_Ocean__image = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_DIGITAL_OCEAN__IMAGE, Types._Machine_Digital_Ocean, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Digital_Ocean__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_DIGITAL_OCEAN__REGION, Types._Machine_Digital_Ocean, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Digital_Ocean__size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_DIGITAL_OCEAN__SIZE, Types._Machine_Digital_Ocean, 3);

		public static final /*@NonNull*/ ExecutorProperty _Machine_Google_Compute_Engine__instance_name = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_GOOGLE_COMPUTE_ENGINE__INSTANCE_NAME, Types._Machine_Google_Compute_Engine, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Google_Compute_Engine__machine_type = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_GOOGLE_COMPUTE_ENGINE__MACHINE_TYPE, Types._Machine_Google_Compute_Engine, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Google_Compute_Engine__project = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_GOOGLE_COMPUTE_ENGINE__PROJECT, Types._Machine_Google_Compute_Engine, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Google_Compute_Engine__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_GOOGLE_COMPUTE_ENGINE__USERNAME, Types._Machine_Google_Compute_Engine, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Google_Compute_Engine__zone = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_GOOGLE_COMPUTE_ENGINE__ZONE, Types._Machine_Google_Compute_Engine, 4);

		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__api_endpoint = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__API_ENDPOINT, Types._Machine_IBM_SoftLayer, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__api_key = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__API_KEY, Types._Machine_IBM_SoftLayer, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__cpu = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__CPU, Types._Machine_IBM_SoftLayer, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__disk_size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__DISK_SIZE, Types._Machine_IBM_SoftLayer, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__domain = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__DOMAIN, Types._Machine_IBM_SoftLayer, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__hourly_billing = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__HOURLY_BILLING, Types._Machine_IBM_SoftLayer, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__image = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__IMAGE, Types._Machine_IBM_SoftLayer, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__local_disk = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__LOCAL_DISK, Types._Machine_IBM_SoftLayer, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__private_net_only = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__PRIVATE_NET_ONLY, Types._Machine_IBM_SoftLayer, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__REGION, Types._Machine_IBM_SoftLayer, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machine_IBM_SoftLayer__user = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_IBM_SOFT_LAYER__USER, Types._Machine_IBM_SoftLayer, 10);

		public static final /*@NonNull*/ ExecutorProperty _Machine_Microsoft_Azure__subscription_cert = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_CERT, Types._Machine_Microsoft_Azure, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Microsoft_Azure__subscription_id = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_MICROSOFT_AZURE__SUBSCRIPTION_ID, Types._Machine_Microsoft_Azure, 1);

		public static final /*@NonNull*/ ExecutorProperty _Machine_Microsoft_Hyper_V__boot2docker_location = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_LOCATION, Types._Machine_Microsoft_Hyper_V, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Microsoft_Hyper_V__boot2docker_url = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_MICROSOFT_HYPER_V__BOOT2DOCKER_URL, Types._Machine_Microsoft_Hyper_V, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Microsoft_Hyper_V__disk_size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_MICROSOFT_HYPER_V__DISK_SIZE, Types._Machine_Microsoft_Hyper_V, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Microsoft_Hyper_V__virtual_switch = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_MICROSOFT_HYPER_V__VIRTUAL_SWITCH, Types._Machine_Microsoft_Hyper_V, 3);

		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__auth_url = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__AUTH_URL, Types._Machine_OpenStack, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__endpoint_type = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__ENDPOINT_TYPE, Types._Machine_OpenStack, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__flavor_id = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__FLAVOR_ID, Types._Machine_OpenStack, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__floatingip_pool = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__FLOATINGIP_POOL, Types._Machine_OpenStack, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__image_id = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__IMAGE_ID, Types._Machine_OpenStack, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__net_id = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__NET_ID, Types._Machine_OpenStack, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__password = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__PASSWORD, Types._Machine_OpenStack, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__REGION, Types._Machine_OpenStack, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__sec_groups = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__SEC_GROUPS, Types._Machine_OpenStack, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__tenant_id = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__TENANT_ID, Types._Machine_OpenStack, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__tenant_name = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__TENANT_NAME, Types._Machine_OpenStack, 10);
		public static final /*@NonNull*/ ExecutorProperty _Machine_OpenStack__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_OPEN_STACK__USERNAME, Types._Machine_OpenStack, 11);

		public static final /*@NonNull*/ ExecutorProperty _Machine_Rackspace__api_key = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_RACKSPACE__API_KEY, Types._Machine_Rackspace, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Rackspace__endpoint_type = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_RACKSPACE__ENDPOINT_TYPE, Types._Machine_Rackspace, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Rackspace__flavor_id = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_RACKSPACE__FLAVOR_ID, Types._Machine_Rackspace, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Rackspace__image_id = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_RACKSPACE__IMAGE_ID, Types._Machine_Rackspace, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Rackspace__region = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_RACKSPACE__REGION, Types._Machine_Rackspace, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Rackspace__ssh_port = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_RACKSPACE__SSH_PORT, Types._Machine_Rackspace, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Rackspace__ssh_user = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_RACKSPACE__SSH_USER, Types._Machine_Rackspace, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machine_Rackspace__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_RACKSPACE__USERNAME, Types._Machine_Rackspace, 7);

		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_Fusion__boot2docker_url = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_FUSION__BOOT2DOCKER_URL, Types._Machine_VMware_Fusion, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_Fusion__disk_size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_FUSION__DISK_SIZE, Types._Machine_VMware_Fusion, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_Fusion__memory_size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_FUSION__MEMORY_SIZE, Types._Machine_VMware_Fusion, 2);

		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__catalog = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__CATALOG, Types._Machine_VMware_vCloud_Air, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__catalogitem = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__CATALOGITEM, Types._Machine_VMware_vCloud_Air, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__computeid = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__COMPUTEID, Types._Machine_VMware_vCloud_Air, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__cpu_count = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__CPU_COUNT, Types._Machine_VMware_vCloud_Air, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__docker_port = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__DOCKER_PORT, Types._Machine_VMware_vCloud_Air, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__edgegateway = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__EDGEGATEWAY, Types._Machine_VMware_vCloud_Air, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__memory_size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__MEMORY_SIZE, Types._Machine_VMware_vCloud_Air, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__orgvdcnetwork = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__ORGVDCNETWORK, Types._Machine_VMware_vCloud_Air, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__password = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__PASSWORD, Types._Machine_VMware_vCloud_Air, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__provision = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__PROVISION, Types._Machine_VMware_vCloud_Air, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__publicip = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__PUBLICIP, Types._Machine_VMware_vCloud_Air, 10);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__ssh_port = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__SSH_PORT, Types._Machine_VMware_vCloud_Air, 11);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__USERNAME, Types._Machine_VMware_vCloud_Air, 12);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__vapp_name = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__VAPP_NAME, Types._Machine_VMware_vCloud_Air, 13);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vCloud_Air__vdcid = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VCLOUD_AIR__VDCID, Types._Machine_VMware_vCloud_Air, 14);

		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__boot2docker_url = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__BOOT2DOCKER_URL, Types._Machine_VMware_vSphere, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__compute_ip = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__COMPUTE_IP, Types._Machine_VMware_vSphere, 1);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__cpu_count = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__CPU_COUNT, Types._Machine_VMware_vSphere, 2);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__datacenter = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__DATACENTER, Types._Machine_VMware_vSphere, 3);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__datastore = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__DATASTORE, Types._Machine_VMware_vSphere, 4);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__disk_size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__DISK_SIZE, Types._Machine_VMware_vSphere, 5);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__memory_size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__MEMORY_SIZE, Types._Machine_VMware_vSphere, 6);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__network = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__NETWORK, Types._Machine_VMware_vSphere, 7);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__password = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__PASSWORD, Types._Machine_VMware_vSphere, 8);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__pool = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__POOL, Types._Machine_VMware_vSphere, 9);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__username = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__USERNAME, Types._Machine_VMware_vSphere, 10);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VMware_vSphere__vcenter = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VMWARE_VSPHERE__VCENTER, Types._Machine_VMware_vSphere, 11);

		public static final /*@NonNull*/ ExecutorProperty _Machine_VirtualBox__boot2docker_url = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VIRTUAL_BOX__BOOT2DOCKER_URL, Types._Machine_VirtualBox, 0);
		public static final /*@NonNull*/ ExecutorProperty _Machine_VirtualBox__disk_size = new EcoreExecutorProperty(DockerPackage.Literals.MACHINE_VIRTUAL_BOX__DISK_SIZE, Types._Machine_VirtualBox, 1);

		public static final /*@NonNull*/ ExecutorProperty _Volumesfrom__mode = new EcoreExecutorProperty(DockerPackage.Literals.VOLUMESFROM__MODE, Types._Volumesfrom, 0);

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
		private static final /*@NonNull*/ ExecutorFragment[] _Container =
		{
			Fragments._Container__OclAny /* 0 */,
			Fragments._Container__OclElement /* 1 */,
			Fragments._Container__Entity /* 2 */,
			Fragments._Container__Resource /* 3 */,
			Fragments._Container__Compute /* 4 */,
			Fragments._Container__Container /* 5 */
		};
		private static final /*@NonNull*/ int[] __Container = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Contains =
		{
			Fragments._Contains__OclAny /* 0 */,
			Fragments._Contains__OclElement /* 1 */,
			Fragments._Contains__Entity /* 2 */,
			Fragments._Contains__Link /* 3 */,
			Fragments._Contains__Contains /* 4 */
		};
		private static final /*@NonNull*/ int[] __Contains = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Link =
		{
			Fragments._Link__OclAny /* 0 */,
			Fragments._Link__OclElement /* 1 */,
			Fragments._Link__Entity /* 2 */,
			Fragments._Link__Link /* 3 */,
			Fragments._Link__Link_1 /* 4 */
		};
		private static final /*@NonNull*/ int[] __Link = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine =
		{
			Fragments._Machine__OclAny /* 0 */,
			Fragments._Machine__OclElement /* 1 */,
			Fragments._Machine__Entity /* 2 */,
			Fragments._Machine__Resource /* 3 */,
			Fragments._Machine__Compute /* 4 */,
			Fragments._Machine__Machine /* 5 */
		};
		private static final /*@NonNull*/ int[] __Machine = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_Amazon_EC2 =
		{
			Fragments._Machine_Amazon_EC2__OclAny /* 0 */,
			Fragments._Machine_Amazon_EC2__OclElement /* 1 */,
			Fragments._Machine_Amazon_EC2__Entity /* 2 */,
			Fragments._Machine_Amazon_EC2__Resource /* 3 */,
			Fragments._Machine_Amazon_EC2__Compute /* 4 */,
			Fragments._Machine_Amazon_EC2__Machine /* 5 */,
			Fragments._Machine_Amazon_EC2__Machine_Amazon_EC2 /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_Amazon_EC2 = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_Digital_Ocean =
		{
			Fragments._Machine_Digital_Ocean__OclAny /* 0 */,
			Fragments._Machine_Digital_Ocean__OclElement /* 1 */,
			Fragments._Machine_Digital_Ocean__Entity /* 2 */,
			Fragments._Machine_Digital_Ocean__Resource /* 3 */,
			Fragments._Machine_Digital_Ocean__Compute /* 4 */,
			Fragments._Machine_Digital_Ocean__Machine /* 5 */,
			Fragments._Machine_Digital_Ocean__Machine_Digital_Ocean /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_Digital_Ocean = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_Google_Compute_Engine =
		{
			Fragments._Machine_Google_Compute_Engine__OclAny /* 0 */,
			Fragments._Machine_Google_Compute_Engine__OclElement /* 1 */,
			Fragments._Machine_Google_Compute_Engine__Entity /* 2 */,
			Fragments._Machine_Google_Compute_Engine__Resource /* 3 */,
			Fragments._Machine_Google_Compute_Engine__Compute /* 4 */,
			Fragments._Machine_Google_Compute_Engine__Machine /* 5 */,
			Fragments._Machine_Google_Compute_Engine__Machine_Google_Compute_Engine /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_Google_Compute_Engine = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_IBM_SoftLayer =
		{
			Fragments._Machine_IBM_SoftLayer__OclAny /* 0 */,
			Fragments._Machine_IBM_SoftLayer__OclElement /* 1 */,
			Fragments._Machine_IBM_SoftLayer__Entity /* 2 */,
			Fragments._Machine_IBM_SoftLayer__Resource /* 3 */,
			Fragments._Machine_IBM_SoftLayer__Compute /* 4 */,
			Fragments._Machine_IBM_SoftLayer__Machine /* 5 */,
			Fragments._Machine_IBM_SoftLayer__Machine_IBM_SoftLayer /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_IBM_SoftLayer = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_Microsoft_Azure =
		{
			Fragments._Machine_Microsoft_Azure__OclAny /* 0 */,
			Fragments._Machine_Microsoft_Azure__OclElement /* 1 */,
			Fragments._Machine_Microsoft_Azure__Entity /* 2 */,
			Fragments._Machine_Microsoft_Azure__Resource /* 3 */,
			Fragments._Machine_Microsoft_Azure__Compute /* 4 */,
			Fragments._Machine_Microsoft_Azure__Machine /* 5 */,
			Fragments._Machine_Microsoft_Azure__Machine_Microsoft_Azure /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_Microsoft_Azure = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_Microsoft_Hyper_V =
		{
			Fragments._Machine_Microsoft_Hyper_V__OclAny /* 0 */,
			Fragments._Machine_Microsoft_Hyper_V__OclElement /* 1 */,
			Fragments._Machine_Microsoft_Hyper_V__Entity /* 2 */,
			Fragments._Machine_Microsoft_Hyper_V__Resource /* 3 */,
			Fragments._Machine_Microsoft_Hyper_V__Compute /* 4 */,
			Fragments._Machine_Microsoft_Hyper_V__Machine /* 5 */,
			Fragments._Machine_Microsoft_Hyper_V__Machine_Microsoft_Hyper_V /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_Microsoft_Hyper_V = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_OpenStack =
		{
			Fragments._Machine_OpenStack__OclAny /* 0 */,
			Fragments._Machine_OpenStack__OclElement /* 1 */,
			Fragments._Machine_OpenStack__Entity /* 2 */,
			Fragments._Machine_OpenStack__Resource /* 3 */,
			Fragments._Machine_OpenStack__Compute /* 4 */,
			Fragments._Machine_OpenStack__Machine /* 5 */,
			Fragments._Machine_OpenStack__Machine_OpenStack /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_OpenStack = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_Rackspace =
		{
			Fragments._Machine_Rackspace__OclAny /* 0 */,
			Fragments._Machine_Rackspace__OclElement /* 1 */,
			Fragments._Machine_Rackspace__Entity /* 2 */,
			Fragments._Machine_Rackspace__Resource /* 3 */,
			Fragments._Machine_Rackspace__Compute /* 4 */,
			Fragments._Machine_Rackspace__Machine /* 5 */,
			Fragments._Machine_Rackspace__Machine_Rackspace /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_Rackspace = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_VMware_Fusion =
		{
			Fragments._Machine_VMware_Fusion__OclAny /* 0 */,
			Fragments._Machine_VMware_Fusion__OclElement /* 1 */,
			Fragments._Machine_VMware_Fusion__Entity /* 2 */,
			Fragments._Machine_VMware_Fusion__Resource /* 3 */,
			Fragments._Machine_VMware_Fusion__Compute /* 4 */,
			Fragments._Machine_VMware_Fusion__Machine /* 5 */,
			Fragments._Machine_VMware_Fusion__Machine_VMware_Fusion /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_VMware_Fusion = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_VMware_vCloud_Air =
		{
			Fragments._Machine_VMware_vCloud_Air__OclAny /* 0 */,
			Fragments._Machine_VMware_vCloud_Air__OclElement /* 1 */,
			Fragments._Machine_VMware_vCloud_Air__Entity /* 2 */,
			Fragments._Machine_VMware_vCloud_Air__Resource /* 3 */,
			Fragments._Machine_VMware_vCloud_Air__Compute /* 4 */,
			Fragments._Machine_VMware_vCloud_Air__Machine /* 5 */,
			Fragments._Machine_VMware_vCloud_Air__Machine_VMware_vCloud_Air /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_VMware_vCloud_Air = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_VMware_vSphere =
		{
			Fragments._Machine_VMware_vSphere__OclAny /* 0 */,
			Fragments._Machine_VMware_vSphere__OclElement /* 1 */,
			Fragments._Machine_VMware_vSphere__Entity /* 2 */,
			Fragments._Machine_VMware_vSphere__Resource /* 3 */,
			Fragments._Machine_VMware_vSphere__Compute /* 4 */,
			Fragments._Machine_VMware_vSphere__Machine /* 5 */,
			Fragments._Machine_VMware_vSphere__Machine_VMware_vSphere /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_VMware_vSphere = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Machine_VirtualBox =
		{
			Fragments._Machine_VirtualBox__OclAny /* 0 */,
			Fragments._Machine_VirtualBox__OclElement /* 1 */,
			Fragments._Machine_VirtualBox__Entity /* 2 */,
			Fragments._Machine_VirtualBox__Resource /* 3 */,
			Fragments._Machine_VirtualBox__Compute /* 4 */,
			Fragments._Machine_VirtualBox__Machine /* 5 */,
			Fragments._Machine_VirtualBox__Machine_VirtualBox /* 6 */
		};
		private static final /*@NonNull*/ int[] __Machine_VirtualBox = { 1,1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Mode =
		{
			Fragments._Mode__OclAny /* 0 */,
			Fragments._Mode__OclElement /* 1 */,
			Fragments._Mode__Nameable /* 2 */,
			Fragments._Mode__OclType /* 2 */,
			Fragments._Mode__Visitable /* 2 */,
			Fragments._Mode__Element /* 3 */,
			Fragments._Mode__NamedElement /* 4 */,
			Fragments._Mode__ParameterableElement /* 4 */,
			Fragments._Mode__TemplateableElement /* 4 */,
			Fragments._Mode__Namespace /* 5 */,
			Fragments._Mode__Type /* 5 */,
			Fragments._Mode__Class /* 6 */,
			Fragments._Mode__DataType /* 7 */,
			Fragments._Mode__Enumeration /* 8 */,
			Fragments._Mode__Mode /* 9 */
		};
		private static final /*@NonNull*/ int[] __Mode = { 1,1,3,1,3,2,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment[] _Volumesfrom =
		{
			Fragments._Volumesfrom__OclAny /* 0 */,
			Fragments._Volumesfrom__OclElement /* 1 */,
			Fragments._Volumesfrom__Entity /* 2 */,
			Fragments._Volumesfrom__Link /* 3 */,
			Fragments._Volumesfrom__Volumesfrom /* 4 */
		};
		private static final /*@NonNull*/ int[] __Volumesfrom = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		public static void init() {
			Fragments.init();
			Properties.init();

			Types._Container.initFragments(_Container, __Container);
			Types._Contains.initFragments(_Contains, __Contains);
			Types._Link.initFragments(_Link, __Link);
			Types._Machine.initFragments(_Machine, __Machine);
			Types._Machine_Amazon_EC2.initFragments(_Machine_Amazon_EC2, __Machine_Amazon_EC2);
			Types._Machine_Digital_Ocean.initFragments(_Machine_Digital_Ocean, __Machine_Digital_Ocean);
			Types._Machine_Google_Compute_Engine.initFragments(_Machine_Google_Compute_Engine, __Machine_Google_Compute_Engine);
			Types._Machine_IBM_SoftLayer.initFragments(_Machine_IBM_SoftLayer, __Machine_IBM_SoftLayer);
			Types._Machine_Microsoft_Azure.initFragments(_Machine_Microsoft_Azure, __Machine_Microsoft_Azure);
			Types._Machine_Microsoft_Hyper_V.initFragments(_Machine_Microsoft_Hyper_V, __Machine_Microsoft_Hyper_V);
			Types._Machine_OpenStack.initFragments(_Machine_OpenStack, __Machine_OpenStack);
			Types._Machine_Rackspace.initFragments(_Machine_Rackspace, __Machine_Rackspace);
			Types._Machine_VMware_Fusion.initFragments(_Machine_VMware_Fusion, __Machine_VMware_Fusion);
			Types._Machine_VMware_vCloud_Air.initFragments(_Machine_VMware_vCloud_Air, __Machine_VMware_vCloud_Air);
			Types._Machine_VMware_vSphere.initFragments(_Machine_VMware_vSphere, __Machine_VMware_vSphere);
			Types._Machine_VirtualBox.initFragments(_Machine_VirtualBox, __Machine_VirtualBox);
			Types._Mode.initFragments(_Mode, __Mode);
			Types._Volumesfrom.initFragments(_Volumesfrom, __Volumesfrom);
		}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		private static final /*@NonNull*/ ExecutorOperation[] _Container__Container = {
			DockerTables.Operations._Container__create /* create() */,
			DockerTables.Operations._Container__kill /* kill(String) */,
			DockerTables.Operations._Container__pause /* pause() */,
			DockerTables.Operations._Container__run /* run() */,
			DockerTables.Operations._Container__unpause /* unpause() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Container__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Container__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Container__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Container__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Container__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Contains__Contains = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Contains__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Contains__Link = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Contains__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Contains__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		private static final /*@NonNull*/ ExecutorOperation[] _Link__Link_1 = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Link__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Link__Link = {};
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

		private static final /*@NonNull*/ ExecutorOperation[] _Machine__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Amazon_EC2__Machine_Amazon_EC2 = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Amazon_EC2__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Amazon_EC2__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Amazon_EC2__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Amazon_EC2__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Amazon_EC2__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Amazon_EC2__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Digital_Ocean__Machine_Digital_Ocean = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Digital_Ocean__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Digital_Ocean__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Digital_Ocean__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Digital_Ocean__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Digital_Ocean__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Digital_Ocean__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Google_Compute_Engine__Machine_Google_Compute_Engine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Google_Compute_Engine__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Google_Compute_Engine__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Google_Compute_Engine__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Google_Compute_Engine__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Google_Compute_Engine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Google_Compute_Engine__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_IBM_SoftLayer__Machine_IBM_SoftLayer = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_IBM_SoftLayer__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_IBM_SoftLayer__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_IBM_SoftLayer__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_IBM_SoftLayer__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_IBM_SoftLayer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_IBM_SoftLayer__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Azure__Machine_Microsoft_Azure = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Azure__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Azure__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Azure__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Azure__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Azure__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Azure__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Hyper_V__Machine_Microsoft_Hyper_V = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Hyper_V__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Hyper_V__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Hyper_V__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Hyper_V__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Hyper_V__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Microsoft_Hyper_V__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_OpenStack__Machine_OpenStack = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_OpenStack__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_OpenStack__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_OpenStack__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_OpenStack__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_OpenStack__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_OpenStack__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Rackspace__Machine_Rackspace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Rackspace__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Rackspace__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Rackspace__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Rackspace__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Rackspace__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_Rackspace__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_Fusion__Machine_VMware_Fusion = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_Fusion__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_Fusion__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_Fusion__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_Fusion__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_Fusion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_Fusion__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vCloud_Air__Machine_VMware_vCloud_Air = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vCloud_Air__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vCloud_Air__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vCloud_Air__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vCloud_Air__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vCloud_Air__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vCloud_Air__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vSphere__Machine_VMware_vSphere = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vSphere__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vSphere__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vSphere__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vSphere__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vSphere__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VMware_vSphere__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VirtualBox__Machine_VirtualBox = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VirtualBox__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VirtualBox__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VirtualBox__Machine = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VirtualBox__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VirtualBox__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Machine_VirtualBox__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Mode__Mode = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__Class = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type,String) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__Enumeration = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__Nameable = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__NamedElement = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__Namespace = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__OclElement = {
			PivotTables.Operations._Enumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__ParameterableElement = {
			PivotTables.Operations._ParameterableElement__isCompatibleWith /* isCompatibleWith(ParameterableElement) */,
			PivotTables.Operations._ParameterableElement__isTemplateParameter /* isTemplateParameter() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__TemplateableElement = {
			PivotTables.Operations._TemplateableElement__isTemplate /* isTemplate() */,
			PivotTables.Operations._TemplateableElement__parameterableElements /* parameterableElements() */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__Type = {
			PivotTables.Operations._Type__specializeIn /* specializeIn(OCLExpression,Type) */
		};
		private static final /*@NonNull*/ ExecutorOperation[] _Mode__Visitable = {};

		private static final /*@NonNull*/ ExecutorOperation[] _Volumesfrom__Volumesfrom = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Volumesfrom__Entity = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Volumesfrom__Link = {};
		private static final /*@NonNull*/ ExecutorOperation[] _Volumesfrom__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation[] _Volumesfrom__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		public static void init() {
			TypeFragments.init();

			Fragments._Container__Compute.initOperations(_Container__Compute);
			Fragments._Container__Container.initOperations(_Container__Container);
			Fragments._Container__Entity.initOperations(_Container__Entity);
			Fragments._Container__OclAny.initOperations(_Container__OclAny);
			Fragments._Container__OclElement.initOperations(_Container__OclElement);
			Fragments._Container__Resource.initOperations(_Container__Resource);

			Fragments._Contains__Contains.initOperations(_Contains__Contains);
			Fragments._Contains__Entity.initOperations(_Contains__Entity);
			Fragments._Contains__Link.initOperations(_Contains__Link);
			Fragments._Contains__OclAny.initOperations(_Contains__OclAny);
			Fragments._Contains__OclElement.initOperations(_Contains__OclElement);

			Fragments._Link__Entity.initOperations(_Link__Entity);
			Fragments._Link__Link_1.initOperations(_Link__Link_1);
			Fragments._Link__Link.initOperations(_Link__Link);
			Fragments._Link__OclAny.initOperations(_Link__OclAny);
			Fragments._Link__OclElement.initOperations(_Link__OclElement);

			Fragments._Machine__Compute.initOperations(_Machine__Compute);
			Fragments._Machine__Entity.initOperations(_Machine__Entity);
			Fragments._Machine__Machine.initOperations(_Machine__Machine);
			Fragments._Machine__OclAny.initOperations(_Machine__OclAny);
			Fragments._Machine__OclElement.initOperations(_Machine__OclElement);
			Fragments._Machine__Resource.initOperations(_Machine__Resource);

			Fragments._Machine_Amazon_EC2__Compute.initOperations(_Machine_Amazon_EC2__Compute);
			Fragments._Machine_Amazon_EC2__Entity.initOperations(_Machine_Amazon_EC2__Entity);
			Fragments._Machine_Amazon_EC2__Machine.initOperations(_Machine_Amazon_EC2__Machine);
			Fragments._Machine_Amazon_EC2__Machine_Amazon_EC2.initOperations(_Machine_Amazon_EC2__Machine_Amazon_EC2);
			Fragments._Machine_Amazon_EC2__OclAny.initOperations(_Machine_Amazon_EC2__OclAny);
			Fragments._Machine_Amazon_EC2__OclElement.initOperations(_Machine_Amazon_EC2__OclElement);
			Fragments._Machine_Amazon_EC2__Resource.initOperations(_Machine_Amazon_EC2__Resource);

			Fragments._Machine_Digital_Ocean__Compute.initOperations(_Machine_Digital_Ocean__Compute);
			Fragments._Machine_Digital_Ocean__Entity.initOperations(_Machine_Digital_Ocean__Entity);
			Fragments._Machine_Digital_Ocean__Machine.initOperations(_Machine_Digital_Ocean__Machine);
			Fragments._Machine_Digital_Ocean__Machine_Digital_Ocean.initOperations(_Machine_Digital_Ocean__Machine_Digital_Ocean);
			Fragments._Machine_Digital_Ocean__OclAny.initOperations(_Machine_Digital_Ocean__OclAny);
			Fragments._Machine_Digital_Ocean__OclElement.initOperations(_Machine_Digital_Ocean__OclElement);
			Fragments._Machine_Digital_Ocean__Resource.initOperations(_Machine_Digital_Ocean__Resource);

			Fragments._Machine_Google_Compute_Engine__Compute.initOperations(_Machine_Google_Compute_Engine__Compute);
			Fragments._Machine_Google_Compute_Engine__Entity.initOperations(_Machine_Google_Compute_Engine__Entity);
			Fragments._Machine_Google_Compute_Engine__Machine.initOperations(_Machine_Google_Compute_Engine__Machine);
			Fragments._Machine_Google_Compute_Engine__Machine_Google_Compute_Engine.initOperations(_Machine_Google_Compute_Engine__Machine_Google_Compute_Engine);
			Fragments._Machine_Google_Compute_Engine__OclAny.initOperations(_Machine_Google_Compute_Engine__OclAny);
			Fragments._Machine_Google_Compute_Engine__OclElement.initOperations(_Machine_Google_Compute_Engine__OclElement);
			Fragments._Machine_Google_Compute_Engine__Resource.initOperations(_Machine_Google_Compute_Engine__Resource);

			Fragments._Machine_IBM_SoftLayer__Compute.initOperations(_Machine_IBM_SoftLayer__Compute);
			Fragments._Machine_IBM_SoftLayer__Entity.initOperations(_Machine_IBM_SoftLayer__Entity);
			Fragments._Machine_IBM_SoftLayer__Machine.initOperations(_Machine_IBM_SoftLayer__Machine);
			Fragments._Machine_IBM_SoftLayer__Machine_IBM_SoftLayer.initOperations(_Machine_IBM_SoftLayer__Machine_IBM_SoftLayer);
			Fragments._Machine_IBM_SoftLayer__OclAny.initOperations(_Machine_IBM_SoftLayer__OclAny);
			Fragments._Machine_IBM_SoftLayer__OclElement.initOperations(_Machine_IBM_SoftLayer__OclElement);
			Fragments._Machine_IBM_SoftLayer__Resource.initOperations(_Machine_IBM_SoftLayer__Resource);

			Fragments._Machine_Microsoft_Azure__Compute.initOperations(_Machine_Microsoft_Azure__Compute);
			Fragments._Machine_Microsoft_Azure__Entity.initOperations(_Machine_Microsoft_Azure__Entity);
			Fragments._Machine_Microsoft_Azure__Machine.initOperations(_Machine_Microsoft_Azure__Machine);
			Fragments._Machine_Microsoft_Azure__Machine_Microsoft_Azure.initOperations(_Machine_Microsoft_Azure__Machine_Microsoft_Azure);
			Fragments._Machine_Microsoft_Azure__OclAny.initOperations(_Machine_Microsoft_Azure__OclAny);
			Fragments._Machine_Microsoft_Azure__OclElement.initOperations(_Machine_Microsoft_Azure__OclElement);
			Fragments._Machine_Microsoft_Azure__Resource.initOperations(_Machine_Microsoft_Azure__Resource);

			Fragments._Machine_Microsoft_Hyper_V__Compute.initOperations(_Machine_Microsoft_Hyper_V__Compute);
			Fragments._Machine_Microsoft_Hyper_V__Entity.initOperations(_Machine_Microsoft_Hyper_V__Entity);
			Fragments._Machine_Microsoft_Hyper_V__Machine.initOperations(_Machine_Microsoft_Hyper_V__Machine);
			Fragments._Machine_Microsoft_Hyper_V__Machine_Microsoft_Hyper_V.initOperations(_Machine_Microsoft_Hyper_V__Machine_Microsoft_Hyper_V);
			Fragments._Machine_Microsoft_Hyper_V__OclAny.initOperations(_Machine_Microsoft_Hyper_V__OclAny);
			Fragments._Machine_Microsoft_Hyper_V__OclElement.initOperations(_Machine_Microsoft_Hyper_V__OclElement);
			Fragments._Machine_Microsoft_Hyper_V__Resource.initOperations(_Machine_Microsoft_Hyper_V__Resource);

			Fragments._Machine_OpenStack__Compute.initOperations(_Machine_OpenStack__Compute);
			Fragments._Machine_OpenStack__Entity.initOperations(_Machine_OpenStack__Entity);
			Fragments._Machine_OpenStack__Machine.initOperations(_Machine_OpenStack__Machine);
			Fragments._Machine_OpenStack__Machine_OpenStack.initOperations(_Machine_OpenStack__Machine_OpenStack);
			Fragments._Machine_OpenStack__OclAny.initOperations(_Machine_OpenStack__OclAny);
			Fragments._Machine_OpenStack__OclElement.initOperations(_Machine_OpenStack__OclElement);
			Fragments._Machine_OpenStack__Resource.initOperations(_Machine_OpenStack__Resource);

			Fragments._Machine_Rackspace__Compute.initOperations(_Machine_Rackspace__Compute);
			Fragments._Machine_Rackspace__Entity.initOperations(_Machine_Rackspace__Entity);
			Fragments._Machine_Rackspace__Machine.initOperations(_Machine_Rackspace__Machine);
			Fragments._Machine_Rackspace__Machine_Rackspace.initOperations(_Machine_Rackspace__Machine_Rackspace);
			Fragments._Machine_Rackspace__OclAny.initOperations(_Machine_Rackspace__OclAny);
			Fragments._Machine_Rackspace__OclElement.initOperations(_Machine_Rackspace__OclElement);
			Fragments._Machine_Rackspace__Resource.initOperations(_Machine_Rackspace__Resource);

			Fragments._Machine_VMware_Fusion__Compute.initOperations(_Machine_VMware_Fusion__Compute);
			Fragments._Machine_VMware_Fusion__Entity.initOperations(_Machine_VMware_Fusion__Entity);
			Fragments._Machine_VMware_Fusion__Machine.initOperations(_Machine_VMware_Fusion__Machine);
			Fragments._Machine_VMware_Fusion__Machine_VMware_Fusion.initOperations(_Machine_VMware_Fusion__Machine_VMware_Fusion);
			Fragments._Machine_VMware_Fusion__OclAny.initOperations(_Machine_VMware_Fusion__OclAny);
			Fragments._Machine_VMware_Fusion__OclElement.initOperations(_Machine_VMware_Fusion__OclElement);
			Fragments._Machine_VMware_Fusion__Resource.initOperations(_Machine_VMware_Fusion__Resource);

			Fragments._Machine_VMware_vCloud_Air__Compute.initOperations(_Machine_VMware_vCloud_Air__Compute);
			Fragments._Machine_VMware_vCloud_Air__Entity.initOperations(_Machine_VMware_vCloud_Air__Entity);
			Fragments._Machine_VMware_vCloud_Air__Machine.initOperations(_Machine_VMware_vCloud_Air__Machine);
			Fragments._Machine_VMware_vCloud_Air__Machine_VMware_vCloud_Air.initOperations(_Machine_VMware_vCloud_Air__Machine_VMware_vCloud_Air);
			Fragments._Machine_VMware_vCloud_Air__OclAny.initOperations(_Machine_VMware_vCloud_Air__OclAny);
			Fragments._Machine_VMware_vCloud_Air__OclElement.initOperations(_Machine_VMware_vCloud_Air__OclElement);
			Fragments._Machine_VMware_vCloud_Air__Resource.initOperations(_Machine_VMware_vCloud_Air__Resource);

			Fragments._Machine_VMware_vSphere__Compute.initOperations(_Machine_VMware_vSphere__Compute);
			Fragments._Machine_VMware_vSphere__Entity.initOperations(_Machine_VMware_vSphere__Entity);
			Fragments._Machine_VMware_vSphere__Machine.initOperations(_Machine_VMware_vSphere__Machine);
			Fragments._Machine_VMware_vSphere__Machine_VMware_vSphere.initOperations(_Machine_VMware_vSphere__Machine_VMware_vSphere);
			Fragments._Machine_VMware_vSphere__OclAny.initOperations(_Machine_VMware_vSphere__OclAny);
			Fragments._Machine_VMware_vSphere__OclElement.initOperations(_Machine_VMware_vSphere__OclElement);
			Fragments._Machine_VMware_vSphere__Resource.initOperations(_Machine_VMware_vSphere__Resource);

			Fragments._Machine_VirtualBox__Compute.initOperations(_Machine_VirtualBox__Compute);
			Fragments._Machine_VirtualBox__Entity.initOperations(_Machine_VirtualBox__Entity);
			Fragments._Machine_VirtualBox__Machine.initOperations(_Machine_VirtualBox__Machine);
			Fragments._Machine_VirtualBox__Machine_VirtualBox.initOperations(_Machine_VirtualBox__Machine_VirtualBox);
			Fragments._Machine_VirtualBox__OclAny.initOperations(_Machine_VirtualBox__OclAny);
			Fragments._Machine_VirtualBox__OclElement.initOperations(_Machine_VirtualBox__OclElement);
			Fragments._Machine_VirtualBox__Resource.initOperations(_Machine_VirtualBox__Resource);

			Fragments._Mode__Class.initOperations(_Mode__Class);
			Fragments._Mode__DataType.initOperations(_Mode__DataType);
			Fragments._Mode__Element.initOperations(_Mode__Element);
			Fragments._Mode__Enumeration.initOperations(_Mode__Enumeration);
			Fragments._Mode__Mode.initOperations(_Mode__Mode);
			Fragments._Mode__Nameable.initOperations(_Mode__Nameable);
			Fragments._Mode__NamedElement.initOperations(_Mode__NamedElement);
			Fragments._Mode__Namespace.initOperations(_Mode__Namespace);
			Fragments._Mode__OclAny.initOperations(_Mode__OclAny);
			Fragments._Mode__OclElement.initOperations(_Mode__OclElement);
			Fragments._Mode__OclType.initOperations(_Mode__OclType);
			Fragments._Mode__ParameterableElement.initOperations(_Mode__ParameterableElement);
			Fragments._Mode__TemplateableElement.initOperations(_Mode__TemplateableElement);
			Fragments._Mode__Type.initOperations(_Mode__Type);
			Fragments._Mode__Visitable.initOperations(_Mode__Visitable);

			Fragments._Volumesfrom__Entity.initOperations(_Volumesfrom__Entity);
			Fragments._Volumesfrom__Link.initOperations(_Volumesfrom__Link);
			Fragments._Volumesfrom__OclAny.initOperations(_Volumesfrom__OclAny);
			Fragments._Volumesfrom__OclElement.initOperations(_Volumesfrom__OclElement);
			Fragments._Volumesfrom__Volumesfrom.initOperations(_Volumesfrom__Volumesfrom);
		}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		private static final /*@NonNull*/ ExecutorProperty[] _Container = {
			DockerTables.Properties._Container__add_host,
			DockerTables.Properties._Container__build,
			DockerTables.Properties._Container__cap_add,
			DockerTables.Properties._Container__cap_drop,
			DockerTables.Properties._Container__command,
			DockerTables.Properties._Container__containerid,
			DockerTables.Properties._Container__cpu_shares,
			DockerTables.Properties._Container__cpuset,
			DockerTables.Properties._Container__device,
			DockerTables.Properties._Container__dns,
			DockerTables.Properties._Container__dns_search,
			DockerTables.Properties._Container__domainname,
			DockerTables.Properties._Container__entrypoint,
			DockerTables.Properties._Container__env_file,
			DockerTables.Properties._Container__environment,
			DockerTables.Properties._Container__expose,
			DockerTables.Properties._Container__image,
			DockerTables.Properties._Container__interactive,
			DockerTables.Properties._Container__ipc,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Container__lxc_conf,
			DockerTables.Properties._Container__mac_address,
			DockerTables.Properties._Container__mem_limit,
			DockerTables.Properties._Container__memory_swap,
			DockerTables.Properties._Container__name,
			DockerTables.Properties._Container__net,
			DockerTables.Properties._Container__pid,
			DockerTables.Properties._Container__ports,
			DockerTables.Properties._Container__privileged,
			DockerTables.Properties._Container__publish_all,
			DockerTables.Properties._Container__read_only,
			DockerTables.Properties._Container__restart,
			DockerTables.Properties._Container__rm,
			DockerTables.Properties._Container__security_opt,
			DockerTables.Properties._Container__stdin_open,
			DockerTables.Properties._Container__tty,
			DockerTables.Properties._Container__user,
			DockerTables.Properties._Container__volumes,
			DockerTables.Properties._Container__working_dir,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Contains = {
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Link = {
			DockerTables.Properties._Link__alias,
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine = {
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_Amazon_EC2 = {
			DockerTables.Properties._Machine_Amazon_EC2__access_key,
			DockerTables.Properties._Machine_Amazon_EC2__ami,
			DockerTables.Properties._Machine_Amazon_EC2__instance_type,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_Amazon_EC2__region,
			DockerTables.Properties._Machine_Amazon_EC2__root_size,
			DockerTables.Properties._Machine_Amazon_EC2__secret_key,
			DockerTables.Properties._Machine_Amazon_EC2__security_group,
			DockerTables.Properties._Machine_Amazon_EC2__session_token,
			DockerTables.Properties._Machine_Amazon_EC2__subnet_id,
			DockerTables.Properties._Machine_Amazon_EC2__vpc_id,
			DockerTables.Properties._Machine_Amazon_EC2__zone,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_Digital_Ocean = {
			DockerTables.Properties._Machine_Digital_Ocean__access_token,
			DockerTables.Properties._Machine_Digital_Ocean__image,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_Digital_Ocean__region,
			DockerTables.Properties._Machine_Digital_Ocean__size,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_Google_Compute_Engine = {
			DockerTables.Properties._Machine_Google_Compute_Engine__instance_name,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine_Google_Compute_Engine__machine_type,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_Google_Compute_Engine__project,
			DockerTables.Properties._Machine_Google_Compute_Engine__username,
			DockerTables.Properties._Machine_Google_Compute_Engine__zone,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_IBM_SoftLayer = {
			DockerTables.Properties._Machine_IBM_SoftLayer__api_endpoint,
			DockerTables.Properties._Machine_IBM_SoftLayer__api_key,
			DockerTables.Properties._Machine_IBM_SoftLayer__cpu,
			DockerTables.Properties._Machine_IBM_SoftLayer__disk_size,
			DockerTables.Properties._Machine_IBM_SoftLayer__domain,
			DockerTables.Properties._Machine_IBM_SoftLayer__hourly_billing,
			DockerTables.Properties._Machine_IBM_SoftLayer__image,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine_IBM_SoftLayer__local_disk,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_IBM_SoftLayer__private_net_only,
			DockerTables.Properties._Machine_IBM_SoftLayer__region,
			DockerTables.Properties._Machine_IBM_SoftLayer__user,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_Microsoft_Azure = {
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_Microsoft_Azure__subscription_cert,
			DockerTables.Properties._Machine_Microsoft_Azure__subscription_id,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_Microsoft_Hyper_V = {
			DockerTables.Properties._Machine_Microsoft_Hyper_V__boot2docker_location,
			DockerTables.Properties._Machine_Microsoft_Hyper_V__boot2docker_url,
			DockerTables.Properties._Machine_Microsoft_Hyper_V__disk_size,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_Microsoft_Hyper_V__virtual_switch,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_OpenStack = {
			DockerTables.Properties._Machine_OpenStack__auth_url,
			DockerTables.Properties._Machine_OpenStack__endpoint_type,
			DockerTables.Properties._Machine_OpenStack__flavor_id,
			DockerTables.Properties._Machine_OpenStack__floatingip_pool,
			DockerTables.Properties._Machine_OpenStack__image_id,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_OpenStack__net_id,
			DockerTables.Properties._Machine_OpenStack__password,
			DockerTables.Properties._Machine_OpenStack__region,
			DockerTables.Properties._Machine_OpenStack__sec_groups,
			DockerTables.Properties._Machine_OpenStack__tenant_id,
			DockerTables.Properties._Machine_OpenStack__tenant_name,
			DockerTables.Properties._Machine_OpenStack__username,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_Rackspace = {
			DockerTables.Properties._Machine_Rackspace__api_key,
			DockerTables.Properties._Machine_Rackspace__endpoint_type,
			DockerTables.Properties._Machine_Rackspace__flavor_id,
			DockerTables.Properties._Machine_Rackspace__image_id,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_Rackspace__region,
			DockerTables.Properties._Machine_Rackspace__ssh_port,
			DockerTables.Properties._Machine_Rackspace__ssh_user,
			DockerTables.Properties._Machine_Rackspace__username,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_VMware_Fusion = {
			DockerTables.Properties._Machine_VMware_Fusion__boot2docker_url,
			DockerTables.Properties._Machine_VMware_Fusion__disk_size,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine_VMware_Fusion__memory_size,
			DockerTables.Properties._Machine__name,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_VMware_vCloud_Air = {
			DockerTables.Properties._Machine_VMware_vCloud_Air__catalog,
			DockerTables.Properties._Machine_VMware_vCloud_Air__catalogitem,
			DockerTables.Properties._Machine_VMware_vCloud_Air__computeid,
			DockerTables.Properties._Machine_VMware_vCloud_Air__cpu_count,
			DockerTables.Properties._Machine_VMware_vCloud_Air__docker_port,
			DockerTables.Properties._Machine_VMware_vCloud_Air__edgegateway,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine_VMware_vCloud_Air__memory_size,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_VMware_vCloud_Air__orgvdcnetwork,
			DockerTables.Properties._Machine_VMware_vCloud_Air__password,
			DockerTables.Properties._Machine_VMware_vCloud_Air__provision,
			DockerTables.Properties._Machine_VMware_vCloud_Air__publicip,
			DockerTables.Properties._Machine_VMware_vCloud_Air__ssh_port,
			DockerTables.Properties._Machine_VMware_vCloud_Air__username,
			DockerTables.Properties._Machine_VMware_vCloud_Air__vapp_name,
			DockerTables.Properties._Machine_VMware_vCloud_Air__vdcid,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_VMware_vSphere = {
			DockerTables.Properties._Machine_VMware_vSphere__boot2docker_url,
			DockerTables.Properties._Machine_VMware_vSphere__compute_ip,
			DockerTables.Properties._Machine_VMware_vSphere__cpu_count,
			DockerTables.Properties._Machine_VMware_vSphere__datacenter,
			DockerTables.Properties._Machine_VMware_vSphere__datastore,
			DockerTables.Properties._Machine_VMware_vSphere__disk_size,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine_VMware_vSphere__memory_size,
			DockerTables.Properties._Machine__name,
			DockerTables.Properties._Machine_VMware_vSphere__network,
			DockerTables.Properties._Machine_VMware_vSphere__password,
			DockerTables.Properties._Machine_VMware_vSphere__pool,
			DockerTables.Properties._Machine_VMware_vSphere__username,
			DockerTables.Properties._Machine_VMware_vSphere__vcenter,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Machine_VirtualBox = {
			DockerTables.Properties._Machine_VirtualBox__boot2docker_url,
			DockerTables.Properties._Machine_VirtualBox__disk_size,
			OCCITables.Properties._Resource__links,
			DockerTables.Properties._Machine__name,
			OCCITables.Properties._Resource__Link__target
		};

		private static final /*@NonNull*/ ExecutorProperty[] _Mode = {};

		private static final /*@NonNull*/ ExecutorProperty[] _Volumesfrom = {
			DockerTables.Properties._Volumesfrom__mode,
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		public static void init() {
			TypeFragments.init();

			Fragments._Container__Container.initProperties(_Container);
			Fragments._Contains__Contains.initProperties(_Contains);
			Fragments._Link__Link_1.initProperties(_Link);
			Fragments._Machine__Machine.initProperties(_Machine);
			Fragments._Machine_Amazon_EC2__Machine_Amazon_EC2.initProperties(_Machine_Amazon_EC2);
			Fragments._Machine_Digital_Ocean__Machine_Digital_Ocean.initProperties(_Machine_Digital_Ocean);
			Fragments._Machine_Google_Compute_Engine__Machine_Google_Compute_Engine.initProperties(_Machine_Google_Compute_Engine);
			Fragments._Machine_IBM_SoftLayer__Machine_IBM_SoftLayer.initProperties(_Machine_IBM_SoftLayer);
			Fragments._Machine_Microsoft_Azure__Machine_Microsoft_Azure.initProperties(_Machine_Microsoft_Azure);
			Fragments._Machine_Microsoft_Hyper_V__Machine_Microsoft_Hyper_V.initProperties(_Machine_Microsoft_Hyper_V);
			Fragments._Machine_OpenStack__Machine_OpenStack.initProperties(_Machine_OpenStack);
			Fragments._Machine_Rackspace__Machine_Rackspace.initProperties(_Machine_Rackspace);
			Fragments._Machine_VMware_Fusion__Machine_VMware_Fusion.initProperties(_Machine_VMware_Fusion);
			Fragments._Machine_VMware_vCloud_Air__Machine_VMware_vCloud_Air.initProperties(_Machine_VMware_vCloud_Air);
			Fragments._Machine_VMware_vSphere__Machine_VMware_vSphere.initProperties(_Machine_VMware_vSphere);
			Fragments._Machine_VirtualBox__Machine_VirtualBox.initProperties(_Machine_VirtualBox);
			Fragments._Mode__Mode.initProperties(_Mode);
			Fragments._Volumesfrom__Volumesfrom.initProperties(_Volumesfrom);
		}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Mode__read_write = new EcoreExecutorEnumerationLiteral(DockerPackage.Literals.MODE.getEEnumLiteral("read_write"), Types._Mode, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Mode__read_only = new EcoreExecutorEnumerationLiteral(DockerPackage.Literals.MODE.getEEnumLiteral("read_only"), Types._Mode, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral[] _Mode = {
			_Mode__read_write,
			_Mode__read_only
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Mode.initLiterals(_Mode);
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

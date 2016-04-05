package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders

import com.google.common.collect.ImmutableSet
import com.google.inject.Module
import org.jclouds.ContextBuilder
import org.jclouds.compute.ComputeServiceContext
import org.occiware.clouddesigner.occi.cloud.CloudPackage
import org.occiware.clouddesigner.occi.cloud.connector.ExecutableCloudFactory
import org.occiware.clouddesigner.occi.infrastructure.StopMethod

class OpenStackTest {

	def  initOnce(){

		val Iterable<Module> modules = ImmutableSet.<Module> of()

		val String provider = "openstack-nova";
		val String identity = "OCCIWARE:fparaiso"; // tenantName:userName
		val String password = "qWqr76Xx";

		var ComputeServiceContext context = ContextBuilder.newBuilder(provider)
				.credentials(identity, password)
				.endpoint("http://ow2-04.xsalto.net:5000/v2.0")
				.modules(modules)
				.buildView(typeof(ComputeServiceContext))
				
		for (image : context.computeService.listImages) {
			println(image)
			println(image.id) 
		}
		
		println("###########################")
		
		for (hardware : context.computeService.listHardwareProfiles) {
			println(hardware)
		}
//		context.computeService.

	}
	
	def static void main(String[] args) {
//		var test = new OpenStackTest()
//		test.initOnce
		 
		// Initialize the executable Cloud factory.
		ExecutableCloudFactory.init()

		// Obtain the Cloud package factory.
		val factory = CloudPackage.eINSTANCE.getCloudFactory

		// Create a Docker VirtualBox machine.
		val machine = factory.createMachine_OpenStack
		machine.name = "jcloud"
		machine.flavor_id = "RegionOne/2"
		machine.provider = "openstack-nova"
		machine.tenant = "OCCIWARE"
		machine.username = "fparaiso"
		machine.password = "qWqr76Xx"
		machine.floating_ip_pool = "public"
		machine.security_group ="jclouds-graphical"
		//Option
		machine.keypair = "fparaiso-key"
		machine.network_id = "63b7887b-2a8c-4c9f-85e2-a9a7eb5a3f85"
		// End option
		machine.endpoint = "http://ow2-04.xsalto.net:5000/v2.0"
		
		// Start the machine.
		machine.start
		
		// Stop the machine 
		machine.stop(StopMethod.GRACEFUL)
		 
	}
	
}
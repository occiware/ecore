package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders

import com.google.common.collect.ImmutableSet
import com.google.inject.Module
import org.jclouds.ContextBuilder
import org.jclouds.compute.ComputeServiceContext
import org.jclouds.openstack.v2_0.services.Image

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
		}
		
		println("###########################")
		
		for (hardware : context.computeService.listHardwareProfiles) {
			println(hardware)
		}
//		context.computeService.
		
	}
	
	def static void main(String[] args) {
		var test = new OpenStackTest()
		test.initOnce 
	}
	
}
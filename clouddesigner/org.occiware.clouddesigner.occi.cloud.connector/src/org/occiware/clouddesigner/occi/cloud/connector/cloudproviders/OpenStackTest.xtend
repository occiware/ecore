package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders

import com.google.common.collect.ImmutableSet
import com.google.inject.Module
import org.jclouds.ContextBuilder
import org.jclouds.compute.ComputeServiceContext

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
	}
	
	def static void main(String[] args) {
		var test = new OpenStackTest()
		test.initOnce 
	}
	
}
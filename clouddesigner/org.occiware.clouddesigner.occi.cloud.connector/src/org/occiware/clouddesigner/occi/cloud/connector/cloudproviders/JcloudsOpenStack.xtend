package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders

import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.jclouds.openstack.nova.v2_0.NovaApi
import com.google.inject.Module
import com.google.common.collect.ImmutableSet
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule
import org.jclouds.ContextBuilder
import java.util.Map
import java.util.HashMap
import java.io.IOException
import org.jclouds.openstack.nova.v2_0.options.CreateServerOptions
import org.jclouds.openstack.nova.v2_0.domain.ServerCreated

class JcloudsOpenStack {

	// Initialize logger for JcloudsOpenStack.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(JcloudsOpenStack))

	private var Machine_OpenStack machine;

	new() {
	}

	new(Machine_OpenStack machine) {
		this.machine = machine
	}

	def String createMachine() {
		LOGGER.info("Creating machine ..")
		var Iterable<Module> modules = ImmutableSet.<Module>of(new SLF4JLoggingModule());
		var NovaApi novaApi = ContextBuilder.newBuilder(this.machine.provider).endpoint(this.machine.endpoint).
			credentials(identity, this.machine.password).modules(modules).buildApi(typeof(NovaApi))
		val String anyZoneName = novaApi.getConfiguredZones().iterator().next();

		// Prepare the server creation
		var Map<String, String> metadata = new HashMap(3)
		metadata.put("Application Name", this.machine.name)
		metadata.put("Root Instance Name", "rootInstanceName")
		metadata.put("Created by", "CloudConnector")
		try {
			var CreateServerOptions options = CreateServerOptions.Builder.keyPairName(this.machine.keypair).
				securityGroupNames(this.machine.security_group).metadata(metadata).networks(this.machine.network_id)
			var ServerCreated server = novaApi.getServerApiForZone(anyZoneName).create(this.machine.name,
				this.machine.image_id, this.machine.flavor_id, options);
			val String machineId = server.getId();
			novaApi.close();

			return machineId

		} catch (IOException e) {
//			 LOGGER.error(e.message.toString)
		}

	}

	/**
	 * 
	 */
	def String identity() {
		return this.machine.tenant + ":" + this.machine.tenant // tenantName:userName
	}	
}
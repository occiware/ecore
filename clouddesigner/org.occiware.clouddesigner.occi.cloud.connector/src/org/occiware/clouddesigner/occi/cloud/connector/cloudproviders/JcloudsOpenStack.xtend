/*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	- Fawaz PARAISO 
 *******************************************************************************/
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
import org.jclouds.compute.ComputeServiceContext
import org.jclouds.compute.domain.TemplateBuilder
import org.jclouds.compute.domain.Template
import org.jclouds.compute.domain.Image;
import java.util.Set
import org.jclouds.compute.domain.NodeMetadata
import java.util.ArrayList
import org.jclouds.compute.domain.ComputeMetadata
import java.util.List
import org.jclouds.compute.domain.Hardware
import java.io.Closeable
import com.google.common.io.Closeables
import java.util.Random
import org.jclouds.domain.Location
import com.google.common.base.Optional
import org.jclouds.openstack.nova.v2_0.extensions.VolumeApi
import org.jclouds.openstack.nova.v2_0.domain.Volume
import org.jclouds.openstack.nova.v2_0.options.CreateVolumeOptions
import org.jclouds.openstack.nova.v2_0.domain.VolumeAttachment

class JcloudsOpenStack extends IaaSHandler implements Closeable {

	// Initialize logger for JcloudsOpenStack.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(JcloudsOpenStack))

	private var Machine_OpenStack machine;

	private var ComputeServiceContext context;
	
	private var NovaApi novaApi;

	new() {
	}

	new(Machine_OpenStack machine) {
		this.machine = machine
		this.context = createContext
	}

	/**
	 * Initialize the context
	 */
	def createContext() {
		val Iterable<Module> modules = ImmutableSet.<Module>of()
		var ComputeServiceContext context = ContextBuilder.newBuilder(this.machine.provider).credentials(this.identity,
			this.machine.password).endpoint(this.machine.endpoint).modules(modules).buildView(
			typeof(ComputeServiceContext))
		LOGGER.info("The context is created Successfully ..")

		return context

	}

	/**
	 * Create a new machine on OpenStack
	 */
	override def createMachine() {
		try {
			LOGGER.info("Creating machine ..")
			var String groupName = "graphical" // TODO Generate random group
			// this.machine.
			var TemplateBuilder templateBuilder = this.context.computeService.templateBuilder()
			if (this.machine.security_group != null) {
				groupName = this.machine.security_group
			}
			if (this.machine.name != null) {
//				templateBuilder.
			}
			if (this.machine.memory > 0.0) {
				templateBuilder.minRam(this.machine.memory.intValue)
			}
			if (this.machine.region != null) {
				templateBuilder.locationId(this.machine.region)
			} else {
				// Choose a random region
				var location = getOneElement(listLocations)
				templateBuilder.locationId(location.id)
			}
			if (this.machine.flavor_id != null) { // TODO
				templateBuilder.hardwareId(this.machine.flavor_id); // provider id or id in Hardware Profile
			} else {
				// Choose a random hardware
				var hardware = getOneElement(listHardware)
				templateBuilder.hardwareId(hardware.id); // Choose a random provider id
			}
			if (this.machine.image_id != null) {
				templateBuilder.imageId(this.machine.image_id); // Image id in Image
			} else {
				// Choose a random image
				var image = getOneElement(listImages)
				templateBuilder.fromImage(image) // Choose a random image id
			}
			var Template template = templateBuilder.build();
			LOGGER.info(" >> Adding node to group = " + groupName)
			var Set<? extends NodeMetadata> nodes = this.context.computeService.createNodesInGroup(groupName, 1,
				template)
			var NodeMetadata lastNodeMetadata = nodes.iterator().next()
			// Update the machine 
			this.machine.id = lastNodeMetadata.id
			this.machine.id = lastNodeMetadata.name

			LOGGER.info("Machine is create ...")

			return lastNodeMetadata.id
		} catch (Exception exception) {
		}
		return null
	}

	def String launchMachine() {
		LOGGER.info("Launching machine: "+ this.machine.name)
		var Iterable<Module> modules = ImmutableSet.<Module>of(new SLF4JLoggingModule());

		novaApi = ContextBuilder.newBuilder(this.machine.provider).endpoint(this.machine.endpoint).
			credentials(this.identity, this.machine.password).modules(modules).buildApi(typeof(NovaApi))

		var location = getOneElement(listLocations)

		val String anyZoneName = location.id

		// Prepare the server creation
		var Map<String, String> metadata = new HashMap(3)
		metadata.put("Server Name", this.machine.name)
		metadata.put("Root Instance Name", "rootInstanceName")
		metadata.put("Created by", "CloudConnector")
		try {
			var CreateServerOptions options = null
			var ServerCreated server = null
			if (this.machine.keypair != null) {
				options = CreateServerOptions.Builder.keyPairName(this.machine.keypair)
			} else {
				// TODO
			}

			if (this.machine.security_group != null) {
				options.securityGroupNames(this.machine.security_group).metadata(metadata)
			} else {
				// TODO
			}

			if (this.machine.network_id != null) {
				options.networks(#[this.machine.network_id])
			}

			if (this.machine.flavor_id != null) {
				if (this.machine.image_id != null) {
					server = novaApi.getServerApiForZone(anyZoneName).create(this.machine.name, this.machine.image_id,
						this.machine.flavor_id, options)

				} else {
					var image = getOneElement(listImages)

					server = novaApi.getServerApiForZone(anyZoneName).create(this.machine.name, image.id,
						this.machine.flavor_id, options)
				}
			} else {
				//TODO
			}
			val String machineId = server.getId();
			novaApi.close();

			// Update the machine 
			this.machine.id = machineId
			LOGGER.info("Machine id: "+ this.machine.id)
			return machineId

		} catch (IOException e) {
			LOGGER.error(e.message)
		}

		return null

	}

	def String createMachines() {
		LOGGER.info("Creating machine: "+ this.machine.name)
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

			// Update the machine 
			this.machine.id = machineId
			return machineId

		} catch (IOException e) {
			LOGGER.error(e.message)
		}

		return null

	}
	

	/**
	 * List all images available on OpenStack
	 */
	override def List<Image> listImages() {
		var Set<? extends Image> images = this.context.computeService.listImages();
		if (images != null) {
			return new ArrayList<Image>(images);
		}
		return new ArrayList<Image>();
	}

	/**
	 * List all images available on OpenStack
	 */
	override def List<NodeMetadata> listMachines() {
		var Set<? extends ComputeMetadata> nodes = this.context.computeService.listNodes();
		var List<NodeMetadata> instancesList = new ArrayList<NodeMetadata>();
		if (nodes != null) {
			for (ComputeMetadata node : nodes) {
				var NodeMetadata metadata = this.context.computeService.getNodeMetadata(node.getId());
				instancesList.add(metadata);
			}
		}
		return instancesList;
	}

	/**
	 * List all hardware available on OpenStack
	 */
	override def List<Hardware> listHardware() {
		var Set<? extends Hardware> flavors = this.context.computeService.listHardwareProfiles();
		if (flavors != null) {
			return new ArrayList<Hardware>(flavors);
		}
		return new ArrayList<Hardware>();
	}

	/**
	 * List all locations on a OpensStack
	 */
	override def List<Location> listLocations() {
		var List<Location> instancesList = new ArrayList<Location>();
		var Set<? extends Location> listAssignableLocations = this.context.computeService.listAssignableLocations
		instancesList.addAll(listAssignableLocations)

		return instancesList
	}

	def terminateMachine(String machineId) {
	}

	/**
	 * Restart a machine
	 */
	override def restartMachine() {
	}

	/**
	 * start a machine
	 */
	override def startMachine() {
	}

	/**
	 * Stop machine
	 */
	override def stopMachine() {
		try {
			this.context.computeService.suspendNode(this.machine.id)
			LOGGER.info("Stopping the machine: " + this.machine.id)
		} catch (Exception e) {
		}
	}

	override def stopMachine(String machineId) {
		try {
			this.context.computeService.suspendNode(machineId)
			LOGGER.info("Stopping the machine: " + this.machine.id)
		} catch (Exception e) {
		}
	}

	/**
	 * Retrieve user identity
	 */
	def String identity() {
		return this.machine.tenant + ":" + this.machine.username // tenantName:userName
	}

	def <T> getOneElement(List<T> element) {
		return element.get(new Random().nextInt(element.size()))
	}

	/**
	 * Always close the service when no longer used.
	 */
	override close() {
		Closeables.close(this.context, true);
		Closeables.close(novaApi, true);
	}

	/**
	 *  Create volume
	 */
	override def createVolume(String volumeName, Integer size) {
		var Optional<? extends VolumeApi> volumeTypeOption
		var NovaApi novaApi = this.context.unwrapApi(typeof(NovaApi))
		var VolumeApi volumesApi = novaApi.getVolumeExtensionForZone("siel").get(); // TODO change Zone
		var Volume volume = volumesApi.create(size,
			CreateVolumeOptions.Builder.name(volumeName).description("OCCIware volume"));

		return volume

	}

	/**
	 * Attach volume to a machine
	 */
	override def attachVolume(String volumeId) {
		var NovaApi novaApi = this.context.unwrapApi(typeof(NovaApi))
		var VolumeApi volumesApi = novaApi.getVolumeExtensionForZone("siel").get(); // TODO change zone
		var VolumeAttachment result = volumesApi.attachVolumeToServerAsDevice(volumeId, this.machine.id, "/dev/vdc");
	}

	/**
	 * Detach volume from machine
	 */
	override def detachVolume(String volumeId) {
		var NovaApi novaApi = this.context.unwrapApi(typeof(NovaApi))
		var VolumeApi volumesApi = novaApi.getVolumeExtensionForZone("siel").get(); // TODO change zone
		volumesApi.detachVolumeFromServer(volumeId, this.machine.id)
	}

	/**
	 * Delete volume from machine
	 */
	override def deleteVolume() {
		var NovaApi novaApi = this.context.unwrapApi(typeof(NovaApi))
		var VolumeApi volumesApi = novaApi.getVolumeExtensionForZone("siel").get(); // TODO change zone
		volumesApi.delete(this.machine.id)
	}
}

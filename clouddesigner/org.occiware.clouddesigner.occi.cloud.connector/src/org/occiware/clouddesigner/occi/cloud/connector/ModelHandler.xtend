package org.occiware.clouddesigner.occi.cloud.connector

import java.util.Map
import org.occiware.clouddesigner.occi.cloud.Machine
import java.util.HashMap
import org.occiware.clouddesigner.occi.cloud.CloudFactory
import org.occiware.clouddesigner.occi.cloud.Machine_OpenStack
import org.jclouds.compute.domain.NodeMetadata
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.occiware.clouddesigner.occi.cloud.Machine_Amazon_EC2
import org.occiware.clouddesigner.occi.cloud.Machine_CloudSigma
import org.occiware.clouddesigner.occi.cloud.Machine_GCE
import org.occiware.clouddesigner.occi.cloud.Machine_Gogrid
import org.occiware.clouddesigner.occi.cloud.Machine_Hp_Helion
import org.occiware.clouddesigner.occi.cloud.Machine_RackSpace
import org.occiware.clouddesigner.occi.cloud.Machine_SoftLayer

class ModelHandler {

	// Initialize logger for ExecutableDockerModel.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(ModelHandler))

	def getmodelEClass() {
		val Map<String, Machine> m = new HashMap

		// TODO verify the good driver name
		m.put(Provider.gogrid.toString, CloudFactory.eINSTANCE.createMachine_Gogrid)
		m.put(Provider.amazonec2.toString, CloudFactory.eINSTANCE.createMachine_Amazon_EC2)
		m.put(Provider.hphelion.toString, CloudFactory.eINSTANCE.createMachine_Hp_Helion)
		m.put(Provider.google.toString, CloudFactory.eINSTANCE.createMachine_GCE)
		m.put(Provider.profitbricks.toString, CloudFactory.eINSTANCE.createMachine_ProfitBricks)
		m.put(Provider.softlayer.toString, CloudFactory.eINSTANCE.createMachine_SoftLayer)
		m.put(Provider.openstack.toString, CloudFactory.eINSTANCE.createMachine_OpenStack)
		m.put(Provider.rackspace.toString, CloudFactory.eINSTANCE.createMachine_RackSpace)
		m.put(Provider.cloudsigma.toString, CloudFactory.eINSTANCE.createMachine_CloudSigma)

		return m
	}

	def Machine getModel(NodeMetadata node, String provider) {
		var machineFactory = getmodelEClass.get(provider)

		if (machineFactory instanceof Machine_OpenStack) {
			var machineOpenStack = machineFactory as Machine_OpenStack

			// Set model values
			machineFactory_OpenStack(machineOpenStack, node)
			LOGGER.info("Model setting: " + machineOpenStack)
			
			return machineOpenStack
		}

		if (machineFactory instanceof Machine_Amazon_EC2) {
			var machineAmazonEC2 = machineFactory as Machine_Amazon_EC2

			// Set model values
			machineFactory_Amazon_EC2(machineAmazonEC2, node)
			LOGGER.info("Model setting: " + machineAmazonEC2)
			
			return machineAmazonEC2
		}
		if (machineFactory instanceof Machine_CloudSigma) {
			var machineCloudSigma = machineFactory as Machine_CloudSigma

			// Set model values
			machineFactory_CloudSigma(machineCloudSigma, node)
			LOGGER.info("Model setting: " + machineCloudSigma)
			
			return machineCloudSigma
		}
		if (machineFactory instanceof Machine_GCE) {
			var machineGCE = machineFactory as Machine_GCE

			// Set model values
			machineFactory_GCE(machineGCE, node)
			LOGGER.info("Model setting: " + machineGCE)
			
			return machineGCE
		}
		if (machineFactory instanceof Machine_Gogrid) {
			var machineGogrid = machineFactory as Machine_Gogrid

			// Set model values
			machineFactory_Gogrid(machineGogrid, node)
			LOGGER.info("Model setting: " + machineGogrid)
			
			return machineGogrid
		}
		if (machineFactory instanceof Machine_Hp_Helion) {
			var machineHpHelion = machineFactory as Machine_Hp_Helion

			// Set model values
			machineFactory_Hp_Helion(machineHpHelion, node)
			LOGGER.info("Model setting: " + machineHpHelion)
			
			return machineHpHelion
		}
		if (machineFactory instanceof Machine_RackSpace) {
			var machineRackSpace = machineFactory as Machine_RackSpace

			// Set model values
			machineFactory_RackSpace(machineRackSpace, node)
			LOGGER.info("Model setting: " + machineRackSpace)
			
			return machineRackSpace
		}
		if (machineFactory instanceof Machine_SoftLayer) {
			var machineSoftLayer = machineFactory as Machine_SoftLayer

			// Set model values
			machineFactory_SoftLayer(machineSoftLayer, node)
			LOGGER.info("Model setting: " + machineSoftLayer)
			
			return machineSoftLayer
		}
		return machineFactory
	}

	def machineFactory_OpenStack(Machine_OpenStack machine, NodeMetadata node) {
		machine.name = node.name
		machine.id = node.id
		machine.region = node.location.id
		machine.image_id = node.imageId
		machine.username = node.credentials.user
		machine.password = node.credentials.password
	}

	def machineFactory_Amazon_EC2(Machine machine, NodeMetadata node) {
	}

	def machineFactory_CloudSigma(Machine machine, NodeMetadata node) {
	}

	def machineFactory_GCE(Machine machine, NodeMetadata node) {
	}

	def machineFactory_Gogrid(Machine machine, NodeMetadata node) {
	}

	def machineFactory_Hp_Helion(Machine machine, NodeMetadata node) {
	}

	def machineFactory_ProfitBricks(Machine machine, NodeMetadata node) {
	}

	def machineFactory_RackSpace(Machine machine, NodeMetadata node) {
	}

	def machineFactory_SoftLayer(Machine machine, NodeMetadata node) {
	}

	def machineFactory(Machine machine, NodeMetadata node) {
	}

}

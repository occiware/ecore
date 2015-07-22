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
package org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.util

import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.StringWriter
import java.util.HashMap
import java.util.Map
import java.util.UUID
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBException
import javax.xml.bind.Marshaller
import org.apache.commons.io.IOUtils
import org.apache.commons.io.LineIterator
import org.occiware.clouddesigner.occi.hypervisor.connector.generated.Domain
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.occiware.clouddesigner.occi.hypervisor.Machine
import org.occiware.clouddesigner.occi.Link
import org.occiware.clouddesigner.occi.infrastructure.Storage
import org.occiware.clouddesigner.occi.hypervisor.Interface
import org.occiware.clouddesigner.occi.infrastructure.Network
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableMachine_VirtualBox
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableMachine

class DomainMarshaller {

	// Initialize logger for Domain Marshaller.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(DomainMarshaller))
	val protected String xmlDirectory = "/xml"
	val protected String storageDirectory = "/storage"
	val protected String ramDirectory = "/ram/"
	val public Map<String, String> uri = new HashMap<String, String>

	def void loadUri() {
		uri.put("vbox", "vbox+unix:///session")
		uri.put("vmware", "vpx://root@185.8.253.211/Datacenters/Production/host/OCCIWARE/172.16.225.11?no_verify=1")
	}

	/**
	 * Create an XML file from compute.
	 * @param compute
	 * @return domain
	 */
	def Domain createComputeDescription(Machine compute) {
		var Domain domain = new Domain
		if(compute instanceof ExecutableMachine_VirtualBox){
			domain.type = compute.driver
		}


		// Set driver name
		val id = UUID.randomUUID.toString
//		domain.type = compute.driver
		domain.setName(compute.name)
		domain.setUuid(id)
		compute.uuid = id
		domain.setMemory(Math.round(compute.memory))
		domain.setCurrentMemory(Math.round(compute.memory))
		domain.setVcpu(compute.cores)

		// OS
		val os = new Domain.Os
		os.type = "hvm"

		// Boot
		val boot1 = new Domain.Os.Boot
		boot1.dev = "cdrom"

		val boot = new Domain.Os.Boot
		boot.dev = "hd"
		os.boot.add(boot1)
		os.boot.add(boot)
		domain.os = os

		//
		val features = new Domain.Features
		features.pae = ""
		features.acpi = ""
		features.apic = ""
		domain.features = features

		//
		val clock = new Domain.Clock
		clock.offset = "localtime"
		domain.clock = clock
		domain.onPoweroff = "destroy"
		domain.onReboot = "restart"
		domain.onCrash = "restart"
		val devices = new Domain.Devices
		val disk = new Domain.Devices.Disk
		disk.type = "file"
		disk.device = "disk"
		val source = new Domain.Devices.Disk.Source
		source.file = createTempDir(storageDirectory).absolutePath + "/" + id + ".vdi"
		if (!compute.links.empty) {
			for (Link link : compute.getLinks()) {
				if (link.target instanceof Storage) {
					devices.disk.add(createStorageDescription(link.target as Storage))
				}
				if (link.target instanceof Interface) {
					devices.interface.add(createNetworkDescription(link.target as Interface))
				}				
			}
		}

		//
		val target = new Domain.Devices.Disk.Target
		target.dev = "hdd"
		target.bus = "sata"
		disk.source = source
		disk.target = target

		val disk1 = new Domain.Devices.Disk
		disk1.type = "file"
		disk1.device = "cdrom"
		disk1.readonly = ""
		val source1 = new Domain.Devices.Disk.Source
		source1.file = "/Users/spirals/Downloads/ubuntu-14.04-server-i386.iso"
		val target1 = new Domain.Devices.Disk.Target
		target1.dev = "hdc"
		target1.bus = "ide"
		disk1.source = source1
		disk1.target = target1

		// Add disk
		devices.disk.add(disk1)
		devices.disk.add(disk)

		// 
		val graphic = new Domain.Devices.Graphics
		graphic.type = "vnc"
		graphic.port = -1
		devices.graphics = graphic

		//
		val input = new Domain.Devices.Input
		input.type = "mouse"
		input.bus = "ps2"
		val input1 = new Domain.Devices.Input
		input1.type = "keyboard"
		input1.bus = "ps2"
		devices.input.add(input)
		devices.input.add(input1)
		domain.devices = devices

		// Save the domain as XMl file.
		writeToDisk(domain)
		LOGGER.info("Domain description: " + compute.id);
		return domain
	}

	/**
	 * Create the XML file from Network.
	 * @param network
	 * @return domain
	 */
	def Domain.Devices.Interface createNetworkDescription(Network network) {
		val interface = new Domain.Devices.Interface
		println("Link size: ------------------>" + network.eContainer)
		interface.type = "bridge"
		val source = new Domain.Devices.Interface.Source
		source.bridge = network.label
		interface.source = source
		val mac = new Domain.Devices.Interface.Mac
		mac.address = '00:0c:29:76:78:50' // TODO generate mac address
		interface.mac = mac
		val model = new Domain.Devices.Interface.Model
		model.type = "82540EM"
		interface.model = model
		return interface
	}

	def Domain.Devices.Interface createNetworkDescription(Interface network) {
		val interface = new Domain.Devices.Interface
		println("Link size: ------------------>" + network.eContainer)
		interface.type = network.type
		val source = new Domain.Devices.Interface.Source
		source.bridge = network.label
		interface.source = source
		val mac = new Domain.Devices.Interface.Mac
		mac.address = network.mac_addresss // TODO generate mac address
		interface.mac = mac
		val model = new Domain.Devices.Interface.Model
		model.type = network.model
		interface.model = model
		return interface
	}
	def String generateMacAddress() {
		return null
	}

	/**
	 * Create the XML file from Storage.
	 * @param storage
	 * @return domain
	 */
	def Domain.Devices.Disk createStorageDescription(Storage storage) {
		val source = new Domain.Devices.Disk.Source
		source.file = createTempDir(storageDirectory).absolutePath + "/" + storage.id + ".vdi"
		val target = new Domain.Devices.Disk.Target
		target.bus = "sata"
		target.dev = "hda"

		val disk = new Domain.Devices.Disk
		disk.type = "file"
		disk.device = "disk"
		disk.source = source
		disk.target = target

		return disk
	}

	def File createTempDir(String baseName) {
		val File baseDir = new File(System.getProperty("java.io.tmpdir"))
		var File tempDir = new File(baseDir, baseName)
		if (!tempDir.exists) {
			if (tempDir.mkdir()) {
				return tempDir
			}
		} else {
			return tempDir

		}

	}

	def String asString(String uuid) {
		val String filename = "/" + uuid + ".xml"
		val StringWriter logwriter = new StringWriter
		val tmpDir = createTempDir(xmlDirectory)
		var InputStream response = new FileInputStream(tmpDir + "/" + filename)

		try {
			val LineIterator itr = IOUtils.lineIterator(response, "UTF-8")

			while (itr.hasNext()) {
				var String line = itr.next()
				if (itr.hasNext()) {
					logwriter.write(line + "\n")
				} else {
					logwriter.write(line + "")
				}
			}
			response.close()

			return logwriter.toString()
		} catch (IOException e) {
			throw new RuntimeException(e)
		} finally {
			IOUtils.closeQuietly(response)
		}
	}

	def void writeToDisk(Domain domain) {
		var FileOutputStream fos = null
		var File file = null
		try {
			val tmpDir = createTempDir(xmlDirectory)
			file = new File(tmpDir + "/" + domain.getUuid.toString + ".xml")
			LOGGER.info(file.absolutePath)
			if (file.exists()) {
				file.delete()
			}

			fos = new FileOutputStream(file)

			var context = JAXBContext.newInstance(typeof(Domain))
			val m = context.createMarshaller()
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE)
			m.marshal(domain, fos)
		} catch (JAXBException e) {
			e.printStackTrace()
		} catch (FileNotFoundException e) {
			e.printStackTrace()
		}
	}

	def String getHypervisorUri(String driver) {

		return null
	}

	def static void main(String[] args) {
		val ExecutableMachine compute = new ExecutableMachine
		compute.hostname = "libvirt-machine-1"
		val domain = new DomainMarshaller
		val vmdomain = domain.createComputeDescription(compute)
		domain.writeToDisk(vmdomain)
		println(domain.asString(vmdomain.getUuid))
	}

}

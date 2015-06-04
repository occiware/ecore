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
package org.occiware.clouddesigner.occi.docker.connector.dockerjava

import com.github.dockerjava.api.DockerClient
import com.github.dockerjava.api.command.CreateContainerCmd
import com.github.dockerjava.api.command.CreateContainerResponse
import com.github.dockerjava.api.command.InspectContainerResponse
import com.github.dockerjava.api.model.ExposedPort
import com.github.dockerjava.api.model.Link
import com.github.dockerjava.api.model.LxcConf
import com.github.dockerjava.api.model.Ports
import com.github.dockerjava.api.model.Volume
import com.github.dockerjava.core.DockerClientBuilder
import com.github.dockerjava.core.DockerClientConfig
import com.google.common.collect.Multimap
import com.jcraft.jsch.Channel
import com.jcraft.jsch.ChannelExec
import com.jcraft.jsch.JSch
import com.jcraft.jsch.JSchException
import com.jcraft.jsch.Session
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException
import java.net.URI
import java.net.URL
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import org.apache.commons.lang.StringUtils
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerConfig
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DockerContainerManager {
	private static DockerClient dockerClient = null
	
	private Map<String, List<String>> images = new HashMap<String, List<String>>

	// Initialize logger for DockerContainerManager.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(DockerContainerManager))

	new() {
	}

	new(Machine machine) {
		dockerClient = setConfig(machine.name)
	}

	def createContainer(Machine machine, Container container) {
		
		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name)
		}
		var Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>
		val create = containerFactory(container, dockerClient)

		// Run Execution
		val CreateContainerResponse rcontainer = create.exec
		result.put(dockerClient, rcontainer)
		return result
	}

	def createContainer(Machine machine, Container container, Multimap<String, String> containerDependency) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name)
		}
		var Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>
		val create = containerFactory(container, dockerClient, containerDependency)

		// Run Execution
		val CreateContainerResponse rcontainer = create.exec
		result.put(dockerClient, rcontainer)
		return result
	}

	def containerFactory(Container container, DockerClient dockerClient) {
		var CreateContainerCmd create = null
		if (container.image != null) {
			create = dockerClient.createContainerCmd(container.image)
		} else if (container.image == null) {
			create = dockerClient.createContainerCmd("busybox")
		}
		if (container.command != null) {

			//TODO command as "sleep", "9999"
			val String[] cmd = container.command.split(",")
			create.withCmd(cmd)
		}
		if (container.cpu_shares > 0) {
			create.withCpuShares(container.cpu_shares)
		}
		if (container.add_host != null) {
			create.withHostName(container.hostname)
		}
		if (container.cpuset != null) {
			create.withCpuset(container.cpuset)
		}
		if (container.privileged) {
			create.withPrivileged(container.privileged)
		}
		if (container.dns != null) {
			create.withDns(container.dns)
		}
		if (container.environment != null) {
			create.withEnv(container.environment)
		}
		if (container.ports != null) {
			var ExposedPort port = ExposedPort.tcp(Integer.parseInt(container.ports))
			val Ports portBindings = new Ports
			portBindings.bind(port, Ports.Binding(11022)) //TODO Create dynamique port number
			create.withPortBindings(portBindings)
		}
		if (container.name != null) {
			create.withName(container.name)
		}
		if (container.net != null) {
			create.withNetworkMode(container.net)
		}
		if (container.publish_all) {
			create.withPublishAllPorts(container.publish_all)
		}
		if (container.tty) {
			create.withTty(container.tty)
		}
		if (container.stdin_open) {
			create.withStdInOnce(container.stdin_open)
		}
		if (container.user != null) {
			create.withUser(container.user)
		}
		if (container.volumes != null) {
			create.withVolumes(new Volume(container.volumes))
		}
		if (container.mem_limit > 0) {
			create.withMemoryLimit(container.mem_limit)
		}
		if (container.memory_swap > 0) {
			create.withMemorySwap(container.memory_swap)
		}
		if (container.lxc_conf != null) {

			//TODO lxc_conf should be String array..
			val LxcConf lxcCon = new LxcConf("key", "value")
			create.withLxcConf(lxcCon)
		}
		if (container.cores > 0) {
			create.withCpuset(String.valueOf(container.cores))
		}

		//		if (container.links.size > 0) {
		//
		//			//TODO Link container.links.get(0)
		//			for (Link link : container.links) {
		//				var linkerContainer = link.target as Container
		//				val com.github.dockerjava.api.model.Link dockeClientlink = new com.github.dockerjava.api.model.Link(
		//					linkerContainer.name, container.name + "To" + linkerContainer.name)
		//				create.withLinks(dockeClientlink)
		//			}
		//
		//		//			container.links.forEach[elt|elt.source as Container]
		//		}
		// Verify that image is presnet on the machine
		return create
	}

	def containerFactory(Container container, DockerClient dockerClient, Multimap<String, String> containerDependency) {
		var CreateContainerCmd create = null
		if (container.image != null) {
			create = dockerClient.createContainerCmd(container.image)
		} else if (container.image == null) {
			create = dockerClient.createContainerCmd("busybox")
		}
		if (container.command != null) {

			// The command is something like: sleep, 9999
			val String[] cmd = container.command.split(",")
			create.withCmd(cmd)
		} else if (container.command == null) {
			create.withCmd("sleep", "9999")
		}
		if (container.cpu_shares > 0) {
			create.withCpuShares(container.cpu_shares)
		}
		if (container.add_host != null) {
			create.withHostName(container.hostname)
		}
		if (container.cpuset != null) {
			create.withCpuset(container.cpuset)
		}
		if (container.privileged) {
			create.withPrivileged(container.privileged)
		}
		if (container.dns != null) {
			create.withDns(container.dns)
		}
		if (container.environment != null) {
			create.withEnv(container.environment)
		}
		if (container.ports != null) {
			val String[] ports = container.ports.split(":")
			var ExposedPort port = ExposedPort.tcp(Integer.parseInt(ports.get(0)))
			val Ports portBindings = new Ports
			if (ports.size == 2) {
				portBindings.bind(port, Ports.Binding(Integer.parseInt(ports.get(1))))

			} else if (ports.size == 1) {
				portBindings.bind(port, Ports.Binding(Integer.parseInt(ports.get(0))))
			}
			create.withPortBindings(portBindings)
		}
		if (container.name != null) {
			create.withName(container.name)
		}
		if (container.net != null) {
			create.withNetworkMode(container.net)
		}
		if (container.publish_all) {
			create.withPublishAllPorts(container.publish_all)
		}
		if (container.tty) {
			create.withTty(container.tty)
		}
		if (container.stdin_open) {
			create.withStdInOnce(container.stdin_open)
		}
		if (container.user != null) {
			create.withUser(container.user)
		}
		if (container.volumes != null) {
			create.withVolumes(new Volume(container.volumes))
		}
		if (container.mem_limit > 0) {
			create.withMemoryLimit(container.mem_limit)
		}
		if (container.memory_swap > 0) {
			create.withMemorySwap(container.memory_swap)
		}
		if (container.lxc_conf != null) {

			//TODO lxc_conf should be String array..
			val LxcConf lxcCon = new LxcConf("key", "value")
			create.withLxcConf(lxcCon)
		}
		if (container.cores > 0) {
			create.withCpuset(String.valueOf(container.cores))
		}

		if (containerDependency.containsKey(container.name)) {
			val List<String> depdupeContainers = new ArrayList<String>(
				new LinkedHashSet<String>(containerDependency.get(container.name)))
			var List<Link> dockeClientlinks = new ArrayList<Link>
			var Link dockeClientlink = null
			for (String entry : depdupeContainers) {
				dockeClientlink = new Link(entry, container.name + "LinkTo" + entry)
				dockeClientlinks.add(dockeClientlink)
			}
			if (depdupeContainers.size > 1) {
				create.withLinks(dockeClientlinks)
			} else if (depdupeContainers.size == 1) {
				create.withLinks(dockeClientlink)
			}
		}
		return create
	}

	def InspectContainerResponse inspectContainer(Map<DockerClient, CreateContainerResponse> map) {
		val dockerClient = map.keySet().iterator().next() as DockerClient
		val createContainerResponse = map.get(dockerClient) as CreateContainerResponse
		val InspectContainerResponse inspectContainerResponse = dockerClient.inspectContainerCmd(
			createContainerResponse.getId()).exec()
		return inspectContainerResponse

	}

	def InspectContainerResponse inspectContainer(Machine machine, String containerId) {
		var DockerClient dockerClient = null

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name)
		}
		val InspectContainerResponse inspectContainerResponse = dockerClient.inspectContainerCmd(containerId).exec()
		return inspectContainerResponse

	}

	def startContainer(Machine machine, Container container) {
		var DockerClient dockerClient = null

		// Set dockerClient
		if (DockerContainerManager.dockerClient != null) {
			dockerClient = DockerContainerManager.dockerClient
		} else {
			dockerClient = setConfig(machine.name)

		}
		dockerClient.startContainerCmd(container.id).exec
	}

	def startContainer(Machine machine, String containerId) {
		var DockerClient dockerClient = null

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name)
		}
		dockerClient.startContainerCmd(containerId).exec
	}

	def stopContainer(Machine machine, Container container) {
		var DockerClient dockerClient = null

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name)
		}
		dockerClient.stopContainerCmd(container.id).exec
	}

	def stopContainer(Machine machine, String containerId) {
		var DockerClient dockerClient = null

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name)
		}
		dockerClient.stopContainerCmd(containerId).exec
	}

	def waitContainer(Machine machine, Container container) {
		var DockerClient dockerClient = null

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name)
		}
		dockerClient.waitContainerCmd(container.id).exec
	}

	def List<com.github.dockerjava.api.model.Container> listContainer(String machineName) {

		var DockerClient dockerClient = null

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machineName)
		}
		val List<com.github.dockerjava.api.model.Container> containers = dockerClient.listContainersCmd().
			withShowAll(true).exec()
		return containers
	}

	def pullImage(Machine machine, String image) {

		var DockerClient dockerClient = null

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name)
		}
		var containerImage = image
		if (!StringUtils.isNotBlank(containerImage)) {
			containerImage = "busybox"
			LOGGER.info("Use default image: "+ containerImage)
		}
		var String output = null
		if (!machineContainsImage(machine.name, containerImage)) {
			LOGGER.info("Downloading image: ->" + containerImage)
			addImageToMachine(machine.name, containerImage)

			// Download a pre-built image
			output = DockerUtil.asString(dockerClient.pullImageCmd(containerImage).withTag("latest").exec)
			LOGGER.info(output)
			LOGGER.info("Download is finished")
		}

		return dockerClient

	}
	
	def boolean machineContainsImage(String machine, String image){
		if(images.get(machine) != null){
			return images.get(machine).contains(image)
		}
		return false
	}
	
	def void addImageToMachine(String machine, String image){
		if(!images.containsKey(machine)){
			var tempList = new ArrayList
			tempList.add(image)
			images.put(machine, tempList)
		}else{
			var tempList = images.get(machine)
			tempList.add(image)
			images.put(machine, tempList)
		}
	}
	
	def DockerClient setConfig(String machine) {
		val lconfig = new DockerConfig
		val dockerClientconfig = lconfig.loadConfig
		LOGGER.info("Connection inside docker-machine ---> " + machine)
		var String port = null
		var String ENDPOINT = DockerMachineManager.urlCmd(Runtime.getRuntime, machine)
		val String certPath = DockerUtil.getEnv(machine)
		if (DockerUtil.getOS.equals("osx")) {
			port = ":2376"
		} else if (DockerUtil.getOS.equals("uni")) {
			port = ":2375"
		}
		val url = new URL(ENDPOINT)
		val URI uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null)
		val dockerUri = uri.toString + port
		LOGGER.info("Connection inside machine: " + machine + " with uri: " + dockerUri.toString)
		val DockerClientConfig config = DockerClientConfig.createDefaultConfigBuilder.withVersion(
			dockerClientconfig.get("docker.version").toString).withUri(dockerUri).withUsername(
			dockerClientconfig.get("docker.username").toString).withPassword(
			dockerClientconfig.get("docker.password").toString).withEmail(
			dockerClientconfig.get("docker.email").toString).withServerAddress("https://index.docker.io/v1/").
			withDockerCertPath(certPath).build()
		val DockerClient dockerClient = DockerClientBuilder.getInstance(config).build()
		return dockerClient
	}

	def void connect() {
		var Session session = null
		val File test = new File("test")
		val host = "192.168.99.100"

		try {
			val JSch jsc = new JSch
			jsc.setKnownHosts("test")
			jsc.addIdentity("/Users/spirals/.docker/machine/machines/bingo/id_rsa")
			val user = "docker"
			session = jsc.getSession(user, host, 22)
			session.connect()

		} catch (JSchException e) {
			LOGGER.info(e.toString)
			addHost(session.getHostKey().getKey(), host, "test")
		}

		try {
			val JSch jsc = new JSch
			jsc.setKnownHosts("test")
			jsc.addIdentity("/Users/spirals/.docker/machine/machines/bingo/id_rsa")
			val user = "docker"
			session = jsc.getSession(user, host, 22)
			session.connect()

			val Channel channel = session.openChannel("shell")
			channel.setInputStream(System.in)
			channel.setOutputStream(System.out)
			channel.connect()
		} catch (JSchException e) {
			LOGGER.info(e.toString)
		}
	}

	def void connect(String host, String privateKey, String command) {
		var Session session = null
		val user = "docker"
		val tempDir = createTempDir("knowHosts")
		val File test = new File(tempDir + "/hosts")

		// Do not remove an existing file
		if (!test.exists) {
			test.createNewFile
		}

		try {
			val JSch jsc = new JSch
			jsc.setKnownHosts(test.absolutePath)
			jsc.addIdentity(privateKey)
			session = jsc.getSession(user, host, 22)
			session.connect()

		} catch (JSchException e) {
			LOGGER.info(e.toString)
			addHost(session.getHostKey().getKey(), host, tempDir + "/hosts")
		}

		try {
			val JSch jsc = new JSch
			jsc.setKnownHosts(test.absolutePath)
			jsc.addIdentity(privateKey)
			val exCommand = "sudo sh -c " + "\"" + command + "\""
			LOGGER.info(exCommand)
			session = jsc.getSession(user, host, 22)
			session.connect()
			val Channel channel = session.openChannel("exec")
			(channel as ChannelExec).setCommand(exCommand)
			(channel as ChannelExec).setErrStream(System.err)
			channel.connect()
		} catch (JSchException e) {
			LOGGER.info(e.toString)

		}
		session.disconnect()
	}

	def void addHost(String key, String ip, String knowHosts) {
		try {
			val FileWriter tmpwriter = new FileWriter(knowHosts, true)
			val String newLine = ip + " ssh-rsa " + key + "\n"
			if (!hostAlreadyExist(newLine, knowHosts)) {
				tmpwriter.append(newLine)
				LOGGER.info(ip + " ssh-rsa " + key)

				tmpwriter.flush()
				tmpwriter.close()
			}

		} catch (IOException e) {
			e.printStackTrace()
		}
	}

	def boolean hostAlreadyExist(String newLine, String knowHosts) {
		val File hostFile = new File(knowHosts)
		var BufferedReader br = new BufferedReader(new FileReader(hostFile))
		var String line = null
		while ((line = br.readLine()) != null) {
			if (line.trim.equalsIgnoreCase(newLine.trim)) {
				return true
			}
		}
		br.close()
		return false
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

}

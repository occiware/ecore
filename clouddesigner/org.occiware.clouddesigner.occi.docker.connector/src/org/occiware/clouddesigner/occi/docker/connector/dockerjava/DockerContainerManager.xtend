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
import com.github.dockerjava.core.command.PullImageResultCallback
import com.github.dockerjava.core.command.WaitContainerResultCallback
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
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import org.apache.commons.lang.StringUtils
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.EventCallBack
import org.occiware.clouddesigner.occi.docker.connector.StatsCallback
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerConfig
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.occiware.clouddesigner.occi.docker.preference.preferences.PreferenceValues
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import com.github.dockerjava.api.model.RestartPolicy

class DockerContainerManager {
	private static DockerClient dockerClient = null

	private static String currentMachine = null

	private Map<String, List<String>> images = new HashMap<String, List<String>>

	// Initialize logger for DockerContainerManager.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(DockerContainerManager))

	private PreferenceValues properties = new PreferenceValues

	new() {
	}

	new(Machine machine) {
		dockerClient = setConfig(machine.name, properties)

	}

	new(String machineName) {
		dockerClient = setConfig(machineName, properties)
	}

	new(Machine machine, EventCallBack event) {
		dockerClient = setConfig(machine.name, properties)

		// listened to Events
		dockerClient.eventsCmd().exec(event)
	}

	def createContainer(Machine machine, Container container) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}

		var Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>
		val create = containerFactory(container, dockerClient)

		// Run Execution
		val CreateContainerResponse rcontainer = create.exec

		// Set container ID
		container.containerid = rcontainer.id
		LOGGER.info("Created container: {}", container.containerid)

		result.put(dockerClient, rcontainer)
		return result
	}

	def createContainer(Machine machine, Container container, Multimap<String, String> containerDependency) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}
		var Map<DockerClient, CreateContainerResponse> result = new LinkedHashMap<DockerClient, CreateContainerResponse>
		val create = containerFactory(container, dockerClient, containerDependency)

		// Run Execution
		val CreateContainerResponse rcontainer = create.exec

		// Set container ID
		container.containerid = rcontainer.id
		LOGGER.info("Created container: {}", container.containerid)

		result.put(dockerClient, rcontainer)
		return result
	}

	def void removeContainer(String machineName, String containerId) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machineName, properties)
		} else if (!currentMachine.equalsIgnoreCase(machineName)) {
			dockerClient = setConfig(machineName, properties)
		}

		dockerClient.removeContainerCmd(containerId).exec
	}

	def containerFactory(Container container, DockerClient dockerClient) {
		var CreateContainerCmd create = null
		if (container.image != null) {
			create = dockerClient.createContainerCmd(container.image.trim)
		} else if (container.image == null) {
			create = dockerClient.createContainerCmd("busybox")
		}
		if (container.command != null) {
			val String[] cmd = StringUtils.deleteWhitespace(container.command).split(",")
			create.withCmd(cmd)
		}
		if (container.cpu_shares > 0) {
			create.withCpuShares(container.cpu_shares)
		}
		if (container.add_host != null) {
			create.withHostName(container.hostname)
		}
		if (container.cpuset != null) {
			create.withCpusetCpus(container.cpuset)
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
		LOGGER.info("Container ports = " + container.ports)
		if (StringUtils.isNotBlank(container.ports)) {
			val String[] l_r_ports = container.ports.split(":")
			var ExposedPort tcp = ExposedPort.tcp(Integer.parseInt(l_r_ports.get(0)))
			val Ports portBindings = new Ports
			// Exposed port l_r_ports.get(0)
			// Binding port l_r_ports.get(1)
			if (l_r_ports.size == 2) {
				if (StringUtils.isNotBlank(l_r_ports.get(1))) {
					portBindings.bind(tcp, Ports.Binding.bindPort(Integer.parseInt(l_r_ports.get(1))))
				} else {
					portBindings.bind(tcp, Ports.Binding.bindPort(32768)) // TODO Create dynamique port number
				}
			}
			create.withPortBindings(portBindings)
		}
		if (container.name != null) {
			create.withName(container.name.trim)
		}
		if (container.hostname != null) {
			create.withHostName(container.hostname.trim)
		}
		if (container.net != null) {
			create.withNetworkMode(container.net)
		}
		if (container.publish_all) {
			create.withPublishAllPorts(container.publish_all)
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
			create.withMemory(Long.valueOf(container.mem_limit))
		}
		if (container.memory_swap > 0) {
			create.withMemory(Long.valueOf(container.memory_swap))
		}
		if (container.lxc_conf != null) {

			// TODO lxc_conf should be String array..
			val LxcConf lxcCon = new LxcConf("key", "value")
			create.withLxcConf(lxcCon)
		}		
		if(container.domainname !=null){
			create.withDomainName(container.domainname)
		}

		if(container.dns_search != null){
			var String[] dnsSearch = container.dns_search.split(",")
			create.withDnsSearch(dnsSearch)
		}

		if(container.entrypoint != null){
			var String[] entrypoint = container.entrypoint.split(",")
			create.withEntrypoint(entrypoint)
		}

		if(container.net != null){
			create.withNetworkMode(container.net)
		}

		if(container.pid != null){
			create.withPidMode(container.pid)
		}
		
		if(container.privileged){
			create.withPrivileged(container.privileged)
		}		

		if(container.publish_all){
			create.withPublishAllPorts(container.publish_all)
		}		

		if(container.read_only){
			create.withReadonlyRootfs(container.read_only)
		}		

		if(container.tty){
			create.withTty(container.tty)
		}		

		if(container.restart != null){
			create.withRestartPolicy(RestartPolicy.parse(container.restart))
		}		

		if(container.working_dir != null){
			create.withWorkingDir(container.working_dir)
			create.cpusetCpus
		}		

		return create
	}

	def containerFactory(Container container, DockerClient dockerClient, Multimap<String, String> containerDependency) {
		var CreateContainerCmd create = null
		if (container.image != null) {
			create = dockerClient.createContainerCmd(container.image.trim)
		} else if (container.image == null) {
			create = dockerClient.createContainerCmd("busybox")
		}
		if (container.command != null) {
			// The command is something like: sleep, 9999
			val String[] cmd = StringUtils.deleteWhitespace(container.command).split(",")
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
			create.withCpusetCpus(container.cpuset)
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
				portBindings.bind(port, Ports.Binding.bindPort(Integer.parseInt(ports.get(1))))

			} else if (ports.size == 1) {
				portBindings.bind(port, Ports.Binding.bindPort(Integer.parseInt(ports.get(0))))
			}
			create.withPortBindings(portBindings)
		}
		if (container.name != null) {
			create.withName(container.name.trim)
		}
		if (container.hostname != null) {
			create.withName(container.hostname.trim)
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
			create.withMemory(Long.valueOf(container.mem_limit))
		}
		if (container.memory_swap > 0) {
			create.withMemorySwap(Long.valueOf(container.memory_swap))
		}
		if (container.lxc_conf != null) {

			// TODO lxc_conf should be String array..
			val LxcConf lxcCon = new LxcConf("key", "value")
			create.withLxcConf(lxcCon)
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

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
			currentMachine = machine.name
		}
		val InspectContainerResponse inspectContainerResponse = dockerClient.inspectContainerCmd(containerId).exec()
		return inspectContainerResponse

	}

	def startContainer(Machine machine, Container container) {

		// Set dockerClient
		if (dockerClient != null) {
			dockerClient = DockerContainerManager.dockerClient
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}

		// Start the container
		dockerClient.startContainerCmd(container.containerid).exec
		
		if(container.monitored){ // Allow the monitoring of a Container
		// Collect monitoring data
		LOGGER.info("Starting metrics collection");
		
		// load new docker client to Fix blocking Thread problem.
		dockerClient = setConfig(machine.name, properties)
		
		dockerClient.statsCmd(container.containerid).exec(new StatsCallback(container))			
			
		}
	}

	def startContainer(Machine machine, String containerId) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}
		// Start the container
		dockerClient.startContainerCmd(containerId).exec

		// Collect monitoring data
		LOGGER.info("Starting metrics collection");
		// load new docker client to Fix blocking Thread problem.
		dockerClient = setConfig(machine.name, properties)
		dockerClient.statsCmd(containerId).exec(new StatsCallback(containerId))
	}

	def stopContainer(Machine machine, Container container) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}
		// Stop the container
		dockerClient.stopContainerCmd(container.id).exec
	}

	def stopContainer(Machine machine, String containerId) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}
		// Stop the container 
		dockerClient.stopContainerCmd(containerId).exec
	}

	def waitContainer(Machine machine, Container container) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}
		dockerClient.waitContainerCmd(container.id).exec(new WaitContainerResultCallback()).awaitStatusCode()
	}

	def List<com.github.dockerjava.api.model.Container> listContainer(String machineName) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machineName, properties)
		} else if (!currentMachine.equalsIgnoreCase(machineName)) {
			dockerClient = setConfig(machineName, properties)
		}
		val List<com.github.dockerjava.api.model.Container> containers = dockerClient.listContainersCmd().
			withShowAll(true).exec()
		return containers
	}

	def pullImage(Machine machine, String image) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}
		var containerImage = image
		if (!StringUtils.isNotBlank(containerImage)) {
			containerImage = "busybox"
			LOGGER.info("Use default image: " + containerImage)
		}
		var String output = null
		LOGGER.info("Downloading image: ->" + containerImage)
		// Download a pre-built image
		try {
			dockerClient.pullImageCmd(containerImage).withTag("latest").exec(new PullImageResultCallback()).
				awaitSuccess()
		// output = DockerUtil.asString(resp)
		} catch (Exception e) {
			LOGGER.error(e.message)
		}
		LOGGER.info(output)
		LOGGER.info("Download is finished")
		/*
		 * 
		 * if (!machineContainsImage(machine.name, containerImage)) {
		 * 	LOGGER.info("Downloading image: ->" + containerImage)
		 * 	addImageToMachine(machine.name, containerImage)

		 * 	// Download a pre-built image
		 * 	try {
		 * 		dockerClient.pullImageCmd(containerImage).withTag("latest").exec(new PullImageResultCallback()).awaitSuccess()
		 * 		//output = DockerUtil.asString(resp)
		 * 	} catch (Exception e) {
		 * 		LOGGER.error(e.message)
		 * 	}
		 * 	LOGGER.info(output)
		 * 	LOGGER.info("Download is finished")
		 * }else{
		 * 	LOGGER.info("Downloading image: ->" + containerImage)
		 * 	// Download a pre-built image
		 * 	try {
		 * 		dockerClient.pullImageCmd(containerImage).withTag("latest").exec(new PullImageResultCallback()).awaitSuccess()
		 * 		//output = DockerUtil.asString(resp)
		 * 	} catch (Exception e) {
		 * 		LOGGER.error(e.message)
		 * 	}
		 * 	LOGGER.info(output)
		 * 	LOGGER.info("Download is finished")
		 * 	
		 * }
		 */
		return dockerClient

	}

	def boolean machineContainsImage(String machine, String image) {
		if (images.get(machine) != null) {
			return images.get(machine).contains(image)
		}
		return false
	}

	def void addImageToMachine(String machine, String image) {
		if (!images.containsKey(machine)) {
			var tempList = new ArrayList
			tempList.add(image)
			images.put(machine, tempList)
		} else {
			var tempList = images.get(machine)
			tempList.add(image)
			images.put(machine, tempList)
		}
	}

	def DockerClient setConfig(String machine, PreferenceValues properties) {
		LOGGER.info("Trying to connect inside machine ---> " + machine)
		var String port = null
		var String ENDPOINT = DockerMachineManager.urlCmd(Runtime.getRuntime, machine)
		val String certPath = DockerUtil.getEnv(machine)
		LOGGER.info("DOCKER_CERT_PATH=" + certPath)
		var DockerClientConfig config = null
		val lconfig = new DockerConfig
		var dockerProperties = lconfig.loadConfig
		// Set Docker host port
		port = ":2376"

		LOGGER.info("ENDPOINT : " + ENDPOINT)
		val dockerHost = ENDPOINT.trim
		LOGGER.info("Connection inside machine: " + machine + " with uri: " + dockerHost.toString)
		var dockerHome = System.getProperty("user.home") + File.separator + ".docker"
		try {
			if (properties.version != null) {
				config = DockerClientConfig.createDefaultConfigBuilder.withApiVersion(properties.version.trim).
					withDockerHost(dockerHost).withDockerTlsVerify(true).withRegistryUsername(properties.username.trim).
					withRegistryPassword(properties.password.trim).withRegistryEmail(properties.email.trim).
					withRegistryUrl(properties.url.trim).withDockerCertPath(certPath).withDockerConfig(
						dockerHome).build()

			}
		} catch (Exception exception) {
			LOGGER.error("Loading docker-java properties files ...")
			config = DockerClientConfig.createDefaultConfigBuilder.withApiVersion(
				dockerProperties.get("docker.version").toString).withDockerHost(dockerHost).withDockerTlsVerify(true).
				withRegistryUsername(dockerProperties.get("docker.username").toString).withRegistryPassword(
					dockerProperties.get("docker.password").toString).withRegistryEmail(
					dockerProperties.get("docker.email").toString).withRegistryUrl(
					dockerProperties.get("docker.url").toString).withDockerCertPath(certPath).withDockerConfig(
					dockerHome).build()
		}
		val DockerClient dockerClient = DockerClientBuilder.getInstance(config).build()

		// Set the new machine as the current
		currentMachine = machine
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

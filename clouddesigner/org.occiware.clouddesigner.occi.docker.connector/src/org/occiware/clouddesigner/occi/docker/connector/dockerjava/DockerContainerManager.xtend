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
import com.github.dockerjava.api.command.CreateNetworkCmd
import com.github.dockerjava.api.command.CreateNetworkResponse
import com.github.dockerjava.api.command.InspectContainerResponse
import com.github.dockerjava.api.exception.InternalServerErrorException
import com.github.dockerjava.api.model.ExposedPort
import com.github.dockerjava.api.model.Link
import com.github.dockerjava.api.model.LxcConf
import com.github.dockerjava.api.model.Network.Ipam.Config
import com.github.dockerjava.api.model.Ports
import com.github.dockerjava.api.model.Ports.Binding
import com.github.dockerjava.api.model.RestartPolicy
import com.github.dockerjava.api.model.Volume
import com.github.dockerjava.core.DefaultDockerClientConfig
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
import java.lang.reflect.InvocationTargetException
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.Properties
import java.util.Set
import org.apache.commons.lang.StringUtils
import org.occiware.clouddesigner.occi.docker.Container
import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.Network
import org.occiware.clouddesigner.occi.docker.NetworkLink
import org.occiware.clouddesigner.occi.docker.connector.EventCallBack
import org.occiware.clouddesigner.occi.docker.connector.StatsCallback
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.DockerMachineManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerConfig
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.occiware.clouddesigner.occi.docker.preference.preferences.PreferenceValues
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.occiware.clouddesigner.occi.docker.Contains
import org.occiware.clouddesigner.occi.docker.Volumesfrom
import com.github.dockerjava.api.model.VolumesFrom
import org.occiware.clouddesigner.occi.Resource
import com.github.dockerjava.api.model.Bind
import com.github.dockerjava.api.model.PortBinding

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

	def createNetwork(Machine machine, Network network) {
		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}

		var List<Config> ipamConfigs = newArrayList()
		var com.github.dockerjava.api.model.Network.Ipam ipam = null

		if (StringUtils.isNotBlank(network.subnet)) {
			ipamConfigs.add(new com.github.dockerjava.api.model.Network.Ipam.Config().withSubnet(network.subnet))
		} else {
			ipamConfigs.add(new com.github.dockerjava.api.model.Network.Ipam.Config().withSubnet("10.67.79.0/24"))
		}

		if (StringUtils.isNotBlank(network.gateway)) {
			ipamConfigs.add(new com.github.dockerjava.api.model.Network.Ipam.Config().withGateway(network.gateway))
		}
		if (StringUtils.isNotBlank(network.ip_range)) {
			ipamConfigs.add(new com.github.dockerjava.api.model.Network.Ipam.Config().withIpRange(network.ip_range))
		}

		try {
			ipam = new com.github.dockerjava.api.model.Network().ipam.withConfig(ipamConfigs)
		} catch (InvocationTargetException exception) {
			LOGGER.error(" InvocationTargetException: " + exception.cause.message)
		} catch (Exception e) {
			LOGGER.error("Exception:" + e.message)
		}
		// Initiate the NetworkCommand
		var CreateNetworkCmd createNetworkCmd = dockerClient.createNetworkCmd().withIpam(ipam)
		if (StringUtils.isNotBlank(network.name)) {
			createNetworkCmd = createNetworkCmd.withName(network.name)
		}
		if (StringUtils.isNotBlank(network.driver)) {
			createNetworkCmd = createNetworkCmd.withDriver(network.driver)
		}

		var CreateNetworkResponse createNetworkResponse = null
		var com.github.dockerjava.api.model.Network updateNetwork = null
		try {
			// Create an overlay network
			createNetworkResponse = createNetworkCmd.withCheckDuplicate(true).exec()
		} catch (InternalServerErrorException exception) {
			LOGGER.error(exception.message)
			createNetworkResponse = null
			updateNetwork = dockerClient.inspectNetworkCmd().withNetworkId(network.name).exec()
			updateNetwork.id
		}
		if (createNetworkResponse != null) {
			return createNetworkResponse.id
		} else {
			return updateNetwork.id
		}
	}

	def connectToNetwork(Machine machine, Map<Container, Set<NetworkLink>> networks) {
		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}
		if (networks.size > 0) {
			for (Map.Entry<Container, Set<NetworkLink>> entry : networks.entrySet) {
				for (NetworkLink netLink : entry.value) {
					try {
					dockerClient.connectToNetworkCmd().withNetworkId((netLink.target as Network).networkId).withContainerId(entry.key.containerid).exec()
					} catch (InternalServerErrorException exception) {
						LOGGER.error("InternalServerErrorException: " + exception.message)
					}
				}
			}
		}
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
		if (StringUtils.isNotBlank(container.image)) {
			create = dockerClient.createContainerCmd(container.image.trim)
		} else{
			create = dockerClient.createContainerCmd("busybox")
		}
		if (StringUtils.isNotBlank(container.command)) {
			var String[] cmd = (StringUtils.deleteWhitespace(container.command)).split(",")
			create.withCmd(cmd)
		} else if (!StringUtils.isNotBlank(container.image)) { // else overrides image command if any (often)
			create.withCmd("sleep", "9999")
		}
		if (container.cpu_shares > 0) {
			create.withCpuShares(container.cpu_shares)
		}
		if (StringUtils.isNotBlank(container.add_host)) {
			create.withHostName(StringUtils.deleteWhitespace(container.hostname))
		}
		if (StringUtils.isNotBlank(container.cpuset)) {
			create.withCpusetCpus(StringUtils.deleteWhitespace(container.cpuset))
		}
		if (container.privileged) {
			create.withPrivileged(container.privileged)
		}
		if (StringUtils.isNotBlank(container.dns)) {
			create.withDns(StringUtils.deleteWhitespace(container.dns))
		}
		if (StringUtils.isNotBlank(container.environment)) {
			var String[] env = StringUtils.deleteWhitespace(container.environment).split(",")
			create.withEnv(env)
		}
		LOGGER.info("Container ports = " + container.ports)
		if (StringUtils.isNotBlank(container.ports)) {
			val String[] unparsedPortBindings = container.ports.split(" ")
			var List<ExposedPort> exposedPortsList = new ArrayList<ExposedPort>
			var List<PortBinding> portBindingsList = new ArrayList<PortBinding>
			for (var i = 0; i < unparsedPortBindings.length; i++) {
				val String[] l_r_ports = unparsedPortBindings.get(i).split(":")
				var ExposedPort tcp = ExposedPort.tcp(Integer.parseInt(l_r_ports.get(0)))
				var PortBinding portBindings = null
				// Exposed port is set with l_r_ports.get(0)
				// Binding port is set with l_r_ports.get(1)
				if (l_r_ports.size == 2) {
					if (StringUtils.isNotBlank(l_r_ports.get(1))) {
						portBindings = new PortBinding(Binding.bindPort(Integer.parseInt(l_r_ports.get(1))), tcp)
					} else {
						portBindings = new PortBinding(Binding.bindPort(32768), tcp) // TODO Create dynamic port number
					}
				}
				exposedPortsList.add(tcp)
				portBindingsList.add(portBindings)
			}

			create.withExposedPorts(exposedPortsList).withPortBindings(portBindingsList)
		}
		if (StringUtils.isNotBlank(container.name)) {
			create.withName(StringUtils.deleteWhitespace(container.name))
		}
		if (StringUtils.isNotBlank(container.hostname)) {
			create.withHostName(StringUtils.deleteWhitespace(container.hostname))
		}
		if (StringUtils.isNotBlank(container.net)) {
			create.withNetworkMode(container.net)
		}
		if (container.publish_all) {
			create.withPublishAllPorts(container.publish_all)
		}
		if (container.stdin_open) {
			create.withStdInOnce(container.stdin_open)
		}
		if (StringUtils.isNotBlank(container.user)) {
			create.withUser(container.user)
		}
		if (StringUtils.isNotBlank(container.volumes)) {
			var String[] volumes = StringUtils.deleteWhitespace(container.volumes).split(",")
			var List<Volume> vs = new ArrayList<Volume>
			for(v:volumes){
				 var Volume newVolume = new Volume(v)
				 vs.add(newVolume)
			}
			create.withVolumes(vs)
		}
		if (container.mem_limit > 0) {
			create.withMemory(Long.valueOf(container.mem_limit))
		}
		if (container.memory_swap > 0) {
			create.withMemory(Long.valueOf(container.memory_swap))
		}
		if (StringUtils.isNotBlank(container.lxc_conf)) {
			// TODO lxc_conf should be String array..
			val LxcConf lxcCon = new LxcConf("key", "value")
			create.withLxcConf(lxcCon)
		}		
		if(StringUtils.isNotBlank(container.domainname)){
			create.withDomainName(container.domainname)
		}
		if(StringUtils.isNotBlank(container.dns_search)){
			var String[] dnsSearch = container.dns_search.split(",")
			create.withDnsSearch(dnsSearch)
		}
		if(StringUtils.isNotBlank(container.entrypoint)){
			var String[] entrypoint = container.entrypoint.split(",")
			create.withEntrypoint(entrypoint)
		}
		if(StringUtils.isNotBlank(container.net)){
			create.withNetworkMode(StringUtils.deleteWhitespace(container.net))
		}
		if(StringUtils.isNotBlank(container.pid)){
			create.withPidMode(StringUtils.deleteWhitespace(container.pid))
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
		if(StringUtils.isNotBlank(container.restart)){
			create.withRestartPolicy(RestartPolicy.parse(StringUtils.deleteWhitespace(container.restart)))
		}		
		if(StringUtils.isNotBlank(container.working_dir)){
			create.withWorkingDir(StringUtils.deleteWhitespace(container.working_dir))
			create.cpusetCpus
		}		
		var List<Container> containersWithVolumes = new ArrayList
		var List<org.occiware.clouddesigner.occi.docker.Volume> volumesInsideHost = new ArrayList
		for(Resource r: containersWithVolumes(container)){
			if(r instanceof Container){
				containersWithVolumes.add(r as Container)
			}
			if(r instanceof org.occiware.clouddesigner.occi.docker.Volume){
				volumesInsideHost.add(r as org.occiware.clouddesigner.occi.docker.Volume)
			}
		}
		//val List<Container> containersWithVolumes = containersWithVolumes(container)
		if(!containersWithVolumes.nullOrEmpty){
			var List<VolumesFrom> volumesFrom = new ArrayList
			for(Container c : containersWithVolumes){
				volumesFrom.add(new VolumesFrom(c.name))
				LOGGER.info(c.name)
			}
			create.withVolumesFrom(volumesFrom)
		}

		if(!volumesInsideHost.nullOrEmpty){
			var List<Bind> volumesBind = new ArrayList
			var List<Volume> vs = new ArrayList<Volume>
			for(org.occiware.clouddesigner.occi.docker.Volume v : volumesInsideHost){
				var Volume newVolume = null
				if(!StringUtils.isBlank(v.destination)){
					newVolume = new Volume(v.destination)
					vs.add(newVolume)
				}
				if(!StringUtils.isBlank(v.source)){
					var newBind = new Bind(v.source, newVolume)
					volumesBind.add(newBind)
				}
			}
			create.withVolumes(vs)
			create.withBinds(volumesBind)
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
		if (StringUtils.isNotBlank(container.command)) {
			// The command is something like: sleep, 9999
			val String[] cmd = StringUtils.deleteWhitespace(container.command).split(",")
			create.withCmd(cmd)
		} else {
			create.withCmd("sleep", "9999")
		}
		if (container.cpu_shares > 0) {
			create.withCpuShares(container.cpu_shares)
		}
		if (StringUtils.isNotBlank(container.add_host)) {
			create.withHostName(StringUtils.deleteWhitespace(container.hostname))
		}
		if (StringUtils.isNotBlank(container.cpuset)) {
			create.withCpusetCpus(StringUtils.deleteWhitespace(container.cpuset))
		}
		if (container.privileged) {
			create.withPrivileged(container.privileged)
		}
		if (!StringUtils.isBlank(container.dns)) {
			create.withDns(StringUtils.deleteWhitespace(container.dns))
		}
		if (!StringUtils.isBlank(container.environment)) {
			create.withEnv(StringUtils.deleteWhitespace(container.environment))
		}
		if (!StringUtils.isBlank(container.ports)) {
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
		if (!StringUtils.isBlank(container.name)) {
			create.withName(StringUtils.deleteWhitespace(container.name))
		}
		if (!StringUtils.isBlank(container.hostname)) {
			create.withName(StringUtils.deleteWhitespace(container.hostname))
		}
		if (!StringUtils.isBlank(container.net)) {
			create.withNetworkMode(StringUtils.deleteWhitespace(container.net))
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
		if (!StringUtils.isBlank(container.user)) {
			create.withUser(StringUtils.deleteWhitespace(container.user))
		}
		if (!StringUtils.isBlank(container.volumes)) {
			var String[] volumes = StringUtils.deleteWhitespace(container.volumes).split(",")
			var List<Volume> vs = new ArrayList<Volume>
			for(v:volumes){
				 var Volume newVolume = new Volume(v)
				 vs.add(newVolume)
			}
			create.withVolumes(vs)
		}
		if (container.mem_limit > 0) {
			create.withMemory(Long.valueOf(container.mem_limit))
		}
		if (container.memory_swap > 0) {
			create.withMemorySwap(Long.valueOf(container.memory_swap))
		}
		if (!StringUtils.isBlank(container.lxc_conf)) {
			// TODO lxc_conf should be String array..
			val LxcConf lxcCon = new LxcConf("key", "value")
			create.withLxcConf(lxcCon)
		}
		// set container link
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
		var List<Container> containersWithVolumes = new ArrayList
		var List<org.occiware.clouddesigner.occi.docker.Volume> volumesInsideHost = new ArrayList
		for(Resource r: containersWithVolumes(container)){
			if(r instanceof Container){
				containersWithVolumes.add(r as Container)
			}
			if(r instanceof org.occiware.clouddesigner.occi.docker.Volume){
				volumesInsideHost.add(r as org.occiware.clouddesigner.occi.docker.Volume)
			}
		}
		//val List<Container> containersWithVolumes = containersWithVolumes(container)
		if(!containersWithVolumes.nullOrEmpty){
			var List<VolumesFrom> volumesFrom = new ArrayList
			for(Container c : containersWithVolumes){
				volumesFrom.add(new VolumesFrom(c.name))
				LOGGER.info(c.name)
			}
			create.withVolumesFrom(volumesFrom)
		}

		if(!volumesInsideHost.nullOrEmpty){
			var List<Bind> volumesBind = new ArrayList
			var List<Volume> vs = new ArrayList<Volume>
			for(org.occiware.clouddesigner.occi.docker.Volume v : volumesInsideHost){
				var Volume newVolume = null
				if(!StringUtils.isBlank(v.destination)){
					newVolume = new Volume(v.destination)
					vs.add(newVolume)
				}
				if(!StringUtils.isBlank(v.source)){
					var newBind = new Bind(v.source, newVolume)
					volumesBind.add(newBind)
				}
			}
			create.withVolumes(vs)
			create.withBinds(volumesBind)
		}		return create
	}


	def List<Resource> containersWithVolumes(Container c) {
		var containersFrom = new ArrayList 
		for (org.occiware.clouddesigner.occi.Link l : c.links) {
			if(l instanceof Volumesfrom){
				containersFrom.add(l.target)
//				if (l.target instanceof org.occiware.clouddesigner.occi.docker.Container) {
//					val container = l.target as org.occiware.clouddesigner.occi.docker.Container
//					containersFrom.add(container)
//				}
			}
		}
		return containersFrom
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

	def renameContainer(Machine machine, String containerId, String newName) {

		// Set dockerClient
		if (dockerClient == null) {
			dockerClient = setConfig(machine.name, properties)
		} else if (!currentMachine.equalsIgnoreCase(machine.name)) {
			dockerClient = setConfig(machine.name, properties)
		}
		// Rename the container 
		dockerClient.renameContainerCmd(containerId).withName(newName).exec
	}

	def removeContainer(Machine machine, String containerId) {
		removeContainer(machine.name, containerId)
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
			LOGGER.info("Use the default Docker Image: {}", containerImage)
		}
		var String output = null
		LOGGER.info("Downloading image: ->" + containerImage)
		// Download a pre-built image
		try {
			//If the given image tag doesn't contain a version number, add "latest" as tag
			if (containerImage.indexOf(':') < 0) {
				dockerClient.pullImageCmd(containerImage).withTag("latest").exec(new PullImageResultCallback()).
				awaitSuccess()
			} else {
				dockerClient.pullImageCmd(containerImage).exec(new PullImageResultCallback()).
				awaitSuccess()
			}
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
		val dockerHost = if (ENDPOINT == null || ENDPOINT.trim.length == 0) "tcp://127.0.0.1" + port else ENDPOINT.trim
		LOGGER.info("Connection inside machine: " + machine + " with uri: " + dockerHost.toString)
		var dockerHome = System.getProperty("user.home") + File.separator + ".docker"
		try {
			if (properties.version != null) {
				config = DefaultDockerClientConfig.createDefaultConfigBuilder.withApiVersion(properties.version.trim).
					withDockerHost(dockerHost).withDockerTlsVerify(true).withRegistryUsername(properties.username.trim).
					withRegistryPassword(properties.password.trim).withRegistryEmail(properties.email.trim).
					withRegistryUrl(properties.url.trim).withDockerCertPath(certPath).withDockerConfig(
						dockerHome).build()

			}
		} catch (Exception exception) {
			LOGGER.error("Loading docker-java properties files ...")
			config = DefaultDockerClientConfig.createDefaultConfigBuilder.withApiVersion(
				dockerProperties.get("api.version").toString).withDockerHost(dockerHost).withDockerTlsVerify(true).
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
		val user = "docker"
		val int port = 22
		val privatekey = "/Users/spirals/.docker/machine/machines/ghost/id_rsa"

		try {
			val JSch jsc = new JSch
			jsc.setKnownHosts("/dev/null")
			jsc.addIdentity(privatekey)
			jsc.knownHosts = "/dev/null"
 			var Properties config = new Properties();
        	config.put("StrictHostKeyChecking", "no")			
			session = jsc.getSession(user, host, port)
			session.config = config
			session.connect()
			println("Connection successfully ...")

		} catch (JSchException e) {
			LOGGER.info(e.toString)
			e.printStackTrace
//			addHost(session.getHostKey().getKey(), host, "test")
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

			jsc.knownHosts = "/dev/null"
 			var Properties config = new Properties();
        	config.put("StrictHostKeyChecking", "no")			

			jsc.setKnownHosts("/dev/null")
			jsc.addIdentity(privateKey)
			LOGGER.info("Identity added ..")

			val exCommand = "sudo sh -c " + "\"" + command + "\""
			LOGGER.info(exCommand)

			session = jsc.getSession(user, host, 22)
			LOGGER.info("Session created ..")
			session.setConfig(config)
			LOGGER.info("Session config ..") 

			session.connect()
			LOGGER.info("Session connected ..")

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

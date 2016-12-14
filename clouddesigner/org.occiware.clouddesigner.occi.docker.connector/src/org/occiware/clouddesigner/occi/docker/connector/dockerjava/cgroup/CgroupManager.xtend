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
package org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup

import org.occiware.clouddesigner.occi.docker.connector.dockerjava.DockerContainerManager
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil
import org.occiware.clouddesigner.occi.docker.Container
import org.slf4j.LoggerFactory
import org.slf4j.Logger

class CgroupManager {
	
	// LOG
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(CgroupManager))

	// For more information go to: https://access.redhat.com/documentation/en-US/Red_Hat_Enterprise_Linux/6/html/Resource_Management_Guide/index.html 
	static final String cGroupPath = "/sys/fs/cgroup/"

	//List of Subsystems
	public static final String blkio_subsystem = "blkio"
	public static final String cpuset_subsystem = "cpuset"
	public static final String cpu_subsystem = "cpu"
	public static final String cpuacct_subsystem = "cpuacct"
	public static final String devices_subsystem = "devices"
	public static final String freezer_subsystem = "freezer"
	public static final String memory_subsystem = "memory"
	public static final String netcls_subsystem = "net_cls"

	//List of Files
	public static final String blkio_write = "blkio.throttle.write_bps_device"
	public static final String blkio_read = "blkio.throttle.read_bps_device"

	public static final String memory_max_mem = "memory.limit_in_bytes"
	public static final String memory_swap = "memory.memsw.limit_in_bytes"

	public static final String cpuset_cpus = "cpuset.cpus"
	public static final String net_cls_classid = "net_cls.classid"

	public static final String cpu_cfs_period = "cpu.cfs_period_us"
	public static final String cpu_cfs_quota = "cpu.cfs_quota_us"




	def static void SetValue(String host, String privateKey, Container container, String subsystem, String file,
		String value) {
		val String FilePath = cGroupPath + subsystem + "/docker/" + container.containerid + "/" + file
		var String command = ""
		val dockerContainerManager = new DockerContainerManager
		if(file.equalsIgnoreCase(memory_max_mem)){
			command = "echo '" + Float.parseFloat(value).intValue + "' > " + FilePath
			LOGGER.info("EXECUTE COMMAND: {}", command)
			dockerContainerManager.connect(host, privateKey, command)
		}else if(file.equalsIgnoreCase(cpuset_cpus)){
			command = "echo '" + cpuSetGenerator(value, container) + "' > " + FilePath
			LOGGER.info("EXECUTE COMMAND: {}", command)
			dockerContainerManager.connect(host, privateKey, command)
		}else if(file.equalsIgnoreCase(net_cls_classid)){
			command = "echo '" + Float.parseFloat(value).intValue + "' > " + FilePath
			LOGGER.info("EXECUTE COMMAND: {}", command)
			dockerContainerManager.connect(host, privateKey, command)
		}else if(file.equalsIgnoreCase(memory_swap)){
			command = "echo '" + Float.parseFloat(value).intValue + "' > " + FilePath
			LOGGER.info("EXECUTE COMMAND: {}", command)
			dockerContainerManager.connect(host, privateKey, command)
		}
		//val String command = "echo '" + cpuSetGenerator(value, container) + "' > " + FilePath
		//println("EXECUTE COMMAND: "+ command)
		//dockerContainerManager.connect(host, privateKey, command)
	}

	def static String cpuSetGenerator(String nbCores, Container container) {
		if (Integer.valueOf(nbCores) > 1 && Integer.valueOf(nbCores) <= container.core_max) {
			var String cpuSet = String.format("0-%s", nbCores)
			return cpuSet
		}

		return '0'

	}
}

class CPUManager {
	def void setCPUValue(String host, String privateKey, Container container, String value) {

		//TODO Check not null here
		CgroupManager.SetValue(host, privateKey, container, CgroupManager.cpuset_subsystem, CgroupManager.cpuset_cpus,
			value)
	}

	def void setFreqValue(String host, String privateKey, Container container, String value) {

		//TODO Check not null here
		val int time = Integer.valueOf(value) * 10000
		CgroupManager.SetValue(host, privateKey, container, CgroupManager.cpu_subsystem, CgroupManager.cpu_cfs_period,
			"1000000")
		CgroupManager.SetValue(host, privateKey, container, CgroupManager.cpu_subsystem, CgroupManager.cpu_cfs_quota,
			String.valueOf(time))
	}
}

class MemoryManager {
	def void setMemValue(String host, String privateKey, Container container, String value) {

		//TODO Check not null here
		CgroupManager.SetValue(host, privateKey, container, CgroupManager.memory_subsystem,
			CgroupManager.memory_max_mem, value)
			
	}

	def void setSwapValue(String host, String privateKey, Container container, String value) {

		//TODO Check not null here
		CgroupManager.SetValue(host, privateKey, container, CgroupManager.memory_subsystem, CgroupManager.memory_swap,
			value)
	}
}

class NetWorkManager {
		def void setNetworkValue(String host, String privateKey, Container container, String value) {
		CgroupManager.SetValue(host, privateKey, container, CgroupManager.netcls_subsystem,
			CgroupManager.net_cls_classid, value)
	}
	
}

class BlkioManager {

	def setReadValue(String host, String privateKey, Container container, String value) {
		if (DockerUtil.isInteger(value)) {
			if (value.equals("-1")) {
				CgroupManager.SetValue(host, privateKey, container, CgroupManager.blkio_subsystem,
					CgroupManager.blkio_read, "")
			} else {
				val newValue = "8:0 " + value
				CgroupManager.SetValue(host, privateKey, container, CgroupManager.blkio_subsystem,
					CgroupManager.blkio_read, newValue)
			}
		}
	}

	def setWriteValue(String host, String privateKey, Container container, String value) {
		if (DockerUtil.isInteger(value)) {
			if (value.equals("-1")) {
				CgroupManager.SetValue(host, privateKey, container, CgroupManager.blkio_subsystem,
					CgroupManager.blkio_write, "")
			} else {
				val newValue = "8:0 " + value
				CgroupManager.SetValue(host, privateKey, container, CgroupManager.blkio_subsystem,
					CgroupManager.blkio_write, newValue)
			}
		}
	}

}

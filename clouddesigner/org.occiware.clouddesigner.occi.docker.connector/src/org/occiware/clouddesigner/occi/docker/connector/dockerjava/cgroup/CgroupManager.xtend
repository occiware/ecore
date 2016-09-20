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

class CgroupManager {

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
	public static final String netcls_subsystem = "netcls"

	//List of Files
	public static final String blkio_write = "blkio.throttle.write_bps_device"
	public static final String blkio_read = "blkio.throttle.read_bps_device"

	public static final String memory_max_mem = "memory.limit_in_bytes"
	public static final String memory_swap = "memory.memsw.limit_in_bytes"

	public static final String cpuset_cpus = "cpuset.cpus"

	public static final String cpu_cfs_period = "cpu.cfs_period_us"
	public static final String cpu_cfs_quota = "cpu.cfs_quota_us"

	def static void SetValue(String host, String privateKey, String containerId, String subsystem, String file,
		String value) {
		val String FilePath = cGroupPath + subsystem + "/docker/" + containerId + "/" + file
		val String command = "echo '" + cpuSetGenerator(value) + "' > " + FilePath
		println("EXECUTE COMMAND: "+ command)
		val dockerContainerManager = new DockerContainerManager
		dockerContainerManager.connect(host, privateKey, command)
	}

	def static String cpuSetGenerator(String nbCores) {
		if (Integer.valueOf(nbCores) > 1) {
			var String cpuSet = String.format("0-%s", nbCores)
			return cpuSet
		}

		return '0'

	}
}

class CPUManager {
	def void setCPUValue(String host, String privateKey, String containerId, String value) {

		//TODO Check not null here
		CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.cpuset_subsystem, CgroupManager.cpuset_cpus,
			value)
	}

	def void setFreqValue(String host, String privateKey, String containerId, String value) {

		//TODO Check not null here
		val int time = Integer.valueOf(value) * 10000
		CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.cpu_subsystem, CgroupManager.cpu_cfs_period,
			"1000000")
		CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.cpu_subsystem, CgroupManager.cpu_cfs_quota,
			String.valueOf(time))
	}
}

class MemoryManager {
	def void setMemValue(String host, String privateKey, String containerId, String value) {

		//TODO Check not null here
		CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.memory_subsystem,
			CgroupManager.memory_max_mem, value)
	}

	def void setSwapValue(String host, String privateKey, String containerId, String value) {

		//TODO Check not null here
		CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.memory_subsystem, CgroupManager.memory_swap,
			value)
	}
}

class NetWorkManager {
}

class BlkioManager {

	def setReadValue(String host, String privateKey, String containerId, String value) {
		if (DockerUtil.isInteger(value)) {
			if (value.equals("-1")) {
				CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.blkio_subsystem,
					CgroupManager.blkio_read, "")
			} else {
				val newValue = "8:0 " + value
				CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.blkio_subsystem,
					CgroupManager.blkio_read, newValue)
			}
		}
	}

	def setWriteValue(String host, String privateKey, String containerId, String value) {
		if (DockerUtil.isInteger(value)) {
			if (value.equals("-1")) {
				CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.blkio_subsystem,
					CgroupManager.blkio_write, "")
			} else {
				val newValue = "8:0 " + value
				CgroupManager.SetValue(host, privateKey, containerId, CgroupManager.blkio_subsystem,
					CgroupManager.blkio_write, newValue)
			}
		}
	}

}

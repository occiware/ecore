package org.occiware.clouddesigner.occi.docker.connector.dockermachine.command


import org.occiware.clouddesigner.occi.docker.impl.Machine_Digital_OceanImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_Google_Compute_EngineImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_OpenStackImpl
import org.occiware.clouddesigner.occi.docker.impl.Machine_VirtualBoxImpl
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager.Provider

class CommandFactory {

	def createMachineCommand(Object obj) {
		var command = new StringBuilder("docker-machine create --driver ")

		if (obj instanceof Machine_VirtualBoxImpl) {

			// Set the driver name
			command.append(Provider.virtualbox.toString)
			val tmp = obj as Machine_VirtualBoxImpl
			if (tmp.name != null) {
				command.append(" " + tmp.name)
				if (tmp.disk_size > 0) {
					command.append(" --virtualbox-disk-size " + tmp.disk_size)
				}
				if (tmp.memory > 0.0F) {
					command.append(" --virtualbox-memory " + tmp.memory)
				}else if(tmp.memory == 0.0F){
					command.append(" --virtualbox-memory " + 1024.0)
				}
				if (tmp.cores > 0) {
					command.append(" --virtualbox-cpu-count " + tmp.cores) // TODO verify is the default value is set
				}else if(tmp.cores == 0){
					command.append(" --virtualbox-cpu-count " + -1)
				}
				if (tmp.boot2docker_url != null) {
					command.append(" --virtualbox-boot2docker-url " + tmp.disk_size)
				}
			} else if (tmp.name == null) {
				// TODO Manage error...
			}
		}
		if (obj instanceof Machine_Digital_OceanImpl) {

			// Set the driver name
			command.append(Provider.amazonec2.toString)
			val tmp = obj as Machine_Digital_OceanImpl
			if (tmp.name != null && tmp.access_token != null) {
				command.append(" " + tmp.name)
				command.append(" --digitalocean-access-token=" + tmp.access_token)
				if (tmp.image != null) {
					command.append(" --digitalocean-image " + tmp.image)
				}
				if (tmp.region != null) {
					command.append(" --digitalocean-region " + tmp.region)
				}
				if (tmp.size != null) {
					command.append(" --digitalocean-size " + tmp.size)
				}

			} else if (tmp.name == null || tmp.access_token == null) {
				// TODO Manage error
			}
		}
		if (obj instanceof Machine_Google_Compute_EngineImpl) {

			// Set the driver name
			command.append(Provider.google.toString)
			val tmp = obj as Machine_Google_Compute_EngineImpl

			// TODO check in the model --google-auth-token
			if (tmp.name != null) {
				command.append(" --google-instance-name " + tmp.instance_name)
				if (tmp.zone != null) {
					command.append("")
				}
				if (tmp.username != null) {
					command.append(" --google-username " + tmp.name)
				}
				if (tmp.project != null) {
					command.append(" --google-project " + tmp.name)
				}
				if (tmp.machine_type != null) {
					command.append(" --google-machine-type " + tmp.machine_type)
				}

			// TODO --google-scopes
			}
		}
		if (obj instanceof Machine_OpenStackImpl) {

			// Set the driver name
			command.append(Provider.google.toString)
			val tmp = obj as Machine_OpenStackImpl
			if (tmp.username != null && tmp.flavor_id != null && tmp.image_id != null && tmp.password != null) {
				command.append(" --openstack-username " + tmp.name)
				command.append(" --openstack-password " + tmp.password)
				command.append(" --openstack-image-id " + tmp.image_id)
				command.append(" --openstack-flavor-id" + tmp.flavor_id)
				if (tmp.auth_url != null) {
					command.append(" --openstack-auth-url " + tmp.auth_url)
				}
				if (tmp.tenant_id != null || tmp.tenant_name != null) {
					val value = if(tmp.tenant_id == null) tmp.tenant_id else tmp.tenant_id
					command.append(" --openstack-tenant-name " + value)
				}
				if (tmp.region != null) {
					command.append(" --openstack-region " + tmp.region)
				}
				if (tmp.endpoint_type != null) {
					command.append(" --openstack-endpoint-type " + tmp.endpoint_type)
				}
				if (tmp.net_id != null) {
					command.append(" --openstack-net-id " + tmp.net_id)
				}
				if (tmp.sec_groups != null) {
					command.append(" --openstack-sec-groups " + tmp.sec_groups)
				}
				if (tmp.floatingip_pool != null) {
					command.append(" --openstack-floatingip-pool " + tmp.floatingip_pool)
				}

			// TODO --openstack-ssh-user and --openstack-ssh-port
			} else if (tmp.username == null || tmp.flavor_id == null || tmp.image_id == null || tmp.password == null) {
				// TODO manage error
			}
		}

		return command.toString
	}

	def createInfoCommand(String machineName) {
		val String command = String.format("docker-machine inspect %s", machineName)
		return command
	}

	def createLsCmd() {
		val String command = "docker-machine ls "
		return command
	}

	def createEnvCmd(String machineName) {
		val String command = String.format("eval \"$(docker-machine env %s)\" ", machineName)
		return command
	}

	def getEnvCmd(String machineName) {
		val String command = String.format("docker-machine env %s", machineName)
		return command
	}

	def createStartCommand(String machineName) {
		val String command = String.format("docker-machine start %s", machineName)
		return command
	}

	def createStopCommand(String machineName) {
		val String command = String.format("docker-machine stop %s", machineName)
		return command
	}

	def createReStartCommand(String machineName) {
		val String command = String.format("docker-machine restart %s", machineName)
		return command
	}

	def createRemoveCommand(String machineName) {
		val String command = String.format("docker-machine rm %s", machineName)
		return command
	}
	
	def createUrlCommand(String machineName) {
		val String command = String.format("docker-machine url %s", machineName)
		return command
	}
	
	def createRemoveStagingCommand(String machineName) {
		val String command = String.format("docker-machine rm %s staging", machineName)
		return command
	}

	def createActivateCommand(String machineName) {
		val String command = String.format("docker-machine activate %s staging", machineName)
		return command
	}

}

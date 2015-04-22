package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect

import org.occiware.clouddesigner.occi.docker.Machine_VirtualBox

class DockerAspect {
	
	var Machine_VirtualBox p
	def static void main(String[] args) {
		var instance = new DockerAspect
//		instance.callAnAspect
	}

//	def callAnAspect(){
//		println(p.validate)		
//	}
//	
//	@Aspect(className=Machine_VirtualBox)
//	class VBoxAspect {
//		def boolean validate() {
//			println(_self.name)
//			return true
//		}
//	}
}

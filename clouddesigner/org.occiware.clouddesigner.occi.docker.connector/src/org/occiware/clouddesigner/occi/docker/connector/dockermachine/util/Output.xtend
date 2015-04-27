package org.occiware.clouddesigner.occi.docker.connector.dockermachine.util

class Output {
	
	def synchronized static print(String string){
		println(string)
	}
	
	def synchronized static printErr(String string){
		println(string)
	}
	
	def synchronized static printlnErr(String string){
		System.err.print(string)
	}
	def synchronized static flushOut(){
		System.out.flush()
	}
	
	def synchronized static flushErr(){
		System.err.flush()
	}
}
package org.occiware.clouddesigner.occi.docker.connector

import java.text.NumberFormat
import java.util.Locale
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.transaction.RollbackException
import org.eclipse.emf.transaction.TransactionalCommandStack
import org.eclipse.emf.transaction.TransactionalEditingDomain
import org.eclipse.emf.transaction.util.TransactionUtil
import org.occiware.clouddesigner.occi.Resource
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.CPUManager
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Elasticity {

	// Initialize logger for Elasticity.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(Elasticity))
	var private Boolean update = false

	new (){
		
	}
	
	def void action(CPUManager cpuManager, String host, String privateKey, ExecutableContainer container){
		var NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH) //TODO DYNAMIC number format
		
		var cpu_used = nf.parse(container.cpu_percent).floatValue
		
		if( cpu_used > 90.0F && !update){
			// Action
 			cpuManager.setCPUValue(host, privateKey, container, '6')
			update = true
			modifyResourceSet(container, 6) // Update the attribute
			LOGGER.info("Elasticity action: 2 Cores was added!")
		}
		if( cpu_used < 90.0F && update){
			// Action
			cpuManager.setCPUValue(host, privateKey, container, '1')
			update = false
			modifyResourceSet(container, 1) // Update the attribute
			LOGGER.info("Elasticity action: x Cores was removed!")
		}
	}

	def synchronized void modifyResourceSet(Resource resource, Integer cores) {
		// Creating an editing domain
		var TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(resource.eResource.resourceSet)
		var Command cmd = new RecordingCommand(domain) {
			override protected void doExecute() {
				// these modifications require a write transaction in this editing domain
				(resource as ExecutableContainer).cores = cores
			}
		};

		try {
			(domain.getCommandStack() as TransactionalCommandStack).execute(cmd, null); // default options
		} catch (RollbackException rbe) {
			LOGGER.error(rbe.getStatus().toString)
		}
	}
	
}
package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;

import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Entity;
import org.occiware.clouddesigner.occi.util.OcciHelper;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public SampleHandler() {
	}


	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("----------------------------");
		String url = "platform:/plugin/org.occiware.clouddesigner.occi.simulation.cloudsim/data/test_1.occic";
		Configuration config = OcciHelper.loadConfiguration(url);
		
		//Verify OCL in the loaded configuration
		if(OcciHelper.validate(config)) {
			System.out.println("Done ... "+url+" was validated by EMF and OCL Validation.");
		}else{
			System.err.println("Not validated by EMF and OCL");
			return null;
		}
		
		//extract attributes from configuration
		BrigeConfigSimulation bridge = new BrigeConfigSimulation(config); 
		Map<Entity, Set<Entity>> entities= bridge.ExtaractEntities();
		
		if(bridge.checkEntities()){
			System.out.println("Configuration contains correct informations");
			Simulation simulation = new Simulation(entities);
			simulation.runExtension();
			
		}else{
			System.err.println("Thanks to verify your linked resources in configuration");
		}
		
		return null;
	}

}

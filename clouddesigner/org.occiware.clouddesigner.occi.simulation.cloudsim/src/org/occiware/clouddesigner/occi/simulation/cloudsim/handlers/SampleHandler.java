package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Entity;
import org.occiware.clouddesigner.occi.util.OCCIResourceSet;

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
		Configuration config = loadConfiguration(url);
		
		//Verify OCL in the loaded configuration
		if(validate(config)) {
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


	private Configuration loadConfiguration(String configurationURI){
		return (Configuration)loadOCCI(configurationURI);
	}

	private boolean validate(EObject occi)
	{
		if(!Boolean.getBoolean("validation")) { 
			return true; 
		}
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(occi);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			StringBuffer stringBuffer = printDiagnostic(diagnostic, "", new StringBuffer());
			System.err.println(stringBuffer.toString());
			return false;
		}
		return true;
	}

	private StringBuffer printDiagnostic(Diagnostic diagnostic, String indent, StringBuffer stringBuffer)
	{
		stringBuffer.append(indent);
		stringBuffer.append(diagnostic.getMessage());
		stringBuffer.append("\n");
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ", stringBuffer);
		}
		return stringBuffer;
	}

	private static Object loadOCCI(String uri)
	{
		ResourceSet resourceSet = new OCCIResourceSet();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(URI.createURI(uri), true);
		return resource.getContents().get(0);
	}

}

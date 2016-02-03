package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;

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

		Configuration conf1 = loadConfiguration("platform:/plugin/org.occiware.clouddesigner.occi.simulation.cloudsim/data/example.occic");
		print(conf1);
		if(validate(conf1)) {
			System.out.println("Youpi model/infrastructure.occic was validated by EMF and OCL Validation.");
		}
		System.out.println("");


		/*ResourceSet resourceSet = new ResourceSetImpl();
		Resource configurationResource = resourceSet.getResource(
				URI.createURI(
						"platform:/plugin/org.occiware.clouddesigner.occi.simulation.cloudsim/data/example.occic"),
				true);
		System.out.println(">>> "+configurationResource.getContents().size());*/

		return null;
	}


	public static Configuration loadConfiguration(String configurationURI)
	{
		return (Configuration)loadOCCI(configurationURI);
	}

	public static boolean validate(EObject occi)
	{
		if(!Boolean.getBoolean("validation")) { return true; }
		// Does the validation when the Java system property 'validation' is set to 'true'.
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(occi);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			StringBuffer stringBuffer = printDiagnostic(diagnostic, "", new StringBuffer());
			System.err.println(stringBuffer.toString());
			return false;
		}
		return true;
	}
	
	private static StringBuffer printDiagnostic(Diagnostic diagnostic, String indent, StringBuffer stringBuffer)
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
		// Create a new resource set.
		ResourceSet resourceSet = new OCCIResourceSet();
		// Load the OCCI resource.
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(URI.createURI(uri), true);
		// Return the first element.
		return resource.getContents().get(0);
	}


	public static void print(Configuration configuration)
	{
		System.out.println("Configuration");
		System.out.println("  - used extensions:");
		for(Extension extension : configuration.getUse()) {
			System.out.println("    * Extension " + extension.getName() + " " + extension.getScheme());
		}
		System.out.println("  - resources:");
		for(Resource resource : configuration.getResources()) {
			System.out.println("    * Resource id " + resource.getId());
			Kind resourceKind = resource.getKind();
			System.out.println("      - Kind " + resourceKind.getScheme() + resourceKind.getTerm());
			System.out.println("      - mixins:");
			for(Mixin mixin : resource.getMixins()) {
				System.out.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
			}
			System.out.println("      - attributes:");
			for(AttributeState as : resource.getAttributes()) {
				System.out.println("        * AttributeState " + as.getName() + "=" + as.getValue());
			}
			System.out.println("      - links:");
			for(Link link : resource.getLinks()) {
				System.out.println("        * Link id " + link.getId());
				Kind linkKind = link.getKind();
				System.out.println("         - Kind " + linkKind.getScheme() + linkKind.getTerm());
				System.out.println("         - mixins:");
				for(Mixin mixin : link.getMixins()) {
					System.out.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
				}
				System.out.println("         - attributes:");
				for(AttributeState as : link.getAttributes()) {
					System.out.println("           * AttributeState " + as.getName() + "=" + as.getValue());
				}
				Resource source = link.getSource();
				System.out.println("        - source id " + source.getId());
				Resource target = link.getTarget();
				if(target != null) {
					System.out.println("        - target id " + target.getId());
				} else {
					System.out.println("        - no target");
				}
			}
		}
	}
}
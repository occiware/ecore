package occi.dynamic

import OCCI.Extension
import OCCI.OCCIPackage
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.ocl.EnvironmentFactory
import org.eclipse.ocl.OCL
import org.eclipse.ocl.ParserException
import org.eclipse.ocl.Query
import org.eclipse.ocl.ecore.CallOperationAction
import org.eclipse.ocl.ecore.Constraint
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory
import org.eclipse.ocl.ecore.SendSignalAction
import org.eclipse.ocl.expressions.OCLExpression
import org.eclipse.ocl.helper.OCLHelper

import static extension occi.dynamic.OcciAspect.*

class OcciTutorialK3 {

	var OCCI.Extension p;

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend for OCCI!')

		///home/barais/workspaces/occiware/ecore/metamodel
		var instance = new OcciTutorialK3(); 
		instance.loadOcciModel("../metamodel/extensions/Infrastructure.xmi")
		instance.callAnAspect()		
		instance.evaluateOCL()

		//Demo to show template
		val String s = '''  '''

	}


	public def loadOcciModel(String modelPath) {
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		var fact1 = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey(OCCIPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(OCCIPackage.eNS_URI, OCCIPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", fact1);
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(modelPath);
		var res = rs.getResource(uri, true);
		 p = res.contents.get(0) as Extension
	}
	
	def callAnAspect(){
		println(p.validate)		
	}

	def boolean evaluateOCL(){
		var boolean valid;
		var OCLExpression<EClassifier> query = null;
		try {
			// create an OCL instance for Ecore
			var OCL<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> ocl;
			ocl = OCL.newInstance(
				EcoreEnvironmentFactory.INSTANCE as EnvironmentFactory<EPackage, EClassifier, EOperation, EStructuralFeature,
		EEnumLiteral, EParameter,
		EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject>);

			// create an OCL helper object
			var OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();

			// set the OCL context classifier
			helper.setContext(OCCIPackage.Literals.KIND);
			
			query = helper.createQuery("parent -> closure(parent) -> excludes (self)");
			val Query<EClassifier, EClass, EObject> eval = ocl.createQuery(query);
			p.kinds.forEach(p1 | println("constraint evaluation for kind "+ p1.title + " : " + eval.evaluate(p1)))
			
			valid = true;
		} catch (ParserException e) {
			valid = false;
			System.err.println(e.getLocalizedMessage());
		}		
		return valid;
	}

}


/** Example to show how you can define an aspect in an Class in Kermeta 3 */
@Aspect(className=Extension)
class OcciAspect {

	def boolean validate() {
		println(_self.name)
		return true
	}
}

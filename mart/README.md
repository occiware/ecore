# OCCIware Model@Run.time

The heart of the OCCIware Cloud Designer is an EMF-based implementation of the OCCI Core Model specification.
See at [https://github.com/occiware/ecore/tree/master/clouddesigner/org.occiware.clouddesigner.occi](https://github.com/occiware/ecore/tree/master/clouddesigner/org.occiware.clouddesigner.occi)

This module illustrates how to run this heart outside an Eclipse IDE in order to do OCCI Model@Run.time.

The main of this module is available [here](https://github.com/occiware/ecore/tree/master/mart/src/main/java/org/occiware/mart/Main.java) and shows how to:
* Load both OCCI extensions and configurations, see `loadExtension` and `loadConfiguration` methods.
* Validate both OCCI extensions and configurations, see `validate` method.
* Print both OCCI extensions and configurations, see `print` methods.
* Create an OCCI configuration programmatically, see `createConfiguration` method.
		
# Usage

Compile the example:

	mvn compile

Execute the example without EMF/OCL validation:

	mvn exec:java

Execute the example with EMF/OCL validation:

	mvn -Pwith-validation exec:java

The second execution mode adds more runtime dependencies required by Eclipse OCL validation.

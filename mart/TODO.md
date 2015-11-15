# Reduce the size and/or number of dependencies

This example uses the [EMF-based implementation of the OCCI Core Model provided by the OCCIware Cloud Designer](https://github.com/occiware/ecore/tree/master/clouddesigner/org.occiware.clouddesigner.occi). This implementation depends on both EMF Ecore and Eclipse OCL. Unfortunatly, both are big JAR dependencies.

In order to reduce the number and the size of dependencies, there are several solutions to investigate:
* Prune both EMF Ecore and Eclipse OCL JARs to keep only what it is strictly required. See tools like [ProGuard](http://proguard.sourceforge.net). 
* Use a KMF-based implementation instead of the EMF-based implementation. See following [paper](https://hal.inria.fr/hal-00996764/document).


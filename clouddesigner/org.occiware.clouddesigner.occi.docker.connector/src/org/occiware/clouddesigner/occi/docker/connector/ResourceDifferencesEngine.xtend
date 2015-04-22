package org.occiware.clouddesigner.occi.docker.connector

import java.io.IOException

import org.occiware.clouddesigner.occi.docker.DockerPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.compare.match.eobject.EditionDistance
import org.eclipse.emf.compare.match.eobject.CachingDistance
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher
import org.eclipse.emf.compare.match.IComparisonFactory
import org.eclipse.emf.compare.match.DefaultComparisonFactory
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.match.IMatchEngine
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.scope.IComparisonScope
import org.eclipse.emf.compare.Comparison
import org.eclipse.emf.ecore.EObject
import org.occiware.clouddesigner.occi.docker.Machine

class ResourceDifferencesEngine {

	def isSimilar(String loadedXmi, String storedXmi) {

		try {
			val ResourceSet resourceSet1 = new ResourceSetImpl();
			val ResourceSet resourceSet2 = new ResourceSetImpl();
			resourceSet1.packageRegistry.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE)
			resourceSet2.packageRegistry.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE)

			val Resource resource1 = ModelHandler.load(URI.createURI("resource1"), resourceSet1, loadedXmi)
			val Resource resource2 = ModelHandler.load(URI.createURI("resource2"), resourceSet2, storedXmi)

			// Configure EMF Compare
			val EditionDistance editionDistance = new EditionDistance
			val CachingDistance cachedDistance = new CachingDistance(editionDistance)
			var IEObjectMatcher matcher = new FixedProximityEObjectMatcher(cachedDistance)

			var IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory)
			var IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory)
			matchEngineFactory.setRanking(20)
			var IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl
			matchEngineRegistry.add(matchEngineFactory)
			val EMFCompare comparator = EMFCompare.builder()./*setDiffEngine(diffEngine).*/setMatchEngineFactoryRegistry(
				matchEngineRegistry).build

			// Compare the two models
			val IComparisonScope scope = EMFCompare.createDefaultScope(resource1.getContents().get(0),
				resource2.getContents().get(0));
			val Comparison comparison = comparator.compare(scope);

			return comparison.differences.isEmpty

		} catch (IOException e) {
			e.printStackTrace
		}

	}

	def boolean areSameType(EObject obj1, EObject obj2) {
		return obj1 != null && obj2 != null && obj1.eClass().equals(obj2.eClass())
	}

	def boolean areSameComponentType(EObject obj1, EObject obj2) {
		return areSameType(obj1, obj2) && obj1 instanceof Machine
	}
	
	def contentSimilarity(EObject obj1, EObject obj2){
		
	}
}

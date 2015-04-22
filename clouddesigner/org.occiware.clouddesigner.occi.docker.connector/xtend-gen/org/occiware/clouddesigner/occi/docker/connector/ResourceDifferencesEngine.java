package org.occiware.clouddesigner.occi.docker.connector;

import com.google.common.base.Objects;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.CachingDistance;
import org.eclipse.emf.compare.match.eobject.EditionDistance;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.docker.DockerPackage;
import org.occiware.clouddesigner.occi.docker.Machine;
import org.occiware.clouddesigner.occi.docker.connector.FixedProximityEObjectMatcher;
import org.occiware.clouddesigner.occi.docker.connector.ModelHandler;

@SuppressWarnings("all")
public class ResourceDifferencesEngine {
  public Boolean isSimilar(final String loadedXmi, final String storedXmi) {
    try {
      final ResourceSet resourceSet1 = new ResourceSetImpl();
      final ResourceSet resourceSet2 = new ResourceSetImpl();
      EPackage.Registry _packageRegistry = resourceSet1.getPackageRegistry();
      _packageRegistry.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE);
      EPackage.Registry _packageRegistry_1 = resourceSet2.getPackageRegistry();
      _packageRegistry_1.put(DockerPackage.eNS_URI, DockerPackage.eINSTANCE);
      URI _createURI = URI.createURI("resource1");
      final Resource resource1 = ModelHandler.load(_createURI, resourceSet1, loadedXmi);
      URI _createURI_1 = URI.createURI("resource2");
      final Resource resource2 = ModelHandler.load(_createURI_1, resourceSet2, storedXmi);
      final EditionDistance editionDistance = new EditionDistance();
      final CachingDistance cachedDistance = new CachingDistance(editionDistance);
      IEObjectMatcher matcher = new FixedProximityEObjectMatcher(cachedDistance);
      DefaultEqualityHelperFactory _defaultEqualityHelperFactory = new DefaultEqualityHelperFactory();
      IComparisonFactory comparisonFactory = new DefaultComparisonFactory(_defaultEqualityHelperFactory);
      IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
      matchEngineFactory.setRanking(20);
      IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
      matchEngineRegistry.add(matchEngineFactory);
      EMFCompare.Builder _builder = EMFCompare.builder();
      EMFCompare.Builder _setMatchEngineFactoryRegistry = _builder.setMatchEngineFactoryRegistry(matchEngineRegistry);
      final EMFCompare comparator = _setMatchEngineFactoryRegistry.build();
      EList<EObject> _contents = resource1.getContents();
      EObject _get = _contents.get(0);
      EList<EObject> _contents_1 = resource2.getContents();
      EObject _get_1 = _contents_1.get(0);
      final IComparisonScope scope = EMFCompare.createDefaultScope(_get, _get_1);
      final Comparison comparison = comparator.compare(scope);
      EList<Diff> _differences = comparison.getDifferences();
      return Boolean.valueOf(_differences.isEmpty());
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }
  
  public boolean areSameType(final EObject obj1, final EObject obj2) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(obj1, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(obj2, null));
      _and_1 = _notEquals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      EClass _eClass = obj1.eClass();
      EClass _eClass_1 = obj2.eClass();
      boolean _equals = _eClass.equals(_eClass_1);
      _and = _equals;
    }
    return _and;
  }
  
  public boolean areSameComponentType(final EObject obj1, final EObject obj2) {
    boolean _and = false;
    boolean _areSameType = this.areSameType(obj1, obj2);
    if (!_areSameType) {
      _and = false;
    } else {
      _and = (obj1 instanceof Machine);
    }
    return _and;
  }
  
  public Object contentSimilarity(final EObject obj1, final EObject obj2) {
    return null;
  }
}

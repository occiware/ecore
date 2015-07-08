package org.occiware.clouddesigner.occi.xtext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.TransientValueService;
import org.occiware.clouddesigner.occi.Category;
import org.occiware.clouddesigner.occi.OCCIPackage;

@SuppressWarnings("restriction")
public class OCCITransientValueService2 extends TransientValueService {
  @Override
  public ITransientValueService.ValueTransient isValueTransient(final EObject semanticObject, final EStructuralFeature feature) {
    boolean _and = false;
    if (!(semanticObject instanceof Category)) {
      _and = false;
    } else {
      int _featureID = feature.getFeatureID();
      boolean _equals = (OCCIPackage.CATEGORY__SCHEME == _featureID);
      _and = _equals;
    }
    if (_and) {
      return ITransientValueService.ValueTransient.YES;
    }
    return super.isValueTransient(semanticObject, feature);
  }
}

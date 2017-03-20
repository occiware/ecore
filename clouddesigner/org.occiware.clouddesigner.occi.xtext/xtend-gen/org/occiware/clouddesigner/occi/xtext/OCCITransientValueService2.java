package org.occiware.clouddesigner.occi.xtext;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
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
    boolean _and_1 = false;
    if (!(semanticObject instanceof EEnumLiteral)) {
      _and_1 = false;
    } else {
      int _featureID_1 = feature.getFeatureID();
      boolean _equals_1 = (EcorePackage.EENUM_LITERAL__VALUE == _featureID_1);
      _and_1 = _equals_1;
    }
    if (_and_1) {
      return ITransientValueService.ValueTransient.YES;
    }
    boolean _and_2 = false;
    if (!(semanticObject instanceof EAnnotation)) {
      _and_2 = false;
    } else {
      int _featureID_2 = feature.getFeatureID();
      boolean _equals_2 = (EcorePackage.EANNOTATION__SOURCE == _featureID_2);
      _and_2 = _equals_2;
    }
    if (_and_2) {
      return ITransientValueService.ValueTransient.YES;
    }
    return super.isValueTransient(semanticObject, feature);
  }
}

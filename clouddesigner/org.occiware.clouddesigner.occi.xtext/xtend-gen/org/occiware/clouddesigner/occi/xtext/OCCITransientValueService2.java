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
    if (((semanticObject instanceof Category) && (OCCIPackage.CATEGORY__SCHEME == feature.getFeatureID()))) {
      return ITransientValueService.ValueTransient.YES;
    }
    if (((semanticObject instanceof EEnumLiteral) && (EcorePackage.EENUM_LITERAL__VALUE == feature.getFeatureID()))) {
      return ITransientValueService.ValueTransient.YES;
    }
    if (((semanticObject instanceof EAnnotation) && (EcorePackage.EANNOTATION__SOURCE == feature.getFeatureID()))) {
      return ITransientValueService.ValueTransient.YES;
    }
    return super.isValueTransient(semanticObject, feature);
  }
}

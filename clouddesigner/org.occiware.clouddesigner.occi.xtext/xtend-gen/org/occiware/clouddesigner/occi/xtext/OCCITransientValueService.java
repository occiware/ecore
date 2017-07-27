package org.occiware.clouddesigner.occi.xtext;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.Category;
import org.occiware.clouddesigner.occi.OCCIPackage;

@SuppressWarnings("all")
public class OCCITransientValueService extends DefaultTransientValueService {
  @Override
  public boolean isTransient(final EObject owner, final EStructuralFeature feature, final int index) {
    if (((owner instanceof Category) && (OCCIPackage.CATEGORY__SCHEME == feature.getFeatureID()))) {
      return true;
    }
    if (((owner instanceof Attribute) && (OCCIPackage.ATTRIBUTE__REQUIRED == feature.getFeatureID()))) {
      return true;
    }
    if (((owner instanceof Attribute) && (OCCIPackage.ATTRIBUTE__DESCRIPTION == feature.getFeatureID()))) {
      return true;
    }
    if (((owner instanceof EEnumLiteral) && (EcorePackage.EENUM_LITERAL__VALUE == feature.getFeatureID()))) {
      return true;
    }
    if (((owner instanceof EEnumLiteral) && (EcorePackage.EENUM_LITERAL__LITERAL == feature.getFeatureID()))) {
      return true;
    }
    if (((owner instanceof EAnnotation) && (EcorePackage.EANNOTATION__SOURCE == feature.getFeatureID()))) {
      return true;
    }
    return super.isTransient(owner, feature, index);
  }
}

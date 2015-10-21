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
    boolean _and = false;
    if (!(owner instanceof Category)) {
      _and = false;
    } else {
      int _featureID = feature.getFeatureID();
      boolean _equals = (OCCIPackage.CATEGORY__SCHEME == _featureID);
      _and = _equals;
    }
    if (_and) {
      return true;
    }
    boolean _and_1 = false;
    if (!(owner instanceof Attribute)) {
      _and_1 = false;
    } else {
      int _featureID_1 = feature.getFeatureID();
      boolean _equals_1 = (OCCIPackage.ATTRIBUTE__REQUIRED == _featureID_1);
      _and_1 = _equals_1;
    }
    if (_and_1) {
      return true;
    }
    boolean _and_2 = false;
    if (!(owner instanceof Attribute)) {
      _and_2 = false;
    } else {
      int _featureID_2 = feature.getFeatureID();
      boolean _equals_2 = (OCCIPackage.ATTRIBUTE__DESCRIPTION == _featureID_2);
      _and_2 = _equals_2;
    }
    if (_and_2) {
      return true;
    }
    boolean _and_3 = false;
    if (!(owner instanceof EEnumLiteral)) {
      _and_3 = false;
    } else {
      int _featureID_3 = feature.getFeatureID();
      boolean _equals_3 = (EcorePackage.EENUM_LITERAL__VALUE == _featureID_3);
      _and_3 = _equals_3;
    }
    if (_and_3) {
      return true;
    }
    boolean _and_4 = false;
    if (!(owner instanceof EEnumLiteral)) {
      _and_4 = false;
    } else {
      int _featureID_4 = feature.getFeatureID();
      boolean _equals_4 = (EcorePackage.EENUM_LITERAL__LITERAL == _featureID_4);
      _and_4 = _equals_4;
    }
    if (_and_4) {
      return true;
    }
    boolean _and_5 = false;
    if (!(owner instanceof EAnnotation)) {
      _and_5 = false;
    } else {
      int _featureID_5 = feature.getFeatureID();
      boolean _equals_5 = (EcorePackage.EANNOTATION__SOURCE == _featureID_5);
      _and_5 = _equals_5;
    }
    if (_and_5) {
      return true;
    }
    return super.isTransient(owner, feature, index);
  }
}

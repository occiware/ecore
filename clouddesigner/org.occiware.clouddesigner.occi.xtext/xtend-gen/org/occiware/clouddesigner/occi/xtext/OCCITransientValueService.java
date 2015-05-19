package org.occiware.clouddesigner.occi.xtext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.occiware.clouddesigner.OCCI.Category;
import org.occiware.clouddesigner.OCCI.OCCIPackage;

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
    return super.isTransient(owner, feature, index);
  }
}

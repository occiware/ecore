package org.occiware.clouddesigner.occi.xtext

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.serializer.sequencer.TransientValueService
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService
import org.occiware.clouddesigner.occi.Category
import org.occiware.clouddesigner.occi.OCCIPackage

class OCCITransientValueService extends DefaultTransientValueService {
   
    override isTransient(EObject owner, EStructuralFeature feature, int index) {
        if (owner instanceof Category && OCCIPackage.CATEGORY__SCHEME == feature.getFeatureID()) {
        	// Force to serialize Category.scheme field even if it is not managed by OCCI.xtext.
            return true;
        }
        return super.isTransient(owner, feature, index);
    }
}

@SuppressWarnings("restriction")
class OCCITransientValueService2 extends TransientValueService {
   
    override isValueTransient(EObject semanticObject, EStructuralFeature feature) {
        if (semanticObject instanceof Category && OCCIPackage.CATEGORY__SCHEME == feature.getFeatureID()) {
        	// Force to serialize Category.scheme field even if it is not managed by OCCI.xtext.
            return ValueTransient.YES;
        }
        return super.isValueTransient(semanticObject, feature);
    }
}

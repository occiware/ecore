package org.occiware.clouddesigner.occi.xtext

import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.serializer.sequencer.TransientValueService
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService
import org.occiware.clouddesigner.occi.Attribute
import org.occiware.clouddesigner.occi.Category
import org.occiware.clouddesigner.occi.OCCIPackage

class OCCITransientValueService extends DefaultTransientValueService {
   
    override isTransient(EObject owner, EStructuralFeature feature, int index) {
        if (owner instanceof Category && OCCIPackage.CATEGORY__SCHEME == feature.getFeatureID()) {
        	// Force to serialize Category.scheme field even if it is not managed by OCCI.xtext.
            return true;
        }
        if (owner instanceof Attribute && OCCIPackage.ATTRIBUTE__REQUIRED == feature.getFeatureID()) {
        	// Force to serialize Attribute.required field even if it is not managed by OCCI.xtext.
            return true;
        }
        if (owner instanceof Attribute && OCCIPackage.ATTRIBUTE__DESCRIPTION == feature.getFeatureID()) {
        	// Force to serialize Attribute.description field even if it is not managed by OCCI.xtext.
            return true;
        }
        if (owner instanceof EEnumLiteral && EcorePackage.EENUM_LITERAL__VALUE == feature.getFeatureID()) {
        	// Force to serialize EEnumLiteral.value field even if it is not managed by OCCI.xtext.
            return true;
        }
        if (owner instanceof EEnumLiteral && EcorePackage.EENUM_LITERAL__LITERAL == feature.getFeatureID()) {
        	// Force to serialize EEnumLiteral.literal field even if it is not managed by OCCI.xtext.
            return true;
        }
        if (owner instanceof EAnnotation && EcorePackage.EANNOTATION__SOURCE == feature.getFeatureID()) {
        	// Force to serialize EAnnotation.source field even if it is not managed by OCCI.xtext.
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
        if (semanticObject instanceof EEnumLiteral && EcorePackage.EENUM_LITERAL__VALUE == feature.getFeatureID()) {
        	// Force to serialize EEnumLiteral.value field even if it is not managed by OCCI.xtext.
            return ValueTransient.YES;
        }
        if (semanticObject instanceof EAnnotation && EcorePackage.EANNOTATION__SOURCE == feature.getFeatureID()) {
        	// Force to serialize EAnnotation.source field even if it is not managed by OCCI.xtext.
            return ValueTransient.YES;
        }
        return super.isValueTransient(semanticObject, feature);
    }
}

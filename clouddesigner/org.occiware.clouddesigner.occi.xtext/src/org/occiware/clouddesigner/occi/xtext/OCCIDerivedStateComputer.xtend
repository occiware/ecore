package org.occiware.clouddesigner.occi.xtext

import org.eclipse.emf.ecore.EDataType
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.occiware.clouddesigner.OCCI.Action
import org.occiware.clouddesigner.OCCI.Category
import org.occiware.clouddesigner.OCCI.Extension
import org.occiware.clouddesigner.OCCI.Kind
import org.occiware.clouddesigner.OCCI.Mixin

/**
 * Some EMF fields of the OCCIware metamodel are not explicitly set by OCCI.xtext:
 * - Kind.scheme
 * - Mixin.scheme
 * - Action.scheme
 * - EDataType.eAnnotations.source
 * So in order to have correct metamodel instances, this class sets these fields automatically to a correct value.
 */
class OCCIDerivedStateComputer implements IDerivedStateComputer {
	
/*
  override discardDerivedState(DerivedStateAwareResource resource) {
    System.out.println("discardDerivedState begin")
    resource.allContents.forEach [ r |
      System.out.println("discardDerivedState " + r)
    ]
    System.out.println("discardDerivedState end")
  }
*/
  
  override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
    resource.allContents.forEach [ r |
      if(r instanceof Kind) {
      	val kind = r as Kind
      	if(kind.scheme == null) {
      		// Set the scheme of a Kind instance to the scheme of its owning Extension instance.
      		kind.scheme = (kind.eContainer as Extension).scheme
      	}
      }
      if(r instanceof Mixin) {
      	val mixin = r as Mixin
      	if(mixin.scheme == null) {
      		// Set the scheme of a Mixin instance to the scheme of its owning Extension instance.
      		mixin.scheme = (mixin.eContainer as Extension).scheme
      	}
      }
      if(r instanceof Action) {
      	val action = r as Action
      	if(action.scheme == null) {
      		val ownerCategory = (action.eContainer as Category)
      		// Set the scheme of an Action instance related to the scheme of its owning Category instance.
      		action.scheme = ownerCategory.scheme.substring(0, ownerCategory.scheme.length-1) + '/' + ownerCategory.term + "/action#"
      	}
      }
      if(r instanceof EDataType) {
      	val datatype = r as EDataType
      	datatype.getEAnnotations().forEach [ annotation |
      		if(annotation.source == null) {
      			annotation.source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"
     		}
      	]
      }
    ]
  }
}

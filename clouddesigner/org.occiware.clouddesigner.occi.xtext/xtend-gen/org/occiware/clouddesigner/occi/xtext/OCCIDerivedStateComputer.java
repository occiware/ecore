package org.occiware.clouddesigner.occi.xtext;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.occiware.clouddesigner.OCCI.Action;
import org.occiware.clouddesigner.OCCI.Category;
import org.occiware.clouddesigner.OCCI.Extension;
import org.occiware.clouddesigner.OCCI.Kind;
import org.occiware.clouddesigner.OCCI.Mixin;

/**
 * Some EMF fields of the OCCIware metamodel are not explicitly set by OCCI.xtext:
 * - Kind.scheme
 * - Mixin.scheme
 * - Action.scheme
 * - EDataType.eAnnotations.source
 * So in order to have correct metamodel instances, this class sets these fields automatically to a correct value.
 */
@SuppressWarnings("all")
public class OCCIDerivedStateComputer implements IDerivedStateComputer {
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
      @Override
      public void apply(final EObject r) {
        if ((r instanceof Kind)) {
          final Kind kind = ((Kind) r);
          String _scheme = kind.getScheme();
          boolean _equals = Objects.equal(_scheme, null);
          if (_equals) {
            EObject _eContainer = kind.eContainer();
            String _scheme_1 = ((Extension) _eContainer).getScheme();
            kind.setScheme(_scheme_1);
          }
        }
        if ((r instanceof Mixin)) {
          final Mixin mixin = ((Mixin) r);
          String _scheme_2 = mixin.getScheme();
          boolean _equals_1 = Objects.equal(_scheme_2, null);
          if (_equals_1) {
            EObject _eContainer_1 = mixin.eContainer();
            String _scheme_3 = ((Extension) _eContainer_1).getScheme();
            mixin.setScheme(_scheme_3);
          }
        }
        if ((r instanceof Action)) {
          final Action action = ((Action) r);
          String _scheme_4 = action.getScheme();
          boolean _equals_2 = Objects.equal(_scheme_4, null);
          if (_equals_2) {
            EObject _eContainer_2 = action.eContainer();
            final Category ownerCategory = ((Category) _eContainer_2);
            String _scheme_5 = ownerCategory.getScheme();
            String _scheme_6 = ownerCategory.getScheme();
            int _length = _scheme_6.length();
            int _minus = (_length - 1);
            String _substring = _scheme_5.substring(0, _minus);
            String _plus = (_substring + "/");
            String _term = ownerCategory.getTerm();
            String _plus_1 = (_plus + _term);
            String _plus_2 = (_plus_1 + "/action#");
            action.setScheme(_plus_2);
          }
        }
        if ((r instanceof EDataType)) {
          final EDataType datatype = ((EDataType) r);
          EList<EAnnotation> _eAnnotations = datatype.getEAnnotations();
          final Procedure1<EAnnotation> _function = new Procedure1<EAnnotation>() {
            @Override
            public void apply(final EAnnotation annotation) {
              String _source = annotation.getSource();
              boolean _equals = Objects.equal(_source, null);
              if (_equals) {
                annotation.setSource("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
              }
            }
          };
          IterableExtensions.<EAnnotation>forEach(_eAnnotations, _function);
        }
      }
    };
    IteratorExtensions.<EObject>forEach(_allContents, _function);
  }
}

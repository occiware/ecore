package org.occiware.clouddesigner.occi.xtext.scoping;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.util.OCCISwitch;

import com.google.inject.Inject;

public class NameProvider extends IQualifiedNameProvider.AbstractImpl {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj.eIsProxy()) {
			return null;
		}

		String name = null;
		if(obj instanceof EDataType) {
			name = ((EDataType)obj).getName();
		} else {
			name = new OCCISwitch<String>() {
						public String caseExtension(Extension object) {
							return object.getName();
						};

						public String caseKind(Kind object) {
							return object.getTerm();
						};

						public String caseMixin(Mixin object) {
							return object.getTerm();
						};

						public String caseResource(Resource object) {
							return object.getId();
						};

						public String caseLink(Link object) {
							return object.getId();
						};
				}.doSwitch(obj);
		}
		return name != null ? qualifiedNameConverter.toQualifiedName(name) : null;
	}
}

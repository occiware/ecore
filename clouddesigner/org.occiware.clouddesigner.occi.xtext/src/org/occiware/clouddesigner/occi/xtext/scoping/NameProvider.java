package org.occiware.clouddesigner.occi.xtext.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.occiware.clouddesigner.OCCI.util.OCCISwitch;

import com.google.inject.Inject;

public class NameProvider extends IQualifiedNameProvider.AbstractImpl {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj.eIsProxy())
			return null;
		String name = new OCCISwitch<String>() {

			public String caseExtension(
					org.occiware.clouddesigner.OCCI.Extension object) {
				return object.getName();
			};

			public String caseKind(org.occiware.clouddesigner.OCCI.Kind object) {
				return object.getTerm();
			};

		}.doSwitch(obj);
		if (name == null)
			return null;
		return qualifiedNameConverter.toQualifiedName(name);
	}
}
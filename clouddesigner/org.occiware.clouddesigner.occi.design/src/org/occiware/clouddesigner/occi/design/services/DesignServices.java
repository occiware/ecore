package org.occiware.clouddesigner.occi.design.services;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EObject;

import org.occiware.clouddesigner.OCCI.Action;
import org.occiware.clouddesigner.OCCI.Attribute;

public class DesignServices {

	// service:isEDataType
	public Boolean isEDataType(EObject eObj) {
		return eObj.eClass() == EcorePackage.eINSTANCE.getEDataType();
	}

    /**
     * Computes the label of an Action.
     */
    public String render(Action action) {
    	System.out.println("Render " + action); //$NON-NLS-1$
		StringBuilder sb = new StringBuilder();
		sb.append(action.getTerm());
		sb.append('(');
		boolean first = true;
		for(Attribute param : action.getAttributes()) {
			if (!first) {
				sb.append(", "); //$NON-NLS-1$
			} else {
				first = false;
			}
			sb.append(param.getName()).append(" : ").append(param.getType().getName()); //$NON-NLS-1$
		}
		sb.append(')');
		return sb.toString();
    }
}

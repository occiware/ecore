/*******************************************************************************
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     William Piers <william.piers@obeo.fr>
 *     Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.design.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
// import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
// import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Category;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OcciCoreConstants;
import org.occiware.clouddesigner.occi.design.dialog.LoadExtensionDialog;
import org.occiware.clouddesigner.occi.util.OcciHelper;

public class DesignServices {

	// service:isEDataType
	public Boolean isEDataType(EObject eObj) {
		return eObj.eClass() == EcorePackage.eINSTANCE.getEDataType();
	}

	/**
	 * Set the value of an enum literal.
	 */
	public void setValue(EEnumLiteral eEnumLiteral)
	{
		eEnumLiteral.setValue(eEnumLiteral.getEEnum().getELiterals().size() - 1);
	}

	/**
	 * Computes the label of an Action.
	 */
	public String render(Action action) {
		StringBuilder sb = new StringBuilder();
		sb.append(action.getTerm());
		sb.append('(');
		boolean first = true;
		for (Attribute param : action.getAttributes()) {
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

	/**
	 * Computes the initial term of an Action.
	 */
	public String initialActionTerm(Action action) {
		Object container = action.eContainer();
		int nb = 0;
		if (container instanceof Kind) {
			nb = ((Kind) container).getActions().size();
		} else if (container instanceof Mixin) {
			nb = ((Mixin) container).getActions().size();
		}
		return "action" + nb;
	}

	/**
	 * Computes the initial scheme of an Action.
	 */
	public String initialActionScheme(Action action) {
		Category category = (Category) action.eContainer();
		String scheme = category.getScheme();
		return scheme.substring(0, scheme.length() - 1) + "/" + category.getTerm() + "/action#";
	}

	public void importExtension(Extension extension) {
		Shell shell = Display.getCurrent().getActiveShell();
		Session session = SessionManager.INSTANCE.getSession(extension);
		LoadExtensionDialog dialog = new LoadExtensionDialog(shell, session.getTransactionalEditingDomain());
		dialog.open();

		for (URI uri : dialog.getURIs()) {
			session.addSemanticResource(uri, new NullProgressMonitor());
			Resource resource = session.getTransactionalEditingDomain().getResourceSet().getResource(uri, true);
			if (!resource.getContents().isEmpty() && (resource.getContents().get(0) instanceof Extension)
					&& !extension.getImport().contains(resource.getContents().get(0))) {
				extension.getImport().add((Extension) resource.getContents().get(0));
			}
		}
	}

	public void setStringType(Attribute attribute) {
		for (EDataType dt : getCoreExtension(attribute).getTypes()) {
			if (dt.getName().equals("String")) {
				// default type
				attribute.setType(dt);
			}
		}
	}

	/**
	 * Set the initial kind of a Resource.
	 */
	public void setResourceKind(org.occiware.clouddesigner.occi.Resource resource) {
		setEntityKind(resource, OcciCoreConstants.OCCI_CORE_RESOURCE_TERM);
	}

	/**
	 * Set the initial kind of a Link.
	 */
	public void setLinkKind(Link link) {
		setEntityKind(link, OcciCoreConstants.OCCI_CORE_LINK_TERM);
	}

	/**
	 * Set the initial kind of an Entity.
	 */
	private void setEntityKind(Entity entity, String kindTerm) {
		for (Kind kind : getCoreExtension(entity).getKinds()) {
			if (kind.getTerm().equals(kindTerm)) {
				entity.setKind(kind);
				return;
			}
		}
	}

	/**
	 * Get the OCCI core extension.
	 */
	private Extension getCoreExtension(EObject eobject)
	{
		Session session = SessionManager.INSTANCE.getSession(eobject);
		Resource resource = session.getSessionResource().getResourceSet().getResource(
					URI.createURI(OcciCoreConstants.OCCI_CORE_URI, true), true);
		return (Extension) resource.getContents().get(0);
	}

	/**
	 * Add all attributes not already present.
	 */
	public void addAllAttributes(Entity entity)
	{
		// Compute already present attribute names.
		List<AttributeState> attributeStates = entity.getAttributes();
		HashSet<String> attributeNames = new HashSet<String>();
		// Iterate over all attribute state instances.
		for(AttributeState attributeState : attributeStates) {
			attributeNames.add(attributeState.getName());
		}

		// Iterate over all attributes.
		for(Attribute attribute : OcciHelper.getAllAttributes(entity)) {
			String attributeName = attribute.getName();
			if(!attributeNames.contains(attributeName)) {
				// If not already present create it.
				AttributeState attributeState = OCCIFactory.eINSTANCE.createAttributeState();
				attributeState.setName(attributeName);
				String attributeDefault = attribute.getDefault();
				if(attributeDefault != null) {
					// if default set then set value.
					attributeState.setValue(attributeDefault);
				}
				// Add it to attribute states of this entity.
				attributeStates.add(attributeState);
			}
		}
	}
}

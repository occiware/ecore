/*******************************************************************************
 * Copyright (c) 2015-16 Inria
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  - Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.occiware.clouddesigner.occi.util;

import java.io.PrintStream;

import org.eclipse.emf.ecore.EDataType;

import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;

/**
 * This class provides utility methods for printing OCCI extensions and configurations.
 *
 * @author Philippe Merle - Inria
 */
public class OcciPrinter
{
	/**
	 * Print a given OCCI extension.
	 * @param ps the print stream where to print the given OCCI extension.
	 * @param extension the given OCCI extension.
	 */
	public static void print(PrintStream ps, Extension extension)
	{
		ps.println("Extension");
		ps.println("  - name: " + extension.getName());
		ps.println("  - scheme: " + extension.getScheme());
		ps.println("  - import extensions:");
		for(Extension importExtension : extension.getImport()) {
			ps.println("        * Extension " + importExtension.getScheme() + importExtension.getName());
		}
		ps.println("  - kinds:");
		for(Kind kind : extension.getKinds()) {
			ps.println("    * Kind");
			ps.println("      - term: " + kind.getTerm());
			ps.println("      - scheme: " + kind.getScheme());
			ps.println("      - title: " + kind.getTitle());
			Kind parent = kind.getParent();
			if(parent != null) {
				ps.println("      - parent: " + parent.getScheme() + parent.getTerm());					
			} else {
				ps.println("      - no parent");
			}
			ps.println("      - attributes:");
			for(Attribute attribute : kind.getAttributes()) {
				ps.println("        * Attribute");
				ps.println("          - name: " + attribute.getName());
				ps.println("          - description: " + attribute.getDescription());
				ps.println("          - mutable: " + attribute.isMutable());
				ps.println("          - required: " + attribute.isRequired());
				ps.println("          - type: " + attribute.getType().getName());
				ps.println("          - default: " + attribute.getDefault());
			}
			ps.println("      - actions:");
			for(Action action : kind.getActions()) {
				ps.println("        * Action");
				ps.println("          - term: " + action.getTerm());
				ps.println("          - scheme: " + action.getScheme());
				ps.println("          - title: " + action.getTitle());
			}
			ps.println("      - entities:");
			for(Entity entity : kind.getEntities()) {
				ps.println("        * Entity id " + entity.getId());
			}
		}
		ps.println("  - mixins:");
		for(Mixin mixin : extension.getMixins()) {
			ps.println("    * Mixin");
			ps.println("      - term: " + mixin.getTerm());
			ps.println("      - scheme: " + mixin.getScheme());
			ps.println("      - title: " + mixin.getTitle());
			ps.println("      - depends:");
			for(Mixin depend : mixin.getDepends()) {
				ps.println("        * Mixin " + depend.getScheme() + depend.getTerm());
			}
			ps.println("      - applies:");
			for(Kind apply : mixin.getApplies()) {
				ps.println("        * Kind " + apply.getScheme() + apply.getTerm());
			}				
			ps.println("      - attributes:");
			for(Attribute attribute : mixin.getAttributes()) {
				ps.println("        * Attribute");
				ps.println("          - name: " + attribute.getName());
				ps.println("          - description: " + attribute.getDescription());
				ps.println("          - mutable: " + attribute.isMutable());
				ps.println("          - required: " + attribute.isRequired());
				ps.println("          - type: " + attribute.getType().getName());
				ps.println("          - default: " + attribute.getDefault());
			}
			ps.println("      - actions:");
			for(Action action : mixin.getActions()) {
				ps.println("        * Action");
				ps.println("          - term: " + action.getTerm());
				ps.println("          - scheme: " + action.getScheme());
				ps.println("          - title: " + action.getTitle());
			}
			ps.println("      - entities:");
			for(Entity entity : mixin.getEntities()) {
				ps.println("        * Entity id " + entity.getId());
			}
		}
		ps.println("  - types:");
		for(EDataType type : extension.getTypes()) {
			ps.println("    * EDataType " + type.getName());
		}
	}

	/**
	 * Print a given OCCI configuration.
	 * @param ps the print stream where to print the given OCCI configuration.
	 * @param configuration the given OCCI configuration.
	 */
	public static void print(PrintStream ps, Configuration configuration)
	{
		ps.println("Configuration");
		ps.println("  - used extensions:");
		for(Extension extension : configuration.getUse()) {
			ps.println("    * Extension " + extension.getScheme() + extension.getName());
		}
		ps.println("  - resources:");
		for(Resource resource : configuration.getResources()) {
			ps.println("    * Resource id " + resource.getId());
			Kind resourceKind = resource.getKind();
			ps.println("      - Kind " + resourceKind.getScheme() + resourceKind.getTerm());
			ps.println("      - mixins:");
			for(Mixin mixin : resource.getMixins()) {
				ps.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
			}
			ps.println("      - attributes:");
			for(AttributeState as : resource.getAttributes()) {
				ps.println("        * AttributeState " + as.getName() + "=" + as.getValue());
			}
			ps.println("      - links:");
			for(Link link : resource.getLinks()) {
				ps.println("        * Link id " + link.getId());
				Kind linkKind = link.getKind();
				ps.println("         - Kind " + linkKind.getScheme() + linkKind.getTerm());
				ps.println("         - mixins:");
				for(Mixin mixin : link.getMixins()) {
					ps.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
				}
				ps.println("         - attributes:");
				for(AttributeState as : link.getAttributes()) {
					ps.println("           * AttributeState " + as.getName() + "=" + as.getValue());
				}
				Resource source = link.getSource();
				ps.println("        - source id " + source.getId());
				Resource target = link.getTarget();
				if(target != null) {
					ps.println("        - target id " + target.getId());
				} else {
					ps.println("        - no target");
				}
			}
		}
	}
}

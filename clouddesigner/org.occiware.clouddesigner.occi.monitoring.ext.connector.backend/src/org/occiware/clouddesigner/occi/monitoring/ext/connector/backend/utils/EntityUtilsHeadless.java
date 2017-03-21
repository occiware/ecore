/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * This class is only for headless usage, it's an utility for updating attributes on connector entity.
 * @author Christophe Gourdin
 *
 */
public class EntityUtilsHeadless {
	private static Logger LOGGER = LoggerFactory.getLogger(EntityUtilsHeadless.class);
	private static final String DELETE_ATTR = "delete";
	private static final String ADD_ATTR = "add";
	private static final String UPDATE_ATTR = "update";
	
	/**
	 * Create, update or delete some attributes on model Entity.
	 *  
	 * @param entity
	 * @param attrsToCreate 
	 * @param attrsToUpdate
	 * @param attrsToDelete
	 */
	public static void updateAttributes(final Entity entity, final Map<String, String> attrsToCreate,
			final Map<String, String> attrsToUpdate, final List<String> attrsToDelete) {
		
		if (!UIDialog.isStandAlone()) {
			LOGGER.warn("This method must be used in a headless environment ! Check your caller code.");
			
		} else {
			// Standalone connector usage.
			LOGGER.info("Updating attributes : Headless mode");
			executeOperations(entity, attrsToCreate, attrsToUpdate, attrsToDelete);
		}
	}
	
	private static void executeOperations(final Entity entity, Map<String, String> attrsToCreate,
			Map<String, String> attrsToUpdate, List<String> attrsToDelete) {
		String attrName;
		String attrValue;
		
		for (Map.Entry<String, String> attr : attrsToCreate.entrySet()) {
			attrName = attr.getKey();
			attrValue = attr.getValue();
			LOGGER.info("attr to create : " + attr.getKey() + " ==> " + attr.getValue());
			
			AttributeState attrState = createAttribute(attrName, attrValue);
			executeOperation(entity, ADD_ATTR, attrState, null, null);
		}
		for (Map.Entry<String, String> attr : attrsToUpdate.entrySet()) {
			attrName = attr.getKey();
			attrValue = attr.getValue();
			LOGGER.info("attr to update : " + attr.getKey() + " ==> " + attr.getValue());
			AttributeState attrState = getAttributeStateObject(entity, attrName);
			executeOperation(entity, UPDATE_ATTR, attrState, attrName, attrValue);
		}
		
		for (String name : attrsToDelete) {
			LOGGER.info("attr to delete : " + name);
			AttributeState attrState = getAttributeStateObject(entity, name);
			executeOperation(entity, DELETE_ATTR, attrState, name, null);
		}
		
		
	}
	
	private static void executeOperation(final Entity entity, final String operation, final AttributeState attr,
			final String attrName, final String attrValue) {
		switch (operation) {
		case UPDATE_ATTR:

			if (attr != null) {
				attr.setValue(attrValue);
			}
			break;

		case DELETE_ATTR:

			Iterator<AttributeState> it = entity.getAttributes().iterator();
			while (it.hasNext()) {
				if (it.equals(attr)) {
					it.remove();
					break;
				}
			}
			break;

		case ADD_ATTR:
			entity.getAttributes().add(attr);
			break;
		}
	}

	/**
	 * Create an attribute without add this to the entity connector object.
	 * 
	 * @param name
	 * @param value
	 * @return AttributeState object.
	 */
	private static AttributeState createAttribute(final String name, final String value) {
		AttributeState attr = OCCIFactory.eINSTANCE.createAttributeState();
		attr.setName(name);
		attr.setValue(value);
		return attr;
	}

	/**
	 * Get an attribute state object for key parameter.
	 * 
	 * @param key
	 *            ex: occi.core.title.
	 * @return an AttributeState object, if attribute doesnt exist, null value
	 *         is returned.
	 */
	private static AttributeState getAttributeStateObject(Entity entity, final String key) {
		AttributeState attr = null;
		if (key == null) {
			return attr;
		}
		// Load the corresponding attribute state.
		for (AttributeState attrState : entity.getAttributes()) {
			if (attrState.getName().equals(key)) {
				attr = attrState;
				break;
			}
		}

		return attr;
	}
	
}

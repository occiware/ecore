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
package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils.thread;

import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * When in multithreading, the attributes update (or create) need a transaction
 * to be wrote. This class set the attributes within an emf transaction.
 * 
 * @author Christophe Gourdin
 *
 */
public class EntityUtils {
	private static Logger LOGGER = LoggerFactory.getLogger(EntityUtils.class);
	private static final String DELETE_ATTR = "delete";
	private static final String ADD_ATTR = "add";
	private static final String UPDATE_ATTR = "update";

	/**
	 * Update an attribute value within a transaction.
	 * 
	 * @param entity
	 * @param attrName
	 * @param attrValue
	 */
	public static void updateAttribute(Entity entity, String attrName, String attrValue) {
		// Update the attribute.

		AttributeState attr = getAttributeStateObject(entity, attrName);

		executeTransaction(entity, UPDATE_ATTR, attr, attrName, attrValue);

	}

	/**
	 * Create an attribute within a transaction.
	 * 
	 * @param entity
	 * @param attrName
	 * @param attrValue
	 */
	public static void createAttribute(Entity entity, String attrName, String attrValue) {
		AttributeState attr = createAttribute(attrName, attrValue);

		executeTransaction(entity, ADD_ATTR, attr, attrName, attrValue);

	}

	/**
	 * Remove an attribute from entity within a transaction.
	 * 
	 * @param entity
	 * @param attrName
	 */
	public static void removeAttribute(Entity entity, String attrName) {
		AttributeState attr = getAttributeStateObject(entity, attrName);
		executeTransaction(entity, DELETE_ATTR, attr, attrName, null);

	}

	/**
	 * Execute a transaction emf command for the operation.
	 * 
	 * @param entity
	 *            {@link Entity}
	 * @param operation
	 * @param attr
	 *            {@link AttributeState}
	 * @param attrName
	 * @param attrValue
	 */
	private static void executeTransaction(Entity entity, String operation, AttributeState attr, String attrName,
			String attrValue) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(entity.eResource().getResourceSet());
		Command cmd = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
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
		};
		try {
			TransactionalCommandStack transactionCmd = (TransactionalCommandStack) domain.getCommandStack();
			transactionCmd.execute(cmd, null); // default options
		} catch (RollbackException rbe) {
			LOGGER.error(rbe.getStatus().toString());
		} catch (InterruptedException ex) {
			LOGGER.error(ex.getMessage());
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

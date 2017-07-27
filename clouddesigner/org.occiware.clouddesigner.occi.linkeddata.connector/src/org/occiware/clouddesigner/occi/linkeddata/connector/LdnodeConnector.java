/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *
 * Generated at Mon Jul 24 10:48:41 CEST 2017 from platform:/plugin/org.occiware.clouddesigner.occi.linkeddata/model/linkeddata.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.linkeddata.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.occiware.clouddesigner.occi.linkeddata.connector.pojo.LdnodeAttributesPOJO;
import org.occiware.clouddesigner.occi.linkeddata.connector.pojo.LdnodePOJO;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/linkeddata#
 * - term: ldnode
 * - title: LDNode
 */
public class LdnodeConnector extends org.occiware.clouddesigner.occi.linkeddata.impl.LdnodeImpl
{	
	/**
	 * Constant to be set to true if the connector to runs on the MartServer
	 * This connector is for Eclipse only
	 */
	private static final boolean IS_MARTSERVER = true;
	
	/**
	 * URL of said MartServer. Must always end with a slash !
	 */
	private static final String MARTSERVER_URL = "http://localhost:8081/";
	
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(LdnodeConnector.class);
	
	/**
	 * Stores the state of the ldnode so that we can compare it with modifications.
	 */
	private LdnodePOJO ldnodePOJO;
	
	/**
	 * Simple CRUD enum.
	 */
	public enum CRUD {
	    CREATE, READ, UPDATE, DELETE
	}
	
	/**
	 * Constructs a ldnode connector.
	 */
	LdnodeConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Ldnode instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		
		CRUD(CRUD.CREATE);
	}

	/**
	 * Called when this Ldnode instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		CRUD(CRUD.READ);
	}

	/**
	 * Called when this Ldnode instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		
		CRUD(CRUD.UPDATE);
	}

	/**
	 * Called when this Ldnode instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		
		CRUD(CRUD.DELETE);
	}
	
	/**
	 * Simple CRUD function to share data between the MartServer and CloudDesigner.
	 * @param crud determines the type of the operation.
	 */
	private void CRUD(CRUD crud) {
		if (IS_MARTSERVER) {
			return;
		}
		
		try {
			DefaultHttpClient httpClient = new DefaultHttpClient();
			// Request to find the ldnode by name (which is supposed to be a primary key).
			HttpGet getRequest = new HttpGet(
					MARTSERVER_URL + "?category=ldnode&attribute=occi.ld.node.name&value=" +
							((this.ldnodePOJO == null) ? this.getName() : this.ldnodePOJO.getAttributes().getName()));
			getRequest.addHeader("accept", "application/json");
			
			HttpPost postRequest = new HttpPost(
					MARTSERVER_URL + "ldnode/");
			postRequest.addHeader("Content-Type", "application/json");
			postRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(response.getEntity().getContent())));

			String output = org.apache.commons.io.IOUtils.toString(br);
			
			final ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			LdnodePOJO ldnodePOJOBuffer = mapper.readValue(output, LdnodePOJO.class);
			
			if (crud == CRUD.CREATE) {
				if (ldnodePOJOBuffer.getId() != null) {
					LOGGER.error("Couldn't create the resource on the server, it already exists.");
				}
				else {
					LdnodeAttributesPOJO ldnodeAttributes = new LdnodeAttributesPOJO(
							this.getName(),
							this.getMongoHosts(),
							this.getMainProject(),
							this.getAnalyticsReadPreference());
					
					ldnodePOJO = new LdnodePOJO(
							"urn:uuid:" + this.getId(),
							this.getTitle(), 
							this.getSummary(),
							this.getKind().getScheme() + this.getKind().getTitle().toLowerCase(),
							new ArrayList<String>(),
							ldnodeAttributes,
							new ArrayList<String>());
					String ldnodeJSONString = mapper.writeValueAsString(ldnodePOJO);
					postRequest.setEntity(new StringEntity(ldnodeJSONString));
					httpClient.execute(postRequest);
				}
			}
			else if (crud == CRUD.READ) {
				if (ldnodePOJOBuffer.getId() != null) {
					ldnodePOJO = ldnodePOJOBuffer;
					this.setTitle(ldnodePOJO.getTitle());
					this.setId(ldnodePOJO.getId().substring(LdnodePOJO.ID_AFTER_N_CHARS, ldnodePOJOBuffer.getId().length()));
					this.setSummary(ldnodePOJO.getSummary());
					this.setName(ldnodePOJO.getAttributes().getName());
					this.setMongoHosts(ldnodePOJO.getAttributes().getMongoHosts());
					this.setMainProject(ldnodePOJO.getAttributes().getMainProject());
					this.setAnalyticsReadPreference(ldnodePOJO.getAttributes().getAnalyticsReadPreference());
				}
				else {
					LOGGER.error("Couldn't find the resource on the server, impossible to retrieve.");
				}
			}
			else if (crud == CRUD.UPDATE) {
				if (ldnodePOJOBuffer.getId() != null) {
					LdnodeAttributesPOJO ldnodeAttributes = ldnodePOJO.getAttributes();
					ldnodeAttributes.setName(this.getName());
					ldnodeAttributes.setMongoHosts(this.getMongoHosts());
					ldnodeAttributes.setMainProject(this.getMainProject());
					ldnodeAttributes.setAnalyticsReadPreference(this.getAnalyticsReadPreference());
					
					ldnodePOJO.setId("urn:uuid:" + this.getId());
					ldnodePOJO.setTitle(this.getTitle());
					ldnodePOJO.setSummary(this.getSummary());					
					
					String ldnodeJSONString = mapper.writeValueAsString(ldnodePOJO);
					postRequest.setEntity(new StringEntity(ldnodeJSONString));
					httpClient.execute(postRequest);
				}
				else {
					LOGGER.error("Couldn't find the resource on the server, impossible to update.");
				}
			}
			else if (crud == CRUD.DELETE) {
				if (ldnodePOJOBuffer.getId() != null) {
					HttpDelete deleteRequest = new HttpDelete(
							MARTSERVER_URL + "ldnode/" +
									ldnodePOJOBuffer
									.getId()
									.substring(LdnodePOJO.ID_AFTER_N_CHARS, ldnodePOJOBuffer.getId().length()));
					deleteRequest.addHeader("accept", "application/json");
					httpClient.execute(deleteRequest);
				}
				else {
					LOGGER.error("Couldn't find the resource on the server, impossible to delete.");
				}
			}
			
			httpClient.getConnectionManager().shutdown();

		} catch (ClientProtocolException e) {
			LOGGER.error(e.getMessage());
		} catch (IOException e) {
			LOGGER.error(e.getMessage());
		}
	}

	//
	// Ldnode actions.
	//

}	

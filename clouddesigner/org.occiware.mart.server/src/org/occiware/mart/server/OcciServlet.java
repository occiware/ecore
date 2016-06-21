/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.mart.server;
 
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.Attribute;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Category;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.OCCIFactory;
import org.occiware.clouddesigner.occi.OCCIRegistry;
import org.occiware.clouddesigner.occi.OcciCoreConstants;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.util.OcciHelper;

public class OcciServlet extends HttpServlet
{
	/**
	 * Name of the init parameter in web.xml files.
	 *
	 * <init-param>
     *   <param-name>occi-configuration-file</param-name>
     *   <param-value>model/infrastructure.occic</param-value>
     *  </init-param>
	 */
//	public static String INIT_PARAM_NAME_OCCI_CONFIGURATION_FILE = "occi-configuration-file";
//	public static String DEFAULT_OCCI_CONFIGURATION_FILE = "model/infrastructure.occic";

	/**
	 * The OCCI model managed by this servlet.
	 */
//	private Model model;

	private Configuration configuration; // TO REMOVE

	public Map<String, Entity> entities; // TO REMOVE
	public Map<String, List<Entity>> collections; // TO REMOVE
	
	// TODO: use the Web server URL
	public static final String OCCI_SERVER = "http://localhost:9090";
	
    public static final String TEXT_PLAIN = "text/plain";
    public static final String TEXT_OCCI = "text/occi";

	public static String CATEGORY = "Category";
	public static String X_OCCI_LOCATION = "X-OCCI-Location";
	public static String X_OCCI_ATTRIBUTE = "X-OCCI-Attribute";

	public static String OCCI_CORE_ID = "occi.core.id";
	public static String OCCI_CORE_SOURCE = "occi.core.source";
	public static String OCCI_CORE_TARGET = "occi.core.target";

	void addToCollection(Entity entity, Category category)
	{
		String collectionLocation = getLocation(category);
		List<Entity> collection = collections.get(collectionLocation);
		if(collection == null) {
			collection = new ArrayList<Entity>();
			collections.put(collectionLocation, collection);
		}
		collection.add(entity);
	}

	void addToCollections(Entity entity)
	{
		addToCollection(entity, entity.getKind());
		for(Mixin mixin : entity.getMixins()) {
			addToCollection(entity, mixin);
		}
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1341053999425047651L;

	@Override
	public void init()
	{
		// Load the OCCI configuration to use.
//		String occiConfigurationFile = getInitParameter(INIT_PARAM_NAME_OCCI_CONFIGURATION_FILE);	
//		if(occiConfigurationFile == null) {
//			occiConfigurationFile = DEFAULT_OCCI_CONFIGURATION_FILE;
//		}
//		log("OcciServlet.init - Loading " + occiConfigurationFile + "...");
//		Configuration configuration = Main.loadConfiguration(occiConfigurationFile);
//		log("OcciServlet.init - " + occiConfigurationFile + " loaded.");

//		model = new ModelImpl(configuration);

		configuration = OCCIFactory.eINSTANCE.createConfiguration();
        for(String scheme : OCCIRegistry.getInstance().getRegisteredExtensions()) {
        	configuration.getUse().add(OcciHelper.loadExtension(scheme));
        }
		
		// TO REMOVE
		entities = new HashMap<String, Entity>();
		collections = new HashMap<String, List<Entity>>();
		for(Resource resource : configuration.getResources()) {
			entities.put(getLocation(resource), resource);
			addToCollections(resource);
			for(Link link : resource.getLinks()) {
				entities.put(getLocation(link), link);
				addToCollections(link);
			}
		}

		org.occiware.mart.MART.reportJavaInformation();
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		String requestPathInfo = request.getPathInfo();
		log("doPost - " + requestPathInfo);

		BufferedReader reader = request.getReader();
        String line;

        // Read the first line containing a category.
		line = reader.readLine();
		log("doPost - line=" + line);
		if(line == null) {
			log("doPost - No category provided!");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}

        Matcher matcher = PATTERN_CATEGORY.matcher(line);
        if (!matcher.find()) {
        	log("doPost - Not a category!");
        	response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        	return;
        }
        String term = matcher.group(GROUP_TERM);
        String scheme = matcher.group(GROUP_SCHEME);
        String categoryClass = matcher.group(GROUP_CLASS);

    	Kind kind = null;
        switch(categoryClass) {
        case CLASS_KIND:
        	for(Extension extension : configuration.getUse()) {
            	for(Kind k : extension.getKinds()) {
            		if(term.equals(k.getTerm()) && scheme.equals(k.getScheme())) {
            			kind = k;
            			break;
            		}
            	}
        	}
        	if(kind == null) {
            	log("doPost - kind " + scheme + term + " not found!");
            	response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            	return;
        	}
        	break;
        default:
        	log("doPost - must be kind!");
        	response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        	return;
        }

        Kind tmp = kind;
        while(tmp != null) {
        	if(OcciCoreConstants.OCCI_CORE_SCHEME.equals(tmp.getScheme())) {
        		break;
        	}
        	tmp = tmp.getParent();
        }
        if(tmp == null) {
        	log("doPost - don't know if this kind is a resource or a link");
        	response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        	return;
        }
        Entity entity = null;
        switch(tmp.getTerm()) {
        case "resource":
			entity = OCCIFactory.eINSTANCE.createResource();
			break;
        case "link":
        	entity = OCCIFactory.eINSTANCE.createLink();
        	break;
        default:
        	log("doPost - don't know if this kind is a resource or a link");
        	response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        	return;
        }
        entity.setKind(kind);

        line = reader.readLine();
    	log("doPost - line=" + line);
    	if(line != null) {
    		while(true) {
    	        matcher = PATTERN_CATEGORY.matcher(line);
    	        if (!matcher.find()) {
    	        	break;
    	        }
    	        term = matcher.group(GROUP_TERM);
    	        scheme = matcher.group(GROUP_SCHEME);
    	        categoryClass = matcher.group(GROUP_CLASS);
    	        Mixin mixin = null;
                switch(categoryClass) {
                case CLASS_MIXIN:
                	for(Extension extension : configuration.getUse()) {
                    	for(Mixin m : extension.getMixins()) {
                    		if(term.equals(m.getTerm()) && scheme.equals(m.getScheme())) {
                    			mixin = m;
                    			break;
                    		}
                    	}
                	}
                	if(mixin == null) {
                    	log("doPost - mixin " + scheme + term + " not found!");
                    	response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    	return;
                	}
                	break;
                default:
                	log("doPost - must be mixin!");
                	response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                	return;
                }
                entity.getMixins().add(mixin);
                line = reader.readLine();
                log("doPost - line=" + line);
    		}
    	}
    	while(line != null) {
    		if(!line.startsWith(X_OCCI_ATTRIBUTE)) {
            	log("doPost - must be X-OCCI-Attributes!");
            	response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            	return;
            }
    		line = line.replaceAll(X_OCCI_ATTRIBUTE, "");
    		line = line.replaceAll(": ", "");
    		String[] parts = line.split("=");

// TODO: deal with occi.core.source and occi.core.target

    		if(!OCCI_CORE_ID.equals(parts[0])) {
    			AttributeState attribute = OCCIFactory.eINSTANCE.createAttributeState();
    			attribute.setName(parts[0]);
    			attribute.setValue(parts[1]);
    			entity.getAttributes().add(attribute);
    		}
        	line = reader.readLine();
        	log("doPost - line=" + line);
    	}

    	if(entity instanceof Resource) {
       		configuration.getResources().add((Resource)entity);
    	}

    	entities.put(getLocation(entity), entity);
		addToCollections(entity);

		log("doPost - " + getNetworkLocation(entity) + " created.");
		response.setStatus(HttpServletResponse.SC_CREATED);
		response.setContentType(TEXT_PLAIN);
    	PrintWriter out = response.getWriter();
		out.println(X_OCCI_LOCATION + ": " + getNetworkLocation(entity));
	}

	@Override
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		String requestPathInfo = request.getPathInfo();
		log("doDelete - " + requestPathInfo);

		Entity entity = entities.get(requestPathInfo);
		if(entity == null) {
			log("doDelete - " + requestPathInfo + " not found");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}

		entities.remove(requestPathInfo);
		collections.get(getLocation(entity.getKind())).remove(entity);
		if(entity instanceof Resource) {
			configuration.getResources().remove(entity);
		} else {
			Link link = (Link)entity;
			link.setSource(null);
		}

		log("doDelete - " + requestPathInfo + " deleted.");
		response.setStatus(HttpServletResponse.SC_OK);		
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		// TODO: following code can be refactored: a class for getAllEntities, getAllCategories, getEntity, getCollection
		String requestPathInfo = request.getPathInfo();
		if("/".equals(requestPathInfo)) {
			getAllEntities(request, response);
		} else if("/-/".equals(requestPathInfo)) {
			getAllCategories(request, response);
		} else {
			Entity entity = entities.get(requestPathInfo);
			if(entity != null) {
				getEntity(entity, request, response);
			} else {
				List<Entity> collection = collections.get(requestPathInfo);
				if(collection != null) {
					getCollection(collection, request, response);
				} else {
					PrintWriter out = response.getWriter();
					out.println("<html>");
					out.println("<body>");
					out.println("<h1>Hello Servlet Get</h1>");
					out.println("<li> pathInfo    = " +  request.getPathInfo());
					out.println("<li> contentType = " +  request.getContentType());
					out.println("<li> servletPath = " +  request.getServletPath());
					java.util.Enumeration<String> headerNames = request.getHeaderNames();
					while(headerNames.hasMoreElements()) {
						String name = headerNames.nextElement();
						out.println("<li> " + name + " = " +  request.getHeader(name));				
					}
					out.println("</body>");
					out.println("</html>");
				}
			}
		}
	}

	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		String requestPathInfo = request.getPathInfo();
		log("doPut - " + requestPathInfo);

		BufferedReader reader = request.getReader();
		String line = reader.readLine();
		while(line != null) {
			log("doPut - line=" + line);
			line = reader.readLine();
		}

		response.setStatus(HttpServletResponse.SC_NOT_IMPLEMENTED);
	}

	public void getEntity(Entity entity, HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType(TEXT_PLAIN);
		out.println(CATEGORY + ": " + asCategory(entity.getKind(), false));
		for(Mixin mixin : entity.getMixins()) {
			out.println(CATEGORY + ": " + asCategory(mixin, false));
		}
		out.println(X_OCCI_ATTRIBUTE + ": " + OCCI_CORE_ID + "=\"" + entity.getId() + '\"');
		if(entity instanceof Link) {
			Link link = (Link)entity;
			out.println(X_OCCI_ATTRIBUTE + ": " + OCCI_CORE_SOURCE + "=\"" + getLocation(link.getSource()) + '\"');
			out.println(X_OCCI_ATTRIBUTE + ": " + OCCI_CORE_TARGET + "=\"" + getLocation(link.getTarget()) + '\"');
		}		
		for(AttributeState attribute : entity.getAttributes()) {
			String value = attribute.getValue();
			// TODO: add " " only for string and enum attributes.
			value = "\"" + value + "\"";
			out.println(X_OCCI_ATTRIBUTE + ": " + attribute.getName() + '=' + value);
		}
	}

	public void getAllEntities(HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType(TEXT_PLAIN);
		for(Resource resource : configuration.getResources()) {
			out.println(X_OCCI_LOCATION + ": " + getNetworkLocation(resource));
			for(Link link : resource.getLinks()) {
				out.println(X_OCCI_LOCATION + ": " + getNetworkLocation(link));
			}
		}
	}

	public void getCollection(List<Entity> collection, HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType(TEXT_PLAIN);
		for(Entity entity : collection) {
			out.println(X_OCCI_LOCATION + ": " + getNetworkLocation(entity));
		}
	}

	String getLocation(Category category)
	{
		return '/' + category.getTerm() + '/';
	}

	String getLocation(Entity entity)
	{
		return getLocation(entity.getKind()) + entity.getId();
	}

	String getNetworkLocation(Entity entity)
	{
		return OCCI_SERVER + getLocation(entity);
	}
	
	public void getAllCategories(HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType(TEXT_PLAIN);
		for(Extension extension : configuration.getUse()) {
			for(Kind kind : extension.getKinds()) {
				out.println(CATEGORY + ": " + asCategory(kind, true));
//				response.addHeader(CATEGORY, asString(kind));
				for(Action action : kind.getActions()) {
					out.println(CATEGORY + ": " + asString(action));
//					response.addHeader(CATEGORY, asString(action));
				}
			}
			for(Mixin mixin : extension.getMixins()) {
				out.println(CATEGORY + ": " + asCategory(mixin, true));
//				response.addHeader(CATEGORY, asString(mixin));
				for(Action action : mixin.getActions()) {
					out.println(CATEGORY + ": " + asString(action));
//					response.addHeader(CATEGORY, asString(action));
				}
			}
		}
	}

	private String asCategory(Kind kind, boolean detailed)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(kind.getTerm())
		  .append(";scheme=\"").append(kind.getScheme()).append("\";class=\"kind\"");
		if(detailed) {
			sb.append(";title=\"").append(kind.getTitle()).append('\"');
			Kind parent = kind.getParent();
			if(parent != null) {
				sb.append(";rel=\"").append(parent.getScheme()).append(parent.getTerm()).append('\"');			
			}
			sb.append(";location=\"").append(getLocation(kind)).append('\"');
			appendAttributes(sb, kind.getAttributes());
			appendActions(sb, kind.getActions());
		}
		return sb.toString();
	}

	private String asCategory(Mixin mixin, boolean detailed)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(mixin.getTerm())
		  .append(";scheme=\"").append(mixin.getScheme()).append("\";class=\"mixin\"");
		if(detailed) {
			sb.append(";title=\"").append(mixin.getTitle()).append('\"');
			List<Mixin> mixins = mixin.getDepends();
			if(mixins.size() != 0) {
				sb.append(";rel=\"");
				String sep = "";
				for(Mixin md : mixins) {
					sb.append(sep).append(md.getScheme()).append(md.getTerm());
					sep = " ";
				}
				sb.append('\"');
			}
			sb.append(";location=\"").append(getLocation(mixin)).append('\"');
			appendAttributes(sb, mixin.getAttributes());
			appendActions(sb, mixin.getActions());
		}
		return sb.toString();
	}

	private String asString(Action action)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(action.getTerm())
		  .append(";scheme=\"").append(action.getScheme()).append("\";class=\"action\"")
		  .append(";title=\"").append(action.getTitle()).append('\"');
		appendAttributes(sb, action.getAttributes());
		return sb.toString();
	}

	private void appendAttributes(StringBuilder sb, List<Attribute> attributes)
	{
		if(attributes.size() != 0) {
			sb.append(";attributes=\"");
			String sep = "";
			for(Attribute attribute : attributes) {
				sb.append(sep).append(attribute.getName());
				if(attribute.isRequired() || !attribute.isMutable()) {
					sb.append('{');
					if(!attribute.isMutable()) {
						sb.append("immutable");
						if(attribute.isRequired()) {
							sb.append(' ');
						}
					}
					if(attribute.isRequired()) {
						sb.append("required");
					}
					sb.append('}');
				}
				sep = " ";
			}
			sb.append('\"');
		}
	}
	
	private void appendActions(StringBuilder sb, List<Action> actions)
	{
		if(actions.size() != 0) {
			sb.append(";actions=\"");
			String sep = "";
			for(Action action : actions) {
				sb.append(sep).append(action.getScheme()).append(action.getTerm());
				sep = " ";
			}
			sb.append('\"');
		}
	}

    public static final String CLASS_ACTION = "action";
    public static final String CLASS_KIND = "kind";
    public static final String CLASS_MIXIN = "mixin";

    //regular expression groups
    public static final String GROUP_TERM = "term";
    public static final String GROUP_SCHEME = "scheme";
    public static final String GROUP_CLASS = "class";
    public static final String GROUP_TITLE = "title";
    public static final String GROUP_REL = "rel";
    public static final String GROUP_LOCATION = "location";
    public static final String GROUP_ATTRIBUTES = "attributes";
    public static final String GROUP_ACTIONS = "actions";
    public static final String GROUP_URI = "uri";
    public static final String GROUP_SELF = "self";
    public static final String GROUP_CATEGORY = "category";

    //regular expressions
    public static final String REGEXP_LOALPHA = "[a-z]";
    public static final String REGEXP_ALPHA = "[a-zA-Z]";
    public static final String REGEXP_DIGIT = "[0-9]";
    public static final String REGEXP_INT = REGEXP_DIGIT + "+";
    public static final String REGEXP_FLOAT = REGEXP_INT + "\\." + REGEXP_INT;
    public static final String REGEXP_NUMBER = REGEXP_FLOAT + "|" + REGEXP_INT;
    public static final String REGEXP_BOOL = "\\b(?<!\\|)true(?!\\|)\\b|\\b(?<!\\|)false(?!\\|)\\b";
    public static final String REGEXP_QUOTED_STRING = "([^\"\\\\]|\\.)*";
    public static final String REGEXP_URI = "(?x-mi:([a-zA-Z][\\-+.a-zA-Z\\d]*):(?:((?:[\\-_.!~*'()a-zA-Z\\d;?:@&=+$,]|%[a-fA-F\\d]{2})(?:[\\-_.!~*'()a-zA-Z\\d;\\/?:@&=+$,\\[\\]]|%[a-fA-F\\d]{2})*)|(?:(?:\\/\\/(?:(?:(?:((?:[\\-_.!~*'()a-zA-Z\\d;:&=+$,]|%[a-fA-F\\d]{2})*)@)?(?:((?:(?:[a-zA-Z0-9\\-.]|%[0-9a-fA-F][0-9a-fA-F])+|\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\[(?:(?:[a-fA-F\\d]{1,4}:)*(?:[a-fA-F\\d]{1,4}|\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|(?:(?:[a-fA-F\\d]{1,4}:)*[a-fA-F\\d]{1,4})?::(?:(?:[a-fA-F\\d]{1,4}:)*(?:[a-fA-F\\d]{1,4}|\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}))?)\\]))(?::(\\d*))?))?|((?:[\\-_.!~*'()a-zA-Z\\d$,;:@&=+]|%[a-fA-F\\d]{2})+))|(?!\\/\\/))(\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*(?:\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*)*)?)(?:\\?((?:[\\-_.!~*'()a-zA-Z\\d;\\/?:@&=+$,\\[\\]]|%[a-fA-F\\d]{2})*))?)(?:\\#((?:[\\-_.!~*'()a-zA-Z\\d;\\/?:@&=+$,\\[\\]]|%[a-fA-F\\d]{2})*))?)";
    public static final String REGEXP_URI_REF = "(?:[a-zA-Z][\\-+.a-zA-Z\\d]*:(?:(?:\\/\\/(?:(?:(?:[\\-_.!~*'()a-zA-Z\\d;:&=+$,]|%[a-fA-F\\d]{2})*@)?(?:(?:[a-zA-Z0-9\\-.]|%[0-9a-fA-F][0-9a-fA-F])+|\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\[(?:(?:[a-fA-F\\d]{1,4}:)*(?:[a-fA-F\\d]{1,4}|\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|(?:(?:[a-fA-F\\d]{1,4}:)*[a-fA-F\\d]{1,4})?::(?:(?:[a-fA-F\\d]{1,4}:)*(?:[a-fA-F\\d]{1,4}|\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}))?)\\])(?::\\d*)?|(?:[\\-_.!~*'()a-zA-Z\\d$,;:@&=+]|%[a-fA-F\\d]{2})+)(?:\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*(?:\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*)*)?|\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*(?:\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*)*)(?:\\?(?:(?:[\\-_.!~*'()a-zA-Z\\d;\\/?:@&=+$,\\[\\]]|%[a-fA-F\\d]{2})*))?|(?:[\\-_.!~*'()a-zA-Z\\d;?:@&=+$,]|%[a-fA-F\\d]{2})(?:[\\-_.!~*'()a-zA-Z\\d;\\/?:@&=+$,\\[\\]]|%[a-fA-F\\d]{2})*)|(?:\\/\\/(?:(?:(?:[\\-_.!~*'()a-zA-Z\\d;:&=+$,]|%[a-fA-F\\d]{2})*@)?(?:(?:[a-zA-Z0-9\\-.]|%[0-9a-fA-F][0-9a-fA-F])+|\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\[(?:(?:[a-fA-F\\d]{1,4}:)*(?:[a-fA-F\\d]{1,4}|\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|(?:(?:[a-fA-F\\d]{1,4}:)*[a-fA-F\\d]{1,4})?::(?:(?:[a-fA-F\\d]{1,4}:)*(?:[a-fA-F\\d]{1,4}|\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}))?)\\])(?::\\d*)?|(?:[\\-_.!~*'()a-zA-Z\\d$,;:@&=+]|%[a-fA-F\\d]{2})+)(?:\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*(?:\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*)*)?|\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*(?:\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*)*|(?:[\\-_.!~*'()a-zA-Z\\d;@&=+$,]|%[a-fA-F\\d]{2})+(?:\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*(?:\\/(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*(?:;(?:[\\-_.!~*'()a-zA-Z\\d:@&=+$,]|%[a-fA-F\\d]{2})*)*)*)?)(?:\\?(?:[\\-_.!~*'()a-zA-Z\\d;\\/?:@&=+$,\\[\\]]|%[a-fA-F\\d]{2})*)?)?(?:#(?:[\\-_.!~*'()a-zA-Z\\d;\\/?:@&=+$,\\[\\]]|%[a-fA-F\\d]{2})*)?";
    public static final String REGEXP_TERM = "(" + REGEXP_ALPHA + "|" + REGEXP_DIGIT + ")(" + REGEXP_LOALPHA + "|" + REGEXP_DIGIT + "|-|_)*";

    public static final String REGEXP_SCHEME = REGEXP_URI + "#";
    public static final String REGEXP_TYPE_IDENTIFIER = REGEXP_SCHEME + REGEXP_TERM;
    public static final String REGEXP_CLASS = "\\b(?<!\\|)action(?!\\|)\\b|\\b(?<!\\|)mixin(?!\\|)\\b|\\b(?<!\\|)kind(?!\\|)\\b";
    public static final String REGEXP_TYPE_IDENTIFIER_LIST = REGEXP_TYPE_IDENTIFIER + "(\\s+" + REGEXP_TYPE_IDENTIFIER + ")*";
    public static final String REGEXP_ATTRIBUTE_COMPONENT = REGEXP_LOALPHA + "(" + REGEXP_LOALPHA + "|" + REGEXP_DIGIT + "|-|_)*";
    public static final String REGEXP_ATTRIBUTE_NAME = REGEXP_ATTRIBUTE_COMPONENT + "(\\." + REGEXP_ATTRIBUTE_COMPONENT + ")*";
    public static final String REGEXP_ATTRIBUTE_PROPERTIES = "\\{(?:required immutable|immutable required|required|immutable)\\}";
    public static final String REGEXP_ATTRIBUTE_DEF = "(?:" + REGEXP_ATTRIBUTE_NAME + ")(?:" + REGEXP_ATTRIBUTE_PROPERTIES + ")?";
    public static final String REGEXP_ATTRIBUTE_LIST = REGEXP_ATTRIBUTE_DEF + "(\\s+" + REGEXP_ATTRIBUTE_DEF + ")*";
    public static final String REGEXP_ATTRIBUTE_REPR = REGEXP_ATTRIBUTE_NAME + "=(\"" + REGEXP_QUOTED_STRING + "\"|" + REGEXP_NUMBER + "|" + REGEXP_BOOL + ");?";
    public static final String REGEXP_ACTION = REGEXP_TYPE_IDENTIFIER;
    public static final String REGEXP_ACTION_LIST = REGEXP_ACTION + "(\\s+" + REGEXP_ACTION + ")*";
    public static final String REGEXP_RESOURCE_TYPE = REGEXP_TYPE_IDENTIFIER + "(\\s+" + REGEXP_TYPE_IDENTIFIER + ")*";
    public static final String REGEXP_LINK_INSTANCE = REGEXP_URI_REF;
    public static final String REGEXP_LINK_TYPE = REGEXP_TYPE_IDENTIFIER + "(\\s+" + REGEXP_TYPE_IDENTIFIER + ")*";

    public static final String REGEXP_CATEGORY = "(?<" + GROUP_TERM + ">" + REGEXP_TERM + ")" // term (mandatory)
            + ";\\s*scheme=\"(?<" + GROUP_SCHEME + ">" + REGEXP_SCHEME + ")(?:" + REGEXP_TERM + ")?\"" // scheme (mandatory)
            + ";\\s*class=\"?(?<" + GROUP_CLASS + ">" + REGEXP_CLASS + ")\"?" // class (mandatory)
            + "(;\\s*title=\"(?<" + GROUP_TITLE + ">" + REGEXP_QUOTED_STRING + ")\")?" // title (optional)
            + "(;\\s*rel=\"(?<" + GROUP_REL + ">" + REGEXP_TYPE_IDENTIFIER_LIST + ")\")?" // rel (optional)
            + "(;\\s*location=\"(?<" + GROUP_LOCATION + ">" + REGEXP_URI_REF + ")\")?" // location (optional)
            + "(;\\s*attributes=\"(?<" + GROUP_ATTRIBUTES + ">" + REGEXP_ATTRIBUTE_LIST + ")\")?" // attributes (optional)
            + "(;\\s*actions=\"(?<" + GROUP_ACTIONS + ">" + REGEXP_ACTION_LIST + ")\")?" // actions (optional)
            + ";?"; // additional semicolon at the end (not specified, for interoperability)

    public static final String REGEXP_ATTRIBUTES = "(" + REGEXP_ATTRIBUTE_DEF + ")";

    public static final String REGEXP_LINK = "\\<(?<" + GROUP_URI + ">" + REGEXP_URI_REF + ")\\>" // uri (mandatory)
            + ";\\s*rel=\"(?<" + GROUP_REL + ">" + REGEXP_RESOURCE_TYPE + ")\"" // rel (mandatory)
            + "(;\\s*self=\"(?<" + GROUP_SELF + ">" + REGEXP_LINK_INSTANCE + ")\")?" // self (optional)
            + "(;\\s*category=\"(?<" + GROUP_CATEGORY + ">(;?\\s*(" + REGEXP_LINK_TYPE + "))+)\")?" // category (optional)
            + "(;\\s*(?<" + GROUP_ATTRIBUTES + ">(;?\\s*" + REGEXP_ATTRIBUTE_REPR + ")*))?" // attributes (optional)
            + ";?"; // additional semicolon at the end (not specified, for interoperability)

    public static final Pattern PATTERN_CATEGORY = Pattern.compile("Category: " + REGEXP_CATEGORY);
    public static final Pattern PATTERN_ATTRIBUTES = Pattern.compile(REGEXP_ATTRIBUTES);
    public static final Pattern PATTERN_LINK = Pattern.compile(REGEXP_LINK);
}

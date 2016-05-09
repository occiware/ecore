package org.occiware.clouddesigner.occi.simulation.design.services;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.util.OcciHelper;

public final class SimulationHelper {
	
	
	private SimulationHelper()
	{
	}
	
	public static final Set<String> attributesToOmit = new HashSet<String>();
	static {
		attributesToOmit.add("occi.core.id");
		attributesToOmit.add("occi.core.source");
		attributesToOmit.add("occi.core.target");
	};
	
	public static boolean schemeExists(Configuration configuration, String scheme){

		Extension extension = OcciHelper.loadExtension(scheme);
		ArrayList<String> schemas = new ArrayList<String>();

		for(Extension ex: configuration.getUse()){
			schemas.add(ex.getScheme());
		}
		return schemas.contains(extension.getScheme());

	}

	public static boolean isCompute(Resource resource){
		String scheme = resource.getKind().getScheme();
		String term = resource.getKind().getTerm();
		final Extension extension = OcciHelper.loadExtension(scheme);
		for(Kind kind: extension.getKinds()){
			if(kind.getTerm().equals(term)){
				Kind d = kind.getParent();
				while(d!=null && !d.getTerm().equals("compute")){
					d = d.getParent();
				}
				if(d !=null && d.getTerm().equals("compute"))
					return true;
			}
		}
		return false;
	}
	
	
	public static void copyEntity(Configuration configuration, Link source, Link target)
	{
		target.setId(source.getId());
		String sourceKindIdentifier = source.getId();
		org.occiware.clouddesigner.occi.Kind targetKind = searchKind(configuration, source.getKind());
		if(targetKind != null) {
			target.setKind(targetKind);
		} else {
			System.err.println("Kind " + sourceKindIdentifier + " unknown!");
		}
		List<org.occiware.clouddesigner.occi.Mixin> targetMixins = target.getMixins();
		for(Mixin mixin : source.getMixins()) {
			org.occiware.clouddesigner.occi.Mixin targetMixin = searchMixin(configuration, mixin);
			if(targetMixin != null) {
				targetMixins.add(targetMixin);
			} else {
				System.err.println("Mixin  unknown!");
			}
		}
	}


	public static void copyEntity(Configuration configuration, Resource source, Resource target)
	{
		target.setId(source.getId());
		org.occiware.clouddesigner.occi.Kind targetKind = searchKind(configuration, source.getKind());
		if(targetKind != null) {
			target.setKind(targetKind);
		} else {
			System.err.println("Kind  unknown!");
		}
		List<org.occiware.clouddesigner.occi.Mixin> targetMixins = target.getMixins();
		for(Mixin mixin : source.getMixins()) {
			org.occiware.clouddesigner.occi.Mixin targetMixin = searchMixin(configuration, mixin);
			if(targetMixin != null) {
				targetMixins.add(targetMixin);
			} else {
				System.err.println("Mixin unknown!");
			}
		}
		// Create all target entity's attributes.
		List<org.occiware.clouddesigner.occi.AttributeState> targetAttributes = target.getAttributes();
		for(AttributeState att: source.getAttributes()) {
			String attributeName = att.getName();
			if(!attributesToOmit.contains(attributeName)) {
				org.occiware.clouddesigner.occi.AttributeState targetAttribute = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE.createAttributeState();
				targetAttributes.add(targetAttribute);
				targetAttribute.setName(att.getName());
				targetAttribute.setValue(att.getValue());
			}
		}
	}

	private static org.occiware.clouddesigner.occi.Kind searchKind(org.occiware.clouddesigner.occi.Configuration configuration, Kind kind)
	{
		org.occiware.clouddesigner.occi.Extension extension = OcciHelper.loadExtension(kind.getScheme().toString());
		if(!schemeExists(configuration, kind.getScheme().toString())){
			configuration.getUse().add(extension);
		}
		String term = kind.getTerm();
		for(org.occiware.clouddesigner.occi.Kind k : extension.getKinds()) {
			if(term.equals(k.getTerm())) {
				return k;
			}
		}
		return null;
	}

	private static org.occiware.clouddesigner.occi.Mixin searchMixin(org.occiware.clouddesigner.occi.Configuration configuration, Mixin mixin)
	{
		String mixinSchemeWithoutSharp = schemeWithoutSharp(mixin.getScheme().toString());
		org.occiware.clouddesigner.occi.Extension extension = null;
		for(org.occiware.clouddesigner.occi.Extension ext : configuration.getUse()) {
			if(mixinSchemeWithoutSharp.startsWith(schemeWithoutSharp(ext.getScheme()))) {
				extension = ext;
				break;
			}
		}
		if(extension == null) {
			if(!schemeExists(configuration, mixin.getScheme().toString()) ){
				extension = OcciHelper.loadExtension(mixin.getScheme().toString());
				configuration.getUse().add(extension);
			}

		}

		String term = mixin.getTerm();
		for(org.occiware.clouddesigner.occi.Mixin m : extension.getMixins()) {
			if(term.equals(m.getTerm())) {
				return m;
			}
		}
		org.occiware.clouddesigner.occi.Mixin result = org.occiware.clouddesigner.occi.OCCIFactory.eINSTANCE.createMixin();
		result.setScheme(mixin.getScheme().toString());
		result.setTerm(mixin.getTerm());
		extension.getMixins().add(result);
		return result;
	}


	private static String schemeWithoutSharp(String scheme) {
		return scheme.substring(0, scheme.length()-2);
	}

}

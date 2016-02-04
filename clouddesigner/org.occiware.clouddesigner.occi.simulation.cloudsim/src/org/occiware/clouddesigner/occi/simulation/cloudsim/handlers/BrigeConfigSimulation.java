package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;

import java.util.ArrayList;
import java.util.List;

import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;


public class BrigeConfigSimulation extends Parser {
	private List<Object> entities;

	public BrigeConfigSimulation(Configuration conf){
		super(conf);
		entities = new ArrayList<Object>();
	}

	public List<Object> ExtaractEntities(){
		entities = this.parsing();
		return entities;
	}

	public boolean checkEntities(){
		boolean linked_dc=true, linked_host=true, linked_vm=true;
		
		for(Object obj: entities){
			if(obj instanceof Dc){
				Dc dc = (Dc) obj;
				if(dc.targetId.size() == 0){
					linked_dc = false;
				}
			}else if(obj instanceof Host){
				Host host = (Host) obj;
				if(host.idTarget.size() == 0){
					linked_host = false;
				}
					
			}else if(obj instanceof VM){
				VM vm = (VM) obj;
				if(vm.idTarget.size() == 0){
					linked_vm = false;
				}
			}
		}
		if(!linked_dc)
			System.err.println("No host in datacenter");
		if(!linked_host)
			System.err.println("No VM in host");
		if(!linked_vm)
			System.err.println("No cloudlet in VM");
		if(!linked_dc || !linked_host || !linked_vm)
			return false;
		
		return true;
	}

}

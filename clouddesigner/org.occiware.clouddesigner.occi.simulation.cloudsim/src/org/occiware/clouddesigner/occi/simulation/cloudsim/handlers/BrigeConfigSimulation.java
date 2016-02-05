package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.occiware.clouddesigner.occi.Configuration;



public class BrigeConfigSimulation extends Parser {
	private Map<Entity, Set<Entity>> entities;

	public BrigeConfigSimulation(Configuration conf){
		super(conf);
		entities = new HashMap<Entity, Set<Entity>>();
	}

	public Map<Entity, Set<Entity>> ExtaractEntities(){
		entities = this.parsing();
		return entities;
	}
	
	public Map<Entity, Set<Entity>> getEntities(){
		return entities;
	}

	public boolean checkEntities(){
		boolean linked_dc=true, linked_host=true, linked_vm=true;

		for(Entity obj: entities.keySet()){
			if(isDC(obj)){
				Dc_Config dc = (Dc_Config) obj;
				if(dc.targetId.size() == 0){
					linked_dc = false;
				}
			}else if(isHost(obj)){
				Host_Config host = (Host_Config) obj;
				if(host.idTarget.size() == 0){
					linked_host = false;
				}

			}else if(isVM(obj)){
				VM_Config vm = (VM_Config) obj;
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

package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;

import java.util.ArrayList;
import java.util.List;

import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.simulation.cloudsim.VmScheduler;
import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.BwProvisioner;
import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.RamProvisioner;

/**
 * 
 * @author mehdi
 *
 */


public class Parser {

	Configuration configuration;

	public Parser(Configuration conf){
		this.configuration = conf;
	}

	public void parsing(){
		System.out.println("start parsing ...");

		for(Resource resource : configuration.getResources()) {
			Kind resourceKind = resource.getKind();
			if(resourceKind.getScheme().contains("simulation")){
				if(resourceKind.getTerm().contains("datacenter")){ //datacenterKind
					Dc dc = DcFromResource(resource);
				}else if(resourceKind.getTerm().contains("host")){//hostKind
					Host host = HostFromResource(resource);
				}else if(resourceKind.getTerm().contains("VM")){//VMKind
					VM vm = VMFromResource(resource);
				}else if(resourceKind.getTerm().contains("cloudlet")){ //cloudletKind
					Cloudlet cloudlet = CloudletFromResource(resource);
				}else{ 

				}
			}else{//Otherwise, the resources are tagued
				for(Mixin mixin : resource.getMixins()) {
					if(mixin.getScheme().contains("simulation")){
						if(mixin.getTerm().contains("datacenter")){
							Dc dc = DcFromResource(resource);
							System.out.println(dc);
						}else if(mixin.getTerm().contains("host")){
							Host host = HostFromResource(resource);
							System.out.println(host);
						}else if (mixin.getTerm().contains("VM")){
							VM vm = VMFromResource(resource);
							System.out.println(vm);
						}else if (mixin.getTerm().contains("cloudlet")){
							Cloudlet cloudlet = CloudletFromResource(resource);
							System.out.println(cloudlet);
						}
					}
				}

			}

		}
	}

	/*********************************************************************************/
	/****************  Fill the attributes of each entity **************************/
	/*********************************************************************************/
	/*********************************************************************************/

	private Cloudlet CloudletFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();
		int cloudletId=0,pesNumber=0;
		long cloudletLength=0, cloudletFileSize=0, cloudletOutputSize=0;
		String utilizationModelCpu="", utilizationModelRam="", utilizationModelBw="";

		for(AttributeState as : resource.getAttributes()) {
			if(as.getName().equals("cloudletId")) cloudletId = Integer.parseInt(as.getValue());
			else if (as.getName().contains("core")) pesNumber = Integer.parseInt(as.getValue());
			else if (as.getName().equals("cloudletLength")) cloudletLength = Long.parseLong(as.getValue());
			else if (as.getName().equals("cloudletFileSize")) cloudletFileSize = Long.parseLong(as.getValue());
			else if (as.getName().equals("cloudletOutputSize")) cloudletOutputSize = Long.parseLong(as.getValue());
			else if (as.getName().equals("utilizationModelCpu")) utilizationModelCpu = as.getValue();
			else if (as.getName().equals("utilizationModelRam")) utilizationModelRam = as.getValue();
			else if (as.getName().equals("utilizationModelBw")) utilizationModelBw = as.getValue();
		}
		//resource linked to host
		for(Link link : resource.getLinks()) {
			idTarget.add(link.getTarget().getId());
		}

		return new Cloudlet(id, idTarget, cloudletId, pesNumber, cloudletLength, cloudletFileSize,
				cloudletOutputSize, utilizationModelCpu, utilizationModelRam,
				utilizationModelBw);
	}

	private VM VMFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();
		int id_vm=0, userId=0, numberOfPes=0, ram=0;
		double mips=0;
		long bw=0, size=0;
		String vmm="";
		String cloudletScheduler="";

		for(AttributeState as : resource.getAttributes()) {
			if(as.getName().equals("id_vm")) id_vm = Integer.parseInt(as.getValue());
			else if (as.getName().contains("speed")) mips = Double.parseDouble(as.getValue());//mips ?
			else if (as.getName().contains("core")) numberOfPes = Integer.parseInt(as.getValue());//numberOfPes ?
			else if (as.getName().contains("memory")) ram = Integer.parseInt(as.getValue());//ram ?
			else if (as.getName().equals("userId")) userId = Integer.parseInt(as.getValue());
			else if (as.getName().equals("bw")) bw = Long.parseLong(as.getValue());
			else if (as.getName().equals("size")) size = Long.parseLong(as.getValue());
			else if (as.getName().equals("vmm")) vmm = as.getValue();
			else if (as.getName().equals("cloudletScheduler")) cloudletScheduler = as.getValue();
		}
		//resource linked to host
		for(Link link : resource.getLinks()) {
			idTarget.add(link.getTarget().getId());
		}

		return new VM(id, idTarget, id_vm, userId, numberOfPes, ram, mips,
				bw, size, vmm, cloudletScheduler) ;
	}	

	private Host HostFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();
		int id_host=0, mips=0, core=0;
		String ramProvisioner="", bwProvisioner="", vmScheduler="";
		long storage=0;

		for(AttributeState as : resource.getAttributes()) {
			if(as.getName().equals("id_host")) id_host = Integer.parseInt(as.getValue());
			else if (as.getName().contains("speed")) mips = Integer.parseInt(as.getValue());//mips ?
			else if (as.getName().contains("core")) core = Integer.parseInt(as.getValue());
			else if (as.getName().contains("storage")) storage = Long.parseLong(as.getValue());
			else if (as.getName().contains("ramProvisioner")) ramProvisioner = as.getValue();
			else if (as.getName().contains("bwProvisioner")) bwProvisioner = as.getValue();
			else if (as.getName().contains("vmScheduler")) vmScheduler = as.getValue();
		}
		//resource linked to host
		for(Link link : resource.getLinks()) {
			idTarget.add(link.getTarget().getId());
		}

		return new Host(id, idTarget, id_host, mips, core, ramProvisioner,
				bwProvisioner, vmScheduler, storage);

	}


	private Dc DcFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();

		String architecture = "", os="", vmm="", name="";
		double schedulingInterval= 0, timeZone=0, costPerSec=0, costPerMem=0, costPerStorage=0, costPerBw=0;
		for(AttributeState as : resource.getAttributes()) {
			if(as.getName().contains("architecture")) architecture = as.getValue();
			else if(as.getName().equals("os")) os = as.getValue();
			else if(as.getName().equals("vmm")) vmm = as.getValue();
			else if(as.getName().equals("time_zone")) timeZone = Double.parseDouble(as.getValue());
			else if(as.getName().equals("cost")) costPerSec = Double.parseDouble(as.getValue());
			else if(as.getName().equals("costPerMem")) costPerMem = Double.parseDouble(as.getValue());
			else if(as.getName().equals("costPerStorage")) costPerStorage = Double.parseDouble(as.getValue());
			else if(as.getName().equals("costPerBw")) costPerBw = Double.parseDouble(as.getValue());
			else if(as.getName().equals("name")) name = as.getValue();
			else if(as.getName().equals("schedulingInterval")) schedulingInterval = Double.parseDouble(as.getValue());

		}
		//resource linked to datacenter
		for(Link link : resource.getLinks()) {
			idTarget.add(link.getTarget().getId());
		}
		//create datacenter
		return new Dc(id, idTarget, name, architecture, os, vmm, timeZone, costPerSec, costPerMem, 
				costPerStorage, costPerBw, schedulingInterval);

	}

	/*********************************************************************************/
	/******************************  PRIVATE CLASSES *********************************/
	/*********************************************************************************/
	/*********************************************************************************/
	private class Cloudlet {
		String id; //ressourceId
		List<String> idTarget;
		int cloudletId,pesNumber;
		long cloudletLength, cloudletFileSize, cloudletOutputSize;
		String utilizationModelCpu, utilizationModelRam,utilizationModelBw;

		public Cloudlet(String id, List<String> idTarget, int cloudletId, int pesNumber, long cloudletLength, long cloudletFileSize,
				long cloudletOutputSize, String utilizationModelCpu, String utilizationModelRam,
				String utilizationModelBw) {
			this.id = id;
			this.idTarget = idTarget;
			this.cloudletId = cloudletId;
			this.pesNumber = pesNumber;
			this.cloudletLength = cloudletLength;
			this.cloudletFileSize = cloudletFileSize;
			this.cloudletOutputSize = cloudletOutputSize;
			this.utilizationModelCpu = utilizationModelCpu;
			this.utilizationModelRam = utilizationModelRam;
			this.utilizationModelBw = utilizationModelBw;
		}
		@Override
		public String toString() {
			return "Cloudlet [cloudletId=" + cloudletId + ", pesNumber=" + pesNumber + ", cloudletLength="
					+ cloudletLength + ", cloudletFileSize=" + cloudletFileSize + ", cloudletOutputSize="
					+ cloudletOutputSize + ", utilizationModelCpu=" + utilizationModelCpu + ", utilizationModelRam="
					+ utilizationModelRam + ", utilizationModelBw=" + utilizationModelBw + "]";
		}


	}

	private class VM {
		String id; //ressourceId
		List<String> idTarget;
		int id_vm, userId, numberOfPes, ram;
		double mips;
		long bw, size;
		String vmm;
		String cloudletScheduler;

		public VM(String id, List<String> idTarget, int id_vm, int userId, int numberOfPes, int ram, double mips,
				long bw, long size, String vmm, String cloudletScheduler) {
			this.id = id;
			this.idTarget = idTarget;
			this.id_vm = id_vm;
			this.userId = userId;
			this.numberOfPes = numberOfPes;
			this.ram = ram;
			this.mips = mips;
			this.bw = bw;
			this.size = size;
			this.vmm = vmm;
			this.cloudletScheduler = cloudletScheduler;
		}

		@Override
		public String toString() {
			return "VM [id=" + id + ", idTarget=" + idTarget + ", id_vm=" + id_vm + ", userId=" + userId
					+ ", numberOfPes=" + numberOfPes + ", ram=" + ram + ", mips=" + mips + ", bw=" + bw + ", size="
					+ size + ", vmm=" + vmm + ", cloudletScheduler=" + cloudletScheduler + "]";
		}
	}


	private class Host {
		String id; //ressourceId
		List<String> idTarget;
		int id_host, mips, core;
		String ramProvisioner, bwProvisioner, vmScheduler;
		long storage;
		public Host(String id, List<String> idTarget, int id_host, int mips, int core, String ramProvisioner,
				String bwProvisioner, String vmScheduler, long storage) {
			this.id = id;
			this.idTarget = idTarget;
			this.id_host = id_host;
			this.mips = mips;
			this.core = core;
			this.ramProvisioner = ramProvisioner;
			this.bwProvisioner = bwProvisioner;
			this.vmScheduler = vmScheduler;
			this.storage = storage;
		}
		@Override
		public String toString() {
			return "Host [id=" + id + ", idTarget=" + idTarget + ", id_host=" + id_host + ", mips=" + mips + ", core="
					+ core + ", ramProvisioner=" + ramProvisioner + ", bwProvisioner=" + bwProvisioner
					+ ", vmScheduler=" + vmScheduler + ", storage=" + storage + "]";
		}


	}

	private class Dc {
		String id;
		List<String> targetId; //list of hosts
		String vmm, os, name;
		double schedulingInterval;
		double time_zone, costPerSec, costPerMem, costPerStorage, costPerBw;

		public Dc(String id, List<String> targetId, String name,
				String architecture, String os, String vmm, double time_zone, 
				double costPerSec, double costPerMem, double costPerStorage, double costPerBw, double schedulingInterval){
			this.id = id;
			this.targetId = targetId;
			this.vmm = vmm;
			this.os = os;
			this.name = name;
			this.schedulingInterval = schedulingInterval;
			this.costPerSec = costPerSec;
			this.costPerMem = costPerMem;
			this.costPerStorage = costPerStorage;
			this.costPerBw = costPerBw;
			this.time_zone = time_zone;	
		}

		@Override
		public String toString() {
			return "Dc [id=" + id + ", targetId=" + targetId + ", vmm=" + vmm + ", os=" + os + ", name=" + name
					+ ", schedulingInterval=" + schedulingInterval + ", time_zone=" + time_zone + ", costPerSec="
					+ costPerSec + ", costPerMem=" + costPerMem + ", costPerStorage=" + costPerStorage + ", costPerBw="
					+ costPerBw + "]";
		}
	}


}

package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.lang.reflect.Constructor;
import java.text.DecimalFormat;
import org.occiware.clouddesigner.occi.simulation.cloudsim.Cloudlet;
import org.occiware.clouddesigner.occi.simulation.cloudsim.CloudletScheduler;
import org.occiware.clouddesigner.occi.simulation.cloudsim.Datacenter;
import org.occiware.clouddesigner.occi.simulation.cloudsim.DatacenterBroker;
import org.occiware.clouddesigner.occi.simulation.cloudsim.DatacenterBrokerOcci;
import org.occiware.clouddesigner.occi.simulation.cloudsim.DatacenterCharacteristics;
import org.occiware.clouddesigner.occi.simulation.cloudsim.Host;
import org.occiware.clouddesigner.occi.simulation.cloudsim.Log;
import org.occiware.clouddesigner.occi.simulation.cloudsim.Pe;
import org.occiware.clouddesigner.occi.simulation.cloudsim.Vm;
import org.occiware.clouddesigner.occi.simulation.cloudsim.VmAllocationPolicyOcci;
import org.occiware.clouddesigner.occi.simulation.cloudsim.VmScheduler;
import org.occiware.clouddesigner.occi.simulation.cloudsim.core.CloudSim;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Cloudlet_Config;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Dc_Config;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Entity;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Host_Config;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.VM_Config;
import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.BwProvisioner;
import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.PeProvisioner;
import org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners.RamProvisioner;
import org.occiware.clouddesigner.occi.simulation.cloudsim.Storage;
import org.occiware.clouddesigner.occi.simulation.cloudsim.UtilizationModel;

public class Simulation {

	public static List<Cloudlet> cloudletList;
	public static List<Vm> vmlist;
	Map<Entity, Set<Entity>> entities;

	public Simulation(Map<Entity, Set<Entity>> entities){
		this.entities = entities;
	}

	public void runExtension(){
		
		//store the cloudletID for each VM. Map VmID to a set of cloudletID
		Map<Integer, Set<Integer>> idVmToIdcloudLet = new HashMap<Integer, Set<Integer>>();

		int num_user = 1; // number of cloud users
		Calendar calendar = Calendar.getInstance();
		boolean trace_flag = false; // mean trace events
		int brokerId=0;

		// Initialize the CloudSim library
		CloudSim.init(num_user, calendar, trace_flag);
		DatacenterBroker broker = null;

		cloudletList = null;
		vmlist = null;
		int vmid = 0, cloudLetId = 0;
		int nameBroker = 1, nbrDatacenter = this.getDcList().size();
		List<DatacenterBroker> listBroker = new ArrayList<DatacenterBroker>();

		Iterator<Entity> it = entities.keySet().iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if (obj instanceof Dc_Config) {
				Datacenter dc = createDatacenter((Dc_Config)obj);
				
				List<Host> listHost = dc.getHostList();

				//broker for each user 
				if (num_user != 0) {
					idVmToIdcloudLet = new HashMap<Integer, Set<Integer>>();
					cloudletList = new ArrayList<Cloudlet>();
					vmlist = new ArrayList<Vm>();
					broker = createBroker(nameBroker);
					brokerId = broker.getId();
					nameBroker++;
				}

				Set<Entity> hostlinkedToDatacenter = entities.get(obj);
				Iterator<Entity> itHost = hostlinkedToDatacenter.iterator();
				while (itHost.hasNext()) {
					Host_Config host_config = (Host_Config) itHost.next();
					Host host = getHostFromList(listHost, host_config);

					Set<Entity> vmLinkedToHost = entities.get(host_config);
					Iterator<Entity> itVM = vmLinkedToHost.iterator();
					while (itVM.hasNext()) {
						Entity isVm = itVM.next();
						createVm((VM_Config)isVm, brokerId, host,vmid);
						idVmToIdcloudLet.put(vmid, new HashSet<Integer>());
						Set<Entity> cloudletLinkedToVm = entities.get(isVm);
						Iterator<Entity> itCloudlet = cloudletLinkedToVm.iterator();
						while (itCloudlet.hasNext()) {
							Entity isCloudLet = itCloudlet.next();
							createCloudLet((Cloudlet_Config)isCloudLet, brokerId, cloudLetId);
							idVmToIdcloudLet.get(vmid).add(cloudLetId);
							cloudLetId++;
						}
						vmid++;
					}
				}
				nbrDatacenter--;
				num_user--;
				
				if ((num_user == 0 && nbrDatacenter == 0) || num_user != 0) {
					broker.submitVmList(vmlist);
					broker.submitCloudletList(cloudletList);
					for (Entry<Integer, Set<Integer>> entry : idVmToIdcloudLet.entrySet()) {
						Integer idVm = entry.getKey();
						Set<Integer> idCloudLet = entry.getValue();
						for (int idc : idCloudLet) {
							broker.bindCloudletToVm(idc, idVm);
						}
					}
					listBroker.add(broker);
				}
				
			}
		}
		
		CloudSim.startSimulation();

		Set<List<Cloudlet>> resultList = new HashSet<List<Cloudlet>>();
		for (DatacenterBroker dcBr : listBroker) {
			List<Cloudlet> newList = dcBr.getCloudletReceivedList();
			resultList.add(newList);
		}

		CloudSim.stopSimulation();

		for (List<Cloudlet> newList : resultList) {
			printCloudletList(newList);
		}

		Log.printLine("Simulation finished!");
	}


	/*********************************************/
	/************ CREATE ENTITIES ****************/
	/*********************************************/
	public Datacenter createDatacenter(Dc_Config dc){
		List<Host> hostList = new ArrayList<Host>();
		List<Pe> peList = new ArrayList<Pe>();
		Set<Entity> linkedToDataCenter = entities.get(dc);
		Iterator<Entity> itForDataCenter = linkedToDataCenter.iterator();
		while (itForDataCenter.hasNext()) {
			Host_Config host = (Host_Config)itForDataCenter.next();
			int hostId = host.id_host, ram = host.ram, numPe = host.core; 
			long storage = host.storage, bw = host.bw ; 
			double mips = host.mips ;
			String peProvisioner = host.peProvisioner;
			String ramProvisioner = host.ramProvisioner;
			String bwProvisioner = host.bwProvisioner;
			String vmScheduler = host.vmScheduler;
			
			try {
				Class<?> classPeProvi = Class.forName("org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners."+peProvisioner);
				Constructor<?> consPeProvi = classPeProvi.getConstructor(Double.class);
				Object peProvis = consPeProvi.newInstance(mips);
				for (int p = 0; p < numPe; p++)
					peList.add(new Pe(0, (PeProvisioner) peProvis));

				Class<?> classRamProvi = Class.forName("org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners."+ramProvisioner);
				Constructor<?> consRamProvi = classRamProvi.getConstructor(Integer.class);
				Object ramProvis = consRamProvi.newInstance(ram);

				Class<?> classBwProvi = Class.forName("org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners."+bwProvisioner);
				Constructor<?> consBwProvi = classBwProvi.getConstructor(Long.class);
				Object bwProvis = consBwProvi.newInstance(bw);

				Class<?> classVmSched = Class.forName("org.occiware.clouddesigner.occi.simulation.cloudsim."+vmScheduler);
				Constructor<?> consVmSched = classVmSched.getConstructor(List.class);
				Object vmSched = consVmSched.newInstance(peList);

				Host h = new Host(hostId, (RamProvisioner) ramProvis, (BwProvisioner)bwProvis, 
						storage, peList, (VmScheduler) vmSched);
				
				hostList.add(h);
			} catch (Exception e) {
				System.err.println("Exception in createDatacenter");
				e.printStackTrace();
			}
		}

		String arch = dc.architecture, os = dc.os, vmm = dc.vmm;
		double time_zone = dc.time_zone, cost = dc.costPerSec, costPerMem = dc.costPerMem, 
				costPerStorage = dc.costPerStorage, costPerBw = dc.costPerBw;
		LinkedList<Storage> storageList = new LinkedList<Storage>();
		DatacenterCharacteristics characteristics = new DatacenterCharacteristics(arch, os, vmm, hostList, time_zone,
				cost, costPerMem, costPerStorage, costPerBw);

		Datacenter datacenter = null;
		try {
			datacenter = new Datacenter(dc.name, characteristics, new VmAllocationPolicyOcci(hostList),
					storageList, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return datacenter;
	}


	public static DatacenterBroker createBroker(int id) {
		DatacenterBroker broker = null;
		try {
			broker = new DatacenterBrokerOcci("Broker" + id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return broker;
	}


	public static void createVm(VM_Config vmResource, int brokerId, Host host, int vmid) {

		double mips = vmResource.mips; 
		int pesNumber = vmResource.numberOfPes, ram = vmResource.ram;
		long size = vmResource.size, bw = vmResource.bw;
		String vmm = vmResource.vmm, cloudletSchedul = vmResource.cloudletScheduler;

		try {
			Class<?> classCloudletSchedul = Class.forName("org.occiware.clouddesigner.occi.simulation.cloudsim."+cloudletSchedul);
			Constructor<?> consCloudletSchedul = classCloudletSchedul.getConstructor();
			Object cloudletSchedulObject = consCloudletSchedul.newInstance();

			// TODO: retreive Scheduler from Mixin
			Vm vm = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm, (CloudletScheduler) cloudletSchedulObject);

			//host.vmCreate(vm);
			vm.setHost(host);

			vmlist.add(vm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createCloudLet(Cloudlet_Config cloudLet, int brokerId, int id) {

		int pesNumber = cloudLet.pesNumber;
		long length = cloudLet.cloudletLength, fileSize = cloudLet.cloudletFileSize, outputSize = cloudLet.cloudletOutputSize;
		String utilizationModelBw = cloudLet.utilizationModelBw;
		String utilizationModelCpu = cloudLet.utilizationModelCpu;
		String utilizationModelRam = cloudLet.utilizationModelRam;

		try {
			Class<?> classModelCPU = Class.forName("org.occiware.clouddesigner.occi.simulation.cloudsim."+utilizationModelCpu);
			Constructor<?> consModelCPU = classModelCPU.getConstructor();
			Object modelCPUObject = consModelCPU.newInstance();

			Class<?> classModelRam = Class.forName("org.occiware.clouddesigner.occi.simulation.cloudsim."+utilizationModelRam);
			Constructor<?> consModelRam = classModelRam.getConstructor();
			Object modelRamObject = consModelRam.newInstance();

			Class<?> classModelBw = Class.forName("org.occiware.clouddesigner.occi.simulation.cloudsim."+utilizationModelBw);
			Constructor<?> consModelBw = classModelBw.getConstructor();
			Object modelBwObject = consModelBw.newInstance();

			// TODO: mixin for utilizationModel

			Cloudlet cloudlet = new Cloudlet(id, length, pesNumber, fileSize, outputSize, (UtilizationModel) modelCPUObject,
					(UtilizationModel) modelRamObject, (UtilizationModel) modelBwObject);

			cloudlet.setUserId(brokerId);
			cloudletList.add(cloudlet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*******************************************/
	/*************** PRINT RESULT **************/
	/*******************************************/
	private static void printCloudletList(List<Cloudlet> list) {
		int size = list.size();
		Cloudlet cloudlet;

		String indent = "    ";
		Log.printLine();
		Log.printLine("========== OUTPUT ==========");
		Log.printLine("Cloudlet ID" + indent + "STATUS" + indent + "Data center ID" + indent + "VM ID" + indent + "Time"
				+ indent + "Start Time" + indent + "Finish Time");

		DecimalFormat dft = new DecimalFormat("###.##");
		for (int i = 0; i < size; i++) {
			cloudlet = list.get(i);
			Log.print(indent + cloudlet.getCloudletId() + indent + indent);

			if (cloudlet.getCloudletStatus() == Cloudlet.SUCCESS) {
				Log.print("SUCCESS");

				Log.printLine(indent + indent + cloudlet.getResourceId() + indent + indent + indent + cloudlet.getVmId()
				+ indent + indent + dft.format(cloudlet.getActualCPUTime()) + indent + indent
				+ dft.format(cloudlet.getExecStartTime()) + indent + indent
				+ dft.format(cloudlet.getFinishTime()));
			}
		}
	}

	/************************************/
	/************ PRIVATE METHOD*********/
	/**********************************/

	private List<Dc_Config> getDcList(){
		List<Dc_Config> l = new ArrayList<Dc_Config>();
		for(Entity obj: entities.keySet()){
			if(obj instanceof Dc_Config){
				Dc_Config dc = (Dc_Config) obj;
				l.add(dc);
			}
		}
		return l;
	}

	private Host getHostFromList(List<Host> list, Host_Config hc){

		for(Host h : list){
			if(h.getId()==hc.id_host)
				return h;
		}
		return null;

	}

}

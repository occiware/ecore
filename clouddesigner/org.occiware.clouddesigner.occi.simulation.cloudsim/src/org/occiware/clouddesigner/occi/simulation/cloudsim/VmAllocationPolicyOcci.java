package org.occiware.clouddesigner.occi.simulation.cloudsim;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.occiware.clouddesigner.occi.simulation.cloudsim.core.CloudSim;

public class VmAllocationPolicyOcci extends VmAllocationPolicy{
	
	private Map<String, Host> vmTable;
	
	public VmAllocationPolicyOcci(List<? extends Host> list) {
		super(list);
		setVmTable(new HashMap<String, Host>());
	}

	@Override
	public boolean allocateHostForVm(Vm vm) {
		System.err.println("VM "+vm.getId()+" is not binding with any Host");
		return false;
	}

	@Override
	public boolean allocateHostForVm(Vm vm, Host host) {
		if (host.vmCreate(vm)) { // if vm has been succesfully created in the host
			getVmTable().put(vm.getUid(), host);

			Log.formatLine("%.2f: VM #" + vm.getId() + " has been allocated to the host #" + host.getId(),
					CloudSim.clock());
			return true;
		}

		return false;
	}

	@Override
	public List<Map<String, Object>> optimizeAllocation(List<? extends Vm> vmList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deallocateHostForVm(Vm vm) {
		Host host = getVmTable().remove(vm.getUid());

		if (host != null) {
			host.vmDestroy(vm);
		}
		
	}

	@Override
	public Host getHost(Vm vm) {
		return getVmTable().get(vm.getUid());
	}

	@Override
	public Host getHost(int vmId, int userId) {
		return getVmTable().get(Vm.getUid(userId, vmId));
	}
	
	
	public Map<String, Host> getVmTable() {
		return vmTable;
	}
	protected void setVmTable(Map<String, Host> vmTable) {
		this.vmTable = vmTable;
	}

}

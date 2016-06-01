/*
 * Title:        CloudSim Toolkit
 * Description:  CloudSim (Cloud Simulation) Toolkit for Modeling and Simulation of Clouds
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2009-2012, The University of Melbourne, Australia
 */

package org.occiware.clouddesigner.occi.simulation.cloudsim.provisioners;

import java.util.HashMap;
import java.util.Map;

import org.occiware.clouddesigner.occi.simulation.cloudsim.Vm;

/**
 * RamProvisionerSimple is an extension of RamProvisioner which uses a best-effort policy to
 * allocate memory to a VM.
 * 
 * @author Rodrigo N. Calheiros
 * @author Anton Beloglazov
 * @since CloudSim Toolkit 1.0
 */
public class RamProvisionerSimple extends RamProvisioner {

	/** The RAM table. */
	private Map<String, Integer> ramTable;
	
	private Map<Integer, Integer> ramConsumed;
	/**
	 * Instantiates a new ram provisioner simple.
	 * 
	 * @param availableRam the available ram
	 */
	public RamProvisionerSimple(Integer availableRam) {
		super(availableRam);
		ramConsumed = new HashMap<Integer, Integer>();
		setRamTable(new HashMap<String, Integer>());
	}

	/*
	 * (non-Javadoc)
	 * @see cloudsim.provisioners.RamProvisioner#allocateRamForVm(cloudsim.Vm, int)
	 */
	@Override
	public boolean allocateRamForVm(Vm vm, int ram) {
		ramConsumed.put(vm.getId(), ram);
		int maxRam = vm.getRam();

		if (ram >= maxRam) {
			ram = maxRam;
		}

		deallocateRamForVm(vm);

		if (getAvailableRam() >= ram) {
			setAvailableRam(getAvailableRam() - ram);
			getRamTable().put(vm.getUid(), ram);
			vm.setCurrentAllocatedRam(getAllocatedRamForVm(vm));
			return true;
		}

		vm.setCurrentAllocatedRam(getAllocatedRamForVm(vm));

		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see cloudsim.provisioners.RamProvisioner#getAllocatedRamForVm(cloudsim.Vm)
	 */
	@Override
	public int getAllocatedRamForVm(Vm vm) {
		if (getRamTable().containsKey(vm.getUid())) {
			return getRamTable().get(vm.getUid());
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see cloudsim.provisioners.RamProvisioner#deallocateRamForVm(cloudsim.Vm)
	 */
	@Override
	public void deallocateRamForVm(Vm vm) {
		if (getRamTable().containsKey(vm.getUid())) {
			int amountFreed = getRamTable().remove(vm.getUid());
			setAvailableRam(getAvailableRam() + amountFreed);
			vm.setCurrentAllocatedRam(0);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see cloudsim.provisioners.RamProvisioner#deallocateRamForVm(cloudsim.Vm)
	 */
	@Override
	public void deallocateRamForAllVms() {
		super.deallocateRamForAllVms();
		getRamTable().clear();
	}

	/*
	 * (non-Javadoc)
	 * @see cloudsim.provisioners.RamProvisioner#isSuitableForVm(cloudsim.Vm, int)
	 */
	@Override
	public boolean isSuitableForVm(Vm vm, int ram) {
		int allocatedRam = getAllocatedRamForVm(vm);
		boolean result = allocateRamForVm(vm, ram);
		deallocateRamForVm(vm);
		if (allocatedRam > 0) {
			allocateRamForVm(vm, allocatedRam);
		}
		return result;
	}

	/**
	 * Gets the ram table.
	 * 
	 * @return the ram table
	 */
	protected Map<String, Integer> getRamTable() {
		return ramTable;
	}

	/**
	 * Sets the ram table.
	 * 
	 * @param ramTable the ram table
	 */
	protected void setRamTable(Map<String, Integer> ramTable) {
		this.ramTable = ramTable;
	}
	
	public Map<Integer, Integer> getramConsumed(){
		return ramConsumed;
	}

}

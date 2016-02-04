package org.occiware.clouddesigner.occi.simulation.cloudsim;


import org.occiware.clouddesigner.occi.simulation.cloudsim.core.CloudSim;
import org.occiware.clouddesigner.occi.simulation.cloudsim.core.CloudSimTags;
import org.occiware.clouddesigner.occi.simulation.cloudsim.core.SimEvent;

public class DatacenterBrokerOcci extends DatacenterBroker {

	public DatacenterBrokerOcci(String name) throws Exception {
		super(name);
	}

	@Override
	protected void processResourceCharacteristics(SimEvent ev) {
		DatacenterCharacteristics characteristics = (DatacenterCharacteristics) ev.getData();
		getDatacenterCharacteristicsList().put(characteristics.getId(), characteristics);

		if (getDatacenterCharacteristicsList().size() == getDatacenterIdsList().size()) {
			bindVmDataCenter();
		}
	}
	

	protected void bindVmDataCenter() {
		int numberOfVmsAllocated = 0;

		for (Vm vm : getVmList()) {
			int datacenterId = vm.getHost().getDatacenter().getId();
			String datacenterName = CloudSim.getEntityName(datacenterId);

			if (!getVmsToDatacentersMap().containsKey(vm.getId())) {
				Log.printLine(CloudSim.clock() + ": " + getName() + ": Trying to Create VM #" + vm.getId() + " in "
						+ datacenterName);
				sendNow(datacenterId, CloudSimTags.VM_CREATE_ACK, vm);
				numberOfVmsAllocated++;
			}
		}

		setVmsRequested(numberOfVmsAllocated);
		setVmsAcks(0);
	}
}

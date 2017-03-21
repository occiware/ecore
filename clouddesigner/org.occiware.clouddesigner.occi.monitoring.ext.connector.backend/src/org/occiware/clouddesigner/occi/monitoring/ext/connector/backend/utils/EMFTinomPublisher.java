package org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.CPUPercentMetric;
import org.occiware.clouddesigner.occi.monitoring.ext.connector.backend.utils.metric.SSHMetric;
import org.occiware.tinom.model.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import monitoringext.Sensorext;

/**
 * Publisher that update entity EMF and its sensor attributes. On v2 this will be mixin attributes that will be updated.
 * @author Christophe Gourdin - Inria.
 *
 */
public class EMFTinomPublisher extends Publisher {

	private static Logger LOGGER = LoggerFactory.getLogger(EMFTinomPublisher.class);
	
	private Sensorext sensorExt;
	private TransactionalEditingDomain domain;
	
	public EMFTinomPublisher(String name, Sensorext sensorExt) {
		super(name);
		this.sensorExt = sensorExt;
		domain = TransactionUtil.getEditingDomain(sensorExt.eResource().getResourceSet());
		System.out.println("Publisher EMF constructor called.");
	}

	@Override
	public void run() {
		System.out.println("Publisher run method call.");
		// Render on entity attributes directly.
		String inputNames[] = getInputNames();
		int cpu = 0;
		int ram = 0;
		float loadavg = 0.0f;
		Float tmp;
		for(String inputName : inputNames) {
			System.out.println("Channel key : " + inputName);
			try {
				String value = get(inputName);
				System.out.println("Value from get method from EMFTinomPublisher : " + value);
				
				// Update corresponding on emf objects.
				if (value != null) {
					if (inputName.endsWith(CPUPercentMetric.METRIC_CPU_PERCENT)) {
						System.out.println("Metric type : " + CPUPercentMetric.METRIC_CPU_PERCENT);
						try {
							tmp = Float.parseFloat(value);
							cpu = tmp.intValue();
						} catch (NumberFormatException ex) {
							LOGGER.error("Error while converting value string to float or to integer: " + value + " ==> " + ex.getMessage());
						}	
					}
					if (inputName.endsWith(SSHMetric.METRIC_LOAD_AVG)) {
						System.out.println("Metric type : " + CPUPercentMetric.METRIC_LOAD_AVG);
						try {
							loadavg = Float.parseFloat(value);
						} catch (NumberFormatException ex) {
							LOGGER.error("Error while converting value string to float : " + value + " ==> " + ex.getMessage());
						}
					}
					if (inputName.endsWith(SSHMetric.METRIC_RAM_PERCENT)) {
						System.out.println("Metric type : " + CPUPercentMetric.METRIC_RAM_PERCENT);
						try {
							tmp = Float.parseFloat(value); 
							ram = tmp.intValue();
						} catch (NumberFormatException ex) {
							LOGGER.error("Error while converting value string to float or to integer : " + value + " ==> " + ex.getMessage());
						}
					}
					
				} else {
					System.err.println("The value of " + inputName + " is null !!!");
				}
				
				
			} catch (NoSuchFieldException ex) {
				LOGGER.error("Field not found error : " + ex.getMessage());
			}
		}
		
		modifyResourceSet(cpu, ram, loadavg, 0);
	}
	
	/**
	 * Update metrics attribute on a compute with mixin monitorcurrent and mixin
	 * credential.
	 * 
	 * @param cpuUsed
	 * @param memUsed
	 * @param loadAverage
	 * @param diskUsed
	 */
	public synchronized void modifyResourceSet(int cpuUsed, int memUsed, float loadAverage, Integer diskUsed) {		
			Map<String, String> attrsToCreate = new HashMap<>();
			Map<String, String> attrsToUpdate = new HashMap<>();
			List<String> attrsToDelete = new ArrayList<>();
			
			attrsToUpdate.put("cpu", cpuUsed + "");
			attrsToUpdate.put("ram", memUsed + "");
			attrsToUpdate.put("loadavg", loadAverage + "");
			// attrsToUpdate.put("disk",  diskUsed + "");
			
			if (UIDialog.isStandAlone()) {
				// Headless environment.
				EntityUtilsHeadless.updateAttributes(sensorExt, attrsToCreate, attrsToUpdate, attrsToDelete);
			} else {
				// Gui environment
				EntityUtils.updateAttributes(sensorExt, attrsToCreate, attrsToUpdate, attrsToDelete);
			}
	}

	// public synchronized void updateSensorAttribute(float cpuUsed, float ramUsed, float loadAvg) {
		
		/*Command cmd = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				
				// Update attributes states object.
				List<AttributeState> attrStates = sensorExt.getAttributes();
				String ramStr = String.valueOf(ramUsed);
				String cpuStr = String.valueOf(cpuUsed);
				String loadavgStr = String.valueOf(loadAvg); 
				for (AttributeState attrState : attrStates) {
					if (attrState.getName().equals("ram")) {
						attrState.setValue(ramStr);
					}
					if (attrState.getName().equals("cpu")) {
						attrState.setValue(cpuStr);
					}
					if (attrState.getName().equals("loadavg")) {
						attrState.setValue(loadavgStr);
					}
				}
				
				// sensorExt.eSet(sensorExt.eClass().getEStructuralFeature("cpu"),cpuUsed);
				// sensorExt.eSet(sensorExt.eClass().getEStructuralFeature("ram"),ramUsed);
				// sensorExt.eSet(sensorExt.eClass().getEStructuralFeature("loadavg"),loadAvg);
				
				// sensorExt.setRam(ramUsed);
				// sensorExt.setLoadavg(loadAvg);
				// sensorExt.setCpu(cpuUsed);
				
			}
		};
		try {
			TransactionalCommandStack transactionCmd = (TransactionalCommandStack) domain.getCommandStack();
			transactionCmd.execute(cmd, null); // default options
		} catch (RollbackException rbe) {
			LOGGER.error(rbe.getStatus().toString());
		} catch (InterruptedException ex) {
			LOGGER.error(ex.getMessage());
		}*/
//	}
	
	public void stop() {
		System.out.println("Stop publisher call.");
	    // Other things to stop if necessary.
	}
	
}

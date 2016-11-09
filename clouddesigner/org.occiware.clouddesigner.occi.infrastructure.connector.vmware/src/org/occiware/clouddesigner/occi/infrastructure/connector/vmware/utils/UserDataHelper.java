package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils;

import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.occiware.clouddesigner.occi.infrastructure.connector.vmware.addons.exceptions.UserDataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.GuestProgramSpec;
import com.vmware.vim25.NamePasswordAuthentication;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.GuestOperationsManager;
import com.vmware.vim25.mo.GuestProcessManager;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * VMWare user data management. 
 * How user data works : 
 * This runnable will test if the instance is definitively started and check if GuestTools are running or not.
 * - With GuestTools --> Create a .properties file with datas (the origin string must have separator ; for each key/value) in home directory of the current user.
 * If no GuestTools installed, await 30 seconds (if instance is power on) and then:   
 * - Without GuestTools --> The ssh public certificate must be use for connection to the virtual machine, 
 * 			Via ssh --> Create a .properties file with datas (the origin string must have separator ; for each key/value) in home directory of the current user.
 * 
 * @author Christophe Gourdin - Inria.
 *
 */
public class UserDataHelper implements Runnable, IRunnableWithProgress {
	private static Logger LOGGER = LoggerFactory.getLogger(UserDataHelper.class);
	private String userDatas = null;
	// private String ipAddress;
	private String username;
	private String password;
	
	/**
	 * Unique id of this vm on vcenter. Used only for guest tools access on this instance.
	 */
	private String morId = null;
	/**
	 * If no morId setted, get the instance from his name and path.
	 */
	private String name = null;
	
	private Folder instanceFolder = null;
	
	private VClientImpl vClient = new VClientImpl();

	

	/**
	 * For guest tools or ssh connection with username and password.
	 * @param instanceId
	 * @param instanceName
	 * @param instanceFolder
	 * @param userDatas
	 * @param username
	 * @param password
	 */
	public UserDataHelper(String instanceId, String instanceName, Folder instanceFolder, String userDatas, String username, String password) {
		super();
		this.userDatas = userDatas;
		// this.ipAddress = ipAddress;
		this.username = username;
		this.password = password;
		this.morId = instanceId;
		this.name = instanceName;
		this.instanceFolder = instanceFolder;
	}

	/**
	 * Execute the create / update of the user data properties on the qualified instance.
	 */
	@Override
	public void run() {
		
		// Connect to the client.
		if (vClient == null) {
			vClient = new VClientImpl();
		}
		try {
			vClient.init();
			boolean connected = vClient.checkConnection();
			if (connected) {
				if (instanceFolder == null) {
					// Get the root Folder.
					LOGGER.info("instance folder not specified for user data set, assuming root folder.");
					instanceFolder = vClient.getServiceInstance().getRootFolder();
				}
				// Client is connected to vcenter.
				// Now check if the instance has vmware tools installed, if not we use ipAddress provided and ssh.
				// Find the the instance.
				VirtualMachine vm = null;
				if (morId != null) {
					vm = VMHelper.findVMForMorId(instanceFolder, morId);
				}
				// If no vm, find by instance name.
				if (vm == null) {
					vm = VMHelper.findVMForName(instanceFolder, name);
				}
				
				if (vm == null) {
					throw new Exception("No vm found on vcenter for setting user datas.");
				}
				
				if (vm != null && VMHelper.isToolsInstalled(vm)) {
					if (VMHelper.getPowerState(vm).equals(VMHelper.POWER_OFF)) {
						// Start the virtual machine before processing.
						VMHelper.powerOn(vm);
					}
					applyUserDataViaGuestTools(vm);
				} else {
					// VMware tools not installed and the vm is not found on this vcenter, try to apply user data via ssh directly (without vClient so).
					applyUserDataViaSSH();
				}
				
				
			}
			
		} catch (Exception ex) {
			// Fail silently.
			LOGGER.error(ex.getMessage());
			
		} finally {
			vClient.disconnect();
		}
		

	}
	
	/**
	 * Apply user data via guest tools (guestoperation).
	 * 
	 * @param vm
	 */
	private void applyUserDataViaGuestTools(VirtualMachine vm) throws UserDataException {
		if (vm == null) {
			LOGGER.warn("No virtual machine supplied for applying user datas.");
			return;
		}
		if (userDatas == null) {
			throw new UserDataException("No user datas specified to apply.");
		} else {
			userDatas.replaceAll("\r\n", "\n");
		}
		if (username == null || password == null) { 
			throw new UserDataException("No credentials given to apply instance connection.");
		}
		int count = 0;
		while (!VMHelper.getGuestState(vm).equals("running")) {
			try {
				if (count >= 10) {
					LOGGER.warn("Cannot wait more times to set user data, please retry later.");
					return;
				}
				this.wait(5000);
				count++;
				
			} catch (InterruptedException ex) {
				LOGGER.error("Wait to guest running state interrupted: " + ex.getMessage());
				break;
			}
		}
		
		// If we are here, the instance is started and guest tools are running.
//		if (this.ipAddress == null) {
//			// Get ipaddress from guest tools.
//			ipAddress = vm.getGuest().getIpAddress();
//		}
		try {
			// example of user datas: userDatas = "touch /tmp/userdata.txt | 'toto:1,titi: hello world' > /tmp/userdata.txt"
			GuestOperationsManager gom = vClient.getServiceInstance().getGuestOperationsManager();
			NamePasswordAuthentication npa = new NamePasswordAuthentication();
			npa.username = username;
			npa.password = password;
			npa.interactiveSession = false;
			GuestProgramSpec gps = new GuestProgramSpec();
			gps.programPath = "/bin/bash";
			gps.arguments = userDatas;
			GuestProcessManager gpm = gom.getProcessManager(vm);
			long result = gpm.startProgramInGuest(npa, gps);
			LOGGER.info("Process: " + result);
			LOGGER.info("User data has applied : " + userDatas);
			
		} catch (RemoteException ex) {
			throw new UserDataException("Unknown remote error : "+ ex.getMessage());
		}
	}
	
	private void applyUserDataViaSSH() {
		LOGGER.warn("apply User data via ssh is not implemented, this feature will come soon.");
	}

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		this.run();
	}
	
}

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
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.GuestOperationsManager;
import com.vmware.vim25.mo.GuestProcessManager;
import com.vmware.vim25.mo.Task;
import com.vmware.vim25.mo.VirtualMachine;

/**
 * VMWare user data management. How user data works : This runnable will test if
 * the instance is definitively started and check if GuestTools are running or
 * not. - With GuestTools --> Create a .properties file with datas (the origin
 * string must have separator ; for each key/value) in home directory of the
 * current user. If no GuestTools installed, await 30 seconds (if instance is
 * power on) and then: - Without GuestTools --> The ssh public certificate must
 * be use for connection to the virtual machine, Via ssh --> Create a
 * .properties file with datas (the origin string must have separator ; for each
 * key/value) in home directory of the current user.
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
	 * Unique id of this vm on vcenter. Used only for guest tools access on this
	 * instance.
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
	 * 
	 * @param instanceId
	 * @param instanceName
	 * @param userDatas
	 * @param username
	 * @param password
	 */
	public UserDataHelper(String instanceId, String instanceName, String userDatas, String username, String password) {
		super();
		this.userDatas = userDatas;
		// this.ipAddress = ipAddress;
		this.username = username;
		this.password = password;
		this.morId = instanceId;
		this.name = instanceName;
		// this.instanceFolder = instanceFolder;
	}

	/**
	 * Execute the create / update of the user data properties on the qualified
	 * instance.
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
				// Now check if the instance has vmware tools installed, if not
				// we use ipAddress provided and ssh.
				if (instanceFolder == null) {
					throw new Exception("Instance folder is unknown.");
				}

				Thread.sleep(10000);

				// Find the the instance.
				VirtualMachine vm = null;
				// if (morId != null) {
				// try {
				// LOGGER.info("Managed object reference id : " + morId);
				// vm = VMHelper.findVMForMorId(instanceFolder, morId);
				// } catch (Exception ex) {
				// LOGGER.error("Exception thrown : " + ex.getMessage() + "
				// class: " + ex.getClass().getName());
				// }
				// }

				// If no vm, find by instance name.
				if (vm == null) {
					LOGGER.info("Searching vm in inventory with the instance name : " + name);
					try {
						vm = VMHelper.findVMForName(instanceFolder, name);
					} catch (Exception ex) {
						LOGGER.error("Exception thrown : " + ex.getMessage() + " class: " + ex.getClass().getName());
						ex.printStackTrace();
						throw ex;
					}
				}

				if (vm == null) {
					LOGGER.error("VM not found for name : " + name);
					throw new Exception("No vm found on vcenter for setting user datas.");
				}

				String vmState;
				try {
					vmState = VMHelper.getPowerState(vm);
				} catch (Exception ex) {
					LOGGER.error("Exception thrown while getting vm state: " + ex.getMessage() + " class: "
							+ ex.getClass().getName());
					ex.printStackTrace();
					throw ex;
				}
				int count = 0;
				LOGGER.info("Virtual machine state : " + vmState);
				
				TaskInfo taskInf = null;
				if (vmState.equals(VMHelper.POWER_OFF)) {
					// Check if a clone task is used.
					Task[] tasks = vm.getRecentTasks();
					Task taskClone = null;
					if (tasks != null && tasks.length > 0) {
						LOGGER.info("Recent Tasks are detected: ");
						for (Task task : tasks) {
							TaskInfo info = task.getTaskInfo();
							String taskName = info.getName();
							LOGGER.info("Task name : " + taskName);
							LOGGER.info("Task entity name : " + info.getEntityName());
							LOGGER.info("Task description id : " + info.getDescriptionId());
							LOGGER.info("Task key : " + info.getKey());
							LOGGER.info("Mor id : " + info.getEntity().getVal());
							if (taskName != null && taskName.contains("lone")) {
								taskInf = info;
								taskClone = task;
								break;

							}
						}
					}
					if (taskInf != null && taskClone != null) {
						LOGGER.info("Task : " + taskInf.getName() + " is detected.");
						// Waiting for task to finish...
						if (!taskInf.isCancelled() && (taskInf.getState().equals(TaskInfoState.running)
								|| taskInf.getState().equals(TaskInfoState.queued))) {

							TaskInfoState state;
							do {
								try {
									Thread.sleep(1000);
								} catch (InterruptedException ex) {
									LOGGER.warn("Thread userdata is interrupted :  " + ex.getMessage());
								}
								state = taskClone.getTaskInfo().getState();
								Integer progress = taskClone.getTaskInfo().getProgress();
								if (state == TaskInfoState.success) {
									progress = 100;
								} else if (progress == null) {
									progress = 0;
								}
								LOGGER.info("State=" + state + "(" + progress + "%)");
							} while (state != TaskInfoState.error && state != TaskInfoState.success);

						}
					}
				}
				
				
				LOGGER.info("Checking if instance is started...");
				while (vmState.equals(VMHelper.POWER_OFF)) {
					try {
						Thread.sleep(5000);
						LOGGER.info("Trying to apply user data count : " + count);
						count++;
					} catch (InterruptedException ex) {
						LOGGER.warn("Thread userdata is interrupted : " + ex.getMessage());
					}
					vmState = VMHelper.getPowerState(vm);
					if (vmState.equals(VMHelper.POWER_OFF)) {
						// Start the virtual machine before processing.
						try {
							VMHelper.powerOn(vm);
						} catch (RemoteException | InterruptedException ex) {
							LOGGER.warn(
									"Trying to power on the instance " + vm.getName() + " failed : " + ex.getMessage());
						}
					}
					if (count >= 24) {
						throw new Exception("The user data couldn't apply cause from timeout.");
					}
				}

				LOGGER.info("VM : " + vm.getName() + " is powered on.");

				if (VMHelper.isToolsInstalled(vm)) {
					LOGGER.info("Calling apply userdata via vmware guest tools.");
					applyUserDataViaGuestTools(vm);
				} else {
					// VMware tools not installed and the vm is not found on
					// this vcenter, try to apply user data via ssh directly
					// (without vClient so).
					LOGGER.info("Call apply userdata via ssh.");
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
		LOGGER.info("checking vmware tools state...");

		if (vm.getGuest() != null) {
			String guestState = VMHelper.getGuestState(vm);
			if (guestState == null) {
				LOGGER.warn("The guest tools state is unknown...");
			} else {
				LOGGER.info("VMware tools check, is not running but installed. Wait for running state.");
				while (!guestState.equals("running")) {
					LOGGER.info("Waiting for running guest state... count: " + count);
					try {
						if (count >= 50) {
							LOGGER.warn("Cannot wait more times to set user data, please retry later.");
							throw new UserDataException("Cannot wait more times to set user data, please retry later.");
						}
						Thread.sleep(5000);
						count++;
						guestState = VMHelper.getGuestState(vm);
					} catch (InterruptedException ex) {
						LOGGER.error("Wait to guest running state interrupted");
						break;
					}
				}

			}
		}
		try {
			Thread.sleep(2000);
		} catch(InterruptedException ex) {
			LOGGER.warn("Thread userdata is interrupted, trying to continue...");
		}
		
		try {
			// example of user datas: userDatas = "touch /tmp/userdata.txt |
			// 'toto:1,titi: hello world' > /tmp/userdata.txt"
			LOGGER.info("Applying user datas please standby...");
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
			throw new UserDataException("Unknown remote error : " + ex.getMessage());
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

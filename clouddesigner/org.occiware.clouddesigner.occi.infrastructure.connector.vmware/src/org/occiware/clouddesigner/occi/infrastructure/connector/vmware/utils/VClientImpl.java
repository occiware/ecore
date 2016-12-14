package org.occiware.clouddesigner.occi.infrastructure.connector.vmware.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.vim25.mo.ServiceInstance;

/**
 * This Class is the same as VCenterClient class but doesnt use static methods, mainly to use within other Threads (multi-threads).
 * @author Christophe Gourdin - Inria.
 *
 */
public class VClientImpl {
	private String url = null;
	private String login = null;
	private String password = null;
	private static Logger LOGGER = LoggerFactory.getLogger(VClientImpl.class);
	private ServiceInstance serviceInstance = null;

	/**
	 * Init credentials from property file object.
	 * 
	 * @throws IOException
	 */
	public void init() throws IOException {
		if (url == null) {
			Properties prop = new Properties();
			
			// String credentialFile = "/resources/credential.properties";
			// String homePath = System.getProperty("user.home") + FileSystems.getDefault().getSeparator();
			String homePath = System.getProperty("user.home") + File.separator;
			InputStream in = new FileInputStream(homePath + "vmware-credential.properties");

			prop.load(in);
			if (in != null) {
				try {
					in.close();
					
				} catch (IOException ex) {
					// no op.
				}
			}
			if (prop.containsKey("vcenter.url")) {
				// prop.load(in);
				login = prop.getProperty("vcenter.login");
				password = prop.getProperty("vcenter.password");
				url = prop.getProperty("vcenter.url");

			} else {
				throw new FileNotFoundException("credential property file not found !");
			}
		}
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Connect to vcenter and ready to go for action with ServiceInstance
	 * object.
	 * 
	 * @param url
	 * @param login
	 * @param password
	 * @return
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public ServiceInstance initServiceInstance(final String url, final String login, final String password)
			throws RemoteException, MalformedURLException {
		serviceInstance = new ServiceInstance(new URL(url), login, password, true); // TODO
																					// :
																					// add
																					// a
																					// parameter
																					// for
																					// certificate
																					// support
																					// -->
																					// false
																					// on
																					// last
																					// parameter.
		return serviceInstance;
	}

	public ServiceInstance getServiceInstance() {
		return serviceInstance;
	}

	/**
	 * Initialize a connection to a vCenter server, if set, logout and connect.
	 * 
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public void connect() throws RemoteException, MalformedURLException {
		if (serviceInstance == null && login != null) {
			initServiceInstance(url, login, password);
		} else {
			if (serviceInstance.getAboutInfo().getApiVersion() == null) {
				// Reconnect...
				LOGGER.info("Reconnect to vcenter in progress...");
				serviceInstance.getServerConnection().logout();
				if (login != null) {
					initServiceInstance(url, login, password);
				}
			}
		}
	}

	/**
	 * Disconnect from this vCenter server.
	 * 
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public void disconnect() {

		if (serviceInstance != null && login != null) {
			LOGGER.info("Logging out from vcenter in progress...");
			serviceInstance.getServerConnection().logout();
			serviceInstance = null;
			LOGGER.info("Disconnected from vcenter.");
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean isConnected() {
		boolean result = false;
		if (serviceInstance != null && serviceInstance.getAboutInfo().getApiVersion() != null) {
			if (serviceInstance.getSessionManager().getCurrentSession() != null) {
				result = true;
			}
		}
		return result;
	}

	/**
	 * if vcenter client connection is not set, this method will connect to
	 * vcenter.
	 */
	public boolean checkConnection() {
		if (!isConnected()) {
			LOGGER.info("Not connected, connection in progress...");

			try {
				init();
				connect();
				LOGGER.info("Connected to vcenter.");
				return true;
			} catch (IOException ex) {
				ex.printStackTrace();
				return false;
			}
		} else {
			LOGGER.info("Connected to vcenter.");
			return true;
		}

	}
}

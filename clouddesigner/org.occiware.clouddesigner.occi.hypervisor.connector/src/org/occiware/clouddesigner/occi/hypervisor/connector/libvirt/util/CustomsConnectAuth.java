package org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.libvirt.ConnectAuth;

public class CustomsConnectAuth extends ConnectAuth {
	
	private String password;

	public CustomsConnectAuth(String password) {
		credType = new CredentialType[] { CredentialType.VIR_CRED_AUTHNAME, CredentialType.VIR_CRED_ECHOPROMPT,
				CredentialType.VIR_CRED_REALM, CredentialType.VIR_CRED_PASSPHRASE,
				CredentialType.VIR_CRED_NOECHOPROMPT };
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public int callback(Credential[] cred) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			for (Credential c : cred) {
				String response = "";
				switch (c.type) {
				case VIR_CRED_USERNAME:
				case VIR_CRED_AUTHNAME:
				case VIR_CRED_ECHOPROMPT:
				case VIR_CRED_REALM:
					System.out.println(c.prompt);
					response = in.readLine();
					break;
				case VIR_CRED_PASSPHRASE:
				case VIR_CRED_NOECHOPROMPT:
					response = this.getPassword();
					break;
				}
				if (response.equals("") && !c.defresult.equals("")) {
					c.result = c.defresult;
				} else {
					c.result = response;
				}
				if (c.result.equals("")) {
					return -1;
				}
			}
		} catch (Exception e) {
			return -1;
		}
		return 0;
	}

}

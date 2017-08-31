/**
 * 
 */
package br.com.cotemig.entities;

/**
 * @author andresulivam
 *
 */
public class SetterClient {

	private static int count = 1;

	public static Client settlerClient() {

		Client client = new Client();
		client.setName("Client " + count);
		
		client.addAccount(SetterAccount.settlerAccount());
		client.addAccount(SetterAccount.settlerAccount());
		client.addAccount(SetterAccount.settlerAccount());
		client.addAccount(SetterAccount.settlerAccount());
		
		count++;
		
		return client;
	}
}

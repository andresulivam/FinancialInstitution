/**
 * 
 */
package br.com.cotemig.entities;

import java.util.ArrayList;

/**
 * @author andresulivam
 *
 */
public class Institution {
	private String name;
	private ArrayList<Client> clients;

	public Institution() {
		clients = new ArrayList<Client>();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Add client
	 * 
	 * @param client
	 */
	public void addClient(Client client) {
		if (client != null) {
			clients.add(client);
		}
	}

}

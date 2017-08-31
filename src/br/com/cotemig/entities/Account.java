/**
 * 
 */
package br.com.cotemig.entities;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author andresulivam
 *
 */
public class Account {

	private String agency_number;
	private Integer account_number;
	private Double balance;
	private Client client;
	private ArrayList<Operation> operations;

	/**
	 * 
	 */
	public Account() {
		operations = new ArrayList<Operation>();
		balance = 0d;
	}

	/**
	 * @return the agency_number
	 */
	public String getAgency_number() {
		return agency_number;
	}

	/**
	 * @param agency_number
	 *            the agency_number to set
	 */
	public void setAgency_number(String agency_number) {
		this.agency_number = agency_number;
	}

	/**
	 * @return the account_number
	 */
	public Integer getAccount_number() {
		return account_number;
	}

	/**
	 * @param account_number
	 *            the account_number to set
	 */
	public void setAccount_number(Integer account_number) {
		this.account_number = account_number;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the operations
	 */
	public ArrayList<Operation> getOperations() {
		return operations;
	}

	/**
	 * @param operations
	 *            the operations to set
	 */
	public void setOperations(ArrayList<Operation> operations) {
		this.operations = operations;
	}

	/**
	 * Deposit
	 * 
	 * @author andresulivam
	 * @param value
	 * @return
	 */
	public boolean deposit(Double value) {
		boolean result = false;
		if (value != null && value > 0) {
			balance += value;
			result = true;
			Operation operation = new Operation(this);
			operation.setType(Operation.DEPOSIT);
			operation.setDate(Calendar.getInstance());
			operation.setValue(value);
		}
		return result;
	}

	/**
	 * Draw
	 * 
	 * @author andresulivam
	 * @param value
	 * @return
	 */
	public boolean draw(Double value) {
		boolean result = false;
		if (value != null && value > 0 && value <= balance) {
			balance -= value;
			result = true;
			Operation operation = new Operation(this);
			operation.setType(Operation.DRAW);
			operation.setDate(Calendar.getInstance());
			operation.setValue(value);
		}
		return result;
	}

	/**
	 * Return balance current;
	 * 
	 * @author andresulivam
	 * @return
	 */
	public Double checkBalance() {
		return balance;
	}

	/**
	 * Get extract
	 * 
	 * @author andresulivam
	 * @param days
	 * @return
	 */
	public ArrayList<Operation> checkExtract(int days) {
		ArrayList<Operation> result = new ArrayList<Operation>();
		if (days == 3 || days == 5 || days == 10 || days == 30) {
			Calendar date = Calendar.getInstance();
			date.add(Calendar.DATE, days * (-1));
			for (int i = 0; i < operations.size(); i++) {
				if (operations.get(i).getDate().after(date)) {
					result.add(operations.get(i));
				}
			}
		}
		return result;
	}

	/**
	 * Add operation
	 * 
	 * @param operation
	 */
	public void addOperation(Operation operation) {
		if (operation != null) {
			operations.add(operation);
		}
	}

}

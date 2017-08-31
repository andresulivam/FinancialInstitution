/**
 * 
 */
package br.com.cotemig.entities;

import java.util.Calendar;

/**
 * @author andresulivam
 *
 */
public class Operation {

	public static String DEPOSIT = "Depositar";
	public static String DRAW = "Sacar";

	private String type;
	private Calendar date;
	private Double value;
	private Account account;

	/**
	 * 
	 */
	public Operation() {
		super();
	}

	/**
	 * Constructor
	 */
	public Operation(Account account) {
		this.account = account;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

}

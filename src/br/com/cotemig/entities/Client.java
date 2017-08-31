package br.com.cotemig.entities;

import java.util.ArrayList;

public class Client {

	private String name;
	private String cpf;
	private Institution institution;
	private ArrayList<Account> accounts;

	public Client() {
		accounts = new ArrayList<Account>();
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
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the institution
	 */
	public Institution getInstitution() {
		return institution;
	}

	/**
	 * @param institution
	 *            the institution to set
	 */
	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	/**
	 * Add account
	 * 
	 * @param account
	 */
	public void addAccount(Account account) {
		if (account != null) {
			accounts.add(account);
		}
	}

}

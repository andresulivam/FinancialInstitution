/**
 * 
 */
package br.com.cotemig.entities;

import java.util.Calendar;

/**
 * @author andresulivam
 *
 */
public class SetterAccount {

	private static int count = 1;
	private static int agency_number = 1;

	public static Account settlerAccount() {
		Account account = new Account();
		account.setAgency_number("Agency number: " + agency_number);
		account.setAccount_number(count);
		count++;
		if (count % 5 == 0) {
			agency_number++;
		}
		account.deposit(200d);

		account.addOperation(SetterOperation.settlerOperationDeposit(Calendar.getInstance()));
		account.addOperation(SetterOperation.settlerOperationDeposit(Calendar.getInstance()));
		account.addOperation(SetterOperation.settlerOperationDeposit(Calendar.getInstance()));
		account.addOperation(SetterOperation.settlerOperationDeposit(Calendar.getInstance()));
		account.addOperation(SetterOperation.settlerOperationDraw(Calendar.getInstance()));
		account.addOperation(SetterOperation.settlerOperationDraw(Calendar.getInstance()));
		account.addOperation(SetterOperation.settlerOperationDraw(Calendar.getInstance()));
		account.addOperation(SetterOperation.settlerOperationDraw(Calendar.getInstance()));

		return account;
	}

}

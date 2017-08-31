/**
 * 
 */
package br.com.cotemig.entities;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

/**
 * @author andresulivam
 *
 */
public class AccountTest {

	/**
	 * Test method for
	 * {@link br.com.cotemig.entities.Account#deposit(java.lang.Double)}.
	 */
	@Test
	public void testDeposit() {
		Account account = SetterAccount.settlerAccount();
		Double value = account.getBalance();

		account.deposit(10d);

		assertEquals(value + 10d, account.getBalance(), 0);
	}

	/**
	 * Test method draw
	 */
	@Test
	public void testDraw() {
		Account account = SetterAccount.settlerAccount();
		Double value = account.getBalance();

		account.draw(10d);

		assertEquals(value - 10d, account.getBalance(), 0);
	}

	/**
	 * Test method get balance
	 */
	@Test
	public void testCheckBalance() {
		Account account = SetterAccount.settlerAccount();
		account.setBalance(40d);

		assertEquals(40, account.checkBalance(), 0);
	}

	/**
	 * Test method get balance
	 */
	@Test
	public void testGetExtract() {
		Account account = SetterAccount.settlerAccount();

		Calendar tree_days = Calendar.getInstance();
		Calendar five_days = Calendar.getInstance();
		Calendar ten_days = Calendar.getInstance();
		Calendar thirdy_days = Calendar.getInstance();

		tree_days.add(Calendar.DATE, -2);
		five_days.add(Calendar.DATE, -4);
		ten_days.add(Calendar.DATE, -9);
		thirdy_days.add(Calendar.DATE, -29);

		account.addOperation(SetterOperation.settlerOperationDeposit(tree_days));
		account.addOperation(SetterOperation.settlerOperationDeposit(five_days));
		account.addOperation(SetterOperation.settlerOperationDeposit(ten_days));
		account.addOperation(SetterOperation.settlerOperationDeposit(thirdy_days));
	
		assertEquals(9, account.checkExtract(3).size(), 0);
		assertEquals(10, account.checkExtract(5).size(), 0);
		assertEquals(11, account.checkExtract(10).size(), 0);
		assertEquals(12, account.checkExtract(30).size(), 0);
	}
	
	/**
	 * Test method get balance
	 */
	@Test
	public void anotherTests() {
		Account account = SetterAccount.settlerAccount();
		account.setAgency_number("New agency number");
		account.getAccount_number();
		account.getAgency_number();
		
		Client client = SetterClient.settlerClient();
		account.setClient(client);
		account.getClient();
		client.getInstitution();
		client.setCpf("New cpf");
		client.getCpf();
		client.getName();
		
		Institution institution = SetterInstitution.settlerInstitution();
		client.setInstitution(institution);
		institution.getName();
		institution.addClient(client);
		institution.addClient(null);
		
		Account account_2 = SetterAccount.settlerAccount();
		account.setOperations(account_2.getOperations());
		
		account.getOperations().get(0).getType();
		account.getOperations().get(0).getType();
		account.getOperations().get(0).getValue();
		account.getOperations().get(0).getAccount();
		account.getOperations().get(0).setAccount(account);
	}

}

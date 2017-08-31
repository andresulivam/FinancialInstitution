/**
 * 
 */
package br.com.cotemig.entities;

import java.util.Calendar;

/**
 * @author andresulivam
 *
 */
public class SetterOperation {

	private static double value = 1;

	public static Operation settlerOperationDeposit(Calendar date) {
		Operation operation = new Operation();
		operation.setType(Operation.DEPOSIT);
		operation.setDate(date);
		operation.setValue(value);
		value++;
		return operation;
	}

	public static Operation settlerOperationDraw(Calendar date) {
		Operation operation = new Operation();
		operation.setType(Operation.DRAW);
		operation.setDate(date);
		operation.setValue(value);
		value++;
		return operation;
	}
}

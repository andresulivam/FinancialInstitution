/**
 * 
 */
package br.com.cotemig.entities;


/**
 * @author andresulivam
 *
 */
public class SetterInstitution {

	private static int count = 1;

	public static Institution settlerInstitution() {

		Institution institution = new Institution();
		institution.setName("Institution "+count);
		count++;
		return institution;
	}

}

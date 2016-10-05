package stokic;

import java.util.List;

import javax.faces.bean.*;

/**
 * BPerson
 * Bean Person is a ManagedBean class so the JSF can communicate with it.
 * You need getter and setter methods, so the JSF can call them/so the bean can acces it.
 * 
 * @author Stefan Stokic
 * @version 0.1
 */

@ManagedBean(name="bPerson", eager = true)
@RequestScoped
public class BPerson {
	
	private String lastname, firstname;
	private int age;
	
	private List<EPerson> ePersonen;
	
	public BPerson() {
		
		readEPersonen();
	}
	
	public void readEPersonen() {
		
		DAPerson da_ePerson = new DAPerson();
		
		ePersonen = da_ePerson.read();
	}
	
	public void saveEPerson() {
		
		DAPerson da_ePerson = new DAPerson();
		EPerson ePerson = new EPerson();
		
		ePerson.setLastname(lastname);
		ePerson.setFirstname(firstname);
		ePerson.setAge(age);
		
		da_ePerson.save(ePerson);
	}
	
	/*public void updateEPerson() {
		
		
	}
	
	public void deleteEPerson() {
		
		
	}*/

	public String getLastname() {
		
		return lastname;
	}

	public void setLastname(String lastname) {
		
		this.lastname = lastname;
	}

	public String getFirstname() {
		
		return firstname;
	}

	public void setFirstname(String firstname) {
		
		this.firstname = firstname;
	}

	public int getAge() {
		
		return age;
	}

	public void setAge(int age) {
		
		this.age = age;
	}

	public List<EPerson> getePersonen() {
		
		return ePersonen;
	}

	public void setePersonen(List<EPerson> ePersonen) {
		
		this.ePersonen = ePersonen;
	}
}
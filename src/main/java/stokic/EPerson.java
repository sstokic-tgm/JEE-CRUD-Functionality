package stokic;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * EPerson
 * Entity Person is the entity class which is going to be mapped. You can say it's the mapping class. The
 * mapping process is archived by using the annotations.
 * It's important to have getter and setter methods for the mapped attributes.
 * 
 * @author Stefan Stokic
 * @version 0.2
 */

@Entity
public class EPerson implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int nr;

	private String lastname;

	private String firstname;

	private int age;

	public EPerson() { }

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

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
}
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
	
	@NotNull
	private String nachname;
	
	@NotNull
	private String vorname;
	
	@NotNull
	private int alter;
	
	public EPerson() {}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
}
package stokic;

import java.util.ArrayList;

import javax.faces.bean.*;

/**
 * BPerson
 * Bean Person is a ManagedBean class so the JSF can communicate with it.
 * You need getter and setter methods, so the JSF can call them/so the bean can acces it.
 * 
 * @author Stefan Stokic
 * @version 0.1
 */

@ManagedBean
@RequestScoped
public class BPerson {
	
	private String nachname, vorname;
	private int alter;
	
	private ArrayList<EPerson> ePersonen;
	
	public BPerson() {
		
		readEPersonen();
	}
	
	public void readEPersonen() {
		
		
	}
	
	public void saveEPerson() {
		
		
	}
	
	public void updateEPerson() {
		
		
	}
	
	public void deleteEPerson() {
		
		
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

	public ArrayList<EPerson> getePersonen() {
		
		return ePersonen;
	}

	public void setePersonen(ArrayList<EPerson> ePersonen) {
		
		this.ePersonen = ePersonen;
	}
}
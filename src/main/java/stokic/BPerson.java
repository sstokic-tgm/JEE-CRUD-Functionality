package stokic;

import java.util.List;

import javax.faces.application.*;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

/**
 * BPerson
 * Bean Person is a ManagedBean class so the JSF can communicate with it.
 * You need getter and setter methods, so the JSF can call them/so the bean can acces it.
 * 
 * @author Stefan Stokic
 * @version 0.6
 */

@ManagedBean
@RequestScoped
public class BPerson {
	
	private String lastname, firstname;
	private int age;
	
	private List<EPerson> selectedPersonen;
	
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
		
		FacesMessage msg = new FacesMessage(lastname + " wurde erfolgreich erstellt!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void onRowEdit(RowEditEvent event) {
		
		DAPerson da_ePerson = new DAPerson();
		EPerson ePerson = ((EPerson)event.getObject());
		
		da_ePerson.update(ePerson);
        
		FacesMessage msg = new FacesMessage("Person " + ((EPerson)event.getObject()).getNr() + " wurde geändert!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        
    	FacesMessage msg = new FacesMessage("Änderungen abgebrochen!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	public void deleteEPerson() {
		
		DAPerson da_ePerson = new DAPerson();
		
		for(EPerson ePerson : selectedPersonen)
			da_ePerson.delete(ePerson);
		
		FacesMessage msg;
		if(selectedPersonen.isEmpty())
			msg = new FacesMessage("Keine Benutzer zum löschen ausgewählt!");
		else {
			
			msg = new FacesMessage("Benutzer erfolgreich gelöscht!");
			
			readEPersonen();
		}
		
        FacesContext.getCurrentInstance().addMessage(null, msg);
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
	
	public List<EPerson> getSelectedPersonen() {
		
		return selectedPersonen;
	}
	
	public void setSelectedPersonen(List<EPerson> selectedPerson) {
		
		this.selectedPersonen = selectedPerson;
	}

	public List<EPerson> getePersonen() {
		
		return ePersonen;
	}

	public void setePersonen(List<EPerson> ePersonen) {
		
		this.ePersonen = ePersonen;
	}
}
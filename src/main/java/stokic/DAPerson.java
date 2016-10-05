package stokic;

import java.util.List;
import org.hibernate.*;

/**
 * DAPerson
 * Data Access Person is a class which access the database and make changes to her. It uses the hibernate
 * transaction API.
 * 
 * @author Stefan Stokic
 * @version 0.1
 */

public class DAPerson {

	public List<EPerson> read() {
		
		List<EPerson> al_ePerson = null;
		
		Session s = HibernateUtil.getSession().openSession();
		
		s.beginTransaction();
		
		al_ePerson = s.createQuery("from EPerson").list();
		
		s.getTransaction().commit();
		s.close();
		
		return al_ePerson;
	}
	
	public void save(EPerson ePerson) {
		
		Session s = HibernateUtil.getSession().openSession();
		
		s.beginTransaction();
		
		s.save(ePerson);
		
		s.getTransaction().commit();
		s.close();
	}
	
	public void update(EPerson ePerson) {
		
		
	}
	
	public void delete(EPerson ePerson) {
		
		
	}
}
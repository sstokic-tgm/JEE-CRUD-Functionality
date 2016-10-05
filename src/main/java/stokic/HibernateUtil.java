package stokic;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Helper class for hibernate configuration.
 * 
 * Source: https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/tutorial.html
 * 
 * @author Stefan Stokic
 * @version 0.1
 */

public class HibernateUtil {

	private static final SessionFactory sessionFactory = establishSessionFactory();

	private static SessionFactory establishSessionFactory() {

		return new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSession() {

		return sessionFactory;
	}
}
package com.onetomanylab.config;
/*
 *@author Arnab Kumar Hoodati 
 * 
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	//creating method of session factory
	private static  SessionFactory sessionFactory;
	static {
		try {	//try block
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		catch(Exception e) {	//exception handling
			System.out.println(e);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;	//return the session factory
	}
}

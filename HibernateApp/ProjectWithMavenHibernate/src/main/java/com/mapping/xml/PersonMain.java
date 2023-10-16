package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	       
	        Person person=new Person(23,"ram","mumbai");
	        
	        Session session = factory.openSession();
	        
	        Transaction tx=session.beginTransaction();
	        
	        
	        tx.commit();
	        session.close();
	        factory.close();

	}

}

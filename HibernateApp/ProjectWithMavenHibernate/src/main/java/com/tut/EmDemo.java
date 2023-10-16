package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	    Student student1 = new Student();
	    student1.setId(11);
	    student1.setName("Ankit");
	    student1.setCity("London");
	    
	    Certificate certi = new Certificate();
	    certi.setCourse("Android");
	    certi.setCourse("2 months");
	    
	    Session s= factory.openSession();
	    Transaction tx= s.beginTransaction();
	    
	    //object save
	    s.save(student1);
	    tx.commit();
	    s.close();
	    factory.close();
	}

}

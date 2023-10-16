package com.States;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	public static void main(String [] args) {
		
		System.out.println("Example");
		
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Student student=new Student();
	        student.setId(333);
	        student.setName("Akansha");
	        student.setCity("mumbai");
	        student.setCerti(new Certificate("Java is prg language","2 months"));
	        //transient state 
	        
	        Session s=factory.openSession();
	        Transaction tx=s.beginTransaction();
	        
	        s.save(student);
	        tx.commit();
	        //persistant state
	        
	        factory.close();
		
	}
}

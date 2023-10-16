package com.Caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstLevelCaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
    Session s=factory.openSession();
    //by default
    
   Student student=s.get(Student.class,1212);
   System.out.println(student);
   System.out.println("working sometyhing");
   Student student1=s.get(Student.class, 1212);
   System.out.println(student1);
   
   System.out.println(s.contains(student1));
    
    
    factory.close();

	}

}

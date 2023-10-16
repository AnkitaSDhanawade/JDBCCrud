package com.SqlQuries;



import java.lang.annotation.Native;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class SqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session s = factory.openSession();
        
        String q="Select * from student";
        NativeQuery nq= s.createSQLQuery(q);
        
        List<Object[]> list=nq.list();
        
        for(Object [] student : list){
        	System.out.println(Arrays.deepToString(student) );
        	
        }
        
        
        s.close();
        factory.close();
    

	}

}

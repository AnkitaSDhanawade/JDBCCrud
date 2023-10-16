package com.pagination;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLPegination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
    
        Session s=factory.openSession();
        
       Query<Student>query= s.createQuery("from Student");
       
       //implementing pagination using hibern ate
       
       query.setFirstResult(0);
       query.setMaxResults(5);
        List<Student> list=query.list();
        
        for(Student st:list) {
        	System.out.println(st.getName() + ":" + st.getCity());
        }
        s.close();
        factory.close();

	}

}

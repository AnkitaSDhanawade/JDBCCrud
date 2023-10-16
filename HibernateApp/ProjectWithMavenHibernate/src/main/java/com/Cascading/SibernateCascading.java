package com.Cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Answer;
import com.tut.Question;

public class SibernateCascading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session s=factory.openSession();
        
        Question q1= new Question();
        
        q1.setQuestionId(101);
        q1.setQuestion("wha is cascading framwork ofd");
        
        Answer a1= new Answer(1234,"it is java ");
        Answer a2 = new Answer(1235,"Second answer java is framweork");
        Answer a3=new Answer(12346,"Third answer springboot");
        
        List<Answer> list= new ArrayList<Answer>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        
        q1.setAnswers(list);
        
        Transaction tx= s.beginTransaction();
        s.save(q1);
        
        tx.commit();
        
        s.close();
        factory.close();
    

	}

}

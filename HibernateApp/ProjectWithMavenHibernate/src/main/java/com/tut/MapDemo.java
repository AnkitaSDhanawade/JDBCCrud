package com.tut;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Question question1=new Question();
        question1.setQuestionId(1212);
        question1.setQuestion("What is java");
        
        //creating answer
        
        Answer answer = new Answer();
        answer.setAnswerId(329);
        answer.setAnswer("Java is ptrogrammming language");
        answer.setQuestion1(question1);
        
        Answer answer1 = new Answer();
        answer1.setAnswerId(328);
        answer1.setAnswer("java is platform indepenedant");
        answer1.setQuestion1(question1);
        
        Answer answer2 = new Answer();
        answer2.setAnswerId(327);
        answer2.setAnswer("it is robust in nature ");
        answer2.setQuestion1(question1);
        
        List<Answer> list=new ArrayList<Answer>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        
        question1.setAnswers(list);
        
        //session
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        //save

        //save
        s.save(question1);
        s.save(answer);
        s.save(answer1);
        s.save(answer2);
        
        tx.commit();
        
       Question newQ=(Question) s.get(Question.class, 1212);
       System.out.println(newQ.getQuestion());
      
        s.close();
        factory.close();

	}

}

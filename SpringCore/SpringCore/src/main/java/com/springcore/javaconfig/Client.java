package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = con.getBean("getStudent",Student.class);
		
		System.out.println(student);
		student.study();
		
		

	}

}

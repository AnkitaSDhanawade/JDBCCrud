package com.springcore.streo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/streo/config.xml");
		Student student=con.getBean("student",Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddresses());
//		System.out.println(student.getAddresses().getClass().getName());
		
		System.out.println(student.hashCode());
		
		Student student1=con.getBean("student",Student.class);
		System.out.println(student1.hashCode());
		
		Teacher teacher1=con.getBean("teacher",Teacher.class);
		System.out.println(teacher1.hashCode());
		
		Teacher teacher2=con.getBean("teacher",Teacher.class);
		System.out.println(teacher2.hashCode());
	}

}

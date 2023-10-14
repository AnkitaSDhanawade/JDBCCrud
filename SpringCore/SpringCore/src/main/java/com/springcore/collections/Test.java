package com.springcore.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/cconfig.xml");
		
		Employee employee1 =(Employee) context.getBean("employee1");
		System.out.println(employee1.getName());
		System.out.println(employee1.getPhones());
		System.out.println(employee1.getAddress());
		System.out.println(employee1.getCourses());

	}

}

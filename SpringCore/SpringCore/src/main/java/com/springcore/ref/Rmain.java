package com.springcore.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Rmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =new ClassPathXmlApplicationContext ("com/springcore/ref/rconfig.xml");
		A temp =(A) context.getBean("Aref");
		System.out.println(temp.getA());
		System.out.println(temp.getOb().getY());
		
	}

}

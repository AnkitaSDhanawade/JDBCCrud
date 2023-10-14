package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.Entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    System.out.println("My program is started");
    
    ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
    StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    Student student = new Student();
    student.setId(707);
    student.setName("An kita shs");
    student.setCity("ratlam");
    
   int result =  studentDao.insert(student);
   
   System.out.println("Student added" + result);
    
    
//  
//    Student student = new Student();
//    student.setId(787);
//    student.setName("Nalini");
//    student.setCity("kanour");
//    
//   int result= studentDao.change(student);
//   int result = studentDao.delete(11);
//   System.out.println("Row deleted" + result);
//    
//    Student student=studentDao.getStudent(787);
//    System.out.println(student);
//    System.out.println("Data fetch succefully");
//    
    
//    List<Student> student=studentDao.getAllStudents();
//    for(Student s:student);
    
            }
}

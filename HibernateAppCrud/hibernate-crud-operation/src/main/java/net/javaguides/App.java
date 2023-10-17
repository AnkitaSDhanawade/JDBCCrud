package net.javaguides;

import java.util.List;

import net.javaguides.hibernate.dao.StudentDao;
import net.javaguides.hibernate.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();
    	
    	//save student 
    	Student student = new Student("Ramesh","fadtare","harsh@gmail.com");
    	studentDao.saveStudent(student);
    	
    	//update student 
    	student.setFirstName("ram");
    	studentDao.updateStudent(student);
    	
    	
    	Student student2 = studentDao.getStudentById(student.getId());
    	List<Student> students = studentDao.getAllStudents();
    	students.forEach(student1 -> System.out.println(student1.getId()));
    	
    	studentDao.deleteStudent(student.getId());
    }
}

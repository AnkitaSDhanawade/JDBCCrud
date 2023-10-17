package net.javaguides.hibernate.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import net.javaguides.hibernate.model.Student;
import net.javaguides.hibernate.util.HibernateUtil;

public class StudentDao {
	
	//save student
	//get all student
	//getstudentbyid
	//updateStudent
	//delete student
	
	public void saveStudent(Student student) {
		org.hibernate.Transaction transaction = null;
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			//save student
			session.save(student);
			//commit
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
		
	}
	
	public void updateStudent(Student student) {
		org.hibernate.Transaction transaction = null;
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			//save student
			session.saveOrUpdate(student);
			//commit
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		
	}
	
	public Student getStudentById(long id) {
		org.hibernate.Transaction transaction = null;
		Student student = null;
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
		//get student ob ject
			student = session.get(Student.class,id);
			//commit
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(transaction !=null) {
				transaction.rollback();
			}
		}
		return student;
		
	}
	
	public List<Student> getAllStudents() {
		org.hibernate.Transaction transaction = null;
		List<Student> students = null;
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
		//get student ob ject
			students = session.createQuery("from Student").list();		//commit
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(transaction !=null) {
				transaction.rollback();
			}
		}
		return students;
		
	}
	
	public Student deleteStudent(long id) {
		org.hibernate.Transaction transaction = null;
		Student student = null;
		try(Session session =HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
		//get student ob ject
			student = session.get(Student.class,id);
			session.delete(student);
			//commit
			transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(transaction !=null) {
				transaction.rollback();
			}
		}
		return student;
		
	}
	
	
	



}

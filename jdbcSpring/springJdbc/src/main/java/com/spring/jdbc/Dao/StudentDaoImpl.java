package com.spring.jdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Entities.Student;
@Component

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	
	public int insert(Student student) {
		//insert query 
		
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return r;
	}

	public int change(Student student) {
		// TODO Auto-generated method stub
		//update data
		String query="update student set name=? , city=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity());
		return r;
	}

	
	public int delete(int studentId) {
		String query ="Delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		//selecting single data 
		;
		
		String query= "Select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		
		return null;
	}
	
	
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		//selecting multiple student 
		String query="select * from student";
		List<Student> student=this.jdbcTemplate.query(query,new RowMapperImpl());
		return null;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	



	

}

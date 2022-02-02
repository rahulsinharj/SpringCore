package com.springJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.entites.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;			// this.jdbcTemplate.update() tab chalega -> jab iss jdbcTemplate ref me obj initialise hoga, joki tab hoga jab iss pure StudentDaoImpl class ka obj banke uske properties initialise kare IOC 
	
	public int insert(Student student) 
	{	
		// insert query
		String query = "insert into student(id,name,city) values(?,?,?) "; 
		int result = this.jdbcTemplate.update(query , student.getId(), student.getName(), student.getCity());

		System.out.println("Records inserted : " +result);
		return result;
	}

	public int change(Student student) 
	{
		// updating data
		String query = "update student set name=? , city=? where id=? ";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		
		System.out.println("Records updated : " +result);
		return result;
	}	

	public int delete(int studentId) 
	{
		// delete operation
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query, studentId);
	
		System.out.println("Records deleted : " +result);
		return result;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [jdbcTemplate=" + jdbcTemplate + "]";
	}

	



}

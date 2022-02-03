package com.springJdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springJdbc.entites.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;			// this.jdbcTemplate.update() tab chalega -> jab iss jdbcTemplate ref me obj initialise hoga, joki tab hoga jab iss pure StudentDaoImpl class ka obj banke uske properties initialise kare IOC 
	
	public int insert(Student student) 
	{	
		// insert query
		String myquery = "insert into student(id,name,city) values(?,?,?) "; 
		int result = this.jdbcTemplate.update(myquery , student.getId(), student.getName(), student.getCity());

		System.out.println("Records inserted : " +result);
		return result;
	}

	public int change(Student student) 
	{
		// updating data
		String myquery = "update student set name=? , city=? where id=? ";
		int result = this.jdbcTemplate.update(myquery, student.getName(), student.getCity(), student.getId());
		
		System.out.println("Records updated : " +result);
		return result;
	}	

	public int delete(int studentId) 
	{
		// delete operation
		String myquery = "delete from student where id=?";
		int result = this.jdbcTemplate.update(myquery, studentId);
	
		System.out.println("Records deleted : " +result);
		return result;
	}

	/* SELECT query Operation : 
			public T queryForObject( String sqlQuery , RowMapper<T> rowMapper , Object args )
			public List<T> query( String sqlQuery , RowMapper<T> rowMapper )
			
		# [Here doing Obj Relational Mapping ] => Row mapper converts "ResultSet obj" to "Entity Class object" (like to - Student class obj)	
			Row uthayega -> entity class ka obj dega
	*/
	
	public Student getStudent(int studentId) 
	{
		// Selecting single student data
		String myquery = "select * from student where id=?";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();									// Here direclty we won't create obj of RowMapper , inspite we will use obj of its implementation class.
		Student student = this.jdbcTemplate.queryForObject(myquery, rowMapper  , studentId);	// calling RowMapper's queryForObject() method
		
		return student;
	}   
	
	public List<Student> getAllStudents() 
	{
		// Selecting multiple students
		String myquery = "select * from student";
		List<Student> students = this.jdbcTemplate.query(myquery, new RowMapperImpl());  // here if want to put some parameter into myquery then we we can put them from our 3rd paramters as well.
		
		return students;
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

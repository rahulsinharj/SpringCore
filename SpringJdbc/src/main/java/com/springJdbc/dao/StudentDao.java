package com.springJdbc.dao;

import java.util.List;

import com.springJdbc.entites.Student;

public interface StudentDao {				// interface - for maintaining loose coupling

	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
}

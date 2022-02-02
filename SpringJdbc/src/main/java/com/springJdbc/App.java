package com.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springJdbc.dao.StudentDao;
import com.springJdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("My program Started....");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springJdbc/config.xml");
     
//	        // Sping JDBC => JdbcTemplate
//	    	JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
//	        
//	    	// insert query
//	    	String query = "insert into student(id,name,city) values(?,?,?) "; 
//	        
//	    	// Fire the query
//	    	int result = template.update(query , 105, "Raj Kumar", "Noida" );
//	    	System.out.println("Num of record inserted : " +result);
        
        
        StudentDao sdao = (StudentDao) context.getBean("studentDaoImpl");
        
        //INSERT Operation
//        Student s1 = new Student();
//        s1.setId(108);					// We should take these student values from user through a html form kind of thing, not like this as hardCoded value.
//        s1.setName("Pramod Kumar"); 
//        s1.setCity("Punjab");
//        sdao.insert(s1);        
    	
    	//UPDATE Operation
//    	Student s2 = new Student();
//    	s2.setId(104);
//    	s2.setName("Varun Sinha");
//    	s2.setCity("Noida");
//    	sdao.change(s2);
    	
    	//DELETE Operation
//        sdao.delete(108);
        
    } 
} 

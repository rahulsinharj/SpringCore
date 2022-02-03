package com.springJdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration					// Ye ye batata hai ki iss class ko as congif.xml file ke quivalent hi treat karo
@ComponentScan(basePackages = {"com.springJdbc"})
public class JdbcConfig {

	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/newdb");
		ds.setUsername("root");
		ds.setPassword("rahulrj");
		return ds;
		
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
	}

// # Inspite of doing below things, we can also do it by - making StudentDaoImpl class as @Component , and adding @ComponentScan(basePackages = "{ }") 
	
//	@Bean("studentDaoImpl")
//	public StudentDao getStudentDao()
//	{
//		StudentDaoImpl studentDao = new StudentDaoImpl();
//		studentDao.setJdbcTemplate(getTemplate());
//		
//		return studentDao;	
//	}
	

	
}

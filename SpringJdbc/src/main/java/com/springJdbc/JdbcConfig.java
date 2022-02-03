package com.springJdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJdbc.dao.StudentDao;
import com.springJdbc.dao.StudentDaoImpl;

@Configuration					// Ye ye batata hai ki iss class ko as congif.xml file ke quivalent hi treat karo
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
	
	@Bean("studentDaoImpl")
	public StudentDao getStudentDao()
	{
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate());
		
		return studentDao;	
	}
}

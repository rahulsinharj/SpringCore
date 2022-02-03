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

	@Bean("ds")							// here even @Bean will work fine, and mentioning @Bean("ds") is not required at all, because by our own we won't call this DataSource obj by "ds" name. Its just that this obj is required by JdbcTemplate obj instantiation
 	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/newdb");
		ds.setUsername("root");
		ds.setPassword("rahulrj");
		return ds;
		
	}

	@Bean("jdbcTemplate")				// here even @Bean will work fine, and mentioning @Bean("jdbcTemplate") is not required at all, because by our own we won't call this JdbcTemplate obj by "jdbcTemplate" name. Its just that this obj is required by StudentDaoImpl obj instantiation
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
	}

// # Inspite of doing below things, we can also do it by - adding here @ComponentScan(basePackages = "{ }") , and making StudentDaoImpl class as @Component 
	
//	@Bean("studentDaoImpl")
//	public StudentDao getStudentDao()
//	{
//		StudentDaoImpl studentDao = new StudentDaoImpl();
//		studentDao.setJdbcTemplate(getTemplate());
//		
//		return studentDao;	
//	}
	

	
}

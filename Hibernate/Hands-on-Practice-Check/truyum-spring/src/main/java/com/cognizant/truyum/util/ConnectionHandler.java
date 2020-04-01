package com.cognizant.truyum.util;

import java.sql.Connection;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class ConnectionHandler {
	static Connection con;
//	public static Connection getConnection() {
	  
//		try {
//			String url="jdbc:mysql://localhost:3306/mydb";
//			String username="root";
//			String pass="root";
//			 con=DriverManager.getConnection(url,username,pass);
//			System.out.println("Connection Successful"); 
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return con;
//	}
//	
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		// MySQL database we are using
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/moviecruiser");
//		dataSource.setUsername("root");
//		dataSource.setPassword("root");
//		return dataSource;
//	}
//
//	@Bean
//	public JdbcTemplate jdbcTemplate() {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate();
//		jdbcTemplate.setDataSource(dataSource());
//		return jdbcTemplate;
//	}

//	@Bean
//	public UserServiceImpl UserServiceMethod() {
//		UserServiceImpl user = new UserServiceImpl();
//		user.setJdbcTemplate(jdbcTemplate());
//		return user;
//	}
	
	@Bean
	public InternalResourceViewResolver resolver() {
	    InternalResourceViewResolver vr = new InternalResourceViewResolver();
	    vr.setPrefix("/WEB-INF/jsp/");
	    vr.setSuffix(".jsp");
	    return vr;
	}
	



}

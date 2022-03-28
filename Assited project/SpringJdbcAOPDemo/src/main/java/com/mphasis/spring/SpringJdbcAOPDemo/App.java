package com.mphasis.spring.SpringJdbcAOPDemo;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mphasis.spring.SpringJdbcAOPDemo.db.employeeDB;
import com.mphasis.spring.SpringJdbcAOPDemo.model.Employee;


@Configuration
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
     
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(App.class);
        employeeDB emp=context.getBean(employeeDB.class);
        Employee E1 =new Employee(1,"raham",38789.23,"IT");
       // Employee E2 =new Employee(2,"deepu","IT",0226);
        System.out.println(emp.getEmployeeById(1));
        System.out.println(emp);
        for(Employee e:emp.getEmployees())
        	System.out.println(e);
        
    }
    @Bean
    
    public DataSource dataSource()
    {
    	System.out.println("connecting to db");
    	DriverManagerDataSource ds = new DriverManagerDataSource();
    	
    	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
    	ds.setUrl("jdbc:mysql://localhost:3306/employee");
    	ds.setUsername("root");
    	ds.setPassword("raham8143");
    	return ds;
    }
    @Bean
    @Autowired
    public JdbcTemplate template(DataSource ds)
    {
    	System.out.println("connecting jdbc template");
    	return new JdbcTemplate(ds);
    }
}

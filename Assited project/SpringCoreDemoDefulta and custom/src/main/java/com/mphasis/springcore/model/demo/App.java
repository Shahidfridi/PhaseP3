package com.mphasis.springcore.model.demo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.mphasis.springcoremodel.Author;
import com.mphasis.springcoremodel.Doctor;
import com.mphasis.springcoremodel.Patient;

public class App {

	public static void main(String[] agrs) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-anno.xml");
	/*	Author author1=(Author)context.getBean("a1");
		System.out.println(author1);
		Author author2=(Author)context.getBean("a2");
        System.out.println(author2);*/
        
        Patient p1=(Patient)context.getBean("a1");
        System.out.println(p1);
        
        Doctor d1=context.getBean(Doctor.class);
        System.out.println(d1);
         
      
        
        
		
		}
	
}

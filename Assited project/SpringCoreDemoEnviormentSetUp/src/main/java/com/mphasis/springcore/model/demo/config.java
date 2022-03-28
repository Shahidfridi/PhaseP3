package com.mphasis.springcore.model.demo;

import java.lang.annotation.Annotation;
import java.security.PublicKey;
import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mphasis.springcore.model.demo.Singer.CallDemo;
import com.mphasis.springcore.model.demo.Singer.Singer;
import com.mphasis.springcoremodel.Doctor;
import com.mphasis.springcoremodel.Patient;

@Configuration
@ComponentScan(basePackages= {"com.mphasis.springcoremodel",
               "com.mphasis.springcore.model.demo.Singer",
		"com.mphasis.springcore.model.demo.Singer"
}  
		)

public class config {
	public static void main(String[] agrs) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		Patient d1=context.getBean(Patient.class);
		System.out.println(d1);
		Singer s1=context.getBean(Singer.class);
		s1.singing();
		CallDemo cdemo=context.getBean(CallDemo.class);
		System.out.println(cdemo.getFruits());
		System.out.println(cdemo.getCertificates());
	}
		@Bean
		public List<String> getFruits()
		{
			System.out.println("getting furtis");
			return Arrays.asList("apples","Bannans","Oranges");
		}
		@Bean
		public Set<String> getCertificates(){
			System.out.println("getting Certificates");
			Set<String>set=new HashSet<String>();
			set.add("java");
			set.add("python");
			set.add("c++");
			return set;
		}
	


	

}

package com.mphasis.web.springBootWebDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.mphasis.web.springBootWebDemo.entity.Product;
import com.mphasis.web.springBootWebDemo.service.ProductService;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
@ComponentScan
public class SpringBootWebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebDemoApplication.class, args);
	}
	@Autowired
	private ProductService service;
	
	@Bean
	public void products()
	{
		this.service.insertProduct(new Product(1, "Pencil", "Used for writing", 30));
		this.service.insertProduct(new Product(2, "Laptop", "Apple MAC", 800000));
		this.service.insertProduct(new Product(3, "Speaker", "Sony HD", 30000));
	}
	@Bean
	public OpenAPI openapi()
	{
		return new OpenAPI().info(new Info()
				.description("This is basic Swagger demo for developers ")
				.title("Product manegement system")
				.contact(new Contact().email("contact@raham.com")
						.name("rahamthulla")
						)
				);
	}
	

}

package com.mphasis.boot.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mphasis.boot.springBootDemo.entity.Product;
import com.mphasis.boot.springBootDemo.service.ProductService;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		ProductService service = context.getBean(ProductService.class);
		System.out.println(service.count());
		Product p1 = new Product();
		p1.setPid(20);
		p1.setPname("Pencil");
		p1.setDescprition("Apsara pencil");
		p1.setPrice(20);
		Product p2 = new Product();
		p2.setPname("Eraser");
		p2.setDescprition("Apsara erasers");
		p2.setPrice(5);
		
		Product p4 = new Product();
		p4.setPname("Notebook");
		p4.setDescprition("For writing");
		p4.setPrice(50);
		
    	service.insertProduct(p1);
		service.insertProduct(p2);
		int id = service.insertProduct(p4);
		if(id!=-1)
			p4.setPid(id);
		
		
        System.out.println(service.getAllProducts());
        System.out.println(service.getProductById(20));
        System.out.println(service.getProductById(21));
//		System.out.println();
		p1.setPid(1);
		p1.setDescprition("Apsara pencils for writing");
		service.updateProduct(p1);
	}

}



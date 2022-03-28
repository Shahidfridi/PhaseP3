package com.consumer.SpringBootConsumerDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ProductsPages {
	
	@GetMapping("/fetch")
	public String fetchAllProducts() {
		RestTemplate template=new RestTemplate();
		return template.getForObject("http://localhost:8096/products",String.class);
	}
	@PostMapping("/add")
	public Product insert(@RequestBody Product p)
	{
		RestTemplate template=new RestTemplate();
		Product p1=template.postForObject("http://localhost:8096/products",p,Product.class);
		return p1;
	}
}

package com.mphasis.web.springBootWebDemo.mvc;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/hello")
	public String messasge()
	{
		System.out.println("messing sending...");
		return "welcome";
	}
	@Generated("/")
	public String homePage()
	{
		System.out.println("message sending...");
		return "index";
	}

}

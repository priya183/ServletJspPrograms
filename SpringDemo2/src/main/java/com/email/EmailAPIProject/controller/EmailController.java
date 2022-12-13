package com.email.EmailAPIProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	//if method not specify, by default it will GET method
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Hello this is my Email API";
	}

}

package com.ecomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class MyController {

	@RequestMapping("/login")
	public String showLoginPage()
	{
		System.out.println("==I am in My Controller--Login Page==");
		return "Login";
	}
	
}

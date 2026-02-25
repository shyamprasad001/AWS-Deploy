package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
	@GetMapping("/home")
	public String rocks() {
		return "This is my fisrt aws deployment project";
	} 
	
	@GetMapping("/cse")
	public String rocks1() {
		return "Welcome to my project";
	}
}

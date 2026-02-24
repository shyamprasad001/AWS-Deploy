package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
	@GetMapping("/home")
	public String rocks() {
		return "Welcome to Jenkins AWS From YDP SIR";
	} 
	
	@GetMapping("/cse")
	public String rocks1() {
		return "Welcome to Third year cse from aditya University";
	}
}

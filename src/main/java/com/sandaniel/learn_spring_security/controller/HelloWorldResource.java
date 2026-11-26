package com.sandaniel.learn_spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldResource {
	
	@GetMapping()
	public String HelloWorld() {
		return "Hello World";
	}
	
}

package com.rest.microservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {

	@RequestMapping("/hello")
	public String display() {
		return "Hello World";
	}
}

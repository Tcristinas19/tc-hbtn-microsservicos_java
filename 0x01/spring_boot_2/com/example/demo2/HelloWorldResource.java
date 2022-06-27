package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class HelloWorldResource {
	
	@GetMapping("/home")
	@ResponseStatus(HttpStatus.OK)
	public String home() {
		return "PROJETO MAVEN (SPRING INITIALIZR) CRIADO COM SUCESSO !!!";
	}
}
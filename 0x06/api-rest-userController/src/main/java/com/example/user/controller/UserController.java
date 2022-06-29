package com.example.user.controller;

import org.springframework.web.bind.annotation.*;

import com.example.user.exception.CPFException;
import com.example.user.exception.UserIdException;
import com.example.user.exception.UserNameException;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping("/user-id{id}")
	public String findUserById(@PathVariable int id) {
		if(id < 0 || id > 100)
			throw new UserIdException(String.valueOf(id));
		return "You have entered valid ID";
	}
	
	@GetMapping("/user-name/{userName}")
	public String findUserName(@PathVariable String userName) {
		if(userName.length() < 3 || userName.length() > 15)
			throw new UserNameException(userName);
		return "You have entered valid USERNAME";
	}
	
	@GetMapping("/user-cpf/{cpf}")
	public String findUserByCPF(@PathVariable String cpf) {
		if(cpf.length() < 3 || cpf.length() > 15)
			throw new CPFException(cpf);
		
		return "You have entered valid CPF";
	}
}
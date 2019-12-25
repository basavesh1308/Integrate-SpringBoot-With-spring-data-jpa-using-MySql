package com.basaveshinfo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basaveshinfo.entity.User;
import com.basaveshinfo.repository.UserRepository;

@RestController
@RequestMapping("/usersprofile")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/add")
	public User create() {
		System.out.println("create controller");
		return userRepository.save(new User(123,"Basavesh", 28));
	}
	
	@GetMapping("/users")
	public List<User> fetchAll(){
		
		return userRepository.findAll();
		
	}
}

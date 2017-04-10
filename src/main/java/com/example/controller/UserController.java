package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.implement.UserImplement;
import com.example.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserImplement userImplement;
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public void getUser(User user){
		userImplement.saveUser(user);
	}
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public User insertUser(User user){
		userImplement.saveUser(user);	
		return user;
	}
	@RequestMapping(value="/user",method=RequestMethod.DELETE)
	public void deleteUser(User user){
		userImplement.saveUser(user);
		
	}
	@RequestMapping(value="/user",method=RequestMethod.PUT)
	public void modifyUser(User user){
		userImplement.saveUser(user);
	}
}

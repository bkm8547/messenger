package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.UserDomain;
import com.example.repository.UserRepository;

@RestController

public class UserController {
	@Autowired
	UserRepository userRepository;
	@RequestMapping(value="/User",method=RequestMethod.GET)
	public void getUser(UserDomain user){
		userRepository.findOne(user.getId());
	}
	@RequestMapping(value="/User",method=RequestMethod.POST)
	public void insertUser(UserDomain user){
		userRepository.save(user);		
	}
	@RequestMapping(value="/User",method=RequestMethod.DELETE)
	public void deleteUser(UserDomain user){
		userRepository.delete(user);
		
	}
	@RequestMapping(value="/User",method=RequestMethod.PUT)
	public void modifyUser(UserDomain user){
		UserDomain dbUser=userRepository.findOne(user.getId());
		user.setId(dbUser.getId());
		userRepository.save(user);
	}
}

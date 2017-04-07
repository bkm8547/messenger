package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MessageController {
	@RequestMapping(value="/Message",method=RequestMethod.GET)
	public void getMessage(){
		
	}
	@RequestMapping(value="/Message",method=RequestMethod.POST)
	public void insertMessage(){
		
	}
	@RequestMapping(value="/Message",method=RequestMethod.DELETE)
	public void deleteMessage(){
		
	}
	@RequestMapping(value="/Message",method=RequestMethod.PUT)
	public void modifyMessage(){
		
	}
}

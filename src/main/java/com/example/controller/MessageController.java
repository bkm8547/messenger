package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MessageController {
	@RequestMapping(value="/message",method=RequestMethod.GET)
	public void getMessage(){
		
	}
	@RequestMapping(value="/message",method=RequestMethod.POST)
	public void insertMessage(){
		
	}
	@RequestMapping(value="/message",method=RequestMethod.DELETE)
	public void deleteMessage(){
		
	}
	@RequestMapping(value="/message",method=RequestMethod.PUT)
	public void modifyMessage(){
		
	}
}

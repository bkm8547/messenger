package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
	@RequestMapping(value="/room",method=RequestMethod.GET)
	public void getRoom(){
		
	}
	@RequestMapping(value="/room",method=RequestMethod.POST)
	public void insertRoom(){
		
	}
	@RequestMapping(value="/room",method=RequestMethod.DELETE)
	public void deleteRoom(){
		
	}
	@RequestMapping(value="/room",method=RequestMethod.PUT)
	public void modifyRoom(){
		
	}
}

package com.aciworldwide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aciworldwide.entities.User;
import com.aciworldwide.services.UserService;
//comes in Presentation Layer and is request processing component
@Controller
public class LogiController {
	//used to invoke business layer
	@Autowired
	private UserService userservice;
	
	//request processing method
	@RequestMapping("/signin")//handle mapping- to map request URL with 
	public String validateUser(User user,ModelMap map) {
		if(userservice.isValid(user)) {
			map.addAttribute("uname", user.getUsername());
			return "success";
		}else {
			map.addAttribute("logonerror", "Invalid Username/Password");
			return "login";
		}
	}
}

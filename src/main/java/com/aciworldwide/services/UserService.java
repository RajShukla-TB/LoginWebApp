package com.aciworldwide.services;

import org.springframework.stereotype.Service;
//Business Layer Interface

import com.aciworldwide.entities.User;
//store of Business layer interface
public interface UserService {
	//Business Logic Method
	boolean isValid(User user);
}

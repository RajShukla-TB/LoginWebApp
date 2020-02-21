package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;
//Business Layer Implementer-----Business layer
@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean isValid(User user) {
		// TODO Auto-generated method stub
		if(user!=null && user.getUsername().equals("Yay") && user.getPassword().equals("Password")) {
			return true;
		}
		return false;
	}
	
	
}

package com.ashokit.service;

import org.springframework.stereotype.Service;


@Service
public class WelcomeService {
	
	public String getwelcomeMsg() {
		 String msg="Good Morning";
		 return msg;
	}
	
	public String getLogin() {
		String msg="User Login Successfully";
		return msg;
	}

	public String getEmail() {
		System.out.println("welcome service call");
		String email="ajay@123";
		return email;
	}
}

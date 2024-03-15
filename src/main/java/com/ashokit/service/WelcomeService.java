package com.ashokit.service;

import org.springframework.stereotype.Service;


@Service
public class WelcomeService {
	
	public String getwelcomeMsg() {
		 String msg="Good Morning";
		 return msg;
	}
	
	public String getLogin() {
		System.out.println("getLogin method()...!!called");
		String msg="User Login Successfully";
		return msg;
	}

	public String getEmail() {
		System.out.println("getEmail() method called");
		String email="ajay@123";
		return email;
	}
}

package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.service.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeService welcomeService;
	
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		System.out.println("welcome service call");
		String responseMsg = welcomeService.getwelcomeMsg();
		return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
		
	}
	
	@GetMapping("/login")
	public ResponseEntity<String> loginPage(){
		String login = welcomeService.getLogin();
		return new ResponseEntity<String>(login,HttpStatus.OK);
	}
	
	@GetMapping("/email")
	public String userEmail() {
		String email = welcomeService.getEmail();
		return email;
	}

}

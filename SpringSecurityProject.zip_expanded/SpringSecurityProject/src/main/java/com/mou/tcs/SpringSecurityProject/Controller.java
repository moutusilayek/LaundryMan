package com.mou.tcs.SpringSecurityProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	
	@GetMapping("/")
	public String getLanding() {
		return "Hello All";
	}
	
	
     @RequestMapping("/user")
	public String getLandingUser() {
		System.out.println("in methods user");
		return "Hello User";
	}
	
	
	
     @RequestMapping("/admin")
	public String getLandingAdmin() {
		System.out.println("in methods admin");
		return "Admin";
	}

}

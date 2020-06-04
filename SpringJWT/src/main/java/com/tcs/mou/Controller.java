package com.tcs.mou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {
	
	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	UserDetailsService service;
	
	@Autowired
	JWTUtil jwtUtil;
	
	
	@Autowired
	ObjectMapper mapper;
	
	@RequestMapping("/validateJWT")
	public String validateJWT() {
		//System.out.println("validateJWT"+SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
		
		if(SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {
			return "JWT validated";
		}else {
			//mapper.getJsonFactory().
			return "JWS token manipulated";
		}
	
		
	}
	
	@RequestMapping(value="/authenticate" , method=RequestMethod.POST)
	public ResponseEntity<AutheticationResponse> autheticateUser(@RequestBody AuthenticationRequest authRequest ) {
		System.out.println("in authentication");
		authManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(),authRequest.getPassword()));		
		final UserDetails user=service.loadUserByUsername(authRequest.getUsername());		
		String jwt=jwtUtil.generateToken(user);		
		return ResponseEntity.ok(new AutheticationResponse(jwt));
		
	}
	
	

}

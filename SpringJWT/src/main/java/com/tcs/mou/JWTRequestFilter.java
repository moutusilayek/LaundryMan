package com.tcs.mou;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class JWTRequestFilter extends OncePerRequestFilter {
	
	@Autowired
	UserDetailsService service; 
	
	
	@Autowired
	JWTUtil util;
	
	@Autowired
	ApplicationContext context;
	
	private final ObjectMapper mapper = new ObjectMapper();
	
	
	

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String authorization=request.getHeader("Authorization");
		System.out.println("inside filter");
	
		if(authorization!=null && authorization.contains("Bearer ")){
			String jwt=authorization.substring(7);
			
			
			try {
				String userName=util.getUsernameFromToken(jwt);
				
				System.out.println("token userName from jwt"+userName);
			if(userName!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
				UserDetails userDetails=service.loadUserByUsername(userName);
				
				System.out.println("userDetails"+userDetails.getUsername());
				
				if(util.validateToken(jwt, userDetails)) {
					UsernamePasswordAuthenticationToken authReqToken= new UsernamePasswordAuthenticationToken(userDetails.getPassword(),null, userDetails.getAuthorities());
					authReqToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
					SecurityContext sc = SecurityContextHolder.getContext();
					sc.setAuthentication(authReqToken);
					
					System.out.println("authReqToken"+authReqToken);
					
				}
			}
			}catch(Exception ex) {
				 Map<String, Object> errorDetails = new HashMap<>();
			        errorDetails.put("message", "Invalid token");
			        mapper.writeValue(response.getWriter(), errorDetails);
				
				SecurityContextHolder.getContext().getAuthentication().setAuthenticated(false);
			}
			
		}
		System.out.println("inside filter chin");
		filterChain.doFilter(request, response);
	}



   @Bean
	public ObjectMapper getMapper() {
		return mapper;
	}

}

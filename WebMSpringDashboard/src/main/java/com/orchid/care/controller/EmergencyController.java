package com.orchid.care.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.orchid.care.model.User;

@Controller
@SessionAttributes("User")
public class EmergencyController {
	

	@RequestMapping(value="/emergencyAssistance")
	public ModelAndView emergencyAssistance(@SessionAttribute("User") User user) {		
		ModelAndView mv=new ModelAndView();
		mv.addObject("username", user.getUserName());
		mv.setViewName("Emergency");
		double token=Math.random();
		System.out.println("token-->" + token);
		return mv;
	}
	
	
	//@RequestMapping(value="/generateToken")
	public ModelAndView generateToken() {
		double token=Math.random();
		ModelAndView mv=new ModelAndView();
		
		return mv;
		
	}
}

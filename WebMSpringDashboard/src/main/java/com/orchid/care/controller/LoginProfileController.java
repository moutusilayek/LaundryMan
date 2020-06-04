package com.orchid.care.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.orchid.care.model.User;


@Controller
@SessionAttributes("User")
public class LoginProfileController {
	
	private static HttpSession userSession;
	
	
	

	public static HttpSession getUserSession() {
		return userSession;
	}

	public static void setUserSession(HttpSession userSession) {
		LoginProfileController.userSession = userSession;
	}

	@RequestMapping(value="/welcome/{name}")
	
	public ModelAndView welcome(@PathVariable Map<String,String> varMap ) {
		System.out.println("Print dashboard" +varMap.get("name") );
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", varMap.get("name"));
		mv.setViewName("Welcome");
		return mv;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(@ModelAttribute ("user") User user,HttpSession userSession1 ) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("User", user);
		mv.setViewName("Login");
		//userSession=userSession1;
		//userSession.setAttribute("user", user);
		//userSession.setAttribute("userName", user.getUserName());
		return mv;
	}
	
	
	@RequestMapping(value="/register")
	public ModelAndView register(@ModelAttribute ("user") User user,HttpSession userSession1 ) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("User", user.getUserName());
		mv.setViewName("UserProfile");
		userSession=userSession1;
		userSession.setAttribute("user", user);
		userSession.setAttribute("userName", user.getUserName());
		return mv;
	}
	
	@RequestMapping(value="/homePage")
	public ModelAndView landOnHomePage() {
		ModelAndView mv=new ModelAndView();
	
		
		mv.setViewName("Home");
		
		return mv;
	}
	
	@RequestMapping(value="/aboutUsPage")
	public ModelAndView landOnAboutPage() {
		ModelAndView mv=new ModelAndView();
	
		
		mv.setViewName("AboutUs");
		
		return mv;
	}
	
	
	
	

}

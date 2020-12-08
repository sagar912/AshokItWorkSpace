package com.sagar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcomecontrollers {
	
	@GetMapping("/home")
	public String welcome(Model model) {
	
		String msg=null;
		msg.toLowerCase();
		model.addAttribute("Msg", "Hello Welcome to this area...");
	
		return "welcome";
	}

	@ExceptionHandler(value=NullPointerException.class)
	public String handleException(Model m) {
		
		m.addAttribute("ErrorMsg", "Something Goes Wrong...We are Working On it..");
		
		return "error";
	}

}
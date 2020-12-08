package com.sagar.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler{
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handle(Model m) {
		
		String ErrorMsg="Something Went Wrong We are Working on it...";
		m.addAttribute("ErrorMsg",ErrorMsg);
		
		return "error";
	}
	
}



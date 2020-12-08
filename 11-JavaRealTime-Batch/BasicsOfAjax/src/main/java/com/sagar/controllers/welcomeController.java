package com.sagar.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class welcomeController {

	@RequestMapping(value= {"/"})
	public String loadForm(){

		return "welcome";
	}			
			
					

//==================================================================//	
	@RequestMapping(value= {"/welcome"})
	
	public @ResponseBody String getNameForm(final @RequestParam("name")String name) {
	if(null !=name && !"".equals(name)) {
		return "Hello, "+ name;	
		}else {
	    return "";
	}

	
	}
	
	
	}
	


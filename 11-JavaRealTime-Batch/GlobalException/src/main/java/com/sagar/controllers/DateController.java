package com.sagar.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping(value="/time")
	public String showTime(Model model) {
	
		model.addAttribute("Msg", new Date());
		String Msg=null;
		Msg.toUpperCase();	
    	return "time";
		}
}

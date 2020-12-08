package com.sagar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sagar.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookservice;
	
	@GetMapping("/findPriceById")
	public String getPriceById(@RequestParam("bookid") String bookid,Model model) {
		
		Double BookPrice = bookservice.findPriceById(bookid);
		model.addAttribute("price", "Book Price::"+BookPrice);
		return "display";
	}
}

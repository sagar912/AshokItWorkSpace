package com.sagar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sagar.model.Product;
import com.sagar.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@GetMapping(value="/getProduct",produces= {"application/json"})
	public Product getPriceById(@RequestParam("pid") String pid,Model model) {
		
		return productservice.findProductById(Integer.parseInt(pid));
	}
}

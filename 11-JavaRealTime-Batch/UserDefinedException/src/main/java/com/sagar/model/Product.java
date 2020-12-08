package com.sagar.model;

import lombok.Data;

@Data
public class Product {

	private String pid;
	private String pname;
	private Double price;
	
	public Product(String pid, String pname, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	
	
}

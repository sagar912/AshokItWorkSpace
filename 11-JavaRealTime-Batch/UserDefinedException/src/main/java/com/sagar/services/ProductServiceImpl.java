package com.sagar.services;

import org.springframework.stereotype.Service;

import com.sagar.exceptions.NoBookFoundException;
import com.sagar.exceptions.NoProductFoundException;
import com.sagar.model.Product;

@Service
public class ProductServiceImpl implements ProductService {


	@Override
	public Product findProductById(int pid) {

		if(pid==101) {
			
		return new Product("101","Keyboard",800.00);
		}else {
			
			throw new NoProductFoundException("No Product Found");
		}
	}

	
	
}

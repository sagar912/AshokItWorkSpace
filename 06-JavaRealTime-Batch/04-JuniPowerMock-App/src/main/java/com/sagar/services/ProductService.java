package com.sagar.services;

import java.util.List;

import com.sagar.model.Product;

public interface ProductService {
	
public String findProductById(int i);

public List<Product> findAllProduct();

	

}

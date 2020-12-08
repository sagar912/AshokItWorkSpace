package com.sagar.services;

import org.springframework.stereotype.Service;

import com.sagar.model.Product;

@Service
public interface ProductService {

	public Product findProductById(int pid);
}

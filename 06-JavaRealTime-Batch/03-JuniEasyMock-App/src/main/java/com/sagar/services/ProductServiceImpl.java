package com.sagar.services;

import java.util.List;

import com.sagar.dao.ProductDao;
import com.sagar.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	
	public void setContactDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public String findProductById(int i) {

		String productById = productDao.getProductById(i);
		String p=productById.toUpperCase();
		
		return p;
	}

	public List<Product> findAllProduct() {
   
		List<Product> list = productDao.getAllProduct();
		
		return list;
	}

	
}
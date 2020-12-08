package com.sagar.dao;

import java.util.List;

import com.sagar.model.Product;

public interface ProductDao {

  public String getProductById(int i);
  
  public List<Product> getAllProduct();
}

package com.sagar.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sagar.dao.ProductDao;
import com.sagar.model.Product;
import com.sagar.services.ProductServiceImpl;

public class ProductServiceTest {


	private static ProductServiceImpl productService;

ProductDao daoProxy = EasyMock.createMock(ProductDao.class);
//==============================================================================================//
//===========================================================================================//
@Test
public void getNameById(){

      EasyMock.expect(daoProxy.getProductById(101)).andReturn("Sagar");
	String name = productService.findProductById(101);

	  productService =new ProductServiceImpl();
	  productService.setContactDao(daoProxy);

	assertNotNull(name);
 }

@Test
public void getAllProductName(){
        
          ArrayList al =new ArrayList();
	  EasyMock.expect(daoProxy.getAllProduct()).andReturn(al);
	  List<Product> list = productService.findAllProduct();

	
	  productService =new ProductServiceImpl();
	  productService.setContactDao(daoProxy);

	  assertNotNull(list);
 }
	
}
	



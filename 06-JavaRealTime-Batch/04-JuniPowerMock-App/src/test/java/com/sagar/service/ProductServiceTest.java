package com.sagar.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.sagar.dao.ProductDao;
import com.sagar.exceptions.NoDataException;
import com.sagar.model.Product;
import com.sagar.services.ProductServiceImpl;

public class ProductServiceTest<expected> {

//==============================================================================================//

@Test
public void getNameById(){
	ProductServiceImpl service = new ProductServiceImpl();

	ProductDao daoMock = PowerMockito.mock(ProductDao.class);
	when(daoMock.getProductById(101)).thenReturn("Jon");

	service.setContactDao(daoMock);
	
	String name = service.findProductById(101);
	
	assertNotNull(name);
 }

@Test
public void getAllNames() {
	
	ProductServiceImpl service =new ProductServiceImpl();
	ProductDao daoMock =PowerMockito.mock(ProductDao.class);
	service.setContactDao(daoMock);
	ArrayList<Product> al=new ArrayList<Product>();
	when(daoMock.getAllProduct()).thenReturn(al);
	
	List<Product> list = service.findAllProduct();
	assertNotNull(list);
	
}
}
	



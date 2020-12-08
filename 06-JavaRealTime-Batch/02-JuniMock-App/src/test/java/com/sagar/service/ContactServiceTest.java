package com.sagar.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.sagar.dao.ContactDao;
import com.sagar.exception.NodataException;
import com.sagar.model.Contact;
import com.sagar.services.ContactServiceImpl;

public class ContactServiceTest {

	private static ContactServiceImpl contactService=null;

@BeforeClass
public static void init() {

	ContactDao daoProxy =EasyMock.createMock(ContactDao.class);
	EasyMock.expect(daoProxy.findNameById(101)).andReturn("Ashok");
	EasyMock.replay(daoProxy);
	 
	     contactService = new ContactServiceImpl();
		contactService.setContactDao(daoProxy);
}  

@Test
public void getNameById(){
 String name = contactService.getNameById(101);
		assertNotNull(name);
 }
	
}
	



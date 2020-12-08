package com.sagar.services;

import java.util.List;

import com.sagar.model.Contact;

public interface ContactService {
	
	public String getNameById(int id);
	
	public List<String> getAllNames();
	
	public Contact getById(int id);

}

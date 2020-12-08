package com.sagar.dao;

import java.util.List;

import com.sagar.model.Contact;

public interface ContactDao {

	public String findNameById(int i);
	
	public List<String> findAllNames();
	
	public Contact findContactById(int i);
}

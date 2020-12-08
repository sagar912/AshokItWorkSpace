package com.sagar.services;

import java.util.List;

import com.sagar.dao.ContactDao;
import com.sagar.exception.NodataException;
import com.sagar.model.Contact;

public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao;

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

//=============================================Method 1=============================================//
	public String getNameById(int id) {

		String name = contactDao.findNameById(id);

		String format = name.toUpperCase();

		return format;
	}

//=============================================Method 2=============================================//

	public List<String> getAllNames() {

		List<String> list = contactDao.findAllNames();

		return list;
	}

//=============================================Method 3=============================================//

	public Contact getById(int id) {

		Contact contact = contactDao.findContactById(id);

		if (contact == null) {
			throw new NodataException("No Data Found");
		}

		return contact;

	}
}

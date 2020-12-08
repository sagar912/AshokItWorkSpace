package com.sagar.services;

import org.springframework.stereotype.Service;

import com.sagar.exceptions.NoBookFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Double findPriceById(String bookid) {

		if(bookid.equals("B101")) {
			return 450.00;
		}else {
			throw new NoBookFoundException("No Book Found With given id");
		}
	}

	
	
}

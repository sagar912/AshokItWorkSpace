package com.sagar.services;

import org.springframework.stereotype.Service;

@Service
public interface BookService {

	public Double findPriceById(String bookid);
}

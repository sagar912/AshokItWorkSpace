package com.sagar.exceptions;

public class NoBookFoundException extends RuntimeException{

	private static final long serialVersionUID = 8760075279422953986L;

	public NoBookFoundException(String msg) {

		super(msg);
	}
}

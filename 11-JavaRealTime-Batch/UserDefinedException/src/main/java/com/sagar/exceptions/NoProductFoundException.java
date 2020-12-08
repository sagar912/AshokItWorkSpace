package com.sagar.exceptions;

public class NoProductFoundException extends RuntimeException{


	private static final long serialVersionUID = 9002369655497364870L;

	public NoProductFoundException(String msg) {

		super(msg);
	}
}

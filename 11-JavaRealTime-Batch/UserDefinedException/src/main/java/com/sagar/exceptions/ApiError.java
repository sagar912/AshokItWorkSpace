package com.sagar.exceptions;

import java.util.Date;

import lombok.Data;

@Data
public class ApiError {

	private int errorCode;
	private String errorDesc;
	private Date date;
	
	public ApiError(int errorCode, String errorDesc, Date date) {
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
		this.date = date;
	}
	
	
}

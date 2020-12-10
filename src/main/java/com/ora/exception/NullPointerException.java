package com.ora.exception;

public class NullPointerException extends Exception{
	
	
	public NullPointerException(String message) {
		super(message);
		System.out.println(message);
	}

}


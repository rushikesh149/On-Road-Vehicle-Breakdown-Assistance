package com.ora.exception;

public class RollbackException extends Exception{
	
	public RollbackException(String message) {
		super(message);
		System.out.println(message);
	}
}


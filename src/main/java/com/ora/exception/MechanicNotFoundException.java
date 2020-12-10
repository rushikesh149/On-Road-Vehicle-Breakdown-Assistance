package com.ora.exception;

public class MechanicNotFoundException extends Exception{
	
	public MechanicNotFoundException(String message)
	{
		super(message);
		System.out.println(message);
	}

}


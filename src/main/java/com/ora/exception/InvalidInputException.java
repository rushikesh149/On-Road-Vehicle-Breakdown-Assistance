package com.ora.exception;
public class InvalidInputException extends Exception{
                
	 String message;
	 
	 public InvalidInputException(String message) {
		 super(message);
	 }
}

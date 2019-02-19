package com.thoughtworks.conftrackmgmnt.exception;

import com.thoughtworks.conftrackmgmnt.constants.FileInputProviderConstants;



public class InvalidInputException extends Exception {
	
	public InvalidInputException(String message){
		super("Invalid input line:"+ message);
	}
}

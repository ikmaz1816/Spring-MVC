package com.springmvc.exception;

@SuppressWarnings("serial")
public class StudentNotFoundException extends Exception{
	public StudentNotFoundException(String message)
	{
		super(message);
	}
}

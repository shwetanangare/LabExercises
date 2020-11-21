package com.capgemini.lab5;

public class NameException extends Exception
{
	String first,last;
	public NameException()
	{
		
	}
	public NameException(String first,String last)
	{
		this.first=first;
		this.last=last;
	}
	public String getMessage()
	{
		return "First name and last name are invalid";
	}
}

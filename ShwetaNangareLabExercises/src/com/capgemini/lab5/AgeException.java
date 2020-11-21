package com.capgemini.lab5;

public class AgeException extends Exception
{
	int age;
	public AgeException()
	{
		
	}
	public AgeException(int age)
	{
		this.age=age;
	}
	public String getMessage()
	{
		return "Age should be greater than 15";
	}
}

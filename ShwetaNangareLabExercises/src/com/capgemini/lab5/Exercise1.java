package com.capgemini.lab5;

import java.util.Scanner;

public class Exercise1 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		int age;
		try
		{
		System.out.println("Enter Age:");
		age=sc.nextInt();
		if(age>15)
		{
			System.out.println("Age is :"+age);
		}
		else
		{
			throw new AgeException(age);
		}
		}
		catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}

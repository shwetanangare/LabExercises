package com.capgemini.lab5;

import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args)
	{
		String first,last;
		System.out.println("Enter first name and last name");
		first=sc.nextLine();
		last=sc.nextLine();
		try
		{
			if(first.equals("") && last.equals(""))
			{
				throw new NameException();
			}
			else
			{
				System.out.println("First Name: "+first+"Last Name: "+last);
			}
		}
		catch(NameException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

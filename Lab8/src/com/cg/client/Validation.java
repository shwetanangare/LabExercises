package com.cg.client;

import java.util.Scanner;

public class Validation {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter username:");
		String username=scanner.nextLine();
		Boolean result=validate(username);
		if(result)
		{
			System.out.println("Username is valid.");
		}
		else
		{
			System.out.println("Username is invalid.");
		}

	}
	private static Boolean validate(String username) 
	{
		String last="";
		if(username.length()>=12)
		{
			last=username.substring(username.length()-4);
			if(last.equals("_job"))
			{
				return true;
			}
		}
	
		return false;
		
	}

}

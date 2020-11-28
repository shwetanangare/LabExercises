package com.cg.training.ui;

import java.util.Scanner;
import com.cg.training.service.Authentication;

public class Exercise3{
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args)
	{
		Authentication auth=(username,password)->
		{
			if(username.equals("User") && password.equals("Pass"))
			{
				return true;
			}
			return false;
		};
		
		String username;
		String password;
		
		System.out.println("Enter Username:");
		username=scanner.nextLine();
		System.out.println("Enter Password:");
		password=scanner.nextLine();
		Boolean result=auth.Authenticate(username, password);
		if(result)
		{
			System.out.println("Logged in successfully.");
		}
		else
		{
			System.out.println("Username or password is wrong.");
		}
		
	}

}

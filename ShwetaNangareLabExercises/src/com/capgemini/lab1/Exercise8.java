package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise8 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number to find if it is power of two or not");
		int n=sc.nextInt();
		if(checkNumber(n))
		{
			System.out.println("Number is power of two ");
		}
		else
		{
			System.out.println("Number is not power of two ");
		}

	}
	static boolean checkNumber(int n)
	{
		
		if(n==0)
			return false;
		else
		{
			while(n!=1)
			{
				if(n%2!=0)
				{
					return false;
				}
				n = n/2;
			}
		}
		return true;
	}
}

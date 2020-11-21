package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise3 
{
	private static Scanner sc =new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Which value is required of fibonacci series?");
		
		int first=0,second=1;
		System.out.println(second);
		for(int i=0;i<10;i++)
		{
			int third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
		System.out.println("Which value is required of fibonacci series?");
		int value =sc.nextInt();
		 first=0;
		 second=1;
		 int third=1;
		for(int i=0;i<value-1;i++)
		{
			third=first+second;
			
			first=second;
			second=third;
		}
		System.out.println(third);
	}
}

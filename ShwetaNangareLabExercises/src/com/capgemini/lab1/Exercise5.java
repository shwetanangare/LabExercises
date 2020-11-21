package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise5 
{
	private static Scanner sc =new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter number to find sum");
		int n=sc.nextInt();
		int sum=calculateSum(n);
		System.out.println("Sum of first n natural numbers divisible by 3 or 5 is "+sum);
	}
	static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{	
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}

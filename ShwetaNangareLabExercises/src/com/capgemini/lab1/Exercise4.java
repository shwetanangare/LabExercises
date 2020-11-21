package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise4 
{
	private static Scanner sc =new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number upto which you want prime numbers");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<=num;i++)
		{
			flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
				
		}
		
		
	}

}

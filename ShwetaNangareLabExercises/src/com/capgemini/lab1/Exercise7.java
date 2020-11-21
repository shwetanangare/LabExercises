package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise7 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number to find if it is increasing");
		int n=sc.nextInt();
		boolean b=checkNumber(n);
		if(b)
		{
			System.out.println("number is increasing");
		}
		else
		{
			System.out.println("number is not increasing");
		}
	}
	static boolean checkNumber(int n)
	{
		boolean b=true;
		int max=n%10;
		while(n !=0)
		{
			int rem=n%10;
			if(max<rem)
			{
				b=false;
				break;
			}
			else
			{
				max=rem;
			}
			n=n/10;
		}
		return b;
	}

}

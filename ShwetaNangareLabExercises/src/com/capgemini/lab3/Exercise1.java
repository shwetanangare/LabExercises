package com.capgemini.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter integers having space in between: ");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
		
		int sum=0;
		System.out.println("Integers are:");
		while(st.hasMoreTokens())
		{
			int a=Integer.parseInt(st.nextToken());
			System.out.println(a);
			sum=sum+a;
		}
		System.out.println("Sum is: "+sum);
	}

}

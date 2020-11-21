package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		String string;
		System.out.println("Enter String for mirror image:");
		string=sc.nextLine();
		System.out.println(new Exercise2().getImage(string));
		
		
	}
	String getImage(String str)
	{
		StringBuffer string=new StringBuffer(str);
		string.append("|");
		
		StringBuffer stri=new StringBuffer(str);
		
		string.append(stri.reverse());
		
		String string1=new String(string);
		
		return string1;
		
	}
}

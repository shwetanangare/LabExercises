package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise3 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		String string;
		System.out.println("Enter String for altering string:");
		string=sc.nextLine();
		System.out.println(new Exercise3().alterString(string));
	}
	String alterString(String str)
	{
		String string="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='a' &&str.charAt(i)!='A' &&str.charAt(i)!='e' &&str.charAt(i)!='E' &&str.charAt(i)!='i' &&
					str.charAt(i)!='I' &&str.charAt(i)!='o' &&str.charAt(i)!='O' &&str.charAt(i)!='u' &&str.charAt(i)!='U' )
			{
				string+=(char)(str.charAt(i)+1);
			}
			else
			{
				string+=str.charAt(i);
			}
		}
		return string;	
	}

}

package com.cg.training.ui;

import java.util.Scanner;

import com.cg.training.service.Format;

public class Exercise2 
{
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter String to add space:");
		String string=scanner.nextLine();
		Format formatString=(string1)->{
			String string2="";
			for(int i=0;i<string1.length();i++)
			{
				string2+=string1.charAt(i)+" ";
			}
			return string2;
		};
		
		System.out.println("String after adding space: "+formatString.AddSpace(string));
	}

}

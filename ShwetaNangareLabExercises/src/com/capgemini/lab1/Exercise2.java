package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("1.Red\n2.Yellow\n3.Green\nEnter your choice:");
		String string =sc.next();
		switch(string)
		{
		case "Red":System.out.println("STOP"); break;
		case "Yellow":System.out.println("READY"); break;
		case "Green":System.out.println("GO"); break;
		}
		
	}
}

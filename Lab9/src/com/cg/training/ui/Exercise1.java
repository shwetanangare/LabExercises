package com.cg.training.ui;

import java.util.Scanner;

import com.cg.training.service.Power;

public class Exercise1 {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Power power=(int num1,int num2)->{
			return (int) Math.pow(num1,num2);	
		};
		System.out.println("Enter number:");
		int num1,num2;
		num1= scanner.nextInt();
		System.out.println("Enter power: ");
		num2= scanner.nextInt();
		
		
		int result=power.pow(num1,num2);
		System.out.println(num1 +" raise to "+num2+" is :"+result);
		
		
	}

}

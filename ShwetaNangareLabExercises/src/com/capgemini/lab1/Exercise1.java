package com.capgemini.lab1;
import java.util.Scanner;
public class Exercise1 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String args[]) {
	    
	int digit;
	digit=sc.nextInt();
	int temp=digit;
	int sum=0;
	while(temp!=0)
	{
		int cube=temp%10;
		sum=sum+cube*cube*cube;
		temp=temp/10;
	}
	System.out.println(sum);
	}
	
}

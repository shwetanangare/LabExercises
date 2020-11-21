package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise6 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number to find difference");
		int n=sc.nextInt();
		int difference=calculateDifference(n);
		System.out.println("Difference of sum of squares and square of sum is "+difference);
	}
	static int calculateDifference(int n)
	{
		int difference=0,sum=0,sumOfSquares=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			sumOfSquares=sumOfSquares+i*i;
		}
		int squareOfSum=sum*sum;
		difference=sumOfSquares-squareOfSum;
		return difference;
	}

}

package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter size of array to find second smallest");
		int n=Integer.parseInt(sc.nextLine());
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The second smallest number is "+getSecondSmallest(arr));
	}
	static int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		
		return arr[arr.length-2];
	}

}

package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter size of array:");
		int n=Integer.parseInt(sc.nextLine());
		String arr[]= new String[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		for(String s:sortStrings(arr))
		{
			System.out.println(s);
		}
	}
	static String[] sortStrings(String arr[])
	{
		Arrays.sort(arr);
		if(arr.length%2==0)
		{
			for(int i=0;i<arr.length/2;i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=arr.length/2;i<arr.length;i++)
			{
				arr[i]=arr[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<arr.length/2+1;i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=arr.length/2+1;i<arr.length;i++)
			{
				arr[i]=arr[i].toLowerCase();
			}
		}
		return arr;
	}
}

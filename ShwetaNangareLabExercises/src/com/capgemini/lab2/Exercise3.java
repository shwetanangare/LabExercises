package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter size of array:");
		int n=Integer.parseInt(sc.nextLine());
		int arr[]= new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int s:getSorted(arr))
		{
			System.out.println(s);
		}
	}
	public static int[] getSorted(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			Integer ij=arr[i];
			String str=ij.toString();
			String rev="";
			for(int j=str.length()-1;j>=0;j--)
			{
				rev=rev+str.charAt(j);
			}
			arr[i]=Integer.parseInt(rev);
		}
		Arrays.sort(arr);
		return arr;
	}

}

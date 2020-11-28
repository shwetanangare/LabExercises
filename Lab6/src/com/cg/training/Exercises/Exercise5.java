package com.cg.training.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise5 {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter size of array:");
		int size=scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println("Second Smallest number is : "+getSecondSmallest(array));
		
	}
	static int getSecondSmallest(int array[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		int size = array.length;
		
		for(int i=0;i<size;i++)
		{
			list.add(array[i]);
		}
		Collections.sort(list);
		return list.get(1);	
	}
}

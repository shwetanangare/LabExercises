package com.cg.training.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter size of array:");
		int size=scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter array elements to reverse each number and sort array:");
		for(int i=0;i<size;i++)
		{
			array[i]=scanner.nextInt();
		}
		
		System.out.println("After reversing each number and sorting array:");
		
		int array1[] = getSorted(array);
		
		for(int i=0;i<size;i++)
		{
			System.out.println(array1[i]);
		}
	}
	static int[] getSorted(int array[]) 
	{
		int length=array.length;
		for(int i=0;i<length;i++)
		{
			Integer intNumber=array[i];
			String strNumber=intNumber.toString();
			String revNumber="";
			for(int j=strNumber.length()-1;j>=0;j--)
			{
				revNumber+=strNumber.charAt(j);
			}
			array[i]=Integer.parseInt(revNumber);
		}
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i=0;i<length;i++)
		{
			list.add(array[i]);
		}
		Collections.sort(list);
		for(int i=0;i<length;i++)
		{
			array[i]=list.get(i);
		}
		
		return array;	
	}

}

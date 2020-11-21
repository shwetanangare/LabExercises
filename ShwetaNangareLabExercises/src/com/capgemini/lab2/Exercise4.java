package com.capgemini.lab2;


import java.util.Scanner;

public class Exercise4 {
	private static Scanner sc =new Scanner(System.in);
	private static int length;
	public static void main(String[] args) 
	{
		System.out.println("Enter size of array:");
		int n=Integer.parseInt(sc.nextLine());
		int arr[]= new int[n];
		int Arr[];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Exercise4 ex= new Exercise4();
		Arr= ex.modifyArray(arr);
		
		for(int i=0;i<length;i++)
		{
			System.out.println(Arr[i]);
		}

	}
	
	int[] modifyArray(int[] arr)
	{
		length=arr.length;
		int temp;
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					for(int k=j;k<length-1;k++)
					{
						arr[k]=arr[k+1];
					}
					length--;
				}
			}
		}
		for (int i = 0; i < length; i++)
		{     
            for (int j = i+1; j <length; j++)
            {     
               if(arr[i] < arr[j]) 
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }
		}
		
		return arr;		
	}
}


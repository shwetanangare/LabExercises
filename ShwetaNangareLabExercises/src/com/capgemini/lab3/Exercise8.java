package com.capgemini.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string: ");
		String input=sc.nextLine();
		sc.close();
		if(isPositiveString(input))
		{
			System.out.println("String is a positive string");
		}else {
			
			System.out.println("String is not a positive string");
		}
	}

	private static boolean isPositiveString(String input) 
	{
		int n = input.length();  
        
    
        char c[] = new char [n];  
   
        for (int i = 0; i < n; i++) 
        {  
            c[i] = input.charAt(i);  
        }  
        
       
        Arrays.sort(c);  
        
        for (int i = 0; i < n; i++)  
            if (c[i] != input.charAt(i)) 
            	{
            		return false;
            	}
                
        return true;      
	}

}
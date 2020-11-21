package com.capgemini.lab5;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Exercise3 {
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args)
	{
		int salary;
		System.out.println("Enter salary:");
		salary=sc.nextInt();
		try
		{
			if(salary<3000)
			{
				throw new EmployeeException();
			}
			else
			{
				System.out.println("Employee salary is:"+salary);
			}
		}
		catch(EmployeeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

package com.cg.training.ui;

import java.util.Scanner;

@FunctionalInterface
interface Employee{
	String getName();
	
}

public class Exercise4 {
	
	private static Scanner scanner=new Scanner(System.in);
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) 
	{
		System.out.println("Enter name:");
		String name = scanner.nextLine();
		
		
		Exercise4  ex4 = new Exercise4 (); 
		
		ex4.setName(name);
	    Employee emp = ex4::getName;
	    System.out.print("Employee Name is : ");
	    System.out.print(emp.getName());
	    
	}
}
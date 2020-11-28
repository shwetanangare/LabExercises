package com.cg.training.pl;


import com.cg.training.service.EmployeeService;

public class EmployeeTester {
	private static EmployeeService service= new EmployeeService();
	
	public static void main(String[] args) {
		double totalSal= service.sumOfSalaries();
		System.out.println("Total salary= "+ totalSal);
		
		System.out.println("--------------------------------");
		service.getDepartmentCount();
        
		System.out.println("------------------------------");
        service.getSeniorMostEmployee();
       
        System.out.println("-------------------------------");
        service.getEmployeeWithDuration();
       
        System.out.println("-------------------------------");
        service.getEmployeeWithoutDepartment();
      
        System.out.println("-------------------------------");
        service.getDepartmentWithHighestEmployees();
        
        System.out.println("---------------------------");
        service.getEmployeeHireDate();
        
        System.out.println("-----------------------------");
        service.getEmployeeStartedOnFriday();
       
        System.out.println("-----------------------------");
        service.getIncreasedSalary();
        
        System.out.println("-----------------------------");
        System.out.println("Find employees who didn’t report to anyone");
        service.getEmployeesWithoutManager();
        
        System.out.println("-----------------------------");
        System.out.println("Sort by employee Id");
        service.sortByEmployeeId().stream().forEach(System.out::println);
        
        System.out.println("-----------------------------");
        System.out.println("Sort by department Id");
        service.sortByDeptId().stream().forEach(System.out::println);
        
        System.out.println("-----------------------------");
        System.out.println("Sort by First name");
        service.sortByFirstName().stream().forEach(System.out::println);
        
        
        System.out.println("-----------------------------");
        System.out.println("accept first name and last name of manager to print name of all his/her subordinates.  ");
        System.out.println("Names of subordinates of Steven King - ");
        service.getSubordinates("Steven", "King").stream().forEach(System.out::println);
	
	}

}

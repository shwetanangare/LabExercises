package com.cg.training.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cg.training.bean.Department;
import com.cg.training.bean.Employee;
import com.cg.training.dao.EmployeeRepository;


public class EmployeeService {

	public Double sumOfSalaries() {
		List<Employee> employeeList= EmployeeRepository.getEmployees();

		Optional<Double> optional= employeeList.stream()
				.map((e)->e.getSalary())
				.reduce((a,b)->a+b);

		if(optional.isPresent()) {
			return optional.get();
		}else {
			return 0.0;
		}

	}


	//List out department names and count of employees in each department
	public void getDepartmentCount()
	{
		
		Map<Department, Long> map = EmployeeRepository.getEmployees().stream()
				.filter((dept)->dept.getDepartment()!= null)
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		for(Map.Entry<Department, Long> entry:map.entrySet())
		{
			System.out.println("Department : "+entry.getKey().getDepartmentName()+" Count  : "+entry.getValue());
		}
	}
	
	//departments with highest count of employees.
	public void getDepartmentWithHighestEmployees()
	{
		
		Map<Department, Long> map = EmployeeRepository.getEmployees().stream()
				.filter((dept)->dept.getDepartment()!= null)
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		String dept="";
		Long Max = (long) 0.0;
		for(Map.Entry<Department, Long> entry:map.entrySet())
		{
			if(entry.getValue()>Max)
			{
				Max=entry.getValue();
				dept=entry.getKey().getDepartmentName();
			}
		}
		System.out.println("Department With Most Employees is "+dept);
	}
	
	//Find out the senior most employee of an organization. 
	public void getSeniorMostEmployee()
	{
		List<Employee> employeeList= EmployeeRepository.getEmployees();
		Optional<LocalDate> optional= employeeList.stream()
		.map((e)->e.getHireDate())
		.min((a,b)->a.compareTo(b));
		
		if(optional.isPresent()) 
		 {
			for(int i=0;i<employeeList.size();i++)
			{
				Employee emp=employeeList.get(i);
				if(emp.getHireDate().equals(optional.get()))
				{
					System.out.println(emp.getFirstName()+" "+emp.getLastName()+" is Senior Most Employee of an organization.");
				}
			}
			
		 }else 
		 {
			 System.out.println("No result.");
		 }
		
	}
	

	//List employee name and duration of their service in months and days
	public void getEmployeeWithDuration()     {         
		List<Employee> employeeList= EmployeeRepository.getEmployees();
		employeeList.stream()
		.forEach(emp -> {
			System.out.println(emp.getFirstName()+" "+emp.getLastName()+
					" is working for "+ChronoUnit.MONTHS.between(emp.getHireDate(), LocalDate.now())
					+" months and "+emp.getHireDate().until(LocalDate.now()).getDays()+" days");
		});
	}

	//Find out employees without department
	public void getEmployeeWithoutDepartment()
	{
		List<Employee> employeeList= EmployeeRepository.getEmployees();
		System.out.println("Employees without department :");
		List<Employee> e =employeeList.stream()
		 .filter((employee)->employee.getDepartment()==null)
		 .collect(Collectors.toList());
		if(e.size() ==0)
		{
			System.out.println("No Employee Without Department.");
		}
		else
		{
			for(Employee e1:e)
			{
				System.out.println(e1.getFirstName()+" "+e1.getLastName());
			}
		}
	}

	//List employee name, hire date and day of week on which employee has started
	public void getEmployeeHireDate()
	{
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		employeeList.stream()
		.forEach((emp) -> {
			System.out.println("Name : " + emp.getFirstName() + " " + emp.getLastName() +
					" - Hire Date : " + emp.getHireDate() + " Day of week : " + emp.getHireDate().getDayOfWeek().toString());
		});
	}


	 //List employee name, hire date and day of week for employee started  on Friday. 
	 
	public void getEmployeeStartedOnFriday()
	{
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		List<Employee> list=  employeeList.stream()
				.filter((employee)->employee.getHireDate().getDayOfWeek().toString().equals("FRIDAY"))
				.collect(Collectors.toList());
		System.out.println("Employees Started On Friday :");
		for (Employee employee : list)
		{
			System.out.println(employee.getFirstName()+" "+employee.getLastName());
		}
	}
	
	//List employee name, salary and salary increased by 15%. 
	
	public void getIncreasedSalary()
	{
		EmployeeRepository.getEmployees().stream()
				.forEach(emp1->{
			System.out.println("Name:"+emp1.getFirstName()+" "+emp1.getLastName()+" - Salary "
					+emp1.getSalary()+" - Hiked Salary : "+emp1.getSalary()*1.15);
		});
	}

	//Find employees who didn’t report to anyone 
	 
	public void getEmployeesWithoutManager()
	{
		System.out.println("Employees Without Manager :");
		 EmployeeRepository.getEmployees().stream().filter(emp->emp.getManagerId()==null)
		.forEach(System.out::println);

	}

	// Sort employees by Employee id
		
	public List<Employee> sortByEmployeeId()
	{
		List<Employee> empList = EmployeeRepository.getEmployees();

		return empList.stream()
				.sorted(Comparator.comparingInt(Employee::getEmployeeId))
				.collect(Collectors.toList());   
	}


	 //Sort by department id.

	public List<Employee> sortByDeptId() {
		List<Employee> empList = EmployeeRepository.getEmployees();

		return empList.stream()
				.filter((e)->e.getDepartment() !=null)
				.sorted(Comparator.comparing((emp) -> emp.getDepartment().getDepartmentId()))
				.collect(Collectors.toList());
	}

	// Sort by first name.
	
	public List<Employee> sortByFirstName() {
		List<Employee> empList = EmployeeRepository.getEmployees();

		return empList.stream()
				.sorted(Comparator.comparing((emp) -> emp.getFirstName().toLowerCase()))
				.collect(Collectors.toList());
	}


	//	    Create a method to accept first name and last name of manager to print name of all his/her subordinates.
	
	public List<Employee> getSubordinates(String firstName, String lastName){
		List<Employee> managerEmployeeList = 
				EmployeeRepository.getEmployees().stream()
				.filter((e)->e.getFirstName().equals(firstName) && e.getLastName().equals(lastName))
				.collect(Collectors.toList());

		return EmployeeRepository.getEmployees().stream()
				.filter((emp)->emp.getManagerId()!=null)
				.filter((e)->e.getManagerId().equals(managerEmployeeList.get(0).getEmployeeId()))
				.collect(Collectors.toList());
	}
	
	
}

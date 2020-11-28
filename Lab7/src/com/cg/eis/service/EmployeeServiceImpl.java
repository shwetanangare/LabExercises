package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.data.EmployeeDAO;
import com.cg.eis.data.EmployeeDaoImpl;
import com.cg.eis.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDao= new EmployeeDaoImpl();

	@Override
	public Integer addEmployee(Employee employee) throws EmployeeException {
		try {
			double sal=employee.getSalary();
			if(sal >=40000.0 ) {
				employee.setDesignation("MANAGER");
				employee.setInsuranceScheme("SCHEME_A");
			}else if(sal>= 20000.0) {
				employee.setDesignation("PROGRAMMER");
				employee.setInsuranceScheme("SCHEME_B");
			}else if(sal >5000) {
				employee.setDesignation("SYSTEM_ASSOCIATE");
				employee.setInsuranceScheme("SCHEME_C");
			}else {
				employee.setDesignation("CLERK");
				employee.setInsuranceScheme("NO_SCHEME");
			}
			
			Integer empid=employeeDao.addEmployee(employee);
			return empid;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	}

	@Override
	public Integer deleteEmployee(Integer empid) throws EmployeeException {
		try {
			Integer id=employeeDao.deleteEmployee(empid);
			return id;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> getEmployeesByInsuranceScheme(String insuranceScheme) throws EmployeeException {
		try {
			
			System.out.println(insuranceScheme);
			List<Employee> empList=
					employeeDao.getEmployeesByInsuranceScheme(insuranceScheme);
			return empList;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		try {
			List<Employee> employeeList= employeeDao.getAllEmployees();
			return employeeList;
		}catch(Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
	}

}

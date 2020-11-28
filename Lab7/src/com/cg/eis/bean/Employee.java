package com.cg.eis.bean;


public class Employee {
	private Integer empid;
	private String ename;
	private Double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee() {
		
	}

	public Employee(Integer empid, String ename, Double salary, String designation,
			String insuranceScheme) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String string) {
		this.designation = string;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	
}

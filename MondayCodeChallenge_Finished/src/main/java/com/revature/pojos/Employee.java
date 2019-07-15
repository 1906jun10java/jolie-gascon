package com.revature.pojos;

public class Employee {

	//fields
	private int employee_ID;
	private  String emp_FirstName;
	private  String emp_LastName;
	private int department_ID;
	private int salary;
	private String emp_Email;
	
	//constructor
	public Employee() {
		super();
	}
	public Employee(int employee_ID, String emp_FirstName, String emp_LastName, int department_ID, int salary, String emp_Email) {
		super();
	
		this.employee_ID = employee_ID; //using the this keyword to refer to an instance variable of the current class
		this.emp_FirstName = emp_FirstName; // local variables are within the blocks, methods, or constructors, but since we're referring to an instance of
		this.emp_LastName = emp_LastName; //a variable within the --> Class <---
		this.department_ID =  department_ID;
		this.salary = salary;
		this.emp_Email = emp_Email;
}
	public int getEmployee_ID() { //getters and setters to make accessible  these private fields 
		return employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}
	public String getEmp_FirstName() {
		return emp_FirstName;
	}
	public void setEmp_FirstName(String emp_FirstName) {
		this.emp_FirstName = emp_FirstName;
	}
	public String getEmp_LastName() {
		return emp_LastName;
	}
	public void setEmp_LastName(String emp_LastName) {
		this.emp_LastName = emp_LastName;
	}
	public int getDepartment_ID() {
		return department_ID;
	}
	public void setDepartment_ID(int department_ID) {
		this.department_ID = department_ID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmp_Email() {
		return emp_Email;
	}
	public void setEmp_Email(String emp_Email) {
		this.emp_Email = emp_Email;
	}
	@Override
	public String toString() {
		return "Employee [employee_ID=" + employee_ID + ", emp_FirstName=" + emp_FirstName + ", emp_LastName="
				+ emp_LastName + ", department_ID=" + department_ID + ", salary=" + salary + ", emp_Email=" + emp_Email
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + department_ID;
		result = prime * result + ((emp_Email == null) ? 0 : emp_Email.hashCode());
		result = prime * result + ((emp_FirstName == null) ? 0 : emp_FirstName.hashCode());
		result = prime * result + ((emp_LastName == null) ? 0 : emp_LastName.hashCode());
		result = prime * result + employee_ID;
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) { //and now we have a pojo...cause  should have hashcode, getters and setters, no arg constructor, equals and toString
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department_ID != other.department_ID)
			return false;
		if (emp_Email == null) {
			if (other.emp_Email != null)
				return false;
		} else if (!emp_Email.equals(other.emp_Email))
			return false;
		if (emp_FirstName == null) {
			if (other.emp_FirstName != null)
				return false;
		} else if (!emp_FirstName.equals(other.emp_FirstName))
			return false;
		if (emp_LastName == null) {
			if (other.emp_LastName != null)
				return false;
		} else if (!emp_LastName.equals(other.emp_LastName))
			return false;
		if (employee_ID != other.employee_ID)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
}
	

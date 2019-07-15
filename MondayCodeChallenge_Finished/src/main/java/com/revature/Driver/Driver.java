package com.revature.Driver;

import java.sql.SQLException;
import java.util.List;

import com.revature.DAOImpl.DepartmentDAOImpl;
import com.revature.DAOImpl.EmployeeDAOImpl;
import com.revature.pojos.Department;
import com.revature.pojos.Employee;

public class Driver {

	public static void main(String[] args) {
		
		Employee employee = new Employee (12, "Adam", "Smith", 1005, 5000, "asmith@gmail.com");
		try {
			EmployeeDAOImpl.eDAOImpl.createNewEmployee(employee);
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		} 
		try {
			DepartmentDAOImpl.dDAOImpl.average();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
			
	}
}
package com.revature.DAO;

import java.sql.SQLException;
import java.util.List;

import com.revature.pojos.Employee;

public interface EmployeeDAO {
			
			 
			 public void createNewEmployee(Employee employee) throws SQLException;
				public List<Employee> getEmployeeList() throws SQLException;
				 
				 }






package com.revature.DAOImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.EmployeeDAO;
import com.revature.Util.ConnectionFactory;
import com.revature.pojos.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {


			public static ConnectionFactory cf = ConnectionFactory.getInstance(); //Singleton ...ensures only ever one of 'them' at a time
			
			public static EmployeeDAOImpl eDAOImpl = new EmployeeDAOImpl();

			@Override
			public void createNewEmployee(Employee employee) throws SQLException { //how to create an new DB entry; create a connection, create a statement, then execute
				Connection conn= cf.getConnection();
				String sql= "INSERT INTO EMPLOYEE VALUES (EMPLOYEE_ID_SEQUENCE.NEXTVAL, ?,?,?,?,?)"; 
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, employee.getEmp_FirstName());
				ps.setString(2, employee.getEmp_LastName());
				ps.setInt(3, employee.getDepartment_ID());
				ps.setInt(4, employee.getSalary());
				ps.setString(5, employee.getEmp_Email());
				ps.executeUpdate(); // sends the SQL statement to the DB 
				
			}

			@Override
			public List<Employee> getEmployeeList() throws SQLException {
				List<Employee> EmployeeList= new ArrayList<Employee>();
				Connection conn = cf.getConnection();
				String sql= "SELECT * FROM EMPLOYEE"; 
				PreparedStatement ps = conn.prepareStatement(sql);
				Employee e =null;
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					e= new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6));
					EmployeeList.add(e);
				}
				//(int employee_ID, String emp_FirstName, String emp_LastName, int department_ID, int salary, String emp_Email) {
				return EmployeeList;
			}
			
		} 
		
			
			
			
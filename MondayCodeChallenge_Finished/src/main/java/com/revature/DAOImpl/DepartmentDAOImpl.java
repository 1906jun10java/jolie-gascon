package com.revature.DAOImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.DepartmentDAO;
import com.revature.Util.ConnectionFactory;
import com.revature.pojos.Department;

public class DepartmentDAOImpl implements DepartmentDAO {


			public static ConnectionFactory cf = ConnectionFactory.getInstance(); //Singleton ...ensures only ever one of 'them' at a time
			
			public static DepartmentDAOImpl dDAOImpl = new DepartmentDAOImpl();

			@Override
			public void createNewDepartment(Department department) throws SQLException { //how to create an new DB entry; create a connection, create a statement, then execute
				Connection conn= cf.getConnection();
				String sql= "INSERT INTO DEPARTMENT VALUES (DEPARTMENT_ID_SEQUENCE.NEXTVAL, ?)"; 
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, department.getDepartment_Name());
				ps.executeUpdate(); // sends the SQL statement to the DB 
				
				
				
			}

			@Override
			public List<Department> getDepartmentList() throws SQLException {
					List<Department> DepartmentList= new ArrayList<Department>();
					Connection conn = cf.getConnection();
					String sql= "SELECT * FROM DEPARTMENT"; 
					PreparedStatement ps = conn.prepareStatement(sql);
					Department d =null;
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						d= new Department(rs.getInt(1), rs.getString(2));
						DepartmentList.add(d);
					}
					
					return DepartmentList;
				}

			@Override
			public void average() throws SQLException {
				List<Department> DepartmentList= new ArrayList<Department>();
				Connection conn = cf.getConnection();
				String sql= "SELECT DEPARTMENT_NAME, AVG (SALARY)\r\n" + 
						"FROM EMPLOYEE\r\n" + 
						"FULL OUTER JOIN DEPARTMENT\r\n" + 
						"ON DEPARTMENT.DEPARTMENT_ID = EMPLOYEE.DEPARTMENT_ID\r\n" + 
						"GROUP BY DEPARTMENT_NAME";
				PreparedStatement ps = conn.prepareStatement(sql);
				Department d =null;
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println("Department average salary: " + rs.getString(1) + rs.getDouble(2));
				
				}
			}
}
				
			


			
			
			
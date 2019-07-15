package com.revature.DAO;
import java.sql.SQLException;
import java.util.List;

import com.revature.pojos.Department;

public interface DepartmentDAO {
			
			public void createNewDepartment(Department department) throws SQLException;
			public List<Department> getDepartmentList() throws SQLException;
			
			public abstract void average() throws SQLException;
				
			
			
		}

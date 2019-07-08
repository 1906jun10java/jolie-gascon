import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAOImpl implements EmployeeDAO {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, e.getEmpFirstName());
			ps.setString(2, e.getEmpLastName());
			ps.setDouble(3, e.getDepartment_ID());
			ps.setDouble(4, e.getSalary());
			ps.setString(5, e.getEmpEmail());
			
			ps.executeUpdate();
			
		}

		


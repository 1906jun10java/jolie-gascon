import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentDAOImpl implements DepartmentDAO {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, e.getDepartmentID());
			ps.setString(2, e.getDepartmentName());
			
			
			ps.executeUpdate(); 
}
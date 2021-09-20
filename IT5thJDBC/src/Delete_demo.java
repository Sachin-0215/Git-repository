import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Delete_demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/it5th","root","ggits");
			PreparedStatement stmt = Con.prepareStatement("Delete from emp1 where empid=?");
			stmt.setString(1, "1002");
			stmt.executeUpdate();
			System.out.println("Record Deleted");
			
			Con.close();
		}
		catch(Exception e) {
			
		}

	}

}

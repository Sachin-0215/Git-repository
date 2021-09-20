import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Update_demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/it5th","root","ggits");
			PreparedStatement stmt = Con.prepareStatement("Update emp1 set empname=? where empid=?");
			stmt.setString(1, "Sachin Verma");
			stmt.setString(2, "1006");
			stmt.executeUpdate();
			System.out.println("Record Updated ");
			Con.close();
		}
		catch(Exception e) {
			
		}

	}

}

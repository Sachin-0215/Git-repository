import java.sql.*;
public class Insert_demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/it5th","root","ggits");
			PreparedStatement stmt = Con.prepareStatement("Insert into emp1 values(?,?,?)");
			stmt.setString(1, "1006");
			stmt.setString(2, "Sachin Gupta");
			stmt.setString(3, "100000000");
			
			int i=stmt.executeUpdate();
			System.out.println("Record Inserted"+i);
			Con.close();
		}
		catch(Exception e) {
			
		}

	}

}

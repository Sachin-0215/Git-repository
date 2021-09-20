import java.sql.Connection;
import java.sql.*;

public class Drop {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/it2019","root","ggits");
			Statement stmt = Con.createStatement();
			String Querry = "Drop Table registration";
			stmt.execute(Querry);
			System.out.println("Table dropped Successfuly");
			
			Con.close();
		}
		catch(Exception e) {
			
		}

	}

}

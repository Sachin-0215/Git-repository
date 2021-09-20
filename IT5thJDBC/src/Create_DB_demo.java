import java.sql.*;

public class Create_DB_demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/","root","ggits");
			Statement stmt=Con.createStatement();
			String Query1 = "CREATE DATABASE IT2019";
			stmt.executeUpdate(Query1);
			System.out.println("Database Created Successfully");
			Con.close();
		}
		catch(Exception e) 
		{
			
		}

	}

}

import java.sql.*;
public class Create_table {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/it2019","root","ggits");
			Statement stmt=Con.createStatement();
			String Query2 = "CREATE TABLE REGISTRATION" + "(Rollno varchar(255), " + " Name varchar(255)) ";
			stmt.executeUpdate(Query2);
			System.out.println("Table Created Successfully");
			Con.close();
		}
		catch(Exception e) 
		{
			
		}

	}

}

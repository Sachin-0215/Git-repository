import java.sql.*;

public class DropTabledemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/","root","ggits");
			Statement stmt = Con.createStatement();
			String Querry = "Drop Database it2019";
			stmt.executeUpdate(Querry);
			System.out.println("Database dropped Successfuly");
			
			Con.close();
		}
		catch(Exception e) {
			
		}

	}

}

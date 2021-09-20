import java.sql.*;

public class ResultsetMetadatademo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/it5th","root","ggits");
			Statement stmt = Con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp1");
			ResultsetMetadata rsmd = (ResultsetMetadata) rs.getMetaData();
			
			System.out.println("Total Columns: "+rsmd.getColumnCount());
			
			
			Con.close();
		}
		catch(Exception e) {
			
		}
	}

	

}

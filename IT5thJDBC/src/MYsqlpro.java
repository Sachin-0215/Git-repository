import java.sql.*; // java.sql is package of jdbc api 
public class MYsqlpro {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/it5th","root","ggits");
			Statement stmt=Con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp1");
			while(rs.next()){
				System.out.println(rs.getString(1)+"       "+rs.getString(2)+"       "+rs.getString(3));
			}
			Con.close();
		}
		catch(Exception e) {
			
		}
	}

}

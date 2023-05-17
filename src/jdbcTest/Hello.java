package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testJDBC","postgres","Elsa@2020");
			Statement stmt =con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from users order by salary");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" Name: "+rs.getString(3)+" Salary: "+ rs.getString(2));
			}
			
			rs.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}
}
package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hello_Transac {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testJDBC","postgres","Elsa@2020");
		con.setAutoCommit(false);
		Statement stmt =con.createStatement();
		stmt.executeUpdate("insert into users values(8,3500000,'Ines NGOUADJEU')");
		stmt.executeUpdate("insert into users values(9,32500000,'Paul NGOUADJEU')");
		con.commit();
		con.close();
			
		
	}


}

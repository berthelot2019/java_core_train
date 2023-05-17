package jdbcTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TM {
	
	public static void main (String [] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testJDBC","postgres","Elsa@2020");
			PreparedStatement ps = con.prepareStatement("insert into users values(?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("enter id: ");
				String s1 = br.readLine();
				int id = Integer.parseInt(s1);
				
				System.out.println("Enter name:");
				String name = br.readLine();
				
				System.out.println("Enter your salary:");
				String s2=br.readLine();
				int salary = Integer.parseInt(s2);
				
				ps.setInt(1,id);
				ps.setInt(2, salary);
				ps.setString(3, name);
				
				ps.executeUpdate();
				
				System.out.println("commit/rollback");
				
				String answer = br.readLine();
				
				if (answer.equals("commit")) {
					con.commit();
				}
				if(answer.equals("rollback")) {
					con.rollback();
				}
				
				System.out.println("Want to add more Records y/n");
				String ans=br.readLine();
				if(ans.equals("n")) {
					break;
				}
				
				con.commit();
				System.out.println("Record successfully saved");
				con.close();
								
			}	
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

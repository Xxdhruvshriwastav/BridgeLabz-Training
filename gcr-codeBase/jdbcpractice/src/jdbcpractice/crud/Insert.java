package jdbcpractice.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","*******");
		
	PreparedStatement ps =	con.prepareStatement("insert into register values('deepak', 'd@.com', 'deepak123', 'male', 'mirganj')");
	int i =	ps.executeUpdate();
		
		if(i > 0) {
			System.out.println("Success");
		} else {
			System.out.println("fail");
		}
		
	}
} 
 
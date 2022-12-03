package TestPackage;

import java.sql.*;

public class IsaiahTest {
	public static void main(String[]args) throws SQLException, ClassNotFoundException {
	    // Load the JDBC driver
	    //Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("Driver loaded");
	
	    // Establish a connection
	    Connection connection = DriverManager.getConnection
	      ("jdbc:sqlserver://a-zbaoyo.database.windows.net:1433;"
	      		+ "database=FlightApp;"
	      		+ "user=akataria@a-zbaoyo;"
	      		+ "password=booty123!;"
	      		+ "encrypt=true;"
	      		+ "trustServerCertificate=false;"
	      		+ "hostNameInCertificate=*.database.windows.net;"
	      		+ "loginTimeout=30;"
	      		);
	    
	    System.out.println("Database connected");
	
	    
	    connection.close();


		
	}

}

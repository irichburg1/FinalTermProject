package cnns;

import java.sql.*;

public class ConnectCode {
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
	    	      		+ "loginTimeout=30;");
	    	    System.out.println("Database connected");
	    	
	    	    // Create a statement
	    	    Statement statement = connection.createStatement();
	    	
	    	    // Execute a statement
	    	    ResultSet resultSet = statement.executeQuery
	    	      ("select * from [dbo].[USER] where state "
	    	        + " = 'GA'");
	    	
	    	    // Iterate through the result and print the student names
	    	    while (resultSet.next())
	    	      System.out.println(resultSet.getString(3) + "\t" +
	    	        resultSet.getString(5) + "\t" + resultSet.getString(7));
	    	
	    	    // Close the connection
	    	    connection.close();

	} 

}









package classes;

import java.sql.*;

public class ConnectCode {
	public static void main(String[]args) throws SQLException, ClassNotFoundException {
	    	    // Load the JDBC driver
	    	    Class.forName("com.mysql.jdbc.Driver");
	    	    System.out.println("Driver loaded");
	    	
	    	    // Establish a connection
	    	    Connection connection = DriverManager.getConnection
	    	      ("jdbc:mysql://localhost/test");
	    	    System.out.println("Database connected");
	    	
	    	    // Create a statement
	    	    Statement statement = connection.createStatement();
	    	
	    	    // Execute a statement
	    	    ResultSet resultSet = statement.executeQuery
	    	      ("select SSN, firstName, lastName from USER where state "
	    	        + " = 'GA'");
	    	
	    	    // Iterate through the result and print the student names
	    	    while (resultSet.next())
	    	      System.out.println(resultSet.getString(1) + "\t" +
	    	        resultSet.getString(2) + "\t" + resultSet.getString(3));
	    	
	    	    // Close the connection
	    	    connection.close();

	} 

}









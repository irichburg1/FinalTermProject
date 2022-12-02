package classes;

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
	    	      		+ "loginTimeout=30;"
	    	      		);
	    	    
	    	    System.out.println("Database connected");
	    	
	    	    // Create a statement
	    	    Statement statement = connection.createStatement();
	    	
	    	    // Execute a statement
	    	    ResultSet resultSet = statement.executeQuery
	    	      ("select * "
	    	      		+ "from [dbo].[USER] "
	    	      		+ "where firstName = 'Porky' ");
	    	    
	    	    // Execute an Insert statement
	    	    resultSet = statement.executeQuery
	    	      ("Insert Into [dbo].[USER]"
	    	      		+ "(SSN,firstName,lastName,address,zipcode,state,username,password,email,securityQuestion,securityAnswer,admin) "
	    	      		+ "Values ('000-01-002','Zoo','Brown','123 Road','30024','GA','runn','123butts','johnlikesyou','What is your height in inches','3in','0');" ); 
	    	
	    	    // Iterate through the result and print the student names
	    	    while (resultSet.next())
	    	      System.out.println(resultSet.getString(1) + "\t" +
	    	        resultSet.getString(2) + "\t" + resultSet.getString(3));
	    	
	    	    // Close the connection
	    	    connection.close();

	} 

}









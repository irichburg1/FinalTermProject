package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Register {
	public static void main(String[]args) {
		
		
	}

	public void register1() throws SQLException {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an email:");
	String email = input.next();
	
	 Connection connection = DriverManager.getConnection
   	      ("jdbc:sqlserver://a-zbaoyo.database.windows.net:1433;"
   	      		+ "database=FlightApp;"
   	      		+ "user=akataria@a-zbaoyo;"
   	      		+ "password=booty123!;"
   	      		+ "encrypt=true;"
   	      		+ "trustServerCertificate=false;"
   	      		+ "hostNameInCertificate=*.database.windows.net;"
   	      		+ "loginTimeout=30;");
   	
   	    PreparedStatement statement = connection.prepareStatement("select username from [dbo].[USER] where email"
   	    		+ " = '?'");
   	
   	    statement.setString(1,email);
   	    
   	    
   	    ResultSet resultSet = statement.executeQuery();
   	   
   	    
   	    if (resultSet.next()) {
   	      System.out.println("The email is already registered to an account");
   	      register1();
   	      }
   	    
   	    else {
   	    	register2();
   	    }

} 
	
	public void register2() {
	

		
	}

	
	}


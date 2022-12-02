package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Register {
	
	private  String tempFirstName ;
	private  String tempLastName;
	private  String tempAddress;
	private  String tempZipcode;
	private  String tempState;
	private  String tempUsername;
	private  String tempPassword;
	private  String tempEmail;
	private  String tempSsn;
	private  String tempSecurityQuestion;
	private  String tempSecurityAnswer;

	
	public static void main(String[]args) {
		try {
			Register r1 = new Register () ;
			r1.register1();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
   	    		+ " = ? ");
   	
   	    statement.setString(1,tempEmail);
   	    
   	    
   	    ResultSet resultSet = statement.executeQuery();
   	   
   	    if (resultSet.next()) {
   	    	System.out.println("The email is already registered to an account");
   	    	register1();
   	      } else {
   	    	  
   	    	this.tempEmail = email ;
   	    	register2();
   	    	
   	      }

} 
	
	public static void register2() {
		
	}
	
	

	
}


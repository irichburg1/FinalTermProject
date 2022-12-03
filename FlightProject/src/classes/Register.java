package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Register {
	private String tempFirstName;
	private String tempLastName;
	private String tempAddress;
	private String tempZipcode;
	private String tempState;
	private String tempUsername;
	private String tempPassword;
	private String tempEmail;
	private String tempSsn;
	private String tempSecurityQuestion;
	private String tempSecurityAnswer;
	
	

	public static void main(String[]args) {
		Register r1 = new Register();
		try {
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
   	    		+ " = ?");
   	
   	    statement.setString(1,email);
   	    
   	    
   	    ResultSet resultSet = statement.executeQuery();
   	   
   	    
   	    if (resultSet.next()) {
   	      System.out.println("The email is already registered to an account");
   	      register1();
   	      }
   	    
   	    else {
   	    	this.tempEmail = email;
   	    	register2(); //The equivalent of pressing enter
   	    }

} 
	
	public void register2() {
		Scanner input = new Scanner(System.in);
		System.out.print("First name:");
		this.tempFirstName = input.nextLine();
		System.out.print("Last name:");
		this.tempLastName = input.nextLine();
		System.out.print("Address:");
		this.tempAddress = input.nextLine();
		System.out.print("Zipcode:");
		this.tempZipcode = input.next();
		System.out.print("State:");
		this.tempState = input.next();
		System.out.print("Username:");
		this.tempUsername = input.next();
		System.out.print("Password:");
		this.tempPassword = input.next();
		System.out.print("SSN:");
		this.tempSsn = input.next();
		
		
		if((tempFirstName.length() > 0) && (tempLastName.length()> 0) && (tempAddress.length() > 0) && (tempZipcode.length() > 0) && 
				(tempState.length() > 0) && (tempUsername.length() > 0) && (tempPassword.length() > 0) && (tempSsn.length() > 0)){
			
			register3(); //Basically the equivalent of pressing submit
		}
		else {
			System.out.println("Please fill in all required fields");
		}
		

		
	}
	
	public void register3() {
		//Check to make sure SSN is unique and run regex on it
		//Do regex for email 
		//Make sure username is unique and no longer then 30 characters
		//Make sure first name is only 20 characters
		//Make sure last name is only 30 characters
		//Make sure address is shorter than 30 characters
		//Make sure zipcode is exactly 5 characters
		//
		
		
	}

	
	}


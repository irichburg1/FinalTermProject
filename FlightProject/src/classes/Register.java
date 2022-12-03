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
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


/*	public static void main(String[]args) {
		try {
			Register r1 = new Register () ;
			r1.register1(IsaiahTest.connectToServer());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
*/
	public void register1(Connection connection) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an email:");
		Register r1 = new Register();
		try {
			r1.register1();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String email = input.next();
   	    PreparedStatement statement = connection.prepareStatement("select username from [dbo].[USER] where email"
   	    		+ " = ? ");
   	
   	    statement.setString(1,tempEmail);
   	    
   	    
   	    ResultSet resultSet = statement.executeQuery();
   	   
   	    
   	    
   	    if (resultSet.next()) {
   	    	System.out.println("The email is already registered to an account");
   	    	register1(connection);
   	      } else {
   	    	  
   	    	this.tempEmail = email ;
   	    	System.out.println (email + "has been saved as tempEmail");
   			//insert open 2nd part of registration screen;

   	    	
   	    	
   	      }

	}
	
	public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
}
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
	
	public void register2  ( Connection connection, String ssn, String fn, String ln, String addy, String zip, 
			String state, String user, String pass, String email, String question, String answer, String adminKey) throws SQLException{
		
		//this method will be called after the user inputs their information into each required text field and presses the "register" button
		
		 PreparedStatement statement = connection.prepareStatement("select username from [dbo].[USER] where SSN"
	   	    		+ " = ? ");
		 
	   	 statement.setString(1,ssn);

	   	 ResultSet resultSet = statement.executeQuery();
	public void register3() {
		//Check to make sure SSN is unique and run regex on it
		//Do regex for email 
		//Make sure username is unique and no longer then 30 characters
		//Make sure first name is only 20 characters
		//Make sure last name is only 30 characters
		//Make sure address is shorter than 30 characters
		//Make sure zipcode is exactly 5 characters
		//
		
	   	if (resultSet.next()) {
   	    	
	   		System.out.println("The SSN is already registered to an account");
	   		
   	      } else {
   	    	  
   	    	  if ( (ssn.length() == 11) && (fn.length() <= 20) && (ln.length() <= 30) && ( addy.length() <= 30) && (zip.length() == 5) &&
   	    			(state.length() == 2 ) && (user.length() <= 30) && (pass.length() <= 50) && (email.length() <= 50) && (answer.length() <= 20) ){
   	    		  
   	    		  if ( (pass.length() >= 8 )) {
   	    			  
   	    			  if (ssn.matches("^(?!666|000|9\\\\d{2})\\\\d{3}-(?!00)\\\\d{2}-(?!0{4})\\\\d{4}$") ) {
   	    				  
   	    	   	    	this.tempSsn = ssn ;

   	    	   	    	
   	    	   	    	if ( ( fn.matches("[a-zA-Z]+") && ln.matches("[a-zA-Z]+") && state.matches("[a-zA-Z]+") 
	   	    	    		&& Register.validate(email) == true  ) ) {
	   	   	    		
   	    	   	    		tempEmail = email;
   	    	   	    		tempFirstName = fn;
   	    	   	    		tempLastName = ln;
   	    	   	    		tempState = state;
		   	    	   		tempAddress = addy;
		   	    	   		tempZipcode = zip;
		   	    	   		tempState = state;
		   	    	   		tempUsername = user;
		   	    	   		tempPassword = pass;
		   	    	   		tempEmail = email;
		   	    	   		tempSsn = ssn ;
		   	    	   		tempSecurityQuestion = "poop"; //insert security question list
		   	    	   		tempSecurityAnswer = answer ;
	   	    	    	
   	    	   	    		} else {
	   	   	    		
			   	   		   		System.out.println("The SSN is already registered to an account");
			   	   	    		
			   	   	    	}
   	    				  
   	    				  
   	    			  } else {
   	    				  
   	   	    			  System.out.println ("SSN must be in format XXX-XX-XXXX");

   	    			  }
   	    			  
   	    			  
   	    			  
   	    		  } else {
   	    			  
   	    			  System.out.println ("Password must be longer than 8 characters.");
   	    		  }
   	    		  
   	    	  } else {
   	    		  
   	    		  
   	    		  System.out.println ("Something is wrong.");
   	    	  }
   	    	  
   	    	   	    	
    	    
	   	 
   	      } 
		
	}
	
	public void  registerUser (Connection connection) throws SQLException {
		
		
		new User (tempSsn, tempEmail, tempFirstName, tempLastName, 
				tempAddress, tempZipcode, tempState, tempUsername, tempPassword, 
				tempEmail, tempSecurityQuestion, tempSecurityQuestion );
	    	
	    Statement statement = connection.createStatement();
	    	    
	    ResultSet resultSet = statement.executeQuery (
	    		"Insert Into [dbo].[USER]"
	    				+ "(SSN,firstName,lastName,address,zipcode,state,username,password,email,securityQuestion,securityAnswer,admin)"
	    				+ "Values ('" + tempSsn + "','" + tempFirstName + "','" + tempLastName + "','" + tempAddress + "','" + tempZipcode 
	    				+ "','" + tempState + "','" + tempUsername + "','" + tempPassword + "','" + tempEmail
	    				+ "','" + tempSecurityQuestion + "','" + tempSecurityAnswer + "','" + 0 + "')"
	    				);
	    		
	}
	
	

	
}


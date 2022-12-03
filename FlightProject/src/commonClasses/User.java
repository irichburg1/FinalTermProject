package commonClasses;

import java.util.*;
import java.sql.*;


public class User {
	private String firstName;
	private String lastName;
	private String address;
	private String zipcode;
	private String state;
	private String username;
	private String password;
	private String email;
	private String ssn;
	private String securityQuestion;
	private String securityAnswer;
	private boolean loggedIn = false;
	
	
	public User (String ssn, String fn, String ln, String addy, String zip, 
			String state, String user, String pass, String email, String question, String answer, String adminKey ) {
		
		this.firstName = fn;
		this.lastName = ln;
		this.address = addy;
		this.zipcode = zip;
		this.state = state;
		this.username = user;
		this.password = pass;
		this.email = email;
		this.ssn = ssn;
		this.securityQuestion = question;
		this.securityAnswer = answer;
		
	}
	
	
	
	//Login to user account
	public boolean login(String username, String password) {
		if (this.username == username && this.password == password) {
			return true;
		}
		return false;
	}
	
	public boolean logout() {
		return false;
	}
	
	//register user account
	public static void registerAccount (Connection connection, String ssn, String fn, String ln, String addy, String zip, 
			String state, String user, String pass, String email, String question, String answer, int admin) throws SQLException {
		
	    Statement statement = connection.createStatement();
	    
	    ResultSet resultSet = statement.executeQuery (
	    		"Insert Into [dbo].[USER]"
	    				+ "(SSN,firstName,lastName,address,zipcode,state,username,password,email,securityQuestion,securityAnswer,admin)"
	    				+ "Values ('" + ssn + "','" + fn + "','" + ln + "','" + addy + "','" + zip + "','" + state + "','" + user + "','" + pass + "','" + email
	    				+ "','" + question + "','" + answer + "','" + admin + "')"
	    				);
	    		

 
	}
	
	
}

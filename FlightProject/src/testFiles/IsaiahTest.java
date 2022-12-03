package testFiles;

import javafx.application.Application ;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;
import javafx.*;

public class IsaiahTest {
	
	

	public String connectToServer () throws SQLException, ClassNotFoundException {
		
		try {
			
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
	    	//Thread.sleep(5 * 1000);

		    
		    //IsaiahFXTest.isConnected();
		    //IsaiahFXTest.changetext();

		    return ("");


		} catch (Exception e) {
			
			
			System.out.println ("Trouble connecting to server. Please try again.");
		    return ("");

		} finally {
			
		}
		
	}
/*	
	public static void main(String[]args) throws SQLException, ClassNotFoundException {
	    // Load the JDBC driver
	    //Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("Driver loaded");
	
	    
	    IsaiahTest.connectToServer();
	    
	    
	    // Establish a connection
	      
	    
	    
	    
	    //connection.close();


		
	}
*/
}

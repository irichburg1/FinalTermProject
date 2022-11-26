package cnns;

import java.sql.*;


public class AzureSQL {

	
	public static void main (String [] args ) {
		
		//Lets get started
		System.out.println ("performing setup ");
		
		String username = "akataria" ;
		String password = "booty123!" ;
		
		String cnnString = 
				
				"jdbc:sqlserver://a-zbaoyo.database.windows.net;" 
					+ "database = FlightApp;"
					+ "user=" + username + ";" 
					+ "password= " + password + ";"
					+ "encrypt = true;"
					+ "trustServerCertificate=false;"
					+ "loginTimeout = 30;"	;
		
		AzureSQL azure = new AzureSQL () ;
		System.out.println ("connecting...") ;
		String sql = "Select * from [dbo].[USER]; " ;
		
		azure.SelectAzureSQL(username, password, sql, cnnString);
		sql = "Insert Into [dbo].[USER] (SSN,firstName,lastName,address,zipcode,state,username,password,email,securityQuestion,securityAnswer,admin)" + "Values ('000-01-002','Zoo','Brown','123 Road','30024','GA','runn','123butts','johnlikesyou','What is your height in inches','3in','0');";
		azure.ExecuteAzureSQL(username, password, sql, cnnString);
		
	}
	
	private void SelectAzureSQL (String username, String password, String sql, String cnnStr ) {
		//Get a result set from Azure and Display it
		
		System.out.println ("selecting data...") ;
		
		ResultSet resultSet = null;
		try (Connection cnn = DriverManager.getConnection(cnnStr);
				Statement statement = cnn.createStatement();) {
			resultSet = statement.executeQuery(sql); 
			while (resultSet.next()) {
				System.out.println (resultSet.getString(1) + "," + resultSet.getString(2)  + "," + resultSet.getString(3) ) ;
				
			}
		}
		catch (SQLException e ) {
			
			e.printStackTrace();
			}
	}
	
	private void ExecuteAzureSQL (String username, String password, String sql, String cnnStr ) {
		System.out.println ("executing SQL statement....") ;
		try (Connection cnn = DriverManager.getConnection (cnnStr) ; 
				PreparedStatement statement = cnn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); ) {
			ResultSet resultSet = null;
			statement.execute();
			resultSet = statement.getGeneratedKeys() ;
			while (resultSet.next()) {
				System.out.println("key(s): " + resultSet.getString(1));	
			}
		}
		catch (SQLException e ) {
			
			e.printStackTrace();
		}
	}

}

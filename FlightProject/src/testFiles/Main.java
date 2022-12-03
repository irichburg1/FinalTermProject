package testFiles;

import javafx.scene.text.*;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
	
import javafx.application.Application ;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.*;

public class Main extends Application {

	public void start (Stage stage ) throws ClassNotFoundException, SQLException {
		
		IsaiahTest dbConnection = new IsaiahTest();
    	dbConnection.connectToServer(); 
    	
		try {
			   
			Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			   
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 

	public static void main(String[] args) {
		launch(args);
	}
	
	
}

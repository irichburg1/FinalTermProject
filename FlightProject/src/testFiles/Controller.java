package testFiles;

import javafx.scene.text.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
	
import javafx.application.Application ;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.*;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Controller {


	@FXML 
	private TextField usernamefield;
	
	@FXML
	private PasswordField passfield;
	
	@FXML
	private Button loginbutton;
	
	@FXML
	private Button registerbutton;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToRegistration (ActionEvent event ) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("RegisterPage.fxml")); 
 
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene (root);
		stage.setScene(scene);
		stage.show();
	}
	

	public void switchToLogin (ActionEvent event ) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml")); 
		 
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene (root);
		stage.setScene(scene);
		stage.show();
	}
}

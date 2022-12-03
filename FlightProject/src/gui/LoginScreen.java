package gui;


import java.awt.Font;
import javafx.scene.text.*;

import javafx.application.Application ;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.*;

public class LoginScreen extends Application {

	public static final String MainStyle = "Styler.css";

	Button button;
	
	public static void main (String [] args ) {
		
		launch (args);
		
}

	@Override
	public void start (Stage primaryStage) throws Exception {
    	primaryStage.setTitle("Odysseia Login Screen");
    	
    	button = new Button ("I am a button. Press me.");
    
    	
    	StackPane layout = new StackPane ();
    	layout.getChildren().add(button) ;
    	
    	Scene scene = new Scene (layout, 350, 600);
    	
    	scene.getStylesheets().add(MainStyle);
    	primaryStage.setScene(scene);
    	
    	primaryStage.show();
    }
}

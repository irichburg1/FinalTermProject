package testFiles;

//import java.awt.Font;
import javafx.scene.text.*;

import java.util.concurrent.TimeUnit;
	
import javafx.application.Application ;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;




public class IsaiahFXTest extends Application {
	
	Button button;
	public static final String MainStyle = "Styler.css";
	
	public static Text loadingtext = new Text ("connecting to server...");
	public static Text loadedtext = new Text ("connected.");

	public static StackPane splashpagelayout = new StackPane ();
	Scene SplashPage = new Scene (splashpagelayout, 500, 857);
	

	
	@Override
	public void start (Stage primaryStage) throws Exception {
		

		//StackPane splashpagelayout = new StackPane ();
		//Scene SplashPage = new Scene (splashpagelayout, 500, 857);

		
		loadingtext.setFont(Font.font("Verdana", 15));
		loadedtext.setFont(Font.font("Verdana", 15));

		//TextField press = new TextField ("Poop") ;
		//press.setFont(Font.font("Verdana", 15));

		splashpagelayout.getChildren().add(loadingtext);
    	primaryStage.setScene(SplashPage);
		primaryStage.setTitle("Odysseia");

    	primaryStage.show();

    	IsaiahTest dbConnection = new IsaiahTest();
    	dbConnection.connectToServer();
		
    	System.out.println ("push");
    	
    	
		this.changetext();
		
		
		
    	    
    	
    	StackPane loginlayout = new StackPane ();
    	//loginlayout.getChildren().add(button) ;
    	
    	Scene loginPage = new Scene (loginlayout, 350, 600);
    	
    	loginPage.getStylesheets().add(MainStyle);
    	
    	//primaryStage.setScene(loginPage);
    	
    }
	public static void isConnected () {
		
		loadingtext = new Text ("connected.");
		loadingtext.setFont(Font.font("Verdana", 15));
		

	}
	public static void changetext () {
		
		splashpagelayout.getChildren().remove(loadingtext);
		splashpagelayout.getChildren().add(loadedtext);

	}
	/*
	public void start2 (Stage secondaryStage) throws Exception {
		

		StackPane splashpagelayout = new StackPane ();
		Scene SplashPage = new Scene (splashpagelayout, 500, 857);

		
		Text loadingtext = new Text ("connecting to server...");
		loadingtext.setFont(Font.font("Verdana", 15));
		
		//TextField press = new TextField ("Poop") ;
		//press.setFont(Font.font("Verdana", 15));
		
		
		splashpagelayout.getChildren().add(loadingtext);

		
		secondaryStage.setScene(SplashPage);
		secondaryStage.setTitle("Odysseia");

		secondaryStage.show();

		
		secondaryStage.setTitle("Odysseia Login Screen");
    	
    	button = new Button ("I am a button. Press me.");
    
    	
    	StackPane loginlayout = new StackPane ();
    	loginlayout.getChildren().add(button) ;
    	
    	Scene loginPage = new Scene (loginlayout, 350, 600);
    	
    	loginPage.getStylesheets().add(MainStyle);
    	
    	//primaryStage.setScene(loginPage);
    	
    }
    */
	
	public static void main (String [] args ) {
		//The entire window is called the STAGE
		//The content inside the window is called the SCENE
		//
		
		
		launch (args);
		
	}
	
	
	
}

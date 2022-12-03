//This code makes buttons and causes text to pop up in the console after clicking the button

package TestPackage;
//The entire window is the stage

//The scene is the content inside the stage

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.awt.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class JavaFxPracticeButtons extends Application {
	Button button;
	
	public static void main(String[]args) {
		launch(args);
		
	}
	
	public void start(Stage primaryStage)throws Exception{
		primaryStage.setTitle("Title of the window");
		button = new Button("Gobble Gobble");
		
		//This lambda expression will handle any button events
		button.setOnAction(e -> {
			System.out.println("WOW");
		});
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout,300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	

}









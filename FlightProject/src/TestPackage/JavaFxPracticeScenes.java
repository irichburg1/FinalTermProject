//Pops up a window with a button, if you click the button, it will change the scene (or the content) for that same window

package TestPackage;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JavaFxPracticeScenes extends Application{
	Stage window;
	Scene scene1,scene2;

	public static void main(String[]args) {
		launch(args);
		
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		
		//A label is a static chunk of text (user doesn't interact w it)
		Label label1 = new Label("Welcome to the first scene");
		Button button1 = new Button("Go to scene 2");
		
		button1.setOnAction(e -> window.setScene(scene2));  //Basically means that when you click on button1, it will go to scene2
		
		//Layout 1 - children are laid out in a vertical column
		VBox layout1 = new VBox(20); //Stacks all of the object on top of each other in a column and spaces them out by 20 pixels
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1,200,200);
		
		//Button2 
		Button button2 = new Button("This scene sucks, go back to scene 1");
	
		button2.setOnAction(e -> window.setScene(scene1));  //Basically means that when you click on button1, it will go to scene1
	
		//Layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2,600,300);
		
		//Telling window to display scene 1 first
		window.setScene(scene1);
		window.setTitle("Title Here");
		window.show();
		
		
	}
		
}

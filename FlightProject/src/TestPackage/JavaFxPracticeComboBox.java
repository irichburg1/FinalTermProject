//ComboBox is like a drop down menu, but they generate their own actions and you can have an option for users to type their own text

package TestPackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.awt.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

public class JavaFxPracticeComboBox extends Application{
	Stage window;
	Scene scene;
	Button button;
	ComboBox<String> comboBox;
	javafx.geometry.Insets inset = new javafx.geometry.Insets(20,20,20,20);

	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("ComboBox Demo");
		
		
		//Button 
		button = new Button("Submit");
		
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll("Shes the man","Bend it like Beckham","SpiderMan","How to play golf");
		
		comboBox.setPromptText("What is your favorite movie?");
		
		comboBox.setEditable(true);
		
		button.setOnAction(e -> printMovie()); //this will occur when you select an item and then press the button
		
		comboBox.setOnAction(e -> System.out.println("User selected: " + comboBox.getValue())); //This will occur whenever you just select an item
		
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(inset);
		layout.getChildren().addAll(comboBox, button);
		
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}
	
	//Print out a movie
	private void printMovie() {
		System.out.println(comboBox.getValue());
	}
	
	
	
}
	
	




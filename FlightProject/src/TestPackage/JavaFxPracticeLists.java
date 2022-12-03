//How to use a drop down list, add items to it, set default values, and extract the user's choice

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

public class JavaFxPracticeLists extends Application{
	Stage window;
	Scene scene;
	Button button;
	javafx.geometry.Insets inset = new javafx.geometry.Insets(20,20,20,20);

	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("ChoiceBox Demo");
		
		
		//Button 
		button = new Button("Click Me");
		
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		
		//get items returns the observable list
		choiceBox.getItems().add("Apples");
		choiceBox.getItems().add("Bananas");
		choiceBox.getItems().addAll("Oranges","Pineapples","Rasberries");
		
		//Set a default value
		choiceBox.setValue("Apples");
		
		button.setOnAction(e -> getChoice(choiceBox));
		
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(inset);
		layout.getChildren().addAll(choiceBox,button);
		
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}
	
	
	private void getChoice(ChoiceBox<String> choiceBox) {
		String food = choiceBox.getValue();
		System.out.println(food);
	}
	
	
	
}



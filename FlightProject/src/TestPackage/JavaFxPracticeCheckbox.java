//Making a checkbox and extracting the options

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

public class JavaFxPracticeCheckbox extends Application{
	Stage window;
	Scene scene;
	Button button;
	javafx.geometry.Insets inset = new javafx.geometry.Insets(20,20,20,20);

	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Meat");
		
		//Checkboxes
		CheckBox box1 = new CheckBox("Chicken");
		CheckBox box2 = new CheckBox("Olives");
		
		//Button 
		button = new Button("Order Now");
		button.setOnAction(e -> handleOptions(box1,box2));
		
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(inset);
		layout.getChildren().addAll(box1,box2,button);
		
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}
	
	private void handleOptions(CheckBox box1, CheckBox box2) {
		String message = "Users order:";
		 
		if(box1.isSelected()) {
			message += "Chicken ";
		}
		
		if(box2.isSelected()) {
			message += "Olives ";
		}
		
		System.out.println(message);
	}
	
	
}

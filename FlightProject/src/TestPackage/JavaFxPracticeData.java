//Getting data and validating it

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

public class JavaFxPracticeData extends Application{
	Stage window;
	Scene scene;
	Button button;
	javafx.geometry.Insets inset = new javafx.geometry.Insets(20,20,20,20);

	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Aboo");
		
		//Form 
		TextField nameInput = new TextField();
		button = new Button("Click Me");
		button.setOnAction(e -> isInt(nameInput,nameInput.getText()));
		
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(inset);
		layout.getChildren().addAll(nameInput,button);
		
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
	
	private boolean isInt(TextField input, String message) {
		try {
			int age = Integer.parseInt(input.getText());
			System.out.println("User is:" + age);
			return true;
		}
		catch(NumberFormatException ex) {
			System.out.println("Error: " + message + " is not a number");
			return false;
		}
	}
	
	
	
}
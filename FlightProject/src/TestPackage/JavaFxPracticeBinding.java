package TestPackage;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFxPracticeBinding extends Application{
	Stage window;
	Button button;

	public static void main(String[]args) {
		launch(args);
		
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Hi");
		
		IntegerProperty x = new SimpleIntegerProperty(3);
		IntegerProperty y = new SimpleIntegerProperty();
		
		y.bind(x.multiply(10));  //Ties together the value of x and y
		System.out.println("x:" + x.getValue());
		System.out.println("y:" + y.getValue() + "\n");
		
		x.setValue(9);
		System.out.println("x:" + x.getValue());
		System.out.println("y:" + y.getValue() + "\n");
		
		button = new Button("Submit");
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
		
	}
		
}



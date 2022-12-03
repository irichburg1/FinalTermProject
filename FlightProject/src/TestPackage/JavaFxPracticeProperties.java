package TestPackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFxPracticeProperties extends Application{
	Stage window;
	Button button;

	public static void main(String[]args) {
		launch(args);
		
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Hi");
		
		Person yes = new Person();
		
		yes.firstNameProperty().addListener((v,oldValue,newValue) -> {
			System.out.println("Name changed to :" + newValue);
			System.out.println("firstNameProperty(): " + yes.firstNameProperty());
			System.out.println("getFirstName(): " + yes.getFirstName());
		});
	
		
		button = new Button("Submit");
		button.setOnAction(e -> yes.setFirstName("Porky"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
		
	}
		
}


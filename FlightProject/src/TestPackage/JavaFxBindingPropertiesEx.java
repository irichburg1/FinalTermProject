package TestPackage;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFxBindingPropertiesEx extends Application{
	Stage window;

	public static void main(String[]args) {
		launch(args);
		
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Hi");
		
		//Input and labels
		TextField userInput = new TextField();
		userInput.setMaxWidth(200);
		Label firstLabel = new Label("Welcome to the site ");
		Label secondLabel = new Label();
		
		HBox bottomText = new HBox(firstLabel,secondLabel);
		bottomText.setAlignment(Pos.CENTER);
		
		
		VBox vBox= new VBox(10,userInput,bottomText);
		vBox.setAlignment(Pos.CENTER);
		
		secondLabel.textProperty().bind(userInput.textProperty());
		
		Scene scene = new Scene(vBox,300,200);
		window.setScene(scene);
		window.show();
		
	}
		
}



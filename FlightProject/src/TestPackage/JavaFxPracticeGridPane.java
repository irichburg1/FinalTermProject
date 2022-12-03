//Customizing color and font size using the viper.css file

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

public class JavaFxPracticeGridPane extends Application{
	Stage window;

	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Aboo");
		javafx.geometry.Insets inset = new javafx.geometry.Insets(10,10,10,10);
		
		GridPane grid = new GridPane();
		grid.setPadding(inset);
		grid.setVgap(8);
		grid.setHgap(10);
		
		//Name label
		Label nameLabel = new Label("Username");
		nameLabel.setId("bold-label");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		//Name input
		TextField nameInput = new TextField();
		nameInput.setPromptText("username");
		GridPane.setConstraints(nameInput, 1, 0);
		
		//Password label
		Label passLabel = new Label("Password");
		GridPane.setConstraints(passLabel, 0, 1);
		
		//Password input
		TextField passInput = new TextField();
		passInput.setPromptText("Password");
		GridPane.setConstraints(passInput, 1, 1);
		
		//Login
		Button loginButton = new Button("Log in");
		GridPane.setConstraints(loginButton, 1, 2);
		
		//Sign up
		Button signUpButton = new Button("Sign up");
		signUpButton.getStyleClass().add("button-blue");
		GridPane.setConstraints(signUpButton, 1, 3);
		
		//Add everything to grid
		grid.getChildren().addAll(nameLabel,nameInput, passLabel, passInput, loginButton,signUpButton);
		
		
		Scene scene = new Scene(grid,300,200);
		scene.getStylesheets().add("viper.css");
		window.setScene(scene);
		window.show();
		
		
	}
	
}
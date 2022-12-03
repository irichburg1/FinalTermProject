package TestPackage;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFxPracticeCssJavaFx extends Application{
	Stage window;

	public static void main(String[]args) {
		launch(args);
		
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Whats good");
		
		
		//GridPane with 10px padding around edge
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		//Name label - constraints use(child,column,row)
		Label nameLabel = new Label("Username");
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
		
		
				
		grid.getChildren().addAll(nameLabel,nameInput, passLabel, passInput, loginButton);
		Scene scene = new Scene(grid,300,200);
		
		
				
		window.setScene(scene);
		window.show();
				
		
	}
		
}



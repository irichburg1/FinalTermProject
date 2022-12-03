//

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

public class JavaFxPracticeFxmlIntro extends Application{
	Stage window;
	
	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("ComboBox Demo");
		
		
		//Input and labels
		TextField userInput = new TextField();
		userInput.setMaxWidth(200);
		Label firstLabel = new Label("Welcome to the site");
		Label secondLabel = new Label();
		
		HBox bottomText = new HBox(firstLabel, secondLabel);
		bottomText.setAlignment(Pos.CENTER);
		VBox vBox = new VBox(10, userInput, bottomText);
		vBox.setAlignment(Pos.CENTER);
	
	}
	
}
	
	
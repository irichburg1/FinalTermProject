//How to properly close out of application (to save progress, history, etc.)

package TestPackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.awt.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JavaFxPracticeScenes3 extends Application{
	Stage window;
	Button button;

	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Aboo");
		
		window.setOnCloseRequest(e -> {
			e.consume();  
			closeProgram();
			
		});
		
		Button button = new Button("Close Program");
		button.setOnAction(e -> closeProgram());
		
	
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
		
	}

	private void closeProgram() {
		Boolean answer = JavaFxPracticeConfirmBox.display("Title","Sure you want to exit?");
		if (answer) {
			window.close();
		}
	}
}

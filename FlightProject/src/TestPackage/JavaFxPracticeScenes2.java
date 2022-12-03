//Makes a window pop up and then makes a confirm box up over the initial window

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

public class JavaFxPracticeScenes2 extends Application{
	Stage window;
	Button button;

	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Aboo");
		
		Button button = new Button("Click me");
		button.setOnAction(e -> {
			boolean result = JavaFxPracticeConfirmBox.display("Title of window", "What do you want?");
			System.out.println(result);
		});
	
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
		
	}

}

//Similar to an alert box, but instead of just popping up a window, it will pop up a window that will have multiple buttons with different options
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

public class JavaFxPracticeConfirmBox {
	
	static boolean answer;
	
	public static boolean display(String title, String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
		label.setAccessibleHelp(message);
		
		//Create two buttons
		Button yesButton = new Button("Yes");
		Button noButton = new Button("No");
		
		yesButton.setOnAction(e -> {
		answer = true;
		window.close();
		});
		
		noButton.setOnAction(e -> {
			answer = false;
			window.close();
			});
			
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label,yesButton,noButton);
		label.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait(); //Blocks any user interaction until the alert box is closed
		
		return answer;
		
	}

}

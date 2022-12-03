//Allows you to scroll if the list is too long and select multiple values if wanted

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
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;

public class JavaFxPracticeListView extends Application{
	Stage window;
	Scene scene;
	Button button;
	ListView<String> listView;
	javafx.geometry.Insets inset = new javafx.geometry.Insets(20,20,20,20);

	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("List View");
		
		
		//Button 
		button = new Button("Submit");
		
		listView = new ListView<>();
		listView.getItems().addAll("Iron Man", "Titanic", "Contact", "Surrogates", "Little women of LA");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);;
		
		button.setOnAction(e -> buttonClicked());
		
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(inset);
		layout.getChildren().addAll(listView,button);
		
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}
	
	
	
	private void buttonClicked() {
		String message = "";
		ObservableList<String> movies;
		movies = listView.getSelectionModel().getSelectedItems();
		
		
		for(String m: movies) {
			message += m + "\n";
		}
		
		System.out.println(message);
	}
	
}
	
	




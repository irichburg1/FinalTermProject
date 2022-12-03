//Building the individual menus and then adding items to the menu and then adding all menus to the menu bar

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

public class JavaFxPracticeMenuBuilding extends Application{
	Stage window;
	BorderPane layout;

	public static void main(String[]args) {
		launch(args);
		
	}
	
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Whats good");
		
		//File menu
		Menu fileMenu = new Menu("File");
		
		//Menu items
		MenuItem newFile = new MenuItem("New...");
		newFile.setOnAction(e -> System.out.println("Create a new file..."));
		fileMenu.getItems().add(newFile);
		
		
		
		fileMenu.getItems().add(new MenuItem("Open..."));
		fileMenu.getItems().add(new MenuItem("Save..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Settings..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Exit"));
		
		//Edit menu
		Menu editMenu = new Menu("_Edit");
		editMenu.getItems().add(new MenuItem("Cut"));
		editMenu.getItems().add(new MenuItem("Copy"));
		
		MenuItem paste = new MenuItem("Paste");
		paste.setOnAction(e -> System.out.println("Pasting some crap"));
		paste.setDisable(true);
		editMenu.getItems().add(paste);
		
		//Help Menu
		Menu helpMenu = new Menu("Help");
		CheckMenuItem showLines = new CheckMenuItem("Show Lines Numbers");
		showLines.setOnAction(e -> {
			if(showLines.isSelected()) {
				System.out.println("Program will now display line numbers");
			}
			else {
				System.out.println("Hiding line numbers");
			}
		});
		
		CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
		autoSave.setSelected(true);
		helpMenu.getItems().addAll(showLines, autoSave);
		
		//Difficulty RadoiMenuItems
		Menu difficultyMenu = new Menu("Difficulty");
		
		ToggleGroup difficultyToggle = new ToggleGroup();
		
		RadioMenuItem easy = new RadioMenuItem("Easy");
		RadioMenuItem medium = new RadioMenuItem("Medium");
		RadioMenuItem hard = new RadioMenuItem("Hard");
		
		easy.setToggleGroup(difficultyToggle);
		medium.setToggleGroup(difficultyToggle);
		hard.setToggleGroup(difficultyToggle);
		
		difficultyMenu.getItems().addAll(easy,medium,hard);
		
		
		//Main menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu,difficultyMenu);
		
		
		
		
		layout = new BorderPane();
		layout.setTop(menuBar);
		
		Scene scene = new Scene(layout,400,300);
		window.setScene(scene);
		window.show();
		
		
	}
		
}


//Creates a tree view 

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
import javafx.scene.control.TreeItem;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TreeView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;

public class JavaFxPracticeTreeView extends Application{
	Stage window;
	TreeView<String> tree;


	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("JavaFX");
		
		TreeItem<String> root, bucky, morris;  //Makes a root (root) and two braches (bucky and morris)
		
		
		//Root
		root = new TreeItem<>();
		root.setExpanded(true);
		
		//Bucky
		bucky = makeBranch("Bucky",root);
		makeBranch("Youtube",bucky);
		makeBranch("Protein",bucky);
		makeBranch("Bed",bucky);
		
		//Morris
		morris = makeBranch("Morris",root);
		makeBranch("Pine Trees",morris);
		makeBranch("Oak Trees",morris);
		makeBranch("Green Tea",morris);
		
		//create tree
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue) -> {
			if (newValue != null) {
				System.out.println(newValue.getValue());
			}
		});
		
		

		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}
	//Create Branches
	public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
		TreeItem<String> item = new TreeItem<> (title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}
	
}
	
	




//Making a table using java FX (uses the Product class) (if you create a table you must have at least one column)

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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class JavaFxPracticeTableViewIntro extends Application{
	Stage window;
	TableView<Product> table;
	TextField nameInput, priceInput, quantityInput;
	


	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("JavaFX");
		
		//Name column
		TableColumn<Product,String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		//Price column
		TableColumn<Product,Double> priceColumn = new TableColumn<>("Item price");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		//Quantity column
		TableColumn<Product,String> quantityColumn = new TableColumn<>("Quantity"); //This string is the name of the header and can be whatever you want
		quantityColumn.setMinWidth(100);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));  //This string much match the variable name
		
		
		//Name input
		nameInput = new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(100);
		
		//Price input
		priceInput = new TextField();
		priceInput.setPromptText("Price");
		priceInput.setMinWidth(100);
		
		//Quantity input
		quantityInput = new TextField();
		quantityInput.setPromptText("Quantity");
		quantityInput.setMinWidth(100);
		
		//Button
		Button addButton = new Button("Add");
		addButton.setOnAction(e -> addButtonClicked());
		Button deleteButton = new Button("Delete");
		deleteButton.setOnAction(e -> deleteButtonClicked());
		
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10,10,10,10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteButton);
		
		
		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(table,hBox);
		

		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
		
	}
	
	//Get all of the products (usually in a database)
	public ObservableList<Product> getProduct(){
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Laptop",859.00,20));
		products.add(new Product("Bouncy Ball",2.49,198));
		products.add(new Product("Toilet",99.00,74));
		products.add(new Product("Notebook DVD",19.99,12));
		products.add(new Product("Corn",1.49,846));
		return products;
	}
	
	public void addButtonClicked() {
		Product product = new Product();
		product.setName(nameInput.getText());
		product.setPrice(Double.parseDouble(priceInput.getText()));
		product.setQuantity(Integer.parseInt(quantityInput.getText()));
		table.getItems().addAll(product);
		nameInput.clear();
		priceInput.clear();
		quantityInput.clear();
	}
	
	
	public void deleteButtonClicked() {
		ObservableList<Product> productSelected, allProducts;
		allProducts = table.getItems();
		productSelected = table.getSelectionModel().getSelectedItems();
		
		productSelected.forEach(allProducts::remove);
		
	}
	
	
}
	
	




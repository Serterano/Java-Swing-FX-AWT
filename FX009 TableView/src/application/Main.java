package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	Stage window;
	TableView<Product> table;
	TextField nameInput,priceInput,quantityInput;
	
	@Override
	public void start(Stage primaryStage) {
		window=primaryStage;
		window.setTitle("TableView");
		
		//column -> (sütun,kolon ve direk gelsin aklına) nesneleri yukardan aşağı sıralıyor
		//row -> sıra anlamına gelir.nesneleri yan yana sıralar
		
		//Name column
		TableColumn<Product,String> nameColumn=new TableColumn<>("Name");
		//Product proplarına erişmek için module'a javafx.base eklemelisin
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<Product,String>("name"));
		
		//Price column
		TableColumn<Product,Double> priceColumn=new TableColumn<Product,Double>("Price");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<Product,Double>("price"));
		
		//Quantity column
		TableColumn<Product,Integer> quantityColumn=new TableColumn<Product,Integer>("Quantity");
		quantityColumn.setMinWidth(100);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<Product,Integer>("quantity"));
		
		
		//name Input
		nameInput = new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(100);
		
		//price Input
		priceInput = new TextField();
		priceInput.setPromptText("Price");
		//priceInput.setMinWidth(100);
	
		//quantity Input
		quantityInput = new TextField();
		quantityInput.setPromptText("Quantity");
		//quantityInput.setMinWidth(100);
		
		//Button
		Button addButton = new Button("Add");
		Button deleteButton = new Button("Delete");
		
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10,10,10,10));
		hBox.setSpacing(10);//araştır
		
		//horizontal box
		hBox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteButton);
		
		addButton.setOnAction(e->{
			addButtonClicked();
		});
		deleteButton.setOnAction(e->{
			deleteButtonClicked();
		});
		
		table = new TableView<Product>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);
		
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(table,hBox);
		
		Scene scene = new Scene(vBox,800,600);
		window.setScene(scene);
		window.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public ObservableList<Product> getProduct(){
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Laptop",100.00,10));
		products.add(new Product("Car",1000.00,3));
		products.add(new Product("House",34000.00,1));
		return products;
	}
	public void addButtonClicked() {
		Product product = new Product();
		product.setName(nameInput.getText());
		product.setPrice(Double.parseDouble(priceInput.getText()));
		product.setQuantity(Integer.parseInt(quantityInput.getText()));
		table.getItems().add(product);
		nameInput.clear();
		priceInput.clear();
		quantityInput.clear();
		
	}
	public void deleteButtonClicked() {
		ObservableList<Product> productSelected,allProducts;
		allProducts = table.getItems();
		productSelected = table.getSelectionModel().getSelectedItems();
		
		productSelected.forEach(allProducts::remove);//lambda expression Collectionlar stream destekler
	}
}

package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	
	Scene scene;
	@Override
	public void start(Stage primaryStage) {
		
		Button button = new Button("Choice");
		
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().add("Apples");
		choiceBox.getItems().add("Banana");
		choiceBox.getItems().addAll("Bacon","Honey","Meatballs");
		
		choiceBox.setValue("Apples");
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10,10,10,10));
		
		Label label  = new Label();
		
		
		
		ComboBox comboBox= new ComboBox<>();//sadece tek bir item seçiyor
		comboBox.getItems().addAll("Good Will Hunting","Blackhat","ST.Vincent");
		
		comboBox.setPromptText("What is your Favorite Film ?");
		comboBox.setEditable(true);
		
		layout.getChildren().addAll(choiceBox,button,label,comboBox);
		button.setOnAction(e-> label.setText(choiceBox.getValue()) );
		
		
		choiceBox.getSelectionModel().selectedItemProperty().addListener(
				(v,oldValue,newValue)->System.out.println(newValue));//listener
		
		comboBox.getSelectionModel().selectedItemProperty().addListener(
				(v,oldValue,newValue)->System.out.println(newValue));//listener
		
		scene = new Scene(layout,600,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	Stage window;
	Scene scene;
	
	
	@Override
	public void start(Stage primaryStage) {
		//constraints -> padding, 
		window = primaryStage;
		window.setTitle("GridPane");
		
		GridPane constraints = new GridPane();
		constraints.setPadding(new Insets(10,10,10,10));
		//Insetler saat yönü gibi sıralanmış.(yukarı,sağ,aşağı,sol)
		
		constraints.setVgap(5);//dikey açıklık,vertical
		constraints.setHgap(10);//yatay açıklık,horizontal
		
		Label nameLabel = new Label("Username");
		GridPane.setConstraints(nameLabel,0,0);
		
		TextField name = new TextField();
		GridPane.setConstraints(name, 1, 0);
		
		Label passLabel = new Label("Password");
		GridPane.setConstraints(passLabel,0,1);//component,enine index,boyuna index
		
		PasswordField pass = new PasswordField();
		pass.setPromptText("example@hotmail.com");
		GridPane.setConstraints(pass, 1, 1);
		
		Button loginButton = new Button("Log in");
		GridPane.setConstraints(loginButton, 1, 2);
		
		constraints.getChildren().addAll(nameLabel,name,passLabel,pass,loginButton);
		scene = new Scene(constraints,600,400);
		window.setScene(scene);
		window.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

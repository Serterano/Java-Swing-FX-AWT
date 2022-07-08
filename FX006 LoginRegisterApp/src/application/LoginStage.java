package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginStage extends Stage{//window

	private static Scene loginScene;
	public static Button loginButton;
	
	public LoginStage() {
		this.setTitle("GridPane");
		GridPane constraints = new GridPane();
		constraints.setPadding(new Insets(10,10,10,10));
		
		constraints.setVgap(5);
		constraints.setHgap(10);
		Label nameLabel = new Label("Username");
		GridPane.setConstraints(nameLabel,0,0);
		
		TextField name = new TextField();
		GridPane.setConstraints(name, 1, 0);
		
		Label passLabel = new Label("Password");
		GridPane.setConstraints(passLabel,0,1);//component,enine index,boyuna index
		
		PasswordField pass = new PasswordField();
		pass.setPromptText("example@hotmail.com");
		GridPane.setConstraints(pass, 1, 1);
		
		loginButton = new Button("Log in");
		GridPane.setConstraints(loginButton, 1, 2);
		
		constraints.getChildren().addAll(nameLabel,name,passLabel,pass,loginButton);
		
		loginScene = new Scene(constraints,600,400);
		
		this.setScene(loginScene);
		this.show();
		
	}
	
	public static Scene getLoginScene() {
		return loginScene;//setScene da kullanılacak method
	}


}

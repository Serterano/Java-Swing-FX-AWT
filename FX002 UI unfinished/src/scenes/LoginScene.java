package scenes;

import application.Main;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginScene extends Scene {
	
	public TextField username;
	public PasswordField pass;
	public Button button1;
	
	public LoginScene(Parent layout, double width, double height) {
		super(layout, width, height);

		username = new TextField();
		pass = new PasswordField();
		button1 = new Button("Login");

//		layout = new VBox(5);
		
		VBox layouts = new VBox(5);

//		layout.getChildrenUnmodifiable().add(button1);
		
		layouts.getChildren().add(username);
		
		

		
	} 

}

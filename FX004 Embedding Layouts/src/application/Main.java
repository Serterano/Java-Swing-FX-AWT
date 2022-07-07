package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	public Stage window;
	Scene scene1,scene2,scene3;
	
	public TextField username;
	public PasswordField pass;
	public PasswordField pass2;
	public TextField email;
	
	
	public Button login;
	public Button register;
	public Button iForgat;
	
	@Override
	public void start(Stage primaryStage) {
		
		
		window = primaryStage;
		window.setTitle("Multiple Layout");
		
		username = new TextField();
		pass = new PasswordField();
		pass2 = new PasswordField();
		email = new TextField();
		
		iForgat = new Button("I Forgat Password");
		login = new Button("Login");
		register = new Button("Register");
		
		register.setOnAction(e->{window.setScene(scene2);});
		
		HBox horizontalLayout = new HBox();
		horizontalLayout.getChildren().addAll(login,register,iForgat);
		
		horizontalLayout.setMargin(login, new Insets(8,8,8,8));
		horizontalLayout.setMargin(register, new Insets(8,8,8,8));
		horizontalLayout.setMargin(iForgat, new Insets(8,8,8,8));
		login.setPadding(new Insets(12,32,16,12));
		register.setPadding(new Insets(12,32,16,12));
		iForgat.setPadding(new Insets(12,32,16,12));
		
		VBox verticalLayout = new VBox();
		verticalLayout.getChildren().addAll(username,pass);
		
		verticalLayout.setMargin(username, new Insets(8,8,8,8));
		verticalLayout.setMargin(pass, new Insets(8,8,8,8));
		username.setPadding(new Insets(12,32,8,12));
		pass.setPadding(new Insets(12,32,8,12));
		
		
		BorderPane layoutList = new BorderPane();
		layoutList.setLeft(verticalLayout);
		layoutList.setCenter(horizontalLayout);
		
		
		scene1 = new Scene(layoutList,600,400);

		//Scene2
//		HBox horizontalLayout2 = new HBox();
//		horizontalLayout2.getChildren().addAll(login,register,iForgat);
//		
//		horizontalLayout2.setMargin(login, new Insets(8,8,8,8));
//		horizontalLayout2.setMargin(register, new Insets(8,8,8,8));
//		horizontalLayout2.setMargin(iForgat, new Insets(8,8,8,8));
//		
//		VBox verticalLayout2 = new VBox();
//		verticalLayout2.getChildren().addAll(username,pass,pass2);
//		
//		verticalLayout2.setMargin(username, new Insets(8,8,8,8));
//		verticalLayout2.setMargin(pass, new Insets(8,8,8,8));
//		verticalLayout2.setMargin(pass2, new Insets(8,8,8,8));
//		
//		pass2.setPadding(new Insets(12,32,8,12));
//		
//		BorderPane layoutList2 = new BorderPane();
//		layoutList2.setLeft(verticalLayout);
//		layoutList2.setCenter(horizontalLayout);
//		
//		scene2 = new Scene(layoutList2,600,400);
		
//		window.setScene(scene1);
//		window.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

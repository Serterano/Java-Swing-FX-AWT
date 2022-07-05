package application;
	
import Utils.AlertBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	Button button1;
	
	@Override
	public void start(Stage primaryStage) {
		button1 = new Button("click alert");
		
		button1.setOnAction(e-> AlertBox.display("Dikkat!","Giriş yaptın") );
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button1);
		
		Scene scene = new Scene(layout,600,400);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

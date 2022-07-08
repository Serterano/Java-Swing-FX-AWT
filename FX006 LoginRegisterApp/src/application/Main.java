package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application implements EventHandler<ActionEvent> {
//	static Main main = new Main();
//	
//	public Main() {
//		main = this;
//	}
	static Stage window; //stageler arasında değişim belki dışardan olur(instanceof ile)
	
	static Scene scene; //belki diğer classlarda lazım olur.
	
	@Override
	public void start(Stage primaryStage) {

		window = new LoginStage();
 		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		
	}
	
//	public static Main getInstance() {
//		return main;
//	}
}

package application;
	
import Utils.AlertBox;
import Utils.ConfirmBox;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	Button button1;
	Stage window;
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		
		window.setOnCloseRequest(e -> closeProgram());
		
		button1 = new Button("click alert");
		
		button1.setOnAction(e-> {
			e.consume();//Event.consume() ->
			//bu eventi tüketildi olarak işaretler buda daha fazla
			//kullanılmasının önüne geçer
			closeProgram();
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button1);
		
		Scene scene = new Scene(layout,600,400);
		
		window.setScene(scene);
		
		window.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void closeProgram() {
		boolean result =ConfirmBox.display("ASY","Are you sure ?");
		if(result) {
			System.out.println(result);
			System.out.println("Saved");//burada loglama işlemlerini felan yap
			window.close();
		}
	}
}

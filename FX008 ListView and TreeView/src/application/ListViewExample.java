package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ListViewExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		ListView<String> list = new ListView<>();
		list.getItems().add("SAD");
		list.getItems().add("happy");
		list.getItems().add("nötr");
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(list);
		Scene scene = new Scene(layout,600,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}

package application;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeStage extends Stage{
	
	static Scene homeScene;
	
	public HomeStage() {
		Label label = new Label("Home");
		VBox layout = new VBox(10);
		layout.getChildren().add(label);
		
		homeScene = new Scene(layout,600,400);
		
		this.setScene(homeScene);
		this.show();
	}

}

package Utils;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {//Alert Util
	
	public static void display(String title, String msg) {
		
		//setOnAction(e-> AlertBox.display("","")); //şeklinde kullan
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		
		window.setTitle(title);
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText(msg);
		
		Button closeButton = new Button("Close");
		closeButton.setOnAction(e->window.close());
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label,closeButton);
		layout.setAlignment(Pos.CENTER);
		
		
		Scene scene = new Scene(layout);
		
		window.setScene(scene);
		window.showAndWait();
	}
}

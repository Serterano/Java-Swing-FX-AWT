package me.serterano.com;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class deneme extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button btn1 = new Button("Say, Hello World"); //create a button
		
		StackPane pane = new StackPane(); //Create a layout
		pane.getChildren().add(btn1); //and add button to it
		
//layoutlar componentler barındırır buton textbox gibi
//scene layoutlar barındırır
//Stage'da sceneler barındırır
		
		//stage(hepsini kapsar) > scene > layouts
		
		Scene scene = new Scene(pane,600,400);//sahneye layout ekledik, sahne boyutu düzenledik
		
		primaryStage.setScene(scene);//stageye scene ekledik
		primaryStage.setTitle("First JavaFX");//stage başlık ekledik
		primaryStage.show();//ve gösterdik
		
		  
//		btn1.setOnAction(new EventHandler<ActionEvent>() {  //buttona işlev ekledik
//              
//	            @Override  
//	            public void handle(ActionEvent arg0) {   
//	                System.out.println("hello world");  
//	            }  
//	        });
		btn1.setOnAction((event) -> {    // lambda expression
	         
	        	 System.out.println("hello world");
	         
		});
		
		
	}
	 public static void main (String[] args){  
	        Application.launch(args);  
	 }  

}

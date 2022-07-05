package me.serterano.com;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
	Button btn1;
	Button btn2;
	TextField text1;
	TextField text2;
	@Override
	public void start(Stage primaryStage) throws Exception{
		btn1 = new Button("Say Something to console"); //create a button
		btn2 = new Button("Click me if you want");
		text1 = new TextField("asd");
		text2 = new TextField("abc");
		
		StackPane layout = new StackPane(); //Create a layout
		Insets pixel8 = new Insets(8,8,8,8); //top, right,bottom,left (0 dan basla saat yönü)
		Insets pixel16= new Insets(16,16,16,16);//margin için 3 farklı Inset ayarladım
		Insets pixel32 = new Insets(32,32,32,32);
		
		layout.getChildren().add(text1);
		layout.setAlignment(text1,Pos.TOP_LEFT);
		layout.setMargin(text1, new Insets(4,4,10,4));
		text1.setPadding(new Insets(8,8,8,8));
		
		layout.getChildren().add(btn1); //and add button to it
		layout.setAlignment(btn1, Pos.TOP_LEFT);
		layout.setMargin(btn1, new Insets(38,8,8,8));//konumunu ayarlıyor sadece
		
//		layout.getChildren().add(btn2);
//		layout.setAlignment(btn2,Pos.TOP_CENTER);//o componentin yerini belirliyor
		
//layoutlar componentler barındırır buton textbox gibi
//scene layoutlar barındırır
//Stage'da sceneler barındırır
		
		//stage(hepsini kapsar) > scene > layouts,shape,text,media,paint etc
		
		Scene scene = new Scene(layout,600,400);//sahneye layout ekledik, sahne boyutu düzenledik
		
		primaryStage.setScene(scene);//stageye scene ekledik
		primaryStage.setTitle("First JavaFX");//stage başlık ekledik
		primaryStage.show();//ve gösterdik
		
		  
//		btn1.setOnAction(new EventHandler<ActionEvent>() {  //buttona işlev ekledik 3.yontem
//              
//	            @Override  
//	            public void handle(ActionEvent arg0) {   
//	                System.out.println("hello world");  
//	            }  
//	        });
		btn1.setOnAction(this);
		btn2.setOnAction(this);//butona 3 farklı şekilde işlev ekleyebilirsin 1si sınıf yoluyla bu şekil
		
//		btn1.setOnAction((event) -> {    // lambda expression //2.yöntem
//	         
//	        	 System.out.println("hello world");
//	         
//		});
		
		
	}
	 public static void main (String[] args){  
	        Application.launch(args);  
	 }
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()==btn1) {
			btn1.setOnAction((e) -> {    // lambda expression
        
				System.out.println(text1.getText());
        
			});
		}
		if(event.getSource()==btn2) {
			btn2.setOnAction((e) -> {    // lambda expression
		        
				System.out.println("bu baska bir buton");
        
			});
		}
		
		
	}  

}

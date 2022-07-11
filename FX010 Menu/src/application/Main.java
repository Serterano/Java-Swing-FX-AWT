package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	Stage window;
	BorderPane layout;
	
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Menu1");
		
		//Menu
		Menu fileMenu = new Menu("File");
		
		MenuItem newItem= new MenuItem("New..");
 		newItem.setOnAction(e->System.out.println("Create a new file..."));
 		fileMenu.getItems().add(newItem);
		
		//Adding MenuItem to Menu
 		fileMenu.getItems().add(new MenuItem("Open.."));
 		fileMenu.getItems().add(new MenuItem("Save.."));
 		fileMenu.getItems().add(new SeparatorMenuItem());
 		fileMenu.getItems().add(new MenuItem("Settings.."));
 		fileMenu.getItems().add(new SeparatorMenuItem());
 		fileMenu.getItems().add(new MenuItem("Exit.."));
		
 		//Edit Menu
 		Menu editMenu = new Menu("_Edit");//burdaki _ işaretinin görevi açılır olması
 		editMenu.getItems().add(new MenuItem("Cut"));
 		editMenu.getItems().add(new MenuItem("Copy"));
 		editMenu.getItems().add(new MenuItem("Paste"));
 		
 		MenuItem pasteItem= new MenuItem("Paste..");
 		pasteItem.setOnAction(e->System.out.println("Pasting..."));
 		pasteItem.setDisable(true);//false yap kullanıcaksan
 		fileMenu.getItems().add(pasteItem);
 		
 		//Help Menu
 		Menu helpMenu = new Menu("_Help");
 		CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
 		showLines.setOnAction(e->{
 			if(showLines.isSelected()) {
 				System.out.println("Program will now display line numbers");
 			}
 			else {
 				System.out.println("Hiding line numbers");
 			}
 		});
 		CheckMenuItem autoSave = new CheckMenuItem("Enable AutoSave");
 		autoSave.setSelected(true);
 		autoSave.setOnAction(e->{
 			if(autoSave.isSelected()) {
 				System.out.println("Auto-Save on");
 			}
 			else {
 				System.out.println("Auto-Save off");
 			}
 		});
 		helpMenu.getItems().addAll(showLines,autoSave);
 		
 		//MenuBar
 		MenuBar menuBar= new MenuBar();
 		menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu);
 		//TopBar contains all menus here
		
 		//layout
		layout = new BorderPane();
		layout.setTop(menuBar);//add node
		
		Scene scene = new Scene(layout,400,300);
		window.setScene(scene);
		window.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class TreeItemExample extends Application {
	
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("TreeItemExample");
		
		TreeItem<String> root,bucky,megan;
		//root
		root = new TreeItem<>();
		root.setExpanded(true);
		
		//bucky
		bucky = makeBranch("Bucky",root);
		makeBranch("asd", bucky);
		makeBranch("Youtube", bucky);
		makeBranch("Chicken", bucky);
		
		//megan
		megan = makeBranch("Megan", root);
		makeBranch("Glitter", megan);
		makeBranch("Makeup", megan);
		
		//create tree
		TreeView<String> tree= new TreeView<>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty().addListener(
				(v,oldValue,newValue)->System.out.println(newValue.getValue()));//listener
		//layout
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		Scene scene = new Scene(layout,400,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public TreeItem<String> makeBranch(String title,TreeItem<String> parent){
		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}
}

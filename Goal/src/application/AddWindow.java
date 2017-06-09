package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddWindow extends Application {
	public javafx.scene.control.ListView<String> goalList;
	public ObservableList<String> goalString;
	
	public AddWindow(javafx.scene.control.ListView<String> goalList, ObservableList<String> goalString){
		this.goalList = goalList;
		this.goalString = goalString;
	}
	
	@Override
	public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AddWindow.fxml"));
        
        MyScene scene = new MyScene(root, 300, 275, goalList, goalString);
    
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();

	}

}

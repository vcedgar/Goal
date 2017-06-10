package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddWindow {
	public javafx.scene.control.ListView<String> goalList;
	public ObservableList<String> goalString;
	
	public AddWindow(javafx.scene.control.ListView<String> goalList, ObservableList<String> goalString){
		this.goalList = goalList;
		this.goalString = goalString;
	}
	
	public void start(Stage stage, Stage main) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/recs/AddWindow.fxml"));
        
        MyScene scene = new MyScene(root, 300, 275, goalList, goalString);
    
        stage.initOwner(main);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();

	}

}

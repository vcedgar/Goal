package application;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.ArrayList;

public class MainController {
	@FXML private javafx.scene.control.ListView<String> goalList;
	@FXML private BorderPane main;
	ObservableList<String> goalString;
	
    @FXML protected void newGoal(ActionEvent event) throws Exception{
    	(new AddWindow(goalList, goalString)).start(new Stage(), (Stage) main.getScene().getWindow());
    }
    
    @FXML
    public void initialize() throws Exception{
    	goalString = FXCollections.observableArrayList("Name\t\t\t\t\tTime\t\t Goal\t\t Percent");
    	goalList.setItems(goalString);
    	
    }
}

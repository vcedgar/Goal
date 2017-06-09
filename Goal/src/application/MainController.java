package application;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import java.util.ArrayList;

public class MainController {
	@FXML private javafx.scene.control.ListView<String> goalList;
	ObservableList<String> goalString;
	
    @FXML protected void newGoal(ActionEvent event) throws Exception{
    	(new AddWindow(goalList, goalString)).start(new Stage());
    }
    
    @FXML
    public void initialize(){
    	goalString = FXCollections.observableArrayList("Name\t\t\t\t\tTime\t\t Goal\t\t Percent");
    	goalList.setItems(goalString);
    }
}

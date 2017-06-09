package application;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Controller {
	@FXML private javafx.scene.control.Button closeButton;
	@FXML private javafx.scene.control.ListView<String> goalList;
	final ObservableList<String> goalString = FXCollections.observableArrayList("Name\t\tTime\t\t\tReal Time\t\t\tPercent");
	private ArrayList<Goal> goals = new ArrayList<Goal>();
	
    @FXML protected void newGoal(ActionEvent event) throws Exception{
    	(new AddWindow()).start(new Stage());
    }
    
    @FXML protected void addGoal(ActionEvent event) throws Exception{
    	
    }
    
    @FXML protected void exit(ActionEvent event) throws Exception{
    	Stage stage = (Stage) closeButton.getScene().getWindow();
    	stage.close();
    }
    
    @FXML
    public void initialize(){
    	goalList.setItems(goalString);
    }
}

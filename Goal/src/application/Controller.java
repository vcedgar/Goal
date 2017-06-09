package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;


public class Controller {
	@FXML private javafx.scene.control.Button closeButton;

    @FXML protected void newGoal(ActionEvent event) throws Exception{
    	(new AddWindow()).start(new Stage());
    }
    
    @FXML protected void addGoal(ActionEvent event) throws Exception{
    	(new AddWindow()).start(new Stage());
    }
    
    @FXML protected void exit(ActionEvent event) throws Exception{
    	Stage stage = (Stage) closeButton.getScene().getWindow();
    	stage.close();
    }
}

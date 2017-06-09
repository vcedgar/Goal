package application;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

public class AddController {
	
	@FXML private javafx.scene.control.Button closeButton;
	@FXML private javafx.scene.control.TextField nameField;
	@FXML private javafx.scene.control.TextField timeField;
	private ArrayList<Goal> goals = new ArrayList<Goal>();

    @FXML protected void addGoal(ActionEvent event) throws Exception{
        Node source = (Node) event.getSource();
        MyScene scene = (MyScene) source.getScene();
    	goals.add(new Goal(nameField.getText(), Integer.parseInt(timeField.getText())));
    	String goal = goals.get(goals.size()-1).toString();
    	scene.goalString.add(goal);
    	scene.goalList.refresh();
    	System.out.println(goal);

    }
    
    @FXML protected void exit(ActionEvent event) throws Exception{
    	Stage stage = (Stage) closeButton.getScene().getWindow();
    	stage.close();
    }

}

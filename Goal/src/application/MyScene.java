package application;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MyScene extends Scene {
	public javafx.scene.control.ListView<String> goalList;
	public ObservableList<String> goalString;
	public static ArrayList<Goal> goals = new ArrayList<Goal>();
	
	public MyScene(Parent root) {
		super(root);
	}

	public MyScene(Parent root, double width, double height) {
		super(root, width, height);
	}
	
	public MyScene(Parent root, double width, double height, javafx.scene.control.ListView<String> goalList, ObservableList<String> goalString) {
		super(root, width, height);
		this.goalList = goalList;
		this.goalString = goalString;
	}

}

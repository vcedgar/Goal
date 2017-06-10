package application;
	
import java.io.File;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class MainWindow extends Application {
	
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/recs/MainWindow.fxml"));
    
        MyScene scene = new MyScene(root);
    
        stage.setTitle("FXML Welcome");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void load(){
		File file = new File("/save.txt");
		
	}
	
	private void save(){
		
	}
	
}

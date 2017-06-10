package application;
	
import java.util.ArrayList;

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
    
        Scene scene = new Scene(root);
    
        stage.setTitle("FXML Welcome");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.setOnShown(new EventHandler<WindowEvent>(){
            @Override
            public void handle(WindowEvent window)
            {
            	try {
					(new InstallWindow()).start(new Stage(), stage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        stage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}

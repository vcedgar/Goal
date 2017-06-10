package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InstallWindow{

    public void start(Stage stage, Stage main) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/recs/InstallWindow.fxml"));
    
        Scene scene = new Scene(root, 300, 275);
        stage.initOwner(main);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }
}

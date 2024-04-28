package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class menu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load FXML file
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));

        // Set up the primary stage
        primaryStage.setTitle("Testing UI");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

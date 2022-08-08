package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/AppView.fxml"));
            Parent parent = loader.load();
            Scene appScene = new Scene(parent);
            primaryStage.setScene(appScene);
            primaryStage.setTitle("Sample JavaFX application");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

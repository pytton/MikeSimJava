package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("PriceControlPanel.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


        Parent root2 = FXMLLoader.load(getClass().getResource("PriceControlPanel.fxml"));

        Stage secondStage = new Stage();
        secondStage.setX(300);
        secondStage.setScene(new Scene(root2));
        secondStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

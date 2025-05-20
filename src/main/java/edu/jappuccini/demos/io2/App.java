package edu.jappuccini.demos.io2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * App
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class App extends Application {

   @Override
   public void start(Stage primaryStage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("InputView.fxml"));
      Scene scene = new Scene(root);
      primaryStage.setTitle("My Super Duper Input Output App 2.0");
      primaryStage.setResizable(false);
      primaryStage.setScene(scene);
      primaryStage.show();
   }

}

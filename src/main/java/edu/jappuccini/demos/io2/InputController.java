package edu.jappuccini.demos.io2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * InputController
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InputController {

   @FXML
   private TextField inputField;

   @FXML
   public void inputToOutput(ActionEvent event) throws IOException {
      String text = inputField.getText();
      System.out.println(text);

      Model model = Model.getInstance();
      model.setValue(text);

      Parent root = FXMLLoader.load(getClass().getResource("OutputView.fxml"));
      Scene newScene = new Scene(root);
      Node node = (Node) event.getSource();
      Scene oldScene = node.getScene();
      Stage stage = (Stage) oldScene.getWindow();
      stage.setScene(newScene);
      stage.show();
   }

}

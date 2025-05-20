package edu.jappuccini.demos.io;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Controller {

   @FXML
   private TextField inputField;

   @FXML
   private Label outputField;

   @FXML
   public void inputToOutput(ActionEvent event) {
      System.out.println("Hilfe, ich werde unterdrückt");
      System.out.println(event.getSource());
      String text = inputField.getText();
      System.out.println(text);
      outputField.setText(text);
   }

}

package edu.jappuccini.demos.io2;

import lombok.Getter;

/**
 * Model
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Model {

   private static Model instance; // public static final Model INSTANCE = new Model();

   @Getter
   private String value;

   private Model() {}

   public static Model getInstance() {
      if (instance == null) {
         instance = new Model();
      }

      return instance;
   }

   public void setValue(String value) throws InvalidValueException {
      /* Fehlerbehandlung */
      if (value == null || value.equals("")) {
         throw new InvalidValueException();
      }

      /* Logik */
      this.value = value;
   }

}

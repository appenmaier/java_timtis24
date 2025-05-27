package edu.jappuccini.demos.io2;

import lombok.Getter;
import lombok.Setter;

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
   @Setter
   private String value;

   private Model() {}

   public static Model getInstance() {
      if (instance == null) {
         instance = new Model();
      }

      return instance;
   }

}

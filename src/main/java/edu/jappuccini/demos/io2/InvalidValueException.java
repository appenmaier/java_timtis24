package edu.jappuccini.demos.io2;

/**
 * InvalidValueException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InvalidValueException extends Exception {

   private static final long serialVersionUID = 1L;

   public InvalidValueException() {
      super("Value is null or empty");
   }

}

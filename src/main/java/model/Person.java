package model;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Person(String name, int age, Gender gender, double sizeInM) {

   public enum Gender {
      MALE, FEMALE, DIVERSE
   }

}

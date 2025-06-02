package main;

import java.util.Optional;
import java.util.Random;

/**
 * Optionals
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D09_Optionals {

   public static void main(String[] args) {
      /* Ohne Optionals */
      String text = getText();
      if (text != null) {
         System.out.println(text.toUpperCase());
      } else {
         System.out.println("text ist null");
      }

      /* Mit Optionals (imperativ) */
      Optional<String> optionalText = getOptionalText();
      if (optionalText.isPresent()) {
         System.out.println(optionalText.get().toUpperCase());
      } else {
         System.out.println("optionalText ist empty");
      }

      /* Mit Optionals (funktional) */
      optionalText.ifPresentOrElse(t -> System.out.println(t.toUpperCase()),
            () -> System.out.println("optionalText ist empty"));
   }

   private static String getText() {
      Random random = new Random();
      if (random.nextBoolean()) {
         return "Hello World";
      } else {
         return null;
      }
   }

   private static Optional<String> getOptionalText() {
      Random random = new Random();
      if (random.nextBoolean()) {
         return Optional.of("Hello World");
      } else {
         return Optional.empty();
      }
   }

}

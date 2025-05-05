package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.PlugType;

/**
 * Java API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D04_JavaAPI {

   public static void main(String[] args) throws FileNotFoundException {
      /* Lists */
      ArrayList<String> names = new ArrayList<>();

      System.out.println(names);
      names.add("Hans");
      names.add("Peter");
      names.add("Lisa");
      System.out.println(names);
      names.add(1, "Max");
      System.out.println(names);
      System.out.println(names.get(2));
      System.out.println(names.getFirst());
      names.remove("Peter");
      System.out.println(names);
      System.out.println(names.size());

      /* Math */
      System.out.println(Math.sqrt(9));

      /* Pseudo Random Numbers */
      Random random = new Random();

      for (int i = 0; i < 100; i++) {
         System.out.println(random.nextInt(1, 7));
      }

      /* Scanner, File, Wrappers */
      File file = new File("src/main/resources/input.txt");

      if (file.exists()) {
         System.out.println("file exists");
      }

      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");
         String name = tokens[0];
         int age = Integer.valueOf(tokens[1]);
         Character gender = tokens[2].charAt(0);
         PlugType plugType = PlugType.valueOf(tokens[3]);
         boolean isLecturer = Boolean.valueOf(tokens[4]);

         System.out.println(name + " " + age + " " + gender + " " + plugType + " " + isLecturer);
      }

      scanner.close();

      /* Dates and Times */
      LocalDateTime now = LocalDateTime.now();
      LocalDateTime christmasEve = LocalDateTime.of(2025, 12, 24, 20, 0);
      LocalDateTime newYearsEve = LocalDateTime.parse("2025-12-31T00:00:00");

      System.out.println(now);
      System.out.println(christmasEve.getDayOfYear());
      System.out.println(newYearsEve.getMonth());

      System.out.println(System.currentTimeMillis());
   }

}

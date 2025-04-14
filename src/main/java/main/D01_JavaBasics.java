package main;

import java.util.Scanner;

/**
 * Java Basics
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D01_JavaBasics {

   public static void main(String[] args) {
      primitiveDatatypes();
      arithmeticOperations();
      cases();
      loops();
      strings();
      io();
   }

   public static void primitiveDatatypes() {
      /* Ganze Zahlen: byte, short, int, long */
      int i = 42;

      /* Gleitkommazahlen: float, double */
      double salaryInEuro = 2986.45;

      /* Boolscher Wahrheitswert: boolean */
      boolean isHappy = true;

      /* Zeichen: char */
      char a1 = 'A';
      char a2 = 65;
      char a3 = '\u0041';
      char a4 = 0b1000001;
      char a5 = 0x41;

      System.out.println("i: " + i); // C: printf("i: %d\n", i);
      System.out.println("salaryInEuro: " + salaryInEuro);
      System.out.println("isHappy: " + isHappy);
      System.out.println("a1: " + a1);
      System.out.println("a2: " + a2);
      System.out.println("a3: " + a3);
      System.out.println("a4: " + a4);
      System.out.println("a5: " + a5);
   }

   public static void arithmeticOperations() {
      int result1 = 5 + 3;
      int result2 = 5 - 3;
      int result3 = 5 * 3;
      int result4 = 5 / 3;
      int result5 = 5 % 3;
      double result6 = (double) 5 / 3;

      int c = 0;
      c = c + 1;
      c += 1;
      c++;

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
      System.out.println(result5);
      System.out.println(result6);
      System.out.println(c);
   }

   public static void cases() {
      /* Verzweigungen */
      /* Vergleichsoperatoren: >, >=, <, <=, ==, != */
      /* logische Operatoren: &&, ||, ! */
      /* Bedingungsoperator: ? : */
      int age = 17;
      char gender = 'm';

      if (gender == 'm' && age >= 12 && age < 18) {
         System.out.println("männlicher Teenager");
      } else if (gender == 'w') {
         System.out.println("weiblich");
      } else {
         System.out.println("divers oder ein Mann oder ein Junge");
      }

      String genderText;
      if (gender == 'm') {
         genderText = "männlich";
      } else {
         genderText = "weiblich";
      }
      System.out.println(genderText);
      genderText = (gender == 'm') ? "männlich" : "weiblich";
      System.out.println(genderText);

      /* Fallunterscheidungen */
      genderText = switch (gender) {
         case 'm', 'M' -> "männlich";
         case 'w', 'W' -> "weiblich";
         default       -> "divers";
      };
      System.out.println(genderText);
   }

   public static void loops() {
      int i = 0;
      while (i < 10) {
         System.out.println(i + 1);
         i++;
      }

      for (int x = 0; x < 10; x++) {
         System.out.println(x + 1);
      }
   }

   public static void strings() {
      String names = "Max"; // C: char names[50] = "Max";

      int length = names.length(); // C: int length = strlen(names);

      names += ";Lisa;Peter"; // C: strcat(names, ";Lisa;Peter");

      String[] tokens = names.split(";");
      for (int i = 0; i < tokens.length; i++) {
         String token = tokens[i];
         System.out.println(token);
      }

      for (String token : tokens) {
         System.out.println(token);
      }

      // C: char delimiter() = ";";
      // char *token = strtok(names, delimiter);
      // while(token != NULL) {
      // printf("%\n", token);
      // *token = strtok(NULL, delimiter);
      // }

      if (names.equals("Max;Lisa;Peter")) {
         System.out.println("gleich");
      }

      System.out.println("names: " + names);
      System.out.println("length: " + length);
   }

   public static void io() {
      // C: int number;
      // printf("Bitte eine ganze Zahl eingeben: ");
      // scanf("%d", %number);
      // C++: int number;
      // cout << "Bitte eine ganze Zahl eingeben: ";
      // cin >> number;

      Scanner scanner = new Scanner(System.in);
      System.out.print("Bitte eine ganze Zahl eingeben: ");
      int number = scanner.nextInt();
      System.out.println("number: " + number);
   }

}

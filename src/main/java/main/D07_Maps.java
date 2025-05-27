package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import model.Exam;
import model.Student;

/**
 * Maps
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D07_Maps {

   public static void main(String[] args) {
      Map<Student, Exam> students = new HashMap<>();

      /* Werte setzen */
      students.put(new Student("1", "Hans"), new Exam("Mathe", 3.5));
      students.put(new Student("2", "Peter"), new Exam("Mathe", 1.7));
      students.put(new Student("3", "Lisa"), new Exam("Mathe", 2.2));

      /* Werte lesen */
      System.out.println(students.get(new Student("2", "Peter")));

      /* Werte prüfen */
      System.out.println(students.containsKey(new Student("2", "Peter")));
      System.out.println(students.containsValue(new Exam("Mathe", 1.0)));

      /* Werte überschreiben */
      System.out.println(students.put(new Student("1", "Hans"), new Exam("Mathe", 3.3)));
      System.out.println(students.get(new Student("1", "Hans")));

      /* Werte ausgeben */
      System.out.println(students);
      System.out.println();

      /* Datensammlungen: Die Menge aller Schlüssel */
      System.out.println("Anwesenheitsliste:");
      for (Student s : students.keySet()) {
         System.out.printf("%-10s [ ]%n", s.getName());
      }
      System.out.println();

      /* Datensammlung: Alle Werte */
      double total = 0;
      for (Exam e : students.values()) {
         total += e.getGrade();
      }
      System.out.println("Durchschnitt: " + total / students.values().size());
      System.out.println();

      /* Datensammlung: Der Menge aller Einträge / Schlüssel-Wert-Paare */
      System.out.println("Notenliste: ");
      for (Entry<Student, Exam> entry : students.entrySet()) {
         Student s = entry.getKey();
         Exam e = entry.getValue();
         System.out.println(s.getId() + ": " + e.getGrade());
      }
      System.out.println();

      /* Probleme der TreeMap */
      students = new TreeMap<>(students);

      students.put(new Student("666", "Peter"), new Exam("Mathe", 4.1));
      System.out.println(students.get(new Student("2", "Peter")));
      System.out.println(students.get(new Student("666", "Peter")));
      System.out.println(students);
   }

}

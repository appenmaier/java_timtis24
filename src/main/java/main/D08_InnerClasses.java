package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Student;

/**
 * Inner Classes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D08_InnerClasses {

   public static void main(String[] args) {
      List<Student> students = new ArrayList<>();
      Student student = new Student("8193465", "Anna");
      students.add(student);
      students.add(new Student("2846854", "Hans"));
      students.add(new Student("1203956", "Peter"));
      students.add(new Student("3826553", "Lisa"));

      /* Lokale Klassen */
      class StudentByIdAscendingComparator implements Comparator<Student> {

         @Override
         public int compare(Student student1, Student student2) {
            return student1.getId().compareTo(student2.getId());
         }

      }

      Collections.sort(students, new StudentByIdAscendingComparator());

      /* Anonyme Klassen */
      Collections.sort(students, new Comparator<Student>() {

         @Override
         public int compare(Student student1, Student student2) {
            return student2.getId().compareTo(student1.getId());
         }

      });

      /* Lamda Ausdrücke */
      Collections.sort(students,
            (student1, student2) -> student1.getName().compareTo(student2.getName()));

      students.forEach(s -> s.getOlder());
      students.forEach(s -> System.out.println(s));
      System.out.println();

      /* Methodenreferenzen */
      students.forEach(Student::getOlder);
      students.forEach(System.out::println);
   }

}

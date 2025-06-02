package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import helper.Students;
import model.Student;

/**
 * IO Streams
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D11_IOStreams {

   public static void main(String[] args) {
      List<Student> students = new ArrayList<>();
      students.add(new Student("9178254", "Hans"));
      students.add(new Student("1029574", "Peter"));
      students.add(new Student("3382195", "Lisa"));

      students.get(0).setAge(33);
      students.get(1).setAge(17);
      students.get(2).setAge(24);

      /* Textbased */
      Students.writeStudentsTextbased(students, new File("src/main/resources/students.txt"));

      students = Students.readStudentsTextbased(new File("src/main/resources/students.txt"));
      students.forEach(System.out::println);
      System.out.println();

      /* Bytebased */
      Students.writeStudentsBytebased(students, new File("src/main/resources/students.dat"));

      students = Students.readStudentsBytebased(new File("src/main/resources/students.dat"));
      students.forEach(System.out::println);
   }

}

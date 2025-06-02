package helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.Student;

/**
 * Students
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Students {

   public static void writeStudentsTextbased(List<Student> students, File file) {
      try (FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
         for (Student s : students) {
            bufferedWriter.write(s.getId() + ";" + s.getName() + ";" + s.getAge());
            bufferedWriter.newLine();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static List<Student> readStudentsTextbased(File file) {
      List<Student> students = new ArrayList<>();

      try (FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
         String line;
         while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split(";");
            String id = tokens[0];
            String name = tokens[1];
            int age = Integer.valueOf(tokens[2]);
            Student student = new Student(id, name);
            student.setAge(age);
            students.add(student);
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }

      return students;
   }

   public static void writeStudentsBytebased(List<Student> students, File file) {
      try (FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
         oos.writeObject(students);
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   @SuppressWarnings("unchecked")
   public static List<Student> readStudentsBytebased(File file) {
      List<Student> students = new ArrayList<>();

      try (FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
         students = (List<Student>) ois.readObject();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }

      return students;
   }

}

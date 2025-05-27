package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Student
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@RequiredArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Student implements Comparable<Student> {

   private final String id;
   private final String name;
   private int age;

   @Override
   public int compareTo(Student other) {
      return other.name.compareTo(name);
   }

   public void getOlder() {
      age++;
   }

}

package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Exam
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Exam {

   private final String lecture;
   private double grade;

}

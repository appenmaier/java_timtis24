package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.LightBulb;

/**
 * Comparators
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D06_Comparators {

   public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
      Collections.sort(numbers);
      System.out.println(numbers);

      List<String> names = Arrays.asList("Hans", "Anna", "Xaver", "Peter");
      Collections.sort(names);
      System.out.println(names);

      List<LightBulb> lightBulbs =
            Arrays.asList(new LightBulb("red"), new LightBulb("white"), new LightBulb("green"));
      Collections.sort(lightBulbs);
      System.out.println(lightBulbs);

      class LightBulbComparator implements Comparator<LightBulb> {

         @Override
         public int compare(LightBulb o1, LightBulb o2) {
            Integer size1 = o1.color().length();
            Integer size2 = o2.color().length();
            return size2.compareTo(size1);
         }

      }
      Collections.sort(lightBulbs, new LightBulbComparator());
      System.out.println(lightBulbs);
   }

}

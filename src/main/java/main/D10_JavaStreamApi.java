package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Person;
import model.Person.Gender;

/**
 * Java Stream API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D10_JavaStreamApi {

   public static void main(String[] args) {
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Hans", 42, Gender.MALE, 1.77));
      persons.add(new Person("Peter", 24, Gender.MALE, 1.90));
      persons.add(new Person("Lisa", 70, Gender.FEMALE, 1.55));
      persons.add(new Person("Anna", 16, Gender.FEMALE, 1.78));
      persons.add(new Person("Maria", 33, Gender.FEMALE, 1.65));
      persons.add(new Person("Max", 55, Gender.MALE, 2.02));

      System.out.println("Nur weibliche Vornamen der Länge 4 absteigend sortiert");

      /* imperative Lösung */
      List<String> names = new ArrayList<>();

      for (Person p : persons) {
         if (p.gender().equals(Gender.FEMALE)) {
            if (p.name().length() == 4) {
               String name = p.name().toUpperCase();
               names.add(name);
            }
         }
      }

      Collections.sort(names);
      names = names.reversed();
      System.out.println(names);

      /* funktionale Lösung */
      /* filter, map, sorted, toList */
      names = persons.stream()
            .filter(p -> p.gender().equals(Gender.FEMALE))
            .filter(p -> p.name().length() == 4)
            .map(p -> p.name().toUpperCase())
            .sorted()
            .toList()
            .reversed();
      System.out.println(names);

      System.out.println();
      System.out.print("Durchschnittsalter der männlichen Personen: ");
      /* filter, mapToInt/mapToDouble/mapToLong, average/sum */
      persons.stream()
            .filter(p -> p.gender().equals(Gender.MALE))
            .mapToInt(Person::age) // mapToInt(p -> p.age())
            .average()
            .ifPresent(System.out::println);

      System.out.println();
      System.out.print("Älteste Person: ");
      /* max/min/count */
      persons.stream()
            .max((p1, p2) -> Integer.compare(p1.age(), p2.age()))
            .ifPresent(System.out::println);

      System.out.println();
      System.out.print("Gibt es einen Max?: ");
      /* anyMatch/allMatch/noneMatch */
      System.out.println(persons.stream().anyMatch(p -> p.name().equals("Max")));

      System.out.println();
      System.out.println("Alle Geschlechter:");
      /* map, distinct, sorted, toList */
      persons.stream()
            .map(Person::gender) // map(p -> p.gender())
            .distinct()
            .sorted()
            .toList()
            .reversed()
            .forEach(System.out::println);

      System.out.println();
      System.out.println("Alle Personen gruppiert nach Geschlecht:");
      /* collect */
      Map<Gender, List<Person>> personsByGender =
            persons.stream().collect(Collectors.groupingBy(Person::gender));
      personsByGender.forEach((g, ps) -> System.out.println(g + ": " + ps));
   }

}

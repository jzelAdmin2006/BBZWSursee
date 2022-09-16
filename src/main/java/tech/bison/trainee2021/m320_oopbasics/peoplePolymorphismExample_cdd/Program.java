package tech.bison.trainee2021.m320_oopbasics.peoplePolymorphismExample_cdd;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    Person teenagerInPuberty = new Teenager(1, "Karlotta", "M�ller", true);
    Person teenagerNotInPuberty = new Teenager(2, "Ludwig", "Kempf", false);
    Person teacher = new Teacher(3, "Bernhard", "L�mpel", 259.95);

    List<Person> people = new ArrayList<>();
    people.add(teenagerInPuberty);
    people.add(teenagerNotInPuberty);
    people.add(teacher);

    for (Person person : people) {
      System.out.println(person.getMessage());
    }
  }
}

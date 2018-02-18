package cz.jakubstastny;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    Person jakub  = new Person("Jakub",184);
    Person david  = new Person("David",178);
    Person ondrej = new Person("Ondrej",180);

    Person[] people = {jakub, david, ondrej};
    
    Arrays.sort(people);
    for(Person person:people) System.out.println(person);
    
//    Arrays.sort(people, Collections.reverseOrder());
  }

}

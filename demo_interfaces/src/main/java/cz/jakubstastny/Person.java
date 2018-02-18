package cz.jakubstastny;

public class Person implements Comparable<Person> {
  private String name;
  private int height;

  public Person(String name, int height) {
    this.name = name;
    this.height = height; 
  }
  
  public int compareTo(Person p) {
    return height - p.height;
  }

  @Override
  public String toString() {
    return name;
    
  }
}

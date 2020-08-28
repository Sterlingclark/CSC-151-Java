package ch01_test;

public class Person {
  public String name = null;
  public Person (String fullName) {
    System.out.println("New person");
    System.out.println("Their name is " + fullName);
    this.name = fullName;
  }
}
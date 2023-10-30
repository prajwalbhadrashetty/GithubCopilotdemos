package org.example.oops;

//give me an encapsulation method with comments on how code works
//create a new class called person with id and name
//create a class to great hello with id
class Person {

    private double id;
    private String name;

    public Person() {
        // Only Person class can access and assign
        id = Math.random();
        sayHello();
    }

    // This method is protected for giving access within Person class only
    private void sayHello() {
        System.out.println("Hello - " + getId());
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

/**
 * Test class for Person
 */
public class encapsulation {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Prajwal");
        System.out.println("Person 1 - " + p1.getId() + " : " + p1.getName());
    }
}
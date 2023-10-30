package org.example.oops;

//Give an example of inheritance with animals and its sound
//create different class for different animals and give their own behavioral sound
//give comments on how it works
public class Inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setId(123);
        dog.sound();
    }
}

class Animal {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound() {
        System.out.println("By default it is mute");
    }
}


class Dog extends Animal {

    // Own behavior
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }


    @Override
    public void sound() {
        bark();
    }
}

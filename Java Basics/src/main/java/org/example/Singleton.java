package org.example;

//Give an example of a working singleton class.
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        //print a message to show that the constructor is called
        System.out.println("\n\n\nSingleton constructor is called\n");
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    //give a main method to test the singleton class
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}

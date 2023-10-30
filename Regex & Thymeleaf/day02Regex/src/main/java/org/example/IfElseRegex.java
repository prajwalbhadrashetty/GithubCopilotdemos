package org.example;

//create a simple if-else condition using regex to check if the number is divisible by 10 and avoid using string
public class IfElseRegex {
    public static void main(String[] args) {
        int number = 100;
        String regex = "\\d+";
        if (regex.matches("\\d+")) {
            System.out.println("This is a number");
        } else {
            System.out.println("This is not a number");
        }
    }
}



package org.example;

//implement a switch statement using regex
public class SwitchRegex {
    public static void main(String[] args) {
        String string = "This is a string with 32 numbers";
        String regex = "\\d+";
        switch (regex) {
            case "\\d+":
                System.out.println("This is a string with numbers");
                break;
            case "\\w+":
                System.out.println("This is a string with words");
                break;
            default:
                System.out.println("This is a string");
                break;
        }
    }
}

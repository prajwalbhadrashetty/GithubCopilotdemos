package org.example.Email;

//Create a regex pattern class to validate email addresses
public class RegexEmail {
    public static void main(String[] args) {
        String email = "prajwal@gmail.com";
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.com+$";
        System.out.println(email.matches(regex));
    }
}
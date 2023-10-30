package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//create a regex pattern to extract all numbers from a string using pattern and matcher class
public class Regex {
    public static void main(String[] args) {
        String string = "This is a string with 12345 numbers";
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


package org.example;

//give a class to count numbers of odd numbers and even numbers in an array
public class Basics {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int oddCount = 0;
        int evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
    }
}

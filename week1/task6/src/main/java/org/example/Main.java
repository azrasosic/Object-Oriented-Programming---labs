package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number");
        int number2 = Integer.parseInt(reader.nextLine());
        if (number1 == number2)
            System.out.println("The numbers are equal");
        else if (number1 > number2)
            System.out.println("Number " + number1 + " is greater than number " + number2);
        else
            System.out.println("Number " + number2 + " is greater than number " + number1);
    }
}

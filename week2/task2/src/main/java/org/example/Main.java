package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the third number");
        int number3 = Integer.parseInt(reader.nextLine());
        System.out.println("the sum is " + (number1 + number2 + number3));
    }
}

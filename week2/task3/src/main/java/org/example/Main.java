package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(reader.nextLine());
        int sum = number;
        while (number != 0) {
            System.out.println("Enter a number");
            number = Integer.parseInt(reader.nextLine());
            sum += number;
        }
        System.out.println("the sum is " + sum);
    }
}

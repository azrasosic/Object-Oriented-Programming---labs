package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(reader.nextLine());
        if (number > 0)
            System.out.println("Number " + number + " is positive");
        else
            System.out.println("Number " + number + " is NOT positive");
    }
}

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number");
        int start = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second number");
        int end = Integer.parseInt(reader.nextLine());
        if (start>end)
            System.out.println("The numbers are " + start + " and " + end);
        else {
            System.out.println("The numbers between are: ");
            while (start < end - 1) {
                start++;
                System.out.println(start);
            }
        }
    }
}



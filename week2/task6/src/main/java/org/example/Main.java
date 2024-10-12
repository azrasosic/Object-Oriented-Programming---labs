package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(reader.nextLine());
        printText(number);
    }
    public static void printText(int n) {
        for (int i=0;i<n;i++)
            System.out.print("In the beginning there were the swamp, the hoe and Java.\n");
    }

}
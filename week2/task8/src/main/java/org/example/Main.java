package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(reader.nextLine());
        drawStarsPiramid(number);
    }
    public static void drawStarsPiramid(int n) {
        for (int i=1;i<=n;i++) {
            for (int j=0;j<=n-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
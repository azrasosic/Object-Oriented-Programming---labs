package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 22;
        int g = 0;
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Guess the number");
            int number = Integer.parseInt(reader.nextLine());
            g++;
            if (number == n) {
                break;
            }
            if (number > n) {
                System.out.println("Lower! - This is your " + g + " guess !");
            }
            else {
                System.out.println("Higher! - This is your " + g + " guess !");
            }

        }
        System.out.println("You are correct! \n You made " + g + " guesses !");

    }

}
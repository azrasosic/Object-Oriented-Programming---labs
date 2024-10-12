package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "carrot";
        while (true) {
            System.out.println("Enter password");
            Scanner reader = new Scanner(System.in);
            String pass = reader.nextLine();
            if (pass.equals(password)) {
                System.out.println("Right! Secret is 'pssst!'");
                break;
            }
        }
    }
}

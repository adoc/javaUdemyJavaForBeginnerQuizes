package io.nicklong.udemy.java_for_beginners.quiz.improved_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Improved Use of Scanner
 *
 * The above program crashes if a user enters something other than a
 * number. The problem is that we use the nextInt() method of Scanner,
 * assuming blindly that we will get an integer.
 *
 * Modify the program so that no input can crash it.
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        while(n != 5) {
            System.out.println("Do as you are told!");
            System.out.print("Enter the number 5: ");
            try {
                n = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Stop messing around!");
                scanner.next();
            }
        }
        System.out.println("Good peon.");
    }
}

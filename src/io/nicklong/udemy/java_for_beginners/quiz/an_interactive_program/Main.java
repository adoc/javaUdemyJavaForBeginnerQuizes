package io.nicklong.udemy.java_for_beginners.quiz.an_interactive_program;

import java.util.Scanner;


/**
 * An Interactive Program
 *
 * Create a program that asks the user to enter an integer. If the integer
 * is less than 10, print the message "This number is too small". If the
 * integer is greater than or equal to 10, print "This number is big enough".
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int inputValue = scanner.nextInt();

        if (inputValue < 10) {
            System.out.println("This number is much too small");
        } else {
            System.out.println("This number is perfect!");
        }
    }
}

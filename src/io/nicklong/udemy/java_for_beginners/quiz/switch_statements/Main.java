package io.nicklong.udemy.java_for_beginners.quiz.switch_statements;

import java.util.Scanner;

/**
 * Switch Statements
 *
 * Write a program that asks the user to enter an integer. If the user
 * enters '1', print "Got 1". If the user enters '66', print "Got 66".
 * If the user enters something other than these two numbers, print
 * "Got something else".
 *
 * The program should use a switch statement.
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int n = scanner.nextInt();

        switch (n){
            case 1: {
                System.out.println("Got One!");
                break;
            }
            case 66: {
                System.out.println("Got Sixty-Six");
                break;
            }
            default: {
                System.out.println("Not what we expected.");
            }
        }
    }
}

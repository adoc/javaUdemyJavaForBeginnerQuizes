package io.nicklong.udemy.java_for_beginners.quiz.do_while_loops;

import java.util.Scanner;

/**
 * Created by coda on 4/23/2015.
 *
 * A while loop checks its condition before the first iteration of the
 * loop. A do...while loop checks the condition at the end of the loop.
 * This means there's always at least one iteration of the loop.
 *
 * Write a program that asks the user to enter an integer, then gets the
 * input from the user. The program should repeatedly ask the user to
 * enter an integer until the user enters an integer greater than 10;
 * then it should print "Integer greater than 10 detected!" and should
 * end.
 *
 * The program must contain only two print statements!
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter an integer: ");
            n = scanner.nextInt();
        } while (n <= 10);
        System.out.println("You are big enough!");
    }
}
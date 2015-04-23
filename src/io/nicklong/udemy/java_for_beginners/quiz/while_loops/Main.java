package io.nicklong.udemy.java_for_beginners.quiz.while_loops;

import java.util.Scanner;

/**
 * Created by coda on 4/23/2015.
 *
 * Write an application that asks the user to enter the number '5' and
 * loops over and over until '5' is entered.
 *
 * When 5 is finally entered, print "Got it!".
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
            n = scanner.nextInt();
        }
        System.out.println("Good peon.");
    }
}

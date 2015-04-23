package io.nicklong.udemy.java_for_beginners.quiz.two_dimensional_arrays;

/**
 * Two Dimensional Main
 *
 * A bit trickier, this one. Write an application that creates a
 * two-dimensional array of Strings, with two rows and three columns.
 * Print the value in the second row and third column.
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Main {
    public static void main(String[] args) {
        String[][] people = {
                {"Nick",  "Angie", "Joe"},
                {"Jeff", "John", "Bob"}
        };
        System.out.println(people[1][2]);
    }
}

package io.nicklong.udemy.java_for_beginners.quiz.looping_2d_arrays;

/**
 * Looping Through 2D Main
 *
 * Create an application that uses two nested for loops to loop through
 * the 2D array defined above and print the values.
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Main {
    public static void main(String[] args) {
        String[][] people = {
                {"Nick",  "Aki", "Joe"},
                {"Jeff", "John", "Bob"}
        };

        for(String[] row: people){
            for(String person: row) {
                System.out.println(person);
            }
        }
    }
}
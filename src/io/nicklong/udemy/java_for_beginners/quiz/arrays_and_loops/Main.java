package io.nicklong.udemy.java_for_beginners.quiz.arrays_and_loops;

/**
 * Arrays and Loops
 *
 * Modify the above program so that it uses a for loop to display all the
 * values in the array, all on the same line, each value formatted to two
 * decimal places and followed by a space.
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Main {
    public static void main(String[] args) {
        float[] numbers = {1.1111f, 2.2222f, 3.3333f, 4.4444f, 5.5555f};
        for(float num: numbers) {
            System.out.printf("%.2f ", num);
        }
    }
}

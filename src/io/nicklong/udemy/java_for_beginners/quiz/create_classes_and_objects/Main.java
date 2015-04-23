package io.nicklong.udemy.java_for_beginners.quiz.create_classes_and_objects;

/**
 * Create Classes and Objects
 *
 * First, create a main program as in the first exercise.
 *
 * Next, define a new class in its own file. Call the class Car. Give
 * it a single method called "start". Make the method simply print "Car started!".
 *
 * In your main program, create a new Car object and call its start() method.
 *
 * Your final program should simply therefore display the text "Car started!".
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}

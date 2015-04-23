package io.nicklong.udemy.java_for_beginners.quiz.constructors;

/**
 * Constructors
 *
 * Modify the above Car class so that it has an instance variable called
 * name of type String. Add a constructor that accepts a string parameter
 * and sets the car's name using this parameter. Add a getName() method
 * that returns the car's name.
 *
 * Finally, modify the main application so that it sets the car's name via
 * the constructor, then prints the cars name (retrieving it using getName()).
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevy Nova");

        System.out.println(car.getName());
    }
}

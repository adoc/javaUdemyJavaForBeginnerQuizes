package io.nicklong.udemy.java_for_beginners.quiz.constructors;

/**
 * Car Class
 *
 * @author Nick Long (https://nicklong.io)
 */
public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("Car started!");
    }

    public Car(String name) {
        this.name = name;
    }
}

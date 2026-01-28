package org.example;

import org.example.behaviours.FlyWithWings;
import org.example.ducks.Duck;
import org.example.ducks.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        System.out.println("---- changing behavior at runtime ----");

        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
    }
}
package org.example.ducks;

import org.example.behaviours.FlyNoWay;
import org.example.behaviours.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
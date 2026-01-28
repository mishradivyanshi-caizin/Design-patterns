package org.example.ducks;

import org.example.behaviours.FlyWithWings;
import org.example.behaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
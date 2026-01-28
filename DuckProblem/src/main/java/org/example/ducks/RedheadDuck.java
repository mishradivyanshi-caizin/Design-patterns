package org.example.ducks;

import org.example.behaviours.FlyWithWings;
import org.example.behaviours.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a Redhead Duck");
    }
}

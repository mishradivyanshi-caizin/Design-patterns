package org.example.ducks;

import org.example.behaviours.FlyNoWay;
import org.example.behaviours.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm a Decoy Duck");
    }
}
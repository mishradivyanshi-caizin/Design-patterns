package org.example.ducks;

import org.example.behaviours.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DuckBehaviorChangeTest {

    @Test
    void testSetFlyBehavior() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.performFly();
        assertEquals("I can't fly", outputStream.toString().trim());

        outputStream.reset();
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.performFly();
        assertEquals("I'm flying with wings", outputStream.toString().trim());
    }

    @Test
    void testSetQuackBehavior() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        DecoyDuck decoyDuck = new DecoyDuck();

        decoyDuck.performQuack();
        assertEquals("<< Silence >>", outputStream.toString().trim());

        outputStream.reset();
        decoyDuck.setQuackBehavior(new Quack());
        decoyDuck.performQuack();
        assertEquals("Quack!", outputStream.toString().trim());
    }

    @Test
    void testMultipleBehaviorChanges() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MallardDuck mallardDuck = new MallardDuck();

        mallardDuck.performFly();
        assertEquals("I'm flying with wings", outputStream.toString().trim());

        outputStream.reset();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();
        assertEquals("I can't fly", outputStream.toString().trim());

        outputStream.reset();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.performFly();
        assertEquals("I'm flying with wings", outputStream.toString().trim());
    }
}

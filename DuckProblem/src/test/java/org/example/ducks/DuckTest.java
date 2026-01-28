package org.example.ducks;

import org.example.behaviours.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void testRubberDuck() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.display();
        assertEquals("I'm a Rubber Duck", outputStream.toString().trim());

        outputStream.reset();
        rubberDuck.performFly();
        assertEquals("I can't fly.", outputStream.toString().trim());

        outputStream.reset();
        rubberDuck.performQuack();
        assertEquals("Squeak!", outputStream.toString().trim());
    }

    @Test
    void testMallardDuck() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MallardDuck mallardDuck = new MallardDuck();

        mallardDuck.display();
        assertEquals("I'm a Mallard Duck", outputStream.toString().trim());

        outputStream.reset();
        mallardDuck.performFly();
        assertEquals("I'm flying with wings!", outputStream.toString().trim());

        outputStream.reset();
        mallardDuck.performQuack();
        assertEquals("Quack!", outputStream.toString().trim());
    }

    @Test
    void testRedheadDuck() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        RedheadDuck redheadDuck = new RedheadDuck();

        redheadDuck.display();
        assertEquals("I'm a Redhead Duck", outputStream.toString().trim());

        outputStream.reset();
        redheadDuck.performFly();
        assertEquals("I'm flying with wings!", outputStream.toString().trim());

        outputStream.reset();
        redheadDuck.performQuack();
        assertEquals("Quack!", outputStream.toString().trim());
    }

    @Test
    void testDecoyDuck() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        DecoyDuck decoyDuck = new DecoyDuck();

        decoyDuck.display();
        assertEquals("I'm a Decoy Duck", outputStream.toString().trim());

        outputStream.reset();
        decoyDuck.performFly();
        assertEquals("I can't fly.", outputStream.toString().trim());

        outputStream.reset();
        decoyDuck.performQuack();
        assertEquals("<< Silence >>", outputStream.toString().trim());
    }

    @Test
    void testSwim() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swim();

        assertEquals("All ducks float, even decoys!", outputStream.toString().trim());
    }
}

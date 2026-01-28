package org.example.behaviours;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class QuackBehaviorTest {

    @Test
    void testQuack() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        QuackBehavior quackBehavior = new Quack();
        quackBehavior.quack();

        assertEquals("Quack!", outputStream.toString().trim());
    }

    @Test
    void testMuteQuack() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        QuackBehavior quackBehavior = new MuteQuack();
        quackBehavior.quack();

        assertEquals("<< Silence >>", outputStream.toString().trim());
    }

    @Test
    void testSqueak() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        QuackBehavior quackBehavior = new Squeak();
        quackBehavior.quack();

        assertEquals("Squeak!", outputStream.toString().trim());
    }
}

package org.example.behaviours;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FlyBehaviorTest {

    @Test
    void testFlyWithWings() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        FlyBehavior flyBehavior = new FlyWithWings();
        flyBehavior.fly();

        assertEquals("I'm flying with wings", outputStream.toString().trim());
    }

    @Test
    void testFlyNoWay() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        FlyBehavior flyBehavior = new FlyNoWay();
        flyBehavior.fly();

        assertEquals("I can't fly", outputStream.toString().trim());
    }
}

package org.example;

import org.example.strategy.CardioWorkout;
import org.example.strategy.StrengthWorkout;
import org.example.strategy.YogaWorkout;
import org.example.user.User;

public class FitnessMain {
    public static void main(String[] args) {
        User user = new User(new CardioWorkout());
        user.performWorkout();

        System.out.println("---->Switching Workout");

        user.setWorkoutStrategy(new StrengthWorkout());
        user.performWorkout();

        System.out.println("---->Switching Workout Again");

        user.setWorkoutStrategy(new YogaWorkout());
        user.performWorkout();
    }
}
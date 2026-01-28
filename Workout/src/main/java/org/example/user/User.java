package org.example.user;

import org.example.strategy.Workout;

public class User {

    private Workout workoutStrategy;

    public User(Workout workoutStrategy) {
        this.workoutStrategy = workoutStrategy;
    }

    public void performWorkout() {
        workoutStrategy.performWorkout();
    }

    // Runtime behavior change
    public void setWorkoutStrategy(Workout workoutStrategy) {
        this.workoutStrategy = workoutStrategy;
    }
}

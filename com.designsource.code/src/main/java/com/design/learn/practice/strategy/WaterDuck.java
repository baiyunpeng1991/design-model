package com.design.learn.practice.strategy;

import com.design.learn.practice.strategy.behavior.Flyable;
import com.design.learn.practice.strategy.behavior.Squeak;

public class WaterDuck extends Duck {
    public WaterDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new Flyable();
        duckName = "{ water duck }";
    }

    @Override
    public void display() {
        System.out.println("{ no color}");
    }
}

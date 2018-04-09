package com.design.learn.practice.strategy;


import com.design.learn.practice.strategy.behavior.Flyable;
import com.design.learn.practice.strategy.behavior.Squeak;

public class FireDuck extends Duck {

    public FireDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new Flyable();
        duckName = "{ fire duck }";
    }

    @Override
    public void display() {
        System.out.println("{ red color }");
    }
}

package com.design.learn.practice.strategy;

import com.design.learn.practice.strategy.behavior.Quack;
import com.design.learn.practice.strategy.behavior.UnFlyable;

public class GoldDuck extends Duck {

    public GoldDuck() {
        quackBehavior = new Quack();
        flyBehavior = new UnFlyable();
        duckName = "{ gold duck }";
    }

    @Override
    public void display() {
        System.out.println("{ gold color }");
    }
}

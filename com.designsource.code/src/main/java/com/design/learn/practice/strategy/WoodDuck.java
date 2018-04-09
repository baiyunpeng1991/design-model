package com.design.learn.practice.strategy;

import com.design.learn.practice.strategy.behavior.MuteQuack;
import com.design.learn.practice.strategy.behavior.UnFlyable;

public class WoodDuck extends Duck{

    public WoodDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new UnFlyable();
        duckName = "{wood duck}";
    }

    @Override
    public void display() {
        System.out.println("{ wood color}");
    }
}

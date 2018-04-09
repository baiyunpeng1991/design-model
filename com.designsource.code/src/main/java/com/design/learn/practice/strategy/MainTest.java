package com.design.learn.practice.strategy;

import com.design.learn.practice.strategy.behavior.Flyable;
import com.design.learn.practice.strategy.behavior.Quack;
import com.design.learn.practice.strategy.behavior.UnFlyable;

public class MainTest {

    public static void main(String[] args) {

        Duck fireDuck = new FireDuck();
        fireDuck.setFlyBehavior(new UnFlyable());
        fireDuck.setQuackBehavior(new Quack());
        fireDuck.fly();
        fireDuck.quack();
        fireDuck.swimming();

        Duck waterDuck = new WaterDuck();
        waterDuck.setFlyBehavior(new Flyable());
        waterDuck.swimming();
        waterDuck.quack();
        waterDuck.fly();
    }
}

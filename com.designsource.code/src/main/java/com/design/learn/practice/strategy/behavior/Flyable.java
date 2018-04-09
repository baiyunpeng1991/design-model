package com.design.learn.practice.strategy.behavior;

public class Flyable implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("{~~~~~~fly in sky~~~~~~~}");
    }
}

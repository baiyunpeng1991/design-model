package com.design.learn.practice.strategy.behavior;

public class UnFlyable implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("{~~~~~~can not fly~~~~~~~}");
    }
}

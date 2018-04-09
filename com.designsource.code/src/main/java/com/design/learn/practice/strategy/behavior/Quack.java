package com.design.learn.practice.strategy.behavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("{~~~~~~quack quack quack~~~~~~~}");
    }
}

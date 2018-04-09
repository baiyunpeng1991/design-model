package com.design.learn.practice.strategy.behavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("{~~~~~~squeak squeak squeak~~~~~~~}");
    }
}

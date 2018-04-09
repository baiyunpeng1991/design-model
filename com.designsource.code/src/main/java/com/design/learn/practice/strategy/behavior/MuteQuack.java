package com.design.learn.practice.strategy.behavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("{~~~~~~muteQuack muteQuack muteQuack~~~~~~~}");
    }
}

package com.design.learn.practice.command;

public class YellowLight implements Light {
    @Override
    public void on() {
        System.out.println("~~~~~yellow light on~~~~~~~~~");
    }

    @Override
    public void off() {
        System.out.println("~~~~~yellow light off~~~~~~~~~");
    }
}

package com.design.learn.practice.adapter;

public class BlueDonkey implements Donkey {
    @Override
    public void quack() {
        System.out.println("~~~~~~~~fool,fool,fool~~~~~~~~~");
    }

    @Override
    public void display() {
        System.out.println("~~~~~~~~blue donkey~~~~~~~~~");
    }
}

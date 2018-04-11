package com.design.learn.practice.command.easy;

public class IronDoor implements Door {
    @Override
    public void open() {
        System.out.println("~~~~~~~~IronDoor open~~~~~~~~~");
    }

    @Override
    public void close() {
        System.out.println("~~~~~~~~IronDoor close~~~~~~~~~");
    }
}

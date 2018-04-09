package com.design.learn.practice.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "{darkRoast}";
    }

    @Override
    public double cost() {
        return 10.00;
    }
}

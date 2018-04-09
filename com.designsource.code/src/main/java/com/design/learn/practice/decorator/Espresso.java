package com.design.learn.practice.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "{espresso}";
    }

    @Override
    public double cost() {
        return 12.00;
    }
}

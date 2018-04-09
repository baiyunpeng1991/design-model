package com.design.learn.practice.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "{houseBlend}";
    }

    @Override
    public double cost() {
        return 13.00;
    }
}

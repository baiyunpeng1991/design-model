package com.design.learn.practice.decorator.condiment;

import com.design.learn.practice.decorator.Beverage;
import com.design.learn.practice.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +"{mocha}";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.99;
    }
}

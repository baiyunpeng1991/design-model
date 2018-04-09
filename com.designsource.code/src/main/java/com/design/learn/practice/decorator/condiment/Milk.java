package com.design.learn.practice.decorator.condiment;

import com.design.learn.practice.decorator.Beverage;
import com.design.learn.practice.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "{milk}";
    }

    @Override
    public double cost() {
        return beverage.cost()+ 0.88;
    }
}

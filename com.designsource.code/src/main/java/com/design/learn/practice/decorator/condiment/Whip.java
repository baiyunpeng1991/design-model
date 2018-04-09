package com.design.learn.practice.decorator.condiment;

import com.design.learn.practice.decorator.Beverage;
import com.design.learn.practice.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "{whip}";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.55;
    }
}

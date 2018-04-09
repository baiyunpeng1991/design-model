package com.design.learn.practice.decorator.condiment;

import com.design.learn.practice.decorator.Beverage;
import com.design.learn.practice.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "{soy}";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.00;
    }
}

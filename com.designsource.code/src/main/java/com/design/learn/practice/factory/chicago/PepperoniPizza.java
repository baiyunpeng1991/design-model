package com.design.learn.practice.factory.chicago;

import com.design.learn.practice.factory.CondimentFactory;
import com.design.learn.practice.factory.Pizza;

public class PepperoniPizza extends Pizza {
    private CondimentFactory condimentFactory;
    public PepperoniPizza(CondimentFactory condimentFactory) {
        this.condimentFactory = condimentFactory;
    }

    @Override
    public void prepare() {
        dough = condimentFactory.dough();
        sauce = condimentFactory.sauce();
        cheese = condimentFactory.cheese();
    }
}

package com.design.learn.practice.factory.chicago;

import com.design.learn.practice.factory.CondimentFactory;
import com.design.learn.practice.factory.Pizza;

public class ViggiePizza extends Pizza {

    private CondimentFactory condimentFactory;

    public ViggiePizza(CondimentFactory condimentFactory) {
        this.condimentFactory = condimentFactory;
    }

    @Override
    public void prepare() {
        cheese = condimentFactory.cheese();
        dough = condimentFactory.dough();
    }
}

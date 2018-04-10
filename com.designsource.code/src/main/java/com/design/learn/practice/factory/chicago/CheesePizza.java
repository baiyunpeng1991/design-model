package com.design.learn.practice.factory.chicago;


import com.design.learn.practice.factory.CondimentFactory;
import com.design.learn.practice.factory.Pizza;


public class CheesePizza extends Pizza {

    private CondimentFactory condimentFactory;

    public CheesePizza(CondimentFactory condimentFactory) {
        this.condimentFactory = condimentFactory;
        setName("CheesePizza");
    }

    @Override
    public void prepare() {
        cheese = condimentFactory.cheese();
        clams =condimentFactory.clams();
        dough = condimentFactory.dough();
    }

}

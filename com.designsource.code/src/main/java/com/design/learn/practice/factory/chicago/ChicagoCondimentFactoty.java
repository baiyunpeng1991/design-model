package com.design.learn.practice.factory.chicago;

import com.design.learn.practice.factory.*;
import com.design.learn.practice.factory.condiment.*;

public class ChicagoCondimentFactoty implements CondimentFactory {
    @Override
    public Dough dough() {
        return new ADough();
    }

    @Override
    public Clams clams() {
        return new AClams();
    }

    @Override
    public Sauce sauce() {
        return null;
    }

    @Override
    public Pepperoni pepperoni() {
        return null;
    }

    @Override
    public Cheese cheese() {
        return null;
    }
}

package com.design.learn.practice.factory;

import com.design.learn.practice.factory.condiment.*;

public interface CondimentFactory {

    Dough dough();

    Clams clams();

    Sauce sauce();

    Pepperoni pepperoni();

    Cheese cheese();
}

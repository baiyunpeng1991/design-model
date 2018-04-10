package com.design.learn.practice.factory;

import com.design.learn.practice.factory.chicago.ChicagoPizzaStore;

public class MainTest {
    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
    }
}

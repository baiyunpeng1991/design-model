package com.design.learn.practice.factory;

public abstract class PizzaStore {

    protected void orderPizza(String pizzaType){

        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("pizza = [" + pizza + "]");
    }

    /**
     * 工厂方法
     * @param pizzaType
     * @return
     */
    protected abstract Pizza createPizza(String pizzaType);
}

package com.design.learn.practice.decorator;

import com.design.learn.practice.decorator.condiment.Milk;
import com.design.learn.practice.decorator.condiment.Mocha;
import com.design.learn.practice.decorator.condiment.Soy;

public class MianTest {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() +" = [" + beverage.cost() + "]");
    }
}

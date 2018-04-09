package com.design.learn.practice.decorator;

import com.design.learn.practice.decorator.condiment.Milk;
import com.design.learn.practice.decorator.condiment.Mocha;
import com.design.learn.practice.decorator.condiment.Soy;

public class MianTest {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        Beverage milk = new Milk(darkRoast);
        Beverage mocha = new Mocha(milk);
        Beverage soy = new Soy(mocha);
        System.out.println(soy.getDescription() +" = [" + soy.cost() + "]");
    }
}

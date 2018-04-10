package com.design.learn.practice.factory.condiment;

public class ADough extends Dough {

    public ADough() {
        this.name = "ADough";
    }

    @Override
    public String toString() {
        return "ADough{" +
                "name='" + name + '\'' +
                '}';
    }
}

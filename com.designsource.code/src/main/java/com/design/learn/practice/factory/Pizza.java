package com.design.learn.practice.factory;

import com.design.learn.practice.factory.condiment.*;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    protected abstract void prepare();

    void bake(){
        System.out.println("{"+this.name+"~~~~~~~~~~~~~box}");
    }

    void cut(){
        System.out.println("{"+this.name+"~~~~~~~~~~~~~cut}");
    }

    void box(){
        System.out.println("{"+this.name+"~~~~~~~~~~~~~box}");
    }

    protected void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}

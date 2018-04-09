package com.design.learn.practice.strategy;

import com.design.learn.practice.strategy.behavior.FlyBehavior;
import com.design.learn.practice.strategy.behavior.QuackBehavior;

public abstract class Duck {

    protected String duckName;

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void swimming(){
        System.out.println(duckName+"{~~~~~~swimming~~~~~~~~~}");
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck() {
    }
}

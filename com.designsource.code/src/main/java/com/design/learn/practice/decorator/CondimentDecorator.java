package com.design.learn.practice.decorator;

/**
 * 装饰者抽象类
 */
public abstract class CondimentDecorator extends Beverage{

    @Override
    public abstract String getDescription();
}

package com.design.learn.practice.adapter;

public class CatAdapter extends Cat implements Dog  {
    @Override
    public void quack() {
        super.quack();
    }
}

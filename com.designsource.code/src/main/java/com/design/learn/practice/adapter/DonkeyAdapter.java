package com.design.learn.practice.adapter;

import com.design.learn.practice.strategy.Duck;

/**
 * 对象适配器
 */
public class DonkeyAdapter extends Duck{
    private Donkey donkey;

    public DonkeyAdapter(Donkey donkey) {
        this.donkey = donkey;
    }

    @Override
    public void display() {
        donkey.display();
    }

    @Override
    public void quack() {
       donkey.quack();
    }
}

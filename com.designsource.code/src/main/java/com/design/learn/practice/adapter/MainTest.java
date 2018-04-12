package com.design.learn.practice.adapter;

import com.design.learn.practice.strategy.Duck;

public class MainTest {
    public static void main(String[] args) {
        //对象适配器，把驴转成鸭子
        Duck duckAdapter = new DonkeyAdapter(new BlueDonkey());

        duckAdapter.display();

        duckAdapter.quack();

        //类适配器，把猫转成狗
        Dog catAdapter = new CatAdapter();

        catAdapter.quack();
    }
}

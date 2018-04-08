package com.design.learn.practice.observer;

import java.util.concurrent.TimeUnit;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        WeatherData suject = new WeatherData();
        new JackObserver(suject);
        TomObserver tomObserver = new TomObserver(suject);
        suject.delObserver(tomObserver);
        suject.notifyAll(" weather changed ");
        TimeUnit.SECONDS.sleep(10);
        suject.addObserver(tomObserver);
        suject.notifyAll(" weather changed again ");
    }
}

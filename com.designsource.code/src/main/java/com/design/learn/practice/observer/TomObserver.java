package com.design.learn.practice.observer;



public class TomObserver implements Observer,Displace {

    private Subject subject;

    public TomObserver(Subject weatherData) {
        this.subject = weatherData;
        subject.addObserver(this);
    }

    @Override
    public void displace(Object arg) {
        System.out.println("tom = [" + arg + "]");
    }

    @Override
    public void update(String msg) {
        displace(msg);
    }
}

package com.design.learn.practice.observer;



public class JackObserver implements Observer,Displace {

    private Subject subject;

    public JackObserver(Subject weatherData) {
        this.subject = weatherData;
        subject.addObserver(this);
    }

    @Override
    public void displace(Object arg) {
        System.out.println("jack = [" + arg + "]");
    }

    @Override
    public void update(String msg) {
        displace(msg);
    }
}

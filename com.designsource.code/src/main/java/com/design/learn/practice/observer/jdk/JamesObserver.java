package com.design.learn.practice.observer.jdk;

import com.design.learn.practice.observer.Displace;

import java.util.Observable;
import java.util.Observer;

public class JamesObserver implements Observer,Displace {

    private Observable observable;

    public JamesObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        displace(arg);
    }

    @Override
    public void displace(Object arg) {
        System.out.println("james = [" + arg + "]");
    }

}

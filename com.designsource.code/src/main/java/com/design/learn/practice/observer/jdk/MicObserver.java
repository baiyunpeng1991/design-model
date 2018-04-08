package com.design.learn.practice.observer.jdk;

import com.design.learn.practice.observer.Displace;

import java.util.Observable;
import java.util.Observer;

public class MicObserver implements Observer,Displace {
    private Observable observable;

    public MicObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void displace(Object arg) {
        System.out.println("Mic = [" + arg + "]");
    }

    @Override
    public void update(Observable o, Object arg) {
        displace(arg);
    }
}

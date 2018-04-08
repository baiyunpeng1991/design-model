package com.design.learn.practice.observer.jdk;

import com.design.learn.practice.observer.Displace;

import java.util.Observable;
import java.util.Observer;

public class BobObserver implements Observer,Displace {

    private Observable observable;

    public BobObserver(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void displace(Object arg) {
        System.out.println("bob = [" + arg + "]");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof BeiJingWeatherData ){
            BeiJingWeatherData weatherData = (BeiJingWeatherData) o;
            displace(weatherData.getMsg());
        }
    }
}

package com.design.learn.practice.observer.jdk;

import java.util.Observable;

public class BeiJingWeatherData extends Observable {

    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }

    public String getMsg() {
        return msg;
    }

}

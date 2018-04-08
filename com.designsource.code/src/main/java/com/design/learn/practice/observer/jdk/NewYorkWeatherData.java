package com.design.learn.practice.observer.jdk;

import java.util.Observable;

public class NewYorkWeatherData extends Observable {
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    @Override
    protected synchronized void clearChanged() {
        super.clearChanged();
    }
}

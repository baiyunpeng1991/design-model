package com.design.learn.practice.observer;

import java.util.concurrent.CopyOnWriteArrayList;

public class WeatherData implements Subject {

    private final CopyOnWriteArrayList<Observer> arrayList = new CopyOnWriteArrayList();

    @Override
    public void addObserver(Observer observer) {
        arrayList.add(observer);
    }

    @Override
    public boolean delObserver(Observer observer) {
        if(arrayList.contains(observer)){
            return arrayList.remove(observer);
        }
        return false;
    }

    @Override
    public void notifyAll(String msg) {
        for (Observer observer : arrayList){
            observer.update(msg);
        }
    }
}

package com.design.learn.practice.observer;

public interface Subject {

    void addObserver(Observer observer);

    boolean delObserver(Observer observer);

    void notifyAll(String msg);
}

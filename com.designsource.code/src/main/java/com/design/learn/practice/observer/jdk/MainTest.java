package com.design.learn.practice.observer.jdk;

public class MainTest {
    public static void main(String[] args) {
        NewYorkWeatherData newYorkWeatherData = new NewYorkWeatherData();
        newYorkWeatherData.setChanged();
        new JamesObserver(newYorkWeatherData);
        new MicObserver(newYorkWeatherData);
        new JerryObserver(newYorkWeatherData);
        newYorkWeatherData.notifyObservers("weather changed");
        int limitTemperature = 10;
        int updateTemperature = 5;
        if(updateTemperature > limitTemperature) {
            newYorkWeatherData.setChanged();
        }
        newYorkWeatherData.notifyObservers(" weather changed again");

        BeiJingWeatherData beiJingWeatherData = new BeiJingWeatherData();
        BobObserver bobObserver = new BobObserver(beiJingWeatherData);
        beiJingWeatherData.setMsg(" the weather of beijing is sunny");
    }
}

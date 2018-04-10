package com.design.learn.practice.singleton;

/**
 * 双重校验+锁
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getDoubleCheckSingleton(){
        if(doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSingleton == null){
                    return new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}

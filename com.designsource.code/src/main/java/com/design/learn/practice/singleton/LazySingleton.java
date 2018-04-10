package com.design.learn.practice.singleton;

/**
 * 懒汉式; 每次访问都要排队，性能开销大
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            return new LazySingleton();
        }
        return lazySingleton;
    }
}

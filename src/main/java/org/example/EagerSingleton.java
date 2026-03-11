package org.example;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        System.out.println("Eager Singleton init");
    }
    public void print() {
        System.out.println("Eager Singleton");
    }
    public static EagerSingleton getInstance() {
        return instance;
    }
}

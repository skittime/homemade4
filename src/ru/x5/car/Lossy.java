package ru.x5.car;

public class Lossy extends Car {
    String overWeight;
    String name  = Lossy.class.getSimpleName();
    @Override
    void start() {
        System.out.println(name + " поехал");
    }

    @Override
    void stop() {
        System.out.println(name + " остановился");
    }

    @Override
    void printinfo() {

    }
}

package ru.x5.car;

public class SportCar extends Car {
    String speedLimit;
    String name = SportCar.class.getSimpleName();

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

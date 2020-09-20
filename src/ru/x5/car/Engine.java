package ru.x5.car;

public class Engine extends Car {
    String power, manufacturer;


    @Override
    void start() {
        System.out.println(brandCar + " поехал ");
    }

    @Override
    void stop() {
        System.out.println(brandCar + " остановился");

    }

    @Override
    void printinfo() {
        System.out.println(brandCar + " " + manufacturer + " " + classCar + " " + engine + " " + weight + " " + power);
    }
}

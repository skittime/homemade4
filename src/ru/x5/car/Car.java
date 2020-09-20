package ru.x5.car;

public abstract class Car {
    Engine brandCar, classCar, engine;
    int weight;

    abstract void start();

    abstract void stop();

    abstract void printinfo();

    public void turnRight() {
        System.out.println(brandCar + " поворот направо");
    }

    public void turnLeft() {
        System.out.println(brandCar + " поворот налево");
    }
}

package ru.x5;

public abstract class Main implements Shape {
    int a = 2, b = 4, r = 14, h = 111;

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle();
        shape[1] = new Circle();
        shape[2] = new Rectangle();
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }

}

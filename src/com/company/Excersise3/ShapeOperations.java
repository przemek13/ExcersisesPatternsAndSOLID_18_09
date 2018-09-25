package com.company.Excersise3;

public class ShapeOperations {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        Shape square = new Square(new RedColor());
        Shape circle2 = new Circle(new BlueColor());
        Shape square2 = new Square(new BlueColor());
        circle.addColor();
        square.addColor();
        circle2.addColor();
        square2.addColor();
    }
}

package com.company.Excersise3;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void addColor() {
        color.addColor();
        System.out.println(" circle.");

    }
}

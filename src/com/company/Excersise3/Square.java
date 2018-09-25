package com.company.Excersise3;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void addColor() {
        color.addColor();
        System.out.println(" square.");

    }
}

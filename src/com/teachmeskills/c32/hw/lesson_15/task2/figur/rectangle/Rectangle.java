package com.teachmeskills.c32.hw.lesson_15.task2.figur.rectangle;

import com.teachmeskills.c32.hw.lesson_15.task2.shape.Shape;

public class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

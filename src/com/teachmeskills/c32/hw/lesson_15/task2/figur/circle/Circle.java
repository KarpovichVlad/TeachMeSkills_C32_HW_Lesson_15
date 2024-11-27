package com.teachmeskills.c32.hw.lesson_15.task2.figur.circle;

import com.teachmeskills.c32.hw.lesson_15.task2.Shape.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


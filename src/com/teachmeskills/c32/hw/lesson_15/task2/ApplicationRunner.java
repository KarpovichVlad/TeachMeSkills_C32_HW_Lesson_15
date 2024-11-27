package com.teachmeskills.c32.hw.lesson_15.task2;

import com.teachmeskills.c32.hw.lesson_15.task2.Shape.Shape;
import com.teachmeskills.c32.hw.lesson_15.task2.figur.circle.Circle;
import com.teachmeskills.c32.hw.lesson_15.task2.figur.rectangle.Rectangle;
import com.teachmeskills.c32.hw.lesson_15.task2.figur.triangle.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать коллекцию фигур.
 * (взять классы для фигур из предыдущих домашних заданий)
 * Заполнить коллекцию различными фигурами.
 * Пройти циклом по коллекции и вызвать метод для подсчета и вывода на экран периметра каждой фигуры.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(7));
        shapes.add(new Rectangle(4,5));
        shapes.add(new Triangle(3,4,5));

        for(Shape shape: shapes){
            System.out.println(shape + ", периметр: " + shape.calculatePerimeter());
        }
    }
}

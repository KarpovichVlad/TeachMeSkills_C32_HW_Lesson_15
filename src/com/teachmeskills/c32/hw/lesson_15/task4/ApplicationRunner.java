package com.teachmeskills.c32.hw.lesson_15.task4;

import java.util.HashSet;
import java.util.Set;

/**
 * Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
 * Вывести коллекцию на экран.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Andrew");
        names.add("Kate");
        names.add("Dmitry");
        names.add("Kirill");
        names.add("Oleg");
        names.add("Fluffic");
        names.add("Sergio");
        names.add("Rita");
        names.add("Dmitry");
        names.add("Flame_host");
        names.add("Marina");
        names.add("Ilya");
        names.add("Vlad");
        names.add("Igor");
        names.add("Daniil");
        names.add("Sultan");

        System.out.println("Уникальные имена:");
        for (String name: names){
            System.out.println(name);
        }
    }
}

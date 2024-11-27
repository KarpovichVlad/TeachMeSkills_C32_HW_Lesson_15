package com.teachmeskills.c32.hw.lesson_15.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать коллекцию целых чисел.
 * Заполните коллекцию рандомными числами.
 * Пусть размер коллекции задается с консоли.
 * Предусмотреть проверку введенного размера коллекции на валидность.
 * Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер коллекции:");
        int size = 0;
        while (true){
            if(scanner.hasNextInt()){
                size = scanner.nextInt();
                if(size>0){
                    break;
                }else {
                    System.out.print("Размер коллекции должен быть больше нуля. Повторите попытку:");
                }
            }else {
                System.out.print("Некорректный ввод. Введите положительное целое число: ");
                scanner.next();
            }
        }
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0;i<size;i++){
            numbers.add((int)(Math.random()*100));
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / size;

        System.out.println("Сгенерированная коллекция: " + numbers);
        System.out.println("Среднее арифметическое: " + average);

    }
}

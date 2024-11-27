package com.teachmeskills.c32.hw.lesson_15.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**При заполнении коллекции числами с консоли следует делать приведения типа.
 Код для привдения строки к числу можно использовать следующий:
 int i = Integer.parseInt(str);
 или
 int val = Integer.valueOf(str);
 Для окончания ввода введите слово "exit".
 При приведении строки к числу, следует учитывать возможность исключений.
 * На экран вывести четные числа из коллекции.
 */

public class ApplicationRunner {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа (для завершения введите 'exit'):");

        while (true){
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            try{
                int number = Integer.parseInt(input);
                numbers.add(number);
            }catch (NumberFormatException e){
                System.out.println("Ошибка: Введите корректное число.");
            }
        }
        System.out.println("Четные числа из коллекции:");
        boolean foundEven = false;
        for(int num: numbers){
            if (num % 2 ==0){
                System.out.println(num);
                foundEven = true;
            }
        }
        if (!foundEven) {
            System.out.println("Четных чисел нет.");
        }
        scanner.close();
    }
}

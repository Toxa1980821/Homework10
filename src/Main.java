
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // === Задача № 1: объявление массивов ===

        // Массив 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        // Массив 2
        double[] doubles = {1.57, 7.654, 9.986};

        // Массив 3
        int[] array = new int[5];
        array[0] = 4;
        array[1] = 5;
        array[2] = 8;
        array[3] = 12;
        array[4] = 2;


        // === Задача № 2: вывод массивов по порядку ===
        System.out.println(" === Задача № 2 ===");

        System.out.println("Массив 1");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Массив 2");
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i < doubles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Массив 3");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // === Задача № 3: вывод массивов в обратном порядке ===
        System.out.println(" === Задача № 3 ===");

        // Массив 1 — вывод наоборот
        System.out.println("Массив 1 вывод наоборот");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Массив 2 — вывод наоборот
        System.out.println("Массив 2 вывод наоборот");
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Массив 3 — вывод наоборот
        System.out.println("Массив 3 вывод наоборот");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // === Задача № 4 : преобразование нечётных чисел в чётные ===
        System.out.println(" === Задача № 4 ===");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}


package lesson_5;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        1
//
//        1. Создать массив на 10 строк.
//        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//        3. Вывести содержимое всего массива (10 элементов)
//        на экран в обратном порядке. Каждый элемент - с новой строки.

        String[] strings = new String[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = strings.length - 1; i >= 0 ; i--) {
            System.out.println(strings[i]);
        }

//        2
//
//        1.1. Создай массив на 10 чисел
//        1.2. Считай с консоли 10 чисел и заполни ими массив
//        2. Найти максимальное число из элементов массива

        int[] ints = new int[10];

        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            ints[i] = scanner1.nextInt();
        }

        int maxInt = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > maxInt){
                maxInt = ints[i];
            }
        }
//
//        System.out.println(maxInt);

//        3
//
//        СО ЗВЕЗДОЧКОЙ
//
//        1. Создать массив на 10 строк.
//        2. Создать массив на 10 чисел.
//        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//        4. В каждую ячейку массива чисел записать длину строки из массива строк,
//                индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

        String[] strings3 = new String[10];
        int[] ints3 = new int[10];
        Scanner scanner3 = new Scanner(System.in);

        for (int i = 0; i < strings3.length; i++) {
            strings3[i] = scanner3.nextLine();
            ints3[i] = strings3[i].length();
        }

        for (int i = 0; i < ints3.length; i++) {
            System.out.println(ints3[i]);
        }

//        4
//
//        1. Создать массив на 10 чисел.
//        2. Ввести с клавиатуры 10 чисел и записать их в массив.
//        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

        int[] ints4 = new int[10];

        Scanner scanner4 = new Scanner(System.in);

        for (int i = 0; i < ints4.length; i++) {
            ints4[i] = scanner4.nextInt();
        }
        for (int i = ints4.length - 1; i >= 0; i--) {
            System.out.println(ints4[i]);
        }

//        5
//
//        1. Создать массив на 20 чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Создать два массива на 10 чисел каждый.
//        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

        int[] ints5 = new int[20];
        int[] oneInts = new int[10];
        int[] twoInts = new int[10];

        Scanner scanner5 = new Scanner(System.in);

        for (int i = 0; i < ints5.length; i++) {
             ints5[i] = scanner5.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            oneInts[i] = ints5[i];
            twoInts[i] = ints5[i + 10];
        }

        for (int i = 0; i < twoInts.length; i++) {
            System.out.println(twoInts[i]);
        }

//        6
//
//        Создать массив на 20 чисел.
//        Заполнить его числами с клавиатуры.
//        Найти максимальное и минимальное числа в массиве.
//        Вывести на экран максимальное и минимальное числа через пробел.

          int[] ints6 = new int[20];

          Scanner scanner6 = new Scanner(System.in);

        for (int i = 0; i < ints6.length; i++) {
            ints6[i] = scanner6.nextInt();
        }

        int max = ints6[0];
        int min = ints6[0];

        for (int i = 0; i < ints6.length; i++) {
            if (ints6[i] > max) {
                max = ints6[i];
            }
            if (ints6[i] < min){
                min = ints6[i];
            }
        }
        System.out.println(max + " " + min);

//        7
//
//        Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

        int[] ints7 = new int[20];

        Scanner scanner7 = new Scanner(System.in);

        for (int i = 0; i < ints7.length; i++) {
            ints7[i] = scanner7.nextInt();
        }


        for (int i = 0; i < ints7.length; i++) {
            for (int j = 0; j < ints7.length - 1; j++) {
                if (ints7[j] < ints7[j + 1]){
                    int f = ints7[j];
                    ints7[j] = ints7[j + 1];
                    ints7[j + 1] = f;
                }
            }
        }
        for (int i = 0; i < ints7.length; i++) {
            System.out.println(ints7[i]);
        }
    }
}

package lesson_6;

import java.util.Locale;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        1
//
//        Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//                Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
//
//                Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//                Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//                Программа выводит слова на экран.

        Scanner scanner = new Scanner(System.in);
           while (true) {
               String str = scanner.nextLine();
               if (str.equals("")){
                   break;
               } else {
                   if (str.length() % 2 == 0) {
                       System.out.println(str.toUpperCase() + str.toUpperCase());
                   } else {
                       System.out.println(str.toUpperCase() + str.toUpperCase() + str.toUpperCase());
                   }
               }
           }

//        Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

        Scanner scanner2 = new Scanner(System.in);
        String str1 = scanner2.nextLine();

        String minStr = str1;
        String maxStr = str1;
        for (int i = 0; i < 4; i++) {
           String str2 = scanner2.nextLine();
            if (maxStr.length() < str2.length()){
                maxStr = str2;
            } else if (minStr.length() > str2.length()){
                minStr = str2;
            }
        }
        System.out.println(maxStr + " " + maxStr.length());
        System.out.println(minStr + " " + minStr.length());

//        1. Создать массив на 10 строк.
//        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

        Scanner scanner3 = new Scanner(System.in);
        String[] strings = new String[10];

        for (int i = 0; i < 8; i++) {
            strings[i] = scanner3.nextLine();
        }

        for (int i = strings.length - 1; i >= 0 ; i--) {
            System.out.println(strings[i]);
        }

//        4
//
//        1. Создать массив на 10 строк.
//        2. Создать массив на 10 чисел.
//        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//        4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
//        которой совпадает с текущим индексом из массива чисел.

        Scanner scanner4 = new Scanner(System.in);

        String[] strings2 = new String[10];
        int[] ints = new int[10];

        for (int i = 0; i < 10; i++) {
            strings2[i] = scanner4.nextLine();
            ints[i] = strings2[i].length();
        }

        for (int anInt : ints) {
            System.out.println(anInt);
        }

//
//        5
//
//        1. Считать 6 строк и заполнить ими массив strings.
//        2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").


        Scanner scanner5 = new Scanner(System.in);
        String[] strings3 = new String[6];


        for (int i = 0; i < 6; i++) {
            strings3[i] = scanner5.nextLine();
        }

        for (int i = 0; i < strings3.length; i++) {
            for (int j = 0; j < strings3.length; j++) {
                if (i != j && strings3[i] != null && strings3[j] != null && strings3[i].equals(strings3[j])) {
                    strings3[i] = null;
                    strings3[j] = null;
                }
            }
        }

        for (int i = 0; i < strings3.length; i++) {
            System.out.println(strings3[i]);
        }


    }
}

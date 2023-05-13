package lesson_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DZ {

    public static void main(String[] args) {
//        1
//
//        1. Создай список строк.
//        2. Добавь в него 5 различных строк.
//        3. Выведи его размер на экран.
//        4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

        List<String> stringList = new ArrayList<>();
        stringList.add("QQQ");
        stringList.add("WWW");
        stringList.add("EEE");
        stringList.add("RRR");
        stringList.add("TTT");

        System.out.println(stringList.size());

        for (String str : stringList) {
            System.out.println(str);
        }

//        2
//        1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую длинную строку в списке.
//        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

        List<String> stringList2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            stringList2.add(str);
        }

        String maxStr = stringList2.get(0);
        for (String str : stringList2) {
             if (maxStr.length() < str.length()) {
                 maxStr = str;
             }
        }

        for (String str : stringList2) {
            if (maxStr.length() == str.length()){
                System.out.println(str);
            }
        }

//        3
//        1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую короткую строку в списке.
//        4. Выведи найденную строку на экран.
//        5. Если таких строк несколько, выведи каждую с новой строки.

        List<String> stringList3 = new ArrayList<>();
        Scanner scanner2 = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String str = scanner2.nextLine();
            stringList3.add(str);
        }

        String minStr = stringList3.get(0);
        for (String str : stringList3) {
            if (minStr.length() > str.length()) {
                minStr = str;
            }
        }

        for (String str : stringList3) {
            if (minStr.length() == str.length()){
                System.out.println(str);
            }
        }

//        4
//
//        1. Создай список строк в методе main.
//        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//        3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

        List<String> stringList4 = new ArrayList<>();
        Scanner scanner3 = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String str = scanner3.nextLine();
            stringList4.add(0, str);
        }

        for (String str : stringList4) {
            System.out.println(str);
        }

//        5
//        1. Создай список строк.
//        2. Добавь в него 5 строк с клавиатуры.
//        3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//        4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

        List<String> stringList5 = new ArrayList<>();
        Scanner scanner4 = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String str = scanner4.nextLine();
            stringList5.add(str);
        }

        for (int i = 0; i < 13; i++) {
            String str = stringList5.get(stringList5.size() - 1);
            stringList5.remove(stringList5.size() - 1);
            stringList5.add(0, str);
        }

        for (String str : stringList5) {
            System.out.println(str);
        }

//        6
//        1. Создай список строк.
//        2. Добавь в него 10 строчек с клавиатуры.
//        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//                Если таких строк несколько, то должны быть учтены самые первые из них.
//        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

        List<String> stringList6 = new ArrayList<>();
        Scanner scanner5 = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String str = scanner5.nextLine();
            stringList6.add(str);
        }

        String maxStr2 = stringList6.get(0);
        String minStr2 = stringList6.get(0);

        for (String str : stringList6) {
            if (maxStr2.length() < str.length()) {
                maxStr2 = str;
            }
            if (minStr2.length() > str.length()) {
                minStr2 = str;
            }
        }

        for (String str : stringList6) {
            if (maxStr2.length() == str.length()) {
                System.out.println(maxStr2);
                break;
            }
            if (minStr2.length() == str.length()) {
                System.out.println(minStr2);
                break;
            }

        }

//        7
//
//        1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//        Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//                Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//                Порядок объявления списков очень важен.
//        1.1 Создай метод printList
//        2. Метод printList должен выводить на экран все элементы списка с новой строки.
//        3. Используя метод printList выведи эти три списка на экран.
//                Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

        List<Integer> integerList = new ArrayList<>();

        Scanner scanner6 = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            integerList.add(scanner6.nextInt());
        }
        List<Integer> integerListOfThree = new ArrayList<>();
        List<Integer> integerListOfTwo = new ArrayList<>();
        List<Integer> integerListAllTheRest = new ArrayList<>();

        for (Integer i : integerList) {
             if (i % 6 == 0) {
                 integerListOfTwo.add(i);
                 integerListOfThree.add(i);
             } else if (i % 2 == 0) {
                 integerListOfTwo.add(i);
             } else if (i % 3 == 0) {
                 integerListOfThree.add(i);
             } else  {
                 integerListAllTheRest.add(i);
             }
        }
        System.out.println("integerListOfThree");
        printList(integerListOfThree);
        System.out.println("integerListOfTwo");
        printList(integerListOfTwo);
        System.out.println("integerListAllTheRest");
        printList(integerListAllTheRest);
    }

    public static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

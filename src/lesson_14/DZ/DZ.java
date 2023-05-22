package lesson_14.DZ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DZ {

    public static void main(String[] args) throws IOException {
//        1
//
//        Введи с клавиатуры 5 слов в список строк.
//        Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

        List<String> list1 = new ArrayList<>();
        list1.add("Коля");
        list1.add("Оля");
        list1.add("Толя");
        list1.add("Витя");
        list1.add("Аня");

        list1.remove(2);

        for (int i = list1.size() - 1; i >= 0 ; i--) {
            System.out.println(list1.get(i));
        }

//        2
//
//        1. Создай список из слов "мама", "мыла", "раму".
//        2. После каждого слова вставь в список строку, содержащую слово "именно".
//        3. Вывести результат на экран, каждый элемент списка с новой строки.

        List<String> list2 = new ArrayList<>();
        list2.add("мама");
        list2.add("мыла");
        list2.add("раму");
        list2.add("мама");
        list2.add("мыла");
        list2.add("раму");

        for (int i = 0; i < list2.size(); i++) {
            list2.add(++i, "именно");
        }

        for (String str : list2) {
            System.out.println(str);
        }

//        3
//
//        1. Создай список слов, заполни его самостоятельно.
//        2. Метод fix должен:
//        2.1. удалять из списка строк все слова, содержащие букву "р"
//        2.2. удваивать все слова содержащие букву "л".
//        2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//        2.4. с другими словами ничего не делать.


            ArrayList<String> strings = new ArrayList<String>();
            strings.add("роза");
            strings.add("лоза");
            strings.add("лира");
            strings.add("ваня");
            strings = fix(strings);

            for (String string : strings) {
                System.out.println(string);
            }

//        4
//
//        1. Введи с клавиатуры 10 слов в список строк.
//
//        2. Метод doubleValues должен удваивать слова по принципу:
//        "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//
//        3. Выведи результат на экран, каждое значение с новой строки.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list3.add(reader.readLine());
        }

        list3.addAll(doubleValues(list3));

        for (String str : list3) {
            System.out.println(str);
        }

//        5
//
//        1. Введи с клавиатуры 10 слов в список строк.
//        2. Определить, является ли список упорядоченным по возрастанию длины строки.
//        3. В случае отрицательного ответа вывести на экран индекс первого элемента,
//        нарушающего такую упорядоченность.

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        List<String> list4 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list4.add(reader2.readLine());
        }

        System.out.println(inAscendingOrder(list4));

    }

    private static String inAscendingOrder(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() > list.get(i + 1).length()){
                return String.valueOf(i + 1);
            }
        }
        return "Список упорядочен по возрастанию";
    }

    private static List<String> doubleValues(List<String> list3) {
        for (int i = 0; i < list3.size(); i += 2) {
             list3.add(i, list3.get(i));
        }
         return list3;
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("л") && !strings.get(i).contains("р")) {
               strings.add(i, strings.get(i));
               i++;
            } else if (strings.get(i).contains("р") && !strings.get(i).contains("л")){
                strings.remove(i);
                i--;
            }
        }
        return strings;
    }

}

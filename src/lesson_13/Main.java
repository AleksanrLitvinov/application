package lesson_13;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        * ArrayList<Integer> - это безразмерная коллекция, реализация изменяемого массива интерфейса List.
//        * Изменяет размер динамически, но может включать в себя элементы только одного типа.
//        * Примитивные типы нельзя хранить внутри коллекций.
//        Для этого есть ссылочные типы примитивов:
//        int Integer
//        byte Byte
//        short Short
//        char Character

        ArrayList<Integer> arrayList = new ArrayList<>();
        // Добавление объекта в коллекцию
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(44);
        //   Получения объекта
        System.out.println(arrayList.get(0));
        // Печать списка

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Print arrayList in fori " + arrayList.get(i));
        }

        for (Integer var : arrayList) {
            System.out.println("Print arrayList in foreach " + var);
        }
        // Удаление элемента коллекции
        // По объекту
        arrayList.remove(Integer.valueOf(44));
        // По индексу
        arrayList.remove(0);
         // Очищения всей коллекции
        arrayList.clear();
        // Проверка на наличие элемента
        ArrayList<String> strings = new ArrayList<>();

        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");

        System.out.println(strings.contains("EEE"));

        // Добавления элемента в коллекцию на определенный индекс

        strings.add(3, "EEE");

        // Замена элемента коллекции

        strings.set(3, "NNN");

        // Размер коллекции

        System.out.println(strings.size());

        // Преобразования коллекции в массив

        Object[] objects = strings.toArray();

        // Добавить все элементы в новую коллекцию

        ArrayList<String> copyArrayList = new ArrayList<>();
        copyArrayList.addAll(strings);
        copyArrayList.clear();

        // Проверка на наличие элементов
        System.out.println("Collection strings is empty " + strings.isEmpty());
        System.out.println("Collection copyArrayList is empty " + copyArrayList.isEmpty());

        // Возвращает индекс элемента коллекции

        System.out.println("index of element is NNN " + strings.indexOf("NNN"));


    }
}

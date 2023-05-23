package lesson_16.DZ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DZ {
    public static void main(String[] args) throws IOException {
//        1
//
//        1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
//        2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//        3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//        4. Вывести содержимое Map на экран.

        Map<String, String> people = new HashMap<>();

        people.put("Иванов","Алексей");
        people.put("Смирнов","Владимир");
        people.put("Кузнецов","Кирилл");
        people.put("Попов","Кирилл");
        people.put("Васильев","Владимир");
        people.put("Петров","Максим");
        people.put("Соколов","Сергей");
        people.put("Смирнов","Владимир");
        people.put("Морозов","Олег");
        people.put("Иванов","Сергей");

        for (Map.Entry <String, String> human : people.entrySet()){
            System.out.println("Фамилия " + human.getKey() + " " + "Имя " + human.getValue());
        }

//        2
//
//        Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
//        Используй коллекции.

        Map<String, Integer> months = new HashMap<>();

        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + " is the " + months.get(name) + " month");

//        3
//
//        Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
//        Новая задача: Программа должна работать не с номерами домов, а с городами:
//
//        Пример ввода:
//        Москва
//        Ивановы
//        Киев
//        Петровы
//        Лондон
//        Абрамовичи
//        Лондон
//        Пример вывода:
//        Абрамовичи

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
//        while (true) {
//            String city = reader.readLine();
//            if (city.isEmpty()) {
//                break;
//            }
//            String family = reader.readLine();
//
//            map.put(city, family);
//        }

        map.put("Москва", "Ивановы");
        map.put("Киев", "Петровы");
        map.put("Лондон", "Абрамовичи");

        String city = reader.readLine();

        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println(familyName);
        }


//        4
//
//        Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
//        арбуз - ягода,
//        банан - трава,
//        вишня - ягода,
//        груша - фрукт,
//        дыня - овощ,
//        ежевика - куст,
//        жень-шень - корен
//        земляника - ягода,
//        ирис - цветок,
//        картофель - клубень.
//        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//
//        Пример вывода (тут показана только одна строка):
//        картофель - клубень

        HashMap<String, String> map2 = new HashMap<>();

        map2.put("арбуз","ягода");
        map2.put("банан","трава");
        map2.put("вишня","ягода");
        map2.put("груша","фрукт");
        map2.put("дыня","овощ");
        map2.put("ежевика","куст");
        map2.put("жень-шень","корен");
        map2.put("земляника","ягода");
        map2.put("ирис","цветок");
        map2.put("картофель","клубень");

        for (Map.Entry <String, String> product : map2.entrySet()){
            System.out.println(product.getKey() + " - " + product.getValue());
        }

//        5
//
//        Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
//        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//
//        Пример вывода (тут показана только одна строка):
//        Sim - 5

        Map<String, Object> map3 = new HashMap<>();


        map3.put("Sim", 5);
        map3.put("Tom", 5.5);
        map3.put("Arbus", false);
        map3.put("Baby", null);
        map3.put("Cat", "Cat");
        map3.put("Eat", new Long(56));
        map3.put("Food", new Character('3'));
        map3.put("Gevey", '6');
        map3.put("Hugs", 111111111111L);
        map3.put("Comp", (double) 123);

               for (Map.Entry <String, Object> object : map3.entrySet()) {
                   System.out.println(object.getKey() + " - " + object.getValue());
               }

    }
}

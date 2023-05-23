package lesson_16;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 1 - Создания коллекции Map

        HashMap<String, Integer> table = new HashMap<>();

        // 2 - Добавление элементов

        table.put("Dinamo", 11);
        table.put("Shakhter", 15);
        table.put("Spartak", 13);

        // 3 - Добавление дубликатов ключа невозможно

        table.put("Dinamo", 19);
        table.put("Shakhter", 19);

        // 4 - метод containsKey

        System.out.println(table.containsKey("Dinamo"));
        System.out.println(table.containsKey("Zenity"));

        // 5 - проход по коллекции

        for (Map.Entry<String, Integer> p : table.entrySet()) {
            System.out.println(p.getKey() + " : " + p.getValue());
        }

        // 6 - вернуть сет ключей

        for (String key : table.keySet()) {
            System.out.println("Key " + key);
        }

        // 7 - вернуть значения по ключу

        for (String key : table.keySet()) {
            System.out.println("Value " + table.get(key));
        }


    }
}

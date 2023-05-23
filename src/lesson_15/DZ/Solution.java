package lesson_15.DZ;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Solution {

//    1
//
//    Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//    Удалить из множества все числа больше 10.
//
//    Требования:
//•    Программа не должна выводить текст на экран.
//•    Программа не должна считывать значения с клавиатуры.
//•    Класс Solution должен содержать только три метода.
//•    Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
//•    Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.


    public static Set<Integer> createSet() {
        Set<Integer> integersSet = new HashSet<>();

        while (integersSet.size() < 20) {
            Random random = new Random();
            integersSet.add(random.nextInt(40));
        }
        return integersSet;
    }


    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> integers = createSet();
        removeAllNumbersGreaterThan10(integers);
        System.out.println(integers);
    }
}

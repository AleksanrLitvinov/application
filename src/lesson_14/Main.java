package lesson_14;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Создания коллекции и добавление в нее элементов
        HashSet<String> strings = new HashSet<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");

        System.out.println("HashSet не имеет порядка вложенности и не имеет дубликатов");

        // LinkedHashSet
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("AAA");
        stringLinkedHashSet.add("BBB");
        stringLinkedHashSet.add("CCC");
        stringLinkedHashSet.add("CCC");
        stringLinkedHashSet.add("DDD");
        stringLinkedHashSet.add("DDD");
        stringLinkedHashSet.add("EEE");
        stringLinkedHashSet.add("EEE");
        stringLinkedHashSet.add("EEE");

        System.out.println("LinkedHashSet имеет порядок вхождения, но не имеет дубликатов");


        for(Iterator<String> iter = stringLinkedHashSet.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }

    }
}

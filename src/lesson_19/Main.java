package lesson_19;

import lesson_7.animals.Cat;

import java.util.List;

@MethodInfo(author = "Viktor", dataOfCreation = 2023, purpose = "For test")
public class Main {
    public static void main(String[] args) {
//        Season winter = new Season();
//        int n = Season.WINTER;
//        EnumSeason winter2 = EnumSeason.WINTER;
//
//        switch (winter2) {
//            case WINTER -> System.out.println(winter2.getNumberOfSeason());
//            case SPRING -> System.out.println(winter2.getNumberOfSeason());
//            case SUMMER -> System.out.println(winter2.getNumberOfSeason());
//            case AUTUMN -> System.out.println(winter2.getNumberOfSeason());
        Cat cat1 = new Cat("Snezhok", 10, "Snezhokovich" );
        Cat cat2 = new Cat("Sharik", 10, "Sharikovich" );
        Cat cat3 = new Cat("Pushok", 10, "Pushokovich" );
        Cat cat4 = new Cat("Tom", 10, "Tomovich" );
        List<Cat> cats = List.of(cat1, cat2, cat3, cat4);
        cats.forEach(c -> System.out.println(c.getName()));

        cats.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));




    }
}

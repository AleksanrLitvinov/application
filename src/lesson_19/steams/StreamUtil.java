package lesson_19.steams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamUtil {
    public static List<Cat> getCats() {
        return List.of(
                new Cat("Bengal", 10, Breed.BENGAL),
                new Cat("Shezhok", 5, Breed.PERSIAN),
                new Cat("Zefir", 7, Breed.SIBERIAN),
                new Cat("Sakhar", 12, Breed.BENGAL),
                new Cat("Zorro", 15, Breed.PERSIAN));
    }
    public static void printCats(List<Cat> cats){
        cats.forEach(cat -> System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getBreed()));
    }

    public static List<Cat> filterByBreed(List<Cat> cats, Breed breed){
          return cats.stream().
                  filter(cat -> cat.getBreed().equals(breed)).
                  collect(Collectors.toList());
    }

    public static List<Cat> filterByAge(List<Cat> cats){
        return cats.stream().
                sorted(Comparator.comparing(Cat::getAge)).
                collect(Collectors.toList());
    }

    public static Cat minByAge(List<Cat> cats){
        return cats.stream().
                min(Comparator.comparing(Cat::getAge)).orElse(null);
    }


    public static Map <Breed,List<Cat>> groupByAge(List<Cat> cats){
        return cats.stream().
                collect(Collectors.groupingBy(Cat::getBreed));

    }

    public static boolean existByBreed(List<Cat> cats, Breed breed){
        return cats.stream().
                anyMatch(cat -> cat.getBreed().equals(breed));
    }
}

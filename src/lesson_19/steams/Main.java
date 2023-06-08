package lesson_19.steams;

import lesson_19.dz2.Solution;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Bengal", 10, Breed.BENGAL);
//        Cat cat2 = new Cat("Shezhok", 5, Breed.PERSIAN);
//        Cat cat3 = new Cat("Zefir", 7, Breed.SIBERIAN);
//        Cat cat4 = new Cat("Sakhar", 12, Breed.BENGAL);
//        Cat cat5 = new Cat("Zorro", 15, Breed.PERSIAN);
        List<Cat> cats = StreamUtil.getCats();

        List<Cat> filteredCatByBreed = StreamUtil.filterByBreed(cats, Breed.BENGAL);

//        StreamUtil.printCats(filteredCatByBreed);

//        StreamUtil.printCats(StreamUtil.filterByAge(cats));
//        System.out.println(StreamUtil.minByAge(cats));

//        System.out.println(StreamUtil.groupByAge(cats));
        System.out.println(StreamUtil.existByBreed(cats, Breed.BENGAL));
        System.out.println(StreamUtil.existByBreed(cats, Breed.BRITAIN));

    }
}

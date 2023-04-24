package lesson_10.animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        Cat cat = new Cat("Мурка");
        cat.setFood("Рыба");
        cat.setLocation("Дома");
        Dog dog = new Dog("Шарик");
        dog.setFood("Мясо");
        dog.setLocation("Будка");
        Horse horse = new Horse("Дакота");
        horse.setFood("Сено");
        horse.setLocation("Загон");

        animals[0] = cat;
        animals[1] = dog;
        animals[2] = horse;

        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}

package lesson_10.animal;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }
}

package lesson_15;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        dog.putCollar();
        dog.putLeash();
    //    dog.putMuzlle();

        try {
            dog.walk();
        } catch (DogIsNotReadyWalk e) {
            e.printStackTrace();
            System.out.println("Проверка готовности к прогулки :");
            System.out.println("Ошейник найден? " + dog.isCollarOn());
            System.out.println("Поводок найден? " + dog.isLeashOn());
            System.out.println("Намордник надет? " + dog.isMuzzleOn());
        }
    }
}

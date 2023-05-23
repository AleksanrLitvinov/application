package lesson_15;

public class Dog {

    private String name;

    private boolean isCollarOn;
    private boolean isLeashOn;
    private boolean isMuzzleOn;

    public Dog(String name) {
        this.name = name;
    }

    public boolean isCollarOn() {
        return isCollarOn;
    }

    public boolean isLeashOn() {
        return isLeashOn;
    }

    public boolean isMuzzleOn() {
        return isMuzzleOn;
    }

    public void putCollar() {
        this.isCollarOn = true;
        System.out.println("Поводок надет!");
    }

    public void putLeash() {
        this.isLeashOn = true;
        System.out.println("Ошейник надет!");
    }

    public void putMuzlle() {
        this.isMuzzleOn = true;
        System.out.println("Намордник надет!");
    }

    public void walk() throws DogIsNotReadyWalk {
        if (isCollarOn && isLeashOn && isMuzzleOn) {
            System.out.println("Ура, мы готовы! Идти гулять!");
        } else {
            throw new DogIsNotReadyWalk("Собака " + name + " не готова");
        }
    }


}

package lesson_15;

import java.util.HashMap;
import java.util.Map;

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
    @SuppressWarnings("unchecked")
    public void testSuppressWarnings() {
        Map map = new HashMap();
        map.put("AAA", 12);
        map.put("BBB", 11);
        map.put("CCC", 10);
        map.put("NNN", 9);
    }







}

package lesson_10.animal;

public class Cat extends Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот не спит");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

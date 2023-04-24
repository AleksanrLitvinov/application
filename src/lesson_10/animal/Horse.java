package lesson_10.animal;

public class Horse extends Animal {

    private String name;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь не спит");
    }

    @Override
    public void eat() {
        System.out.println("Лошедь ест");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

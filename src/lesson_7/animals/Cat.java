package lesson_7.animals;

public class Cat {
    // Поля
    String name;
    Integer age;
    String parentName;


    // Конструктор


    public Cat(String name, Integer age, String parentName) {
        this.name = name;
        this.age = age;
        this.parentName = parentName;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getParentName() {
        return parentName;
    }

    public Cat(Integer age) {
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }
}

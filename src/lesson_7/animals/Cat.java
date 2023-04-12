package lesson_7.animals;

public class Cat {
    // ïîëÿ
    String name;
    Integer age;
    String parentName;


    // êîíñòðóêòîð


    public Cat(String name, Integer age, String parentName) {
        this.name = name;
        this.age = age;
        this.parentName = parentName;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
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

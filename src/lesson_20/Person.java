package lesson_20;

import lesson_19.MethodInfo;

@MethodInfo(purpose = "test")
public class Person {
   private String name;
   private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(String name, int age) {
        System.out.println(name + " " + age);
    }
}

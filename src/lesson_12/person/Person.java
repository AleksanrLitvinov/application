package lesson_12.person;

public class Person {

    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("�����-�� " + this.fullName  + " �������");
    }

    public void talk() {
        System.out.println("�����-�� " + this.fullName  + " �������");
    }
}

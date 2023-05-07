package lesson_12.humar;

import java.util.Arrays;

public class Human {
    private String name;
    private boolean gender ;
    private int age;
    private Human father;
    private Human mother;


    public Human(String name) {
        this.name = name;
    }


    public Human(String name, boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = new Human(father.name);
        this.mother = new Human(mother.name);
    }

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getStringGender() {
        return this.gender ? "�������" : "�������";
    }

    @Override
    public String toString() {
        String str = "" ;
        if (father != null && mother != null) {
          str = "Human{" +
                    "��� " + name + '\'' +
                    ", ��� " + getStringGender() +
                    ", ������� " + age +
                    ", ���� " + father.name +
                    ", ���� " + mother.name +
                    '}';
        } else {
            str = "Human{" +
                    "��� " + name + '\'' +
                    ", ��� " + getStringGender() +
                    ", ������� " + age +
                    '}';
        }
        return str;
    }


}

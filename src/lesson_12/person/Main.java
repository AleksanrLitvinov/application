package lesson_12.person;

public class Main {
//2
//    ������� ����� Person, ������� ��������:
//
//    ���������� fullName, age;
//    ������ move() � talk(), � ������� ������ ������� �� ������� ��������� -"�����-��  Person �������".
//    �������� ��� ������������  - Person() � Person(fullName, age).
//    �������� ��� ������� ����� ������. ���� ������ ���������������� ������������� Person(), ������ - Person(fullName, age).
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("����", 25);

       person2.move();
       person2.talk();
    }
}

package lesson_12.humar;

public class Main {
//    3

//    ������ ����� Human � ������ ���(String), ���(boolean), �������(int), ����(Human), ����(Human). ������ ������� � ������� �� ���, ����� ����������: ��� �������, ��� �������, ����, ����, ���� �����. ������� ������� �� �����.
//
//    ����������:
//    ���� �������� ���� ����� String toString() � ������ Human, �� ������ �� ����� �������������� ��� ������ ������� �� �����.
//
//    ������ ������:
//    ���: ���, ���: �������, �������: 21, ����: �����, ����: ����
//    ���: ����, ���: �������, �������: 55
//    ���: �����, ���: �������, �������: 2, ����: ������, ����: ���
    public static void main(String[] args) {

        Human human = new Human("���",false, 47);
        Human human2 = new Human("���",false, 47,
                new Human("����"), new Human("���"));
        System.out.println(human.toString());
        System.out.println(human2.toString());
    }
}

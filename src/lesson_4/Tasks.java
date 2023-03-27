package lesson_4;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

//        Ввести с клавиатуры два числа m и n.
//        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
//
//        Пример: m=2, n=4
//        8888
//        8888

        Scanner scanner1 = new Scanner(System.in);
        int m1 = scanner1.nextInt();
        int n = scanner1.nextInt();

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

//        2
//        Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
//
//        Пример вывода на экран:
//        8
//        88
//        888
//        8888
//        88888
//        888888
//        8888888
//        88888888
//        888888888
//        8888888888

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

//        Ввести с клавиатуры три числа, вывести на экран среднее из них.
//         Т.е. не самое большое и не самое маленькое.
//        Если все числа равны, вывести любое из них.

        Scanner scanner3 = new Scanner(System.in);
        int a = scanner3.nextInt();
        int b = scanner3.nextInt();
        int c = scanner3.nextInt();


           if ((a > b && a < c) || (a < b && a > c) || (a == b) || (a == c)) {
               System.out.println(a);
           } else if ((b > a && b < c) || (b < a && b > c) || b == c) {
               System.out.println(b);
           } else if ((c > a && c < b) || (c < a && c > b) ) {
               System.out.println(c);
           } else if (a == b && a == c && b == c){
               System.out.println(a);
           }


//        4
//        Вывести на экран таблицу умножения 10х10 используя цикл while.
//        Числа разделить пробелом.
//
//                Пример вывода на экран:
//        1 2 3 4 5 6 7 8 9 10
//        2 4 6 8 10 12 14 16 18 20
//        3 6 9 12 15 18 21 24 27 30
//        4 8 12 16 20 24 28 32 36 40
//        5 10 15 20 25 30 35 40 45 50
//        6 12 18 24 30 36 42 48 54 60
//        7 14 21 28 35 42 49 56 63 70
//        8 16 24 32 40 48 56 64 72 80
//        9 18 27 36 45 54 63 72 81 90
//        10 20 30 40 50 60 70 80 90 100

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

//        5
//        Ввести с клавиатуры строку name.
//        Ввести с клавиатуры дату рождения (три числа): y, m, d.
//
//        Вывести на экран текст:
//        "Меня зовут name.
//        Я родился d.m.y"
//
//        Пример вывода:
//        Меня зовут Вася.
//       Я родился 15.2.1988

        Scanner scanner5 = new Scanner(System.in);
        String name = scanner5.nextLine();
        int y = scanner5.nextInt();
        int m = scanner5.nextInt();
        int d = scanner5.nextInt();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + y + "." + m + "." + d );
    }
}

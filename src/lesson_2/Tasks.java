package lesson_2;

public class Tasks {

    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;
    public static void main(String[] args) {
        //    Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы.
        //    Сколько рублей лежит в каждой кассе?
        //    Вывести на косоль

        double sumAll = 5.0;
        int cashDesks = 2;
        double oneCashRegister = sumAll / cashDesks;

        System.out.println(oneCashRegister);

//        Дано: Стороны квадрата a = 50, b = 20. Найти площадь. S = ab

        int aSide = 50;
        int bSide = 20;
        int square = aSide * bSide;

        System.out.println(square);

//        Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
//                насколько быстрее голодный Вася съедает один банан?

        int hungry = 9;
        int full = 15;
        int eats = 3;
        int hungryOne = hungry / eats;
        int fullOne = full / eats;
        int faster = fullOne - hungryOne;

        System.out.println(faster);

//        Задача 4. Закомментируй часть кода, чтобы на экран вывелось сообщение "sum = 12"

        int a1 = 3;
//        int a = 10;
        int b1 = 6;
//        int b = 12;
//        int sum = 1 + a + b;
//        int sum = 2 + a + b;
        int sum = 3 + a1 + b1;
//        int sum = 4 + a + b;

        System.out.println("sum = " + sum);

//    Задача 5. В методе main расставь правильно знаки плюс и минус,
//    чтобы значение переменной result получилось равным 20.
//        public static int a = 1;
//        public static int b = 3;
//        public static int c = 9;
//        public static int d = 27;

        int result = -a + b - c + d;
        System.out.println(result);



    }




}

package lesson_3;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        1 Написать программу, чтобы она:
//        - выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
//                - выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
//                - выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.

        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        if (number1 < 5) {
            System.out.println("Число меньше 5");
        } else if (number1 > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }

//        2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
//        в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
//        "Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.
//                Пример для числа 112:
//        Число 112 не содержится в интервале.
//
//        Пример для числа 60:
//        Число 60 содержится в интервале.

        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner2.nextInt();

        if (number2 >= 50 && number2 <= 100){
            System.out.println("Число " + number2 + " содержится в интервале.");
        } else {
            System.out.println("Число " + number2 + " не содержится в интервале.");
        }

//        3 Напиши программу, которая по номеру месяца должна определить время года
//        (зима, весна, лето, осень) и вывести на экран.
//
//        Пример для номера месяца 2:
//        зима
//
//        Пример для номера месяца 5:
//        весна

        Scanner scanner3 = new Scanner(System.in);
        int month = scanner3.nextInt();

        switch (month) {
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неправильное число");
                break;
        }

//        4
//        Написать программу, которая будет проверять число, которое мы подадим ей.
//        Если число положительное, то увеличить его в два раза.
//        Если число отрицательное, то прибавить единицу.
//        Если введенное число равно нулю, необходимо вывести ноль.
//        Вывести результат в консоль.

        Scanner scanner4 = new Scanner(System.in);
        int number4 = scanner4.nextInt();

        if (number4 > 0) {
            number4 *= 2;
            System.out.println(number4);
        } else if (number4 < 0) {
            number4++;
            System.out.println(number4);
        } else {
            System.out.println(number4);
        }

//        6
//        Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
//                , будет определять количество дней в году. Результат вывести на экран в следующем виде:
//        количество дней в этом году: x
//                , где
//        х - 366 для високосного года,
//                х - 365 для обычного года.
//
//                Подсказка:
//        В високосном году - 366 дней, тогда как в обычном - 365.
//        1) если год делится без остатка на 400 это високосный год;
//        2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
//        3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
//        4) все оставшиеся года невисокосные.
//        Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
//        Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
//        Годы 2100, 2200 и 2300 - не високосные.

        Scanner scanner6 = new Scanner(System.in);
        int year = scanner6.nextInt();
        int x = 0;
        if (year % 400 == 0){
            x = 366;
        } else if (year % 100 == 0) {
            x = 365;
        } else if (year % 4 == 0){
            x = 366;
        } else {
            x = 365;
        }
        System.out.println(x);
//

//
////7
////    Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
////    Определить возможность существования треугольника по сторонам.
////    Результат вывести на экран в следующем виде:
////            "Треугольник существует." - если треугольник с такими сторонами существует.
////            "Треугольник не существует." - если треугольник с такими сторонами не существует.
////
////            Подсказка:
////    Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
////    Требуется сравнить каждую сторону с суммой двух других.
////    Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
////    то треугольника с такими сторонами не существует.
//
//
        Scanner scanner7 = new Scanner(System.in);
        int a = scanner7.nextInt();
        int b = scanner7.nextInt();
        int c = scanner7.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

//
////        8
////        Работа светофора для пешеходов запрограммирована следующим образом:
////        в начале каждого часа в течение трех минут горит зелёный сигнал,
////                затем в течение одной минуты - жёлтый,
////                а потом в течение одной минуты - красный,
////                затем опять зелёный горит три минуты и т. д.
////                Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
////        Определить, сигнал какого цвета горит для пешеходов в этот момент.
////        Результат вывести на экран в следующем виде:
////        "зелёный" - если горит зелёный цвет,
////                "жёлтый" - если горит жёлтый цвет,
////                "красный" - если горит красный цвет.
////
////                Пример для числа 2.5:
////        зелёный
////
////        Пример для числа 3:
////        жёлтый
////
////        Пример для числа 4:
////        красный
////
////        Пример для числа 5:
////        зелёный
//
//
        Scanner scanner8 = new Scanner(System.in);
        double t = scanner8.nextDouble();


        if (t % 5 >= 0 && t % 5 < 3){
            System.out.println("зелёный");
        } else if (t % 5 >= 3 && t % 5 < 4) {
            System.out.println("жёлтый");
        } else if (t % 5 >= 4 && t % 5 < 5) {
            System.out.println("красный");
        }
    }




}

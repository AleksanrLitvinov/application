package lesson_8.phone;

import java.util.Scanner;

public class Calculator {

    //    5
//
//    Условие задачи:
//    Необходимо написать простой консольный калькулятор на Java.
//
//
//            Метод int getInt() - должен считывать с консоли целое число и возвращать его
//    Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
//    Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2
//    арифметическую операцию, заданную operation.
//    Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию
//            (с помощью getOperation(), передать все методу calc() и вывести на экран результат

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static int calc(int num1, int num2, char operation) {

        int result = 0;
        if (operation == '+') {
            result = num1 * num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/' && num1 != 0 && num2 != 0) {
            result = num1 / num2;
        }
        return result;

    }

    public static void main(String[] args) {
        int i = Calculator.calc(Calculator.getInt(), Calculator.getInt(), Calculator.getOperation());
        System.out.println(i);
    }


}

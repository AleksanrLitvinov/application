package lesson_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int age = 10;
//        Scanner scanner = new Scanner(System.in);
//        int age = Integer.parseInt(scanner.next());
//
//        String answer = age > 14 ? "Your age is ok" : "No, you can't go to the film";
//        System.out.println(answer);

//        if (age >= 13) {
//            System.out.println("Your age is ok");
//        } else if (age < 13) {
//            System.out.println("No, you can't go to the film");
//        }

        int factorial = Util.findFactorial(5);
        System.out.println(factorial);
    }
}

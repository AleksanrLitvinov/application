package lesson_5;

import java.util.Scanner;

public class TaskArray {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 1");
        Scanner scanner = new Scanner(System.in);
        int [] lenina = new int[8];

        for (int i = 0; i < lenina.length; i++) {
            lenina [i] = scanner.nextInt();
        }

        int even = 0; // ÷ĺňíűĺ
        int odd = 0; // íĺ÷ĺňíűĺ

        for (int i = 0; i < lenina.length; i++) {
            if (i % 2 == 0) {
                even += lenina[i]; // even = even + lenina[i]
            } else {
                odd += lenina[i];  // odd = odd + lenina[i]
            }
        }

        if (even > odd) {
            System.out.println("Íŕ ÷ĺňíîé ńňîđîíĺ óëčöű ćčâĺň áîëüřĺ ëţäĺé");
        } else if (even < odd) {
            System.out.println("Íŕ íĺ÷ĺňíîé ńňîđîíĺ óëčöű ćčâĺň áîëüřĺ ëţäĺé");
        } else if (even == odd) {
            System.out.println("Íŕ îáĺčő ńňîđîíŕő ćčâĺň îäčíŕęîâîĺ ęîë-âî ëţäĺé");
        }
        System.out.println("\n" + "\n");

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 2");

        System.out.println("println"); // + ďĺđĺíîń ęŕđĺňęč ÍŔ ŃËĹÄÓŢŮČÉ ŔÁÇŔÖ
        System.out.print("print"); // ÁĹÇ ďĺđĺíîńŕ ęŕđĺňęč ÍŔ ŃËĹÄÓŢŮČÉ ŔÁÇŔÖ
        System.out.println();
        String name = scanner.nextLine();
        System.out.printf("My name is %s", name);
        int age = scanner.nextInt();
        System.out.printf("My age is %d", age);


        System.out.println("H");

    }
}

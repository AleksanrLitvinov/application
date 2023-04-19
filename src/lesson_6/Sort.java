package lesson_6;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] mas = {1, 3 , 45, 23, 7, 9};

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    int but = mas[i];
                    mas[i]= mas[i + 1];
                    mas[i + 1] = but;
                }
            }

        }
        System.out.println(Arrays.toString(mas));
    }
}

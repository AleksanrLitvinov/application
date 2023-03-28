package lesson_5;

public class Array {
    public static void main(String[] args) {
        //        byte[] array2 = {12, 14, 16, 21};
        //        byte a = 5;


        byte[] array1 = new byte[7];
        array1 [0] = 5;
        array1 [1] = 7;
        array1 [2] = 11;
        array1 [3] = 23;
        array1 [4] = 47;
        array1 [5] = 52;
        array1 [6] = 59;

        System.out.println(" Length of array is " + array1.length);

        // Task 1. Print array

        System.out.println(array1 [0]);
        System.out.println(array1 [1]);
        System.out.println(array1 [2]);
        System.out.println(array1 [3]);
        System.out.println(array1 [4]);
        System.out.println(array1 [5]);
        System.out.println(array1 [6]);

        // Task 2. Print array by cycle


        for (int i = 0; i <= 6; i++) {
            System.out.println(" on index  " +  i + " set value " + array1 [i]);
        }

        // Task 3. Print only odd elements of array

//        System.out.println(array1 [0]);
//        System.out.println(array1 [3]);

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array1 [i]);
            }
        }

        // Task 4. Fill array in cycle

        int [] array2 = new int[10];

        for (int i = 0; i < array2.length; i++) {
            array2 [i] = i;
        }

        double [] arr3 = new double[5];
        boolean [] arr4 = new boolean[5];
        String [] arr5 = new String[5];


        System.out.println("");
    }
}

package lesson_19.dz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//  1
//        Ввести с клавиатуры число N.
//        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//        3. Найти минимальное число среди элементов списка - метод getMinimum.
public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }
    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут

//        Collections.sort(array);
//        return array.get(0);

        return Collections.min(array);

    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        List<Integer> integers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }
        return integers;
    }


}

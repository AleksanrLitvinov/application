package lesson_12;

public class Util {
    public static int findFactorial(int x) {
//        int result = x;
//
////        while (x > 1) {
////            result = (x - 1) * result;
////            x--;
////        }
//
        if (x == 1) {
            return 1;
        }
        return x * findFactorial(x - 1);

    }
}

package lesson_15;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;

public class ExceptionsClass {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
//        System.out.println(10/0);
//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(1);
        System.out.println("---------------------------------------------");
//        String str = null;
//        System.out.println(str.length());
//        NullPointerException nullPointerException = new NullPointerException();
//        nullPointerException.printStackTrace();
        System.out.println("---------------------------------------------");
//        String str = null;
//        try {
//            System.out.println(str.length());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("---------------------------------------------");
        try {
            Files.copy(new File("D:/rg.jpg").toPath(), new File("D:/rg432434.jpg").toPath());
        } catch (FileSystemException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

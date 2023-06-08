package lesson_20;

import lesson_19.MethodInfo;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Person viktor = new Person();
        // 1
        Class personClass = Person.class;
        // 2
        Class aClass = viktor.getClass();
        // 3
        Class c = Class.forName("lesson_20.Person");

//        Method[] methods = personClass.getMethods();
//
//        for (Method m : methods) {
//            System.out.println(m.getName());
//            System.out.println(m.getReturnType());
//            System.out.println(Arrays.toString(m.getParameters()));
//        }

//        Arrays.stream(personClass.getDeclaredFields()).
//                forEach(field -> System.out.println(field.getName() + " " + field.getType()));

//        Arrays.stream(personClass.getAnnotations())
//                .forEach(annotation -> {
//                    if (annotation instanceof MethodInfo){
//                        System.out.println("Yes, this object extends from MethodInfo");
//                    }
//                });
//        System.out.println(Signature.getSignature());

           Signature.getSignature().showTextOfSignature();






    }
}

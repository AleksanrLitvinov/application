package lesson_19;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {

    String author() default  "Viktor";
    int dataOfCreation() default 2023;
    String purpose();
}

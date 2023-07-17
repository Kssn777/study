package spring;


import java.lang.annotation.*;

/**
 * @author Kssn
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mymethod {
    String value() default "";

}

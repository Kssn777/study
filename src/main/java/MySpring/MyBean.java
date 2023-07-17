package MySpring;

import java.lang.annotation.*;

/**
 * @author Kssn
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyBean {

    String name() default "";
}

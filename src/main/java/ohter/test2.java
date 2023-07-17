package ohter;
import java.lang.reflect.Field;
import java.util.*;

public class test2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        String s = new String("abc");
        Class<? extends String> sClass = s.getClass();
        Field value = sClass.getDeclaredField("value");
        value.setAccessible(true);

        char[] x = "abcd".toCharArray();

        value.set(s,x);

        System.out.println(s);

    }
}

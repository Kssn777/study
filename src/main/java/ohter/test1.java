package ohter;

import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class test1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        plane p = new plane();
        Class<? extends plane> aClass = p.getClass();
        Field a = aClass.getDeclaredField("a");
        a.setAccessible(true);
        a.set(p,2);
        p.getA();


    }
}

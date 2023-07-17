package AnnotationTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author lrh
 * @description
 * @date 2023/4/6
 */
public class Application {
    public static void main(String[] args) throws Exception {
        Test test = new TestImpl();
        ProxyFactory proxyFactory = new ProxyFactory(test);
        Test t = (Test) proxyFactory.getProxy(TestImpl.class);

        int f = t.f(1, 2);
        System.out.println(f);


    }
}

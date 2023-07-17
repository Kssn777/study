package AnnotationTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lrh
 * @description
 * @date 2023/4/6
 */
public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }
    public Object getProxy(Class clazz){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Method m = clazz.getMethod(method.getName(), method.getParameterTypes());

                        if(m.isAnnotationPresent(MyAnno.class)){
                            MyAnno annotation = m.getAnnotation(MyAnno.class);
                            int value = annotation.value();
                            return value;
                        }
                        return method.invoke(target,args);
                    }
                });
    }
}

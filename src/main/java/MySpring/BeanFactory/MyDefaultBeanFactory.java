package MySpring.BeanFactory;

import MySpring.BeanDefination.MyBeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lrh
 * @description
 * @date 2022/8/10
 */
public class MyDefaultBeanFactory implements MyBeanFactory{

    Map<String, MyBeanDefinition> beanDefinitionMap;


    public MyDefaultBeanFactory(){
        beanDefinitionMap = new ConcurrentHashMap<>();
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) {
        MyBeanDefinition definition = beanDefinitionMap.get(name);

        return (T) definition.getTarget();

    }

    @Override
    public void register(Class<?> configClass) {
        MyBeanDefinition beanDefinition = new MyBeanDefinition();
        String className = configClass.getName();
        String beanName = className.substring(className.lastIndexOf('.')+1);

        StringBuilder stringBuilder = new StringBuilder(beanName);
        stringBuilder.setCharAt(0, (char) (beanName.charAt(0)+32));
        beanName = stringBuilder.toString();

        try {
            Object instance = configClass.newInstance();
            beanDefinition.setTarget(instance);
            beanDefinitionMap.put(beanName,beanDefinition);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        //beanDefinitionMap.put(beanName,definition);
    }


}

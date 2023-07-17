package MySpring.BeanFactory;

import MySpring.BeanDefination.MyBeanDefinition;

/**
 * @author Kssn
 */
public interface MyBeanFactory {
    <T> T getBean(String name, Class<T> requiredType);

    void register(Class<?> configClass);


}

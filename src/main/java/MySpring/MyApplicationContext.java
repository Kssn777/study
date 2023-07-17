package MySpring;

import MySpring.BeanFactory.MyBeanFactory;
import MySpring.BeanFactory.MyDefaultBeanFactory;

/**
 * @author lrh
 * @description
 * @date 2022/8/10
 */
public class MyApplicationContext {

    private MyBeanFactory beanFactory;

    public MyApplicationContext(){
        beanFactory = new MyDefaultBeanFactory();
    }

    public MyApplicationContext(Class<?> configClass){
        this();
        beanFactory.register(configClass);
    }

    public <T> T getBean(String name, Class<T> personClass) {
        return getBeanFactory().getBean(name,personClass);

    }

    private MyBeanFactory getBeanFactory() {
        return this.beanFactory;
    }
}

package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author lrh
 * @description
 * @date 2022/8/10
 */
@Component
public class LrhBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private Hui hui;

    private String name;
}

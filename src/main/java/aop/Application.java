package aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author lrh
 * @description
 * @date 2023/4/15
 */
@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        AOPTest aopTest = context.getBean("AOPTest", AOPTest.class);
        aopTest.b();

    }
}

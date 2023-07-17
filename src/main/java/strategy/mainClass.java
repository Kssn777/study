package strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lrh
 * @description
 * @date 2022/8/2
 */
@SpringBootApplication
public class mainClass {
    public static void main(String[] args) {
        SpringApplication.run(mainClass.class,args);

        System.out.println("--------------------------------------");
        StrategyFactory.getStrategy("C").method();
    }
}

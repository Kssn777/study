package strategy;

import org.springframework.stereotype.Component;

/**
 * @author lrh
 * @description
 * @date 2022/8/2
 */
@StrategyType(type = "A")
@Component
public class MyStrategyA implements Strategy {
    @Override
    public void method() {
        System.out.println("策略A");
    }
}

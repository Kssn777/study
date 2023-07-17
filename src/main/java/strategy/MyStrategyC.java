package strategy;

import org.springframework.stereotype.Component;

/**
 * @author lrh
 * @description
 * @date 2022/8/2
 */
@Component
@StrategyType(type = "C")
public class MyStrategyC implements Strategy{

    @Override
    public void method() {
        System.out.println("策略C");
    }
}

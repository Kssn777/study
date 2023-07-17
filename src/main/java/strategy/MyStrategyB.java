package strategy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author lrh
 * @description
 * @date 2022/8/2
 */
@StrategyType(type = "B")
@Component
public class MyStrategyB implements Strategy {
    @Override
    public void method() {
        System.out.println("策略B");
    }
}

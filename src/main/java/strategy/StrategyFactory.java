package strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lrh
 * @description
 * @date 2022/8/2
 */
@Component
public class StrategyFactory {

    @Autowired
    private List<Strategy> strategyList;

    private static Map<String,Strategy> strategyMap = new HashMap();

    @PostConstruct
    public void init(){
        for (Strategy strategy : strategyList) {
            Class<? extends Strategy> clazz = strategy.getClass();
            StrategyType annotation = clazz.getAnnotation(StrategyType.class);
            if(annotation != null){
                String type = annotation.type();
                strategyMap.put(type,strategy);
            }
        }
    }

    public static Strategy getStrategy(String type){
        Strategy strategy = strategyMap.get(type);
        if(strategy == null){
            throw new RuntimeException("没有此策略");
        }
        return strategy;
    }

}

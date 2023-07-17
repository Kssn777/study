package summer;

import com.swingfrog.summer.app.Summer;
import com.swingfrog.summer.app.SummerApp;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SummerDemoApp implements SummerApp {
    @Override
    public void init() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    public static void main(String[] args) {
        Summer.hot(new SummerDemoApp());
        log.info("启动完成");
    }
}
